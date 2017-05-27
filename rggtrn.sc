// mensaje misterioso

RGGTRN {

classvar <version;
classvar <s;
	*turboCargar {


		super.initClass;
	    version = "Mayo 4 2016";
		("PERREO TURBO CARGADO : version 1.0").postln;

~dembow=Buffer.read(s, "~/Dropbox/samples/dembow.wav".standardizePath);
~romantic=Buffer.read(s, "~/Dropbox/samples/romantic.wav".standardizePath);
~rggtrn2=Buffer.read(s, "~/Dropbox/samples/rggtrn2.wav".standardizePath);
~digital=Buffer.read(s, "~/Dropbox/samples/digital.wav".standardizePath);
~sonidero=Buffer.read(s, "~/Dropbox/samples/sonidero.wav".standardizePath);
~internacional=Buffer.read(s, "~/Dropbox/samples/internacional.wav".standardizePath);
~rggtrn=Buffer.read(s, "~/Dropbox/samples/rggtrn.wav".standardizePath);
~si=Buffer.read(s, "~/Dropbox/samples/si.wav".standardizePath);
~bombo=Buffer.read(s, "~/Dropbox/samples/bombo.wav".standardizePath);
~bajo=Buffer.read(s, "~/Dropbox/samples/bajo.wav".standardizePath);
~timbal=Buffer.read(s, "~/Dropbox/samples/timbal.wav".standardizePath);
~tom1=Buffer.read(s, "~/Dropbox/samples/tom1.wav".standardizePath);
~principio=Buffer.read(s, "~/Dropbox/samples/principio_2.wav".standardizePath);
~bote=Buffer.read(s, "~/Dropbox/samples/bote.wav".standardizePath);
~sabro=Buffer.read(s, "~/Dropbox/samples/sabro.wav".standardizePath);
~fuerte=Buffer.read(s, "~/Dropbox/samples/fuerte.wav".standardizePath);
~intro=Buffer.read(s, "~/Dropbox/samples/intro_soni.wav".standardizePath);

SynthDef (\samples, {
	arg buf, freq=1, amp=0.5, pan=0, atk=0.01, rel=1;
	var sig, paneo, env;
	sig= PlayBuf.ar(2, buf, BufRateScale.ir(buf) + freq, doneAction:2);
	env= EnvGen.ar(Env.perc(atk, rel, amp), doneAction:2);
	sig=sig*env;
	paneo=Pan2.ar(sig,pan);
	Out.ar(0,Limiter.ar (Compander.ar (paneo, mul: 2),1));
}).add;



SynthDef(\sharp, {|freq 440, amp 0.1, out 0, gate 1 atk 0.001, rel 0.005|
	var env, audio, freq2;
	freq2 = Lag.ar(K2A.ar(freq), lagTime:0.5);
	env = EnvGen.ar(Env.adsr(0.001, 0.005, -1.dbamp, 0.3), doneAction:2, gate:gate);
	audio = Saw.ar(freq:freq, mul:amp);
	audio = audio * env;
	Out.ar(out, Pan2.ar (audio));
}).add;

SynthDef (\bombo, {|amp = 1, freq = 40, atk = 0.01, rel = 0.02|
	var sin, env, out;
	sin = SinOsc.ar(freq/2, mul:amp) ;
	env = EnvGen.ar(Env.perc(atk, rel), doneAction:2);
			out = Out.ar(0,Compander.ar (Pan2.ar (sin*env,0),mul:2));
	}
).add;

SynthDef (\bajoSample, {
	arg freq = 200, buf=~bajo.bufnum, rate=1, amp=1, pan=1, atk=1.0, amp2=1.0;
	var sig, paneo, env;
	sig= PlayBuf.ar(1, buf, BufRateScale.ir(buf) * freq, doneAction:2);
	env= EnvGen.ar(Env.perc(0.01, atk, amp), doneAction:2);
	sig=sig*Line.kr(1, 0, 0.2)*amp;
	paneo=Pan2.ar(sig,pan);
	Out.ar(0,Limiter.ar (Compander.ar (paneo, mul: 2),1)) ;
}).add;



SynthDef (\bajo, {|amp = 1, freq = 40, atk = 0.5, rel = 1|
	var sin, env, out;
	sin = Pulse.ar(freq/2, mul:amp) + SinOsc.ar (freq/2, mul:amp);
	env = EnvGen.ar(Env.perc(atk, rel), doneAction:2);
	out = Out.ar(0,Pan2.ar (sin*env,0));
	}
).add;

SynthDef(\hi, {|amp =1 atk=0.01 rel=0.2 pan = 0 fil = 3900| Out.ar(0,Pan2.ar (Compander.ar(HPF.ar(WhiteNoise.ar(amp.clip(0,0.5)),fil)*Env.perc(atk,rel).kr(2),mul:1),pan))}).add;

SynthDef(\tarola,{|freq, amp 1| Out.ar (0, (Compander.ar (Pan2.ar((SinOsc.ar(300)+ WhiteNoise.ar)*Env.perc(0.01,0.25,amp).kr(2),0,1),0,0.8,0,1,0.1,0.1,1,0)))}).add;


/*SynthDef(\guira, {|amp atk=0.01 rel=0.2, dura=0.2| Out.ar(0,Pan2.ar (Compander.ar(HPF.ar(
	Klank.ar(`[10, 25, 35, 40], (LFPulse.ar(Rand(100, 150))* WhiteNoise.ar(amp/2)))+WhiteNoise.ar(amp/2), Rand(2500,2000),Rand(2900,1500)*Env([0,1, 1, 0], [atk, dura,rel]).kr(2),mul:1)),0))}).add;*/


// Array.exprand(14,1000,15000).postln; freqs
// Array.rand(14,0.1,0.5).postln;  amps
// Array.rand(14,0.1,0.45).postln;  durs
SynthDef(\guira, {|amp 1, atk=0.01, rel=0.2, dura=0.2|
	var klank, sig, env;
	klank = Klank.ar(`[[3986,3429,4681,3798,4007,1953,1121,
		                1608,2351,2582,1350,3783,6375,1610],
		               [0.44,0.29,0.45,0.44,0.21,0.47,0.49,
			            0.12,0.15,0.23,0.14,0.26,0.18,0.47],
                       [0.36,0.14,0.22,0.19,0.22,0.25,0.16,
			            0.16,0.14,0.28,0.43,0.34,0.21,0.37]
                       ],
		LFPulse.ar(20,0,0.5,Rand(0.03,0.045))
	                 );
	sig = HPF.ar(klank+WhiteNoise.ar(amp/2), Rand(2500,2000));
	sig = (Compander.ar(sig));
	env = Env([0,1, 1, 0], [atk, dura,rel]).kr(2);

	Out.ar(0,Pan2.ar (sig*env,0));
		}).add;



SynthDef(\mel, {|freq 200, amp 1, pan 0, atk 0.125, rel 0.25| Out.ar(0,(Pan2.ar(Compander.ar(Pulse.ar(freq, 0.5, amp)*Env.perc(atk, rel).kr(2),mul:2),0)))}).add;

SynthDef(\mel2, {|freq 200, amp 1, pan 0, atk 0.025, rel 0.125| Out.ar(0,(Pan2.ar(Compander.ar(Pulse.ar(freq, Line.ar(0.025,1, 0.125), amp)*Env.perc(atk, rel).kr(2),mul:1),0)))}).add;

SynthDef(\mel3, {|freq 200, amp 1, pan 0, atk 0.125, rel 0.25, ora 0.01,  le 0.125| Out.ar(0,(Pan2.ar(Compander.ar(Pulse.ar(freq, Line.ar(ora,le, 0.25), amp)*Env.perc(atk, rel).kr(2),mul:1),0)))}).add;

//use this with low frequencies
SynthDef(\pluck,{|freq 2, amp 0.25, pan 0, atk 0.025, rel 0.25 freqimp=3|	Out.ar(0,Pan2.ar(Pluck.ar(WhiteNoise.ar(amp.clip(0,0.5))+SinOsc.ar(freq, mul:amp.clip(0,0.5), mul:amp.clip(0,0.5)), Impulse.kr(freqimp), freq.reciprocal, freq.reciprocal, 2,coef: 0.15)*Env.perc(atk,rel).kr(2),0))}).add;


SynthDef(\pluckTri,{|freq 2, amp 0.25, pan 0, atk 0.025, rel 0.25 freqimp=4|	Out.ar(0,Pan2.ar(Pluck.ar(LFTri.ar(freq, mul:amp.clip(0,0.5), mul: amp.clip(0,0.75)), Impulse.kr(freqimp), freq.reciprocal, freq.reciprocal, 2,coef: 0.15)*Env.perc(atk,rel).kr(2),0))}).add;

SynthDef(\pad, {|freq 80, amp = 0.5, pan 0, atk 0.25, rel 0.05, fase 0.2, num 4| Out.ar(0,(Compander.ar (Pan2.ar(Saw.ar(freq, mul:2)+LFTri.ar(freq*num, fase, amp/2)*Env.perc(atk, rel, amp).kr(2),pan))))}).add;


SynthDef(\pad2, {|freq 100, amp = 0.5, pan 0, atk 0.25, rel 0.05| Out.ar(0, Pan2.ar (Limiter.ar (Compander.ar ((Saw.ar(freq, mul:2)*Env.perc(atk, rel, amp).kr(2)),0,0.5,1,1,0.01,0.1,1,0),1)))}).add;

SynthDef(\pad3, {|freq=100, amp=1,  pan 0, atk 0.25, rel 0.05,  fase=0.2, num=9| Out.ar(0,(Compander.ar (Pan2.ar(SinOsc.ar(freq, mul:amp )+LFTri.ar(freq*num, fase, amp/2)*Env.perc(atk, rel, amp).kr(2),pan), mul:4)))}).add;

SynthDef(\pad4, {|freq 200, amp 3, pan 0, atk 0.25, rel 0.05| Out.ar(0,Pan2.ar(Saw.ar(freq, 0.5, mul:amp)*Env.perc(atk, rel, amp).kr(2),pan))}).add;
//ruidos

SynthDef(\rui1, {|amp| Out.ar(0,Pan2.ar(HPF.ar(WhiteNoise.ar(amp),Line.kr(800,10000, 2))*Env.perc(0.025,0.25).kr(2),0))}).add;

SynthDef(\rui2, {|amp, freq| Out.ar(0,Pan2.ar(Limiter.ar(HPF.ar(SinOsc.ar(freq, 0, amp)/WhiteNoise.ar(amp),Line.kr(100,100000000, 2))*Env.perc(0.05,0.2).kr(2),1),0))}).add;

SynthDef(\rui3, {|amp| Out.ar(0,Pan2.ar(Limiter.ar(LPF.ar(WhiteNoise.ar(amp/2),Line.kr(1000000,10, 8))*Env.perc(0.5,0.125).kr(2),0.1),0))}).add;

SynthDef(\rui4, {|amp, atk=0.5, rel=4, freq| Out.ar(0,Pan2.ar(CombN.ar(LPF.ar(SinOsc.ar (freq*Line.kr (200, 1500,0.5),mul:amp)), 1, XLine.kr(0.05, 0.25, 1.5),0.2)*Env.perc(atk, rel).kr(2),0))}).add;

SynthDef(\rui5, {|amp, freq atk=0.5, rel=0.125| Out.ar(0,Pan2.ar(CombC.ar(LPF.ar(SinOsc.ar(freq, 0, amp)+PinkNoise.ar(amp),Line.kr(800,200, 8)),0.2, XLine.kr(0.01, 0.3, 10000),0.2)*Env.perc(atk,rel).kr(2),0))}).add;


SynthDef (\wow, {
	arg atk = 2, sus = 0, rel = 3, c1 =1, c2 = (-1),
	freq= 500, detune= 0.2, pan = 0, cfhzmin=0.1, cfhzmax = 0.3, cfmin=500, cfmax=2000, rqmin= 0.1, rqmax=0.2, lsf=200, ldb=0, amp=1, out=0;
	var sig, env;
	env = EnvGen.kr (Env([0, 1, 1, 0], [atk, sus, rel], [c1, 0, c2]), doneAction:2);
	sig= Saw.ar (freq * LFNoise1.kr(0.5, detune).midiratio)!2;
	sig= BPF.ar(
		sig,
	{LFNoise1.kr(
			LFNoise1.kr(4).exprange (cfhzmin, cfhzmax),
		).exprange(cfmin, cfmax)}!2,
		{LFNoise1.kr(0.1).exprange(rqmin, rqmax)}!2
	);
		sig = BLowShelf.ar(sig, lsf, 0.5, ldb);
	sig = Balance2.ar (sig[0], sig[1], pan);
	sig = sig * env * (amp * MouseX.kr(0, 2));
		Out.ar (out, sig);
	}).add;

////METALES

//este synth sube una 2a mayor las melodias, hay que restarle 2 a las midinotes
SynthDef(\metal1Osc, {|buf=0, mod 0.5, freq=100, sinFact 0.555, amp 1, ampSig 0.23, pan 0, att 0.03, durs 0.15, out 36, atk 0.005|
	var freqA, freqMod, sig, env;
	freqA=(1..5)*0.01+1; //CHORUS
	//freqA=LFNoise2.kr(0.1,(1..5)*0.01,1);
	freqMod=SinOsc.ar(mod,0,0.05,0.95)*freq*freqA;
	sig=Osc.ar(buf,freqMod, 0, ampSig*0.234);
	sig=sig+SinOsc.ar(freqMod*sinFact*[1/2,1],0,ampSig*0.5);
	sig=(sig*30).distort;
	sig=Pan2.ar(Mix(sig*amp), pan, 0.25);
	//env=EnvGen.kr(Env.perc(att,dur,1,-4),doneAction:2);
	env=EnvGen.kr(Env([0,1,1,0],[atk,durs -0.1,0.15]),doneAction:2);
	Out.ar(out,sig*env);
}).add;

//Synth(\metal1Osc,[\freq, 60.midicps*4, \out, 0]);
//{SinOsc.ar(62.midicps)}.play;


SynthDef(\metal2Osc, {|buf=0, mod 0.5, freq=100, sinFact 0.555, amp 1, ampSig 0.23, pan 0, att 0.03, durs 0.05, out 36, atk 0.02|
	var freqA, freqMod, sig, sig2, env;
	freqA=(1..5)*0.005+1;
	freqMod=SinOsc.ar(mod,0,0.05,0.95)*freq*freqA;
	sig=Osc.ar(buf,freqMod, 0, ampSig*0.234);
	sig=sig+SinOsc.ar(freqMod*sinFact*[1/2,1],0,ampSig*0.5);
	sig=(sig*30).distort;
	//sig=sig.wrap2(0.75);
	sig=sig.wrap2(Line.kr(0.8,1,durs*2));//0.75
	sig2=BRF.ar(sig,freq*2,1);
	sig2=LPF.ar(sig2,freq*8);
	sig2=Pan2.ar(Mix(sig2*amp), pan, 0.25);
	env=EnvGen.kr(Env([0,1,1,0],[atk,durs -0.1,0.125]),doneAction:2);
	Out.ar(out,sig2*env);
}).add;


SynthDef(\rev, {
	arg mix = 0.5, room = 0.5, gate = 1;
	var sin, env, out;
	sin = FreeVerb.ar(In.ar(36, 2), mix, room);
	env = EnvGen.ar(Env.asr,gate,doneAction:2);
	Out.ar(0, sin*env);

}).add;


//________________________________________________________________________________________________________


SynthDef(\dembow, {|tempo = 140, rate = -1, pos = 0, imp = #[0.25, 0.25, 0.25, 0.25]|
	var synth;
	synth = LPF.ar(Pan2.ar(PlayBuf.ar(2, e, BufRateScale.kr(e) * Demand.kr(Impulse.kr((tempo/60)*0.5), 0, Dseq([0.75]*rate, inf)), Impulse.kr((tempo/60)*Demand.kr(Impulse.kr((tempo/60)), 0, Dseq(imp, inf))), BufFrames.kr(e)* pos, 1)).flat*0.4, 10500);
	Out.ar(0, synth)
}).add;


~keys = {Pan2.ar(
	SinOsc.ar(
	40, 0, 
	Decay.kr(Demand.kr(Impulse.kr(~tempo*[1,2]),0,Dseq([
	Dseq([2,2,0,0,2,0,0,0,2,0,0,0,2,0,0,0],7),
	Dseq([2,2,0,0,2,0,0,0,2,0,0,0,2,0,0,0],1)],inf)) * 
	Impulse.kr(~tempo * [
	Demand.kr(Impulse.kr(~tempo), 0, Dseq([3, 2, 2, 2, 3, 2, 2, 2], inf)),2]), 0.15)).fold2(0.2)).sum * 1};


	}
}

