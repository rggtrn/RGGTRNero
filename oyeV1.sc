TrainingSample {
	classvar <version;
	classvar < s;
	classvar <allowBroadcast;
	classvar <printO;
	classvar <toThinkingModule;


	*init {

		super.initClass;
			 version = "June 06 2017";
		     ("TechLado.sc: " ++ version).postln;

	}

	*record  {arg pathToAudio = "~/path", dKickOutput = Env.new([0,0], [30]), dHiHatsOutput = Env.new([0,0], [30]), dSnareOutput = Env.new([0,0], [30]), dGuiraOutput = Env.new([0,0], [30]), dTimbalOutput = Env.new([0,0], [30]), dJamBlockOutput = Env.new([0,0], [30]), dPadOutput = Env.new([0,0], [30]), dBassOutput = Env.new([0,0], [30]), dStringsOutput = Env.new([0,0], [30]), loopSample = 0, port = 57700, broadcast = true, printOutputs = false;

		toThinkingModule = NetAddr.new("localhost", port);
			 allowBroadcast = broadcast;
			 printO = printOutputs;


		~bufferAlloc0 = Buffer.alloc(s, 1024,2);//for sampling rates 44100 and 48000
		~bufferAlloc1 = Buffer.alloc(s, 1024,2);
		~bufferAlloc2 = Buffer.alloc(s, 1024,2);
		~bufferAlloc3 = Buffer.alloc(s, 1024,2);
		~bufferAlloc4 = Buffer.alloc(s, 1024,2);
		~bufferAlloc5 = Buffer.alloc(s, 1024,2);
		~bufferAlloc6 = Buffer.alloc(s, 1024,2);

		~performance = Buffer.read(s, pathToAudio);
		~dKickOutput = dKickOutput;
		~dHiHatsOutput = dHiHatsOutput;
		~dSnareOutput = dSnareOutput;
		~dGuiraOutput = dGuiraOutput;
		~dTimbalOutput = dTimbalOutput;
		~dJamBlockOutput = dJamBlockOutput;
		~dPadOutput = dPadOutput;
		~dBassOutput = dBassOutput;
		~dStringsOutput = dStringsOutput;
		~loopSample = loopSample;

//~performance = Buffer.read(s, "c:\\Users\\d0kt0r0\\Desktop\\trainingSamples\\c0");
//~performance = RGGTRN.timbal;
//Env.new([0,0,1,1,0,0],[5,0.05,120,1]);
// ~desiredOutput = ~generateOutputEnvelope.([ [5,125] ]); // this would be very convenient...
//~bufferRead = RGGTRN.timbal;

SynthDef (\training, {
	var in0 = PlayBuf.ar(2, ~performance, BufRateScale.kr(~performance),1, 0, ~loopSample, doneAction:2); //read buffer two channels(stereo)
	var in = Mix.ar(in0); //mixing to one channel (mono)
	var fft0 = FFT(~bufferAlloc0, in);
	var fft1 = PV_Copy(fft0, ~bufferAlloc1);
	var fft2 = PV_Copy(fft0, ~bufferAlloc2);
	var fft3 = PV_Copy(fft0, ~bufferAlloc3);
    var fft4 = PV_Copy(fft0, ~bufferAlloc4);
 	var fft5 = PV_Copy(fft0, ~bufferAlloc5);
    var fft6 = PV_Copy(fft0, ~bufferAlloc6);

	//////////////////////feature extraction Ugens//////////////////
	var loudness = Loudness.kr(fft0); //loudness = amplitude = intensity
	var pitch = Pitch.kr(in, initFreq:in, minFreq:16); //pitch detection in Hertz
	// mfcc = MFCC.kr(fft1, 13); //timbre detection only for monophonic instruments/pieces
	var centroid = SpecCentroid.kr(fft1); //amount of brightness = amount of treble freqs
	var filteringVeryLowFreqs = Amplitude.kr(LPF.ar(in, 20)); //filtering freqs as Rhythm 20hz and below
	var filteringLowFreqs = Amplitude.kr (BPF.ar(in, 60, 1.3)); //filtering low freqs between 20 and 100hz
	var filteringMidFreqs = Amplitude.kr(BPF.ar(in, 300, 1.3)); //filtering mid freq between 100 and 500hz
	var filteringHighFreqs = Amplitude.kr(HPF.ar(in,501)); //filtering high freq above 501hz
	var cFilter = Amplitude.kr(Mix.ar(BPF.ar(in,[24,36,48,60,72,84,96].midicps,0.01)));//filtering the pitch class of C
	var csFilter = Amplitude.kr(Mix.ar(BPF.ar(in,([24,36,48,60,72,84,96]+1).midicps,0.01))); //... C#
	var dFilter = Amplitude.kr(Mix.ar(BPF.ar(in,([24,36,48,60,72,84,96]+2).midicps,0.01))); //... D
	var dsFilter = Amplitude.kr(Mix.ar(BPF.ar(in,([24,36,48,60,72,84,96]+3).midicps,0.01))); //... D#
	var eFilter = Amplitude.kr(Mix.ar(BPF.ar(in,([24,36,48,60,72,84,96]+4).midicps,0.01))); //... E
	var fFilter = Amplitude.kr(Mix.ar(BPF.ar(in,([24,36,48,60,72,84,96]+5).midicps,0.01))); //... F
	var fsFilter = Amplitude.kr(Mix.ar(BPF.ar(in,([24,36,48,60,72,84,96]+6).midicps,0.01))); //... F#
    var gFilter = Amplitude.kr(Mix.ar(BPF.ar(in,([24,36,48,60,72,84,96]+7).midicps,0.01))); //... G
	var gsFilter = Amplitude.kr(Mix.ar(BPF.ar(in,([24,36,48,60,72,84,96]+8).midicps,0.01))); //... G#
  	var aFilter = Amplitude.kr(Mix.ar(BPF.ar(in,([24,36,48,60,72,84,96]+9).midicps,0.01))); //... A
	var asFilter = Amplitude.kr(Mix.ar(BPF.ar(in,([24,36,48,60,72,84,96]+10).midicps,0.01))); //... A#
	var bFilter = Amplitude.kr(Mix.ar(BPF.ar(in,([24,36,48,60,72,84,96]+11).midicps,0.01))); //... B
	var onsets = Onsets.kr(fft2,0,\rcomplex); //detecting intitial impulse of a sound (transient)
	var zeroCrossing = ZeroCrossing.ar(in); //detecting variation or changes in the signal
	var specFlatness = SpecFlatness.kr(fft3);// how "noise-like is a sound" (wikipedia), how tonal or noisy is, how close is a sound to being a noise, 0 = pure sinusoid to 1 = white noise
	var specPcile = SpecPcile.kr(fft4, 0.95); //amount of skweness (assimetry) of a wave// cumulative distribution of the freq spectrum// in which band (high, mid or low) is the energy located
	var keyTrack = KeyTrack.kr(fft5);

	////////////////////desired outputs/////////////////
			var desiredKick = EnvGen.kr(~dKickOutput, gate: Impulse.kr(1), doneAction:0);
	var desiredHihats = EnvGen.kr(~dHiHatsOutput, gate: Impulse.kr(1), doneAction:0);
	var desiredSnare = EnvGen.kr(~dSnareOutput, gate: Impulse.kr(1), doneAction:0);
	var desiredGuira = EnvGen.kr(~dGuiraOutput, gate: Impulse.kr(1), doneAction:0);
	var desiredTimbal = EnvGen.kr(~dTimbalOutput, 1, doneAction:0);
	var desiredJamBlock = EnvGen.kr(~dJamBlockOutput, gate: Impulse.kr(2), doneAction:0);
	var desiredPad = EnvGen.kr(~dPadOutput, gate: Impulse.kr(1), doneAction:0);
	var desiredBass = EnvGen.kr(~dBassOutput, gate: Impulse.kr(1), doneAction:0);
	var desiredStrings = EnvGen.kr(~dStringsOutput, 1, doneAction:0);


	var quarternotetick, eighthnotetick, sixteenthnotetick, tempo, features;
	#quarternotetick, eighthnotetick, sixteenthnotetick, tempo =	BeatTrack.kr(fft6);


	///////////////////////sending sound features to a list////////////////////////////
	features = [/*3*/loudness, /*4*/pitch[0], /*5*/centroid, /*6*/filteringVeryLowFreqs, /*7*/ filteringLowFreqs, /*8*/ filteringMidFreqs, /*9*/filteringHighFreqs, /*10*/ cFilter, /*11*/csFilter, /*12*/ dFilter, /*13*/ dsFilter, /*14*/eFilter, /*15*/fFilter, /*16*/ fsFilter, /*17*/ gFilter, /*18*/ gsFilter, /*19*/aFilter, /*20*/asFilter, /*21*/ bFilter, /*22*/ onsets, /*23*/ zeroCrossing, /*24*/ specFlatness, /*25*/ specPcile, /*26*/ keyTrack, /*27*/ quarternotetick,
		/*28*/ eighthnotetick, /*29*/ sixteenthnotetick, /*30*/ tempo, /*31*/ desiredKick, /*32*/desiredHihats, /*33*/ desiredSnare, /*34*/ desiredGuira, /*35*/ desiredTimbal, /*36*/ desiredJamBlock, /*37*/ desiredPad, /*38*/ desiredBass.clip(0,1), /*39*/desiredStrings];
	SendReply.kr(Impulse.kr(20), "/training", features);
	Out.ar(0, in0);
}).play;

//receiving features and adding them to a list
OSCdef (\feat, {|msg, time|
	var d = Dictionary.new;

	d[\time] = time;
	/*1*/d[\loudness] = msg[3];
	/*2*/d[\pitch] = msg[4];
	/*3*/d[\centroid] = msg[5];
	/*4*/d[\filteringVeryLowFreqs] = msg[6];
	/*5*/d[\filteringLowFreqs] = msg[7];
	/*6*/d[\filteringMidFreqs] = msg[8];
	/*7*/d[\filteringHighFreqs] = msg[9];
	/*8*/d[\cFilter] = msg[10];
    /*9*/d[\csFilter] = msg[11];
	/*10*/d[\dFilter] = msg[12];
	/*11*/d[\dsFilter] = msg[13];
	/*12*/d[\eFilter] = msg[14];
	/*13*/d[\fFilter] = msg[15];
	/*14*/d[\fsFilter] = msg[16];
	/*15*/d[\gFilter] = msg[17];
	/*16*/d[\gsFilter] = msg[18];
	/*17*/d[\aFilter] = msg[19];
	/*18*/d[\asFilter] = msg[20];
	/*19*/d[\bFilter] = msg[21];
	/*20*/d[\onsets] = msg[22];
	/*21*/d[\zeroCrossing] = msg[23];
	/*22*/d[\specFlatness] = msg[24];
	/*23*/d[\specPcile] = msg[25];
	/*24*/d[\keyTrack] = msg[26];
	/*25*/d[\quarternotetick] = msg[27];
	/*26*/d[\eighthnotetick] = msg[28];
	/*27*/d[\sixteenthnotetick] = msg[29];
    /*28*/d[\tempo] = msg[30];
			/////////////desired outputs//////////
	/*29*/d[\desiredKick] = msg[31];
	/*30*/d[\desiredHihats] = msg[32];
	/*31*/d[\desiredSnare] = msg[33];
	/*32*/d[\desiredGuira] = msg[34];
	/*33*/d[\desiredTimbal] = msg[35];
	/*34*/d[\desiredJamBlock] = msg[36];
	/*35*/d[\desiredPad] = msg[37];
	/*36*/d[\desiredBass] = msg[38];
	/*37*/d[\desiredStrings] = msg[39];

			if (printOutputs, {["kick " ++ d[\desiredKick].asFloat, "hihats " ++ d[\desiredHihats].asFloat,  "snare " ++ d[\desiredSnare].asFloat, "guira " ++ d[\desiredGuira].asFloat, "timbal " ++ d[\desiredTimbal].asFloat, "jamBlock " ++ d[\desiredJamBlock].asFloat, "pad " ++ d[\desiredPad].asFloat, "bass " ++ d[\desiredBass].asFloat, "strings " ++ d[\desiredStrings].asFloat].postln});
if (allowBroadcast, {
				toThinkingModule.sendMsg("/train",  d[\loudness].asFloat, d[\pitch].asFloat, d[\centroid].asFloat, d[\filteringVeryLowFreqs].asFloat, d[\filteringLowFreqs].asFloat, d[\filteringMidFreqs].asFloat, d[\filteringHighFreqs].asFloat, d[\cFilter].asFloat, d[\csFilter].asFloat, d[\dFilter].asFloat, d[\dsFilter].asFloat, d[\eFilter].asFloat, d[\fFilter].asFloat, d[\fsFilter].asFloat, d[\gFilter].asFloat, d[\gsFilter].asFloat, d[\aFilter].asFloat, d[\asFilter].asFloat, d[\bFilter].asFloat, d[\onsets].asFloat, d[\zeroCrossing].asFloat, d[\specFlatness].asFloat, d[\specPcile].asFloat, d[\keyTrack].asFloat, d[\quarternotetick].asFloat, d[\eighthnotetick].asFloat, d[\sixteenthnotetick].asFloat, d[\tempo].asFloat,
d[\desiredKick].asFloat, d[\desiredHihats].asFloat, d[\desiredSnare].asFloat, d[\desiredGuira].asFloat, d[\desiredTimbal].asFloat, d[\desiredJamBlock].asFloat, d[\desiredPad].asFloat, d[\desiredBass].asFloat, d[\desiredStrings].asFloat)});
}, "/training");
		^super.newCopyArgs(pathToAudio, dKickOutput, dHiHatsOutput, dSnareOutput, dJamBlockOutput, dPadOutput, dBassOutput, loopSample, allowBroadcast, printOutputs);
	}
}
