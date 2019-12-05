// mensaje misterioso

RGGTRN {

	classvar <version;
	classvar <s; classvar <csf; classvar <dembow; classvar <romantic; classvar <rggtrn2; classvar <digital; classvar <sonidero; classvar <internacional; classvar <rggtrn; classvar <si; classvar <bombo; classvar <bajo; classvar <timbal; classvar <tom1; classvar <principio; classvar <bote; classvar <sabro; classvar <fuerte; classvar <intro; classvar < busArray; classvar < congaS; classvar < congaC; classvar < bongoP; classvar < bongoC;

	*turboCargar {
		super.initClass;
		Ritmo.initClass;
		Bajo.initClass;
		Teclado.initClass;
		version = "Jun 20 2018";
		("

 ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄        ▄
▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░▌      ▐░▌
▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀▀▀  ▀▀▀▀█░█▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌▐░▌░▌     ▐░▌
▐░▌       ▐░▌▐░▌          ▐░▌               ▐░▌     ▐░▌       ▐░▌▐░▌▐░▌    ▐░▌
▐░█▄▄▄▄▄▄▄█░▌▐░▌ ▄▄▄▄▄▄▄▄ ▐░▌ ▄▄▄▄▄▄▄▄      ▐░▌     ▐░█▄▄▄▄▄▄▄█░▌▐░▌ ▐░▌   ▐░▌
▐░░░░░░░░░░░▌▐░▌▐░░░░░░░░▌▐░▌▐░░░░░░░░▌     ▐░▌     ▐░░░░░░░░░░░▌▐░▌  ▐░▌  ▐░▌
▐░█▀▀▀▀█░█▀▀ ▐░▌ ▀▀▀▀▀▀█░▌▐░▌ ▀▀▀▀▀▀█░▌     ▐░▌     ▐░█▀▀▀▀█░█▀▀ ▐░▌   ▐░▌ ▐░▌
▐░▌     ▐░▌  ▐░▌       ▐░▌▐░▌       ▐░▌     ▐░▌     ▐░▌     ▐░▌  ▐░▌    ▐░▌▐░▌
▐░▌      ▐░▌ ▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌     ▐░▌     ▐░▌      ▐░▌ ▐░▌     ▐░▐░▌
▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░▌     ▐░▌       ▐░▌▐░▌      ▐░░▌
 ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀       ▀       ▀         ▀  ▀        ▀▀  turbocargado").postln;

		~luislacolegiala=Buffer.read(s, ".local/share/SuperCollider/Extensions/RGGTRNero/samples/patioCSF.wav".standardizePath);
		~csf=Buffer.read(s, ".local/share/SuperCollider/Extensions/RGGTRNero/samples/patioCSF.wav".standardizePath);
		~dembow=Buffer.read(s, ".local/share/SuperCollider/Extensions/RGGTRNero/samples/dembow.wav".standardizePath);
		romantic=Buffer.read(s, ".local/share/SuperCollider/Extensions/RGGTRNero/samples//romantic.wav".standardizePath);
		rggtrn2=Buffer.read(s, ".local/share/SuperCollider/Extensions/RGGTRNero/samples/rggtrn2.wav".standardizePath);
		digital=Buffer.read(s, ".local/share/SuperCollider/Extensions/RGGTRNero/samples/digital.wav".standardizePath);
		sonidero=Buffer.read(s, ".local/share/SuperCollider/Extensions/RGGTRNero/samples/sonidero.wav".standardizePath);
		internacional=Buffer.read(s, ".local/share/SuperCollider/Extensions/RGGTRNero/samples/internacional.wav".standardizePath);
		rggtrn=Buffer.read(s, ".local/share/SuperCollider/Extensions/RGGTRNero/samples/rggtrn.wav".standardizePath);
		si=Buffer.read(s, ".local/share/SuperCollider/Extensions/RGGTRNero/samples/si.wav".standardizePath);
		bombo=Buffer.read(s, ".local/share/SuperCollider/Extensions/RGGTRNero/samples/bombo.wav".standardizePath);
		bajo=Buffer.read(s, ".local/share/SuperCollider/Extensions/RGGTRNero/samples/bajo.wav".standardizePath);
		timbal=Buffer.read(s, ".local/share/SuperCollider/Extensions/RGGTRNero/samples/timbal.wav".standardizePath);
		tom1=Buffer.read(s, ".local/share/SuperCollider/Extensions/RGGTRNero/samples/tom1.wav".standardizePath);
		principio=Buffer.read(s, ".local/share/SuperCollider/Extensions/RGGTRNero/samples/principio_2.wav".standardizePath);
		bote=Buffer.read(s, ".local/share/SuperCollider/Extensions/RGGTRNero/samples/bote.wav".standardizePath);
		sabro=Buffer.read(s, ".local/share/SuperCollider/Extensions/RGGTRNero/samples/sabro.wav".standardizePath);
		fuerte=Buffer.read(s, ".local/share/SuperCollider/Extensions/RGGTRNero/samples/fuerte.wav".standardizePath);
		intro=Buffer.read(s, ".local/share/SuperCollider/Extensions/RGGTRNero/samples/intro_soni.wav".standardizePath);
		congaC=Buffer.read(s, ".local/share/SuperCollider/Extensions/RGGTRNero/samples/congaC.wav".standardizePath);
		congaS=Buffer.read(s, ".local/share/SuperCollider/Extensions/RGGTRNero/samples/congaS.wav".standardizePath);
		bongoP=Buffer.read(s, ".local/share/SuperCollider/Extensions/RGGTRNero/samples/bongo2.aiff".standardizePath);
		bongoC=Buffer.read(s, ".local/share/SuperCollider/Extensions/RGGTRNero/samples/bongoC.wav".standardizePath);
		busArray = [0,4];

		// rggtrn oficial masterización
	~rggtrnMaster = SynthDef (\mix, {
			var outD = GVerb.ar(BPF.ar(In.ar(0), Array.geom(8, 50, 1.5), 1/4).sum, 80, 5.85, 0.41, 0.19, 15, -3.dbamp, -5.dbamp, -5.dbamp, 80, 1)*0.15;
			var outS = DelayC.ar(In.ar(0), 0.01, 0.0001*0.5);
			var envOutS = EnvFollow.ar(In.ar(0), 1 - (0.0001 * SampleRate.ir).reciprocal).max(0.134377).reciprocal * 0.2!2;
			outS = outS * envOutS;

	      Out.ar(0, outS);

		}).play;

		//deprecated?

		/*~reverb1 = SynthDef(\reverb, {
			var sin, env, out;
			sin = GVerb.ar(In.ar(0),roomsize:10, mul: 0.3, damping: 0.5, revtime: 1.25);
			env = EnvGen.ar(Env.asr,1,doneAction:2);
			Out.ar(0, sin*env);
		}).play;

	~reverb2 = SynthDef(\rev, {
			arg mix = 0.5, room = 0.5, gate = 1;
			var sin, env, out;
			sin = FreeVerb.ar(In.ar(36, 2), mix, room,  mul: 0.25);
			env = EnvGen.ar(Env.asr,gate,doneAction:2);
			Out.ar(0, sin*env);
		}).add;


	~compresor = SynthDef(\compresor, {
			var sin, env, out;
			sin = Compander.ar(In.ar(0), control: 1, thresh:0.7, clampTime:0.05);
			env = EnvGen.ar(Env.asr,1,doneAction:2);
			Out.ar(0, sin*env);
		}).play;

*/

		SynthDef(\cafetera,
			{ arg freq = 55, amp = -25.dbamp, lpf = 2000, atk = 2, rel = 5;
				var audio = SinOsc.ar(freq.rand, mul:amp*Saw.ar(freq*8.rand));
				audio = LPF.ar (audio, freq:lpf.rand);
				audio = audio * EnvGen.ar(Env.perc(atk, rel), doneAction:2);
				Out.ar(0,audio);
		}).add;

		SynthDef (\samplesStereo, {
			arg buf, freq=1, amp=0.5, pan=0, atk=0.01, rel=1, speed = buf;
			var sig, paneo, env, sigMix;
			sig= Mix.ar(PlayBuf.ar(2, buf, BufRateScale.ir(speed) + freq, doneAction:2));
			env= EnvGen.ar(Env.perc(atk, rel, level: amp.clip(0,0.5)), doneAction:2);
			sig= sig*env;
			paneo=Pan2.ar(sig,pan);
			Out.ar(busArray, Limiter.ar(Compander.ar (paneo, mul: 1),1));
		}).add;

		SynthDef (\samplesMono, {
			arg buf, freq=1, amp=0.5, pan=0, atk=0.01, rel=1, speed = buf;
			var sig, paneo, env, sigMix;
			sig= Mix.ar(PlayBuf.ar(1, buf, BufRateScale.ir(speed) + freq, doneAction:2));
			env= EnvGen.ar(Env.perc(atk, rel, level: amp.clip(0,0.5)), doneAction:2);
			sig= sig*env;
			paneo=Pan2.ar(sig,pan);
			Out.ar(busArray, Limiter.ar(Compander.ar (paneo, mul: 1),1));
		}).add;

		SynthDef (\samplesE, {
			arg buf, freq=1, amp=0.5, pan=0, atk=0.01, rel=1;
			var sig, paneo, env, sigMix;
			sig= PlayBuf.ar(2, buf, BufRateScale.ir(buf) + freq, doneAction:2);
			env= EnvGen.ar(Env.perc(atk, rel, level: amp.clip(0,0.5)), doneAction:2);
			sig=sig*env;
			paneo=Pan2.ar(sig,pan);
			Out.ar(0, Limiter.ar(Compander.ar (paneo, mul: 1),1));
		}).add;


		SynthDef (\timbal, {
			arg buf = ~timbal, freq=1, amp=1, pan=0, atk=0.01, rel=1;
			var sig, paneo, env;
			sig= PlayBuf.ar(1, buf, BufRateScale.ir(buf) + freq, doneAction:2);
			env= EnvGen.ar(Env.perc(atk, rel), doneAction:2);
			sig=sig*env;
			paneo=Pan2.ar(sig,pan);
			Out.ar([0,4],Limiter.ar (Compander.ar (paneo, mul: amp.clip(0,0.85), relaxTime: 0.5, mul: amp),amp, 0.01));
		}).add;

		SynthDef (\timbalE, {
			arg buf = ~timbal, freq=1, amp=1, pan=0, atk=0.01, rel=1;
			var sig, paneo, env;
			sig= PlayBuf.ar(1, buf, BufRateScale.ir(buf) + freq, doneAction:2);
			env= EnvGen.ar(Env.perc(atk, rel), doneAction:2);
			sig=sig*env;
			paneo=Pan2.ar(sig,pan);
			Out.ar(0,Limiter.ar (Compander.ar (paneo, mul: amp.clip(0,0.75)),1));
		}).add;


		SynthDef (\bajo, {|amp = 1, freq = 40, atk = 0.025, rel = 1, pan = 0, fnoise=0.003|
			var sin, env, out, randF;
			randF = Rand(1-fnoise,1+fnoise);
			sin = Pulse.ar(freq/2*randF, mul:amp.clip(0,0.5)) + SinOsc.ar (freq/2*randF, mul:amp.clip(0,0.5));
			env = EnvGen.ar(Env.perc(atk, rel), doneAction:2);
			out = Out.ar(busArray,Pan2.ar (sin*env, pan));
		}
		).add;

		SynthDef (\bajo2, {|amp = 0.5, freq = 40, atk = 0.025,rel = 1, pan = 0, fnoise=0.003, out = 0|
			var sin, env,  randF, audio;
			randF = Rand(1-fnoise,1+fnoise);
			sin = Saw.ar(freq/2*randF, mul:0.035) + LFTri.ar(freq/2*randF, mul:amp.clip(0,1)) + SinOsc.ar (freq/2*randF, mul:amp.clip(0,1)) + SinOsc.ar (freq*randF, mul:amp.clip(0,1)) + SinOsc.ar (freq*randF, mul:amp.clip(0,1)) + Impulse.ar(1, mul:1);
			sin = LPF.ar (sin, 2000);
			env = EnvGen.ar(Env.perc(atk, rel), doneAction:2);
			audio = sin * env;
			audio = Pan2.ar (audio, pan);
			audio = Compander.ar (audio, pan, 1, 0.5, 1, 0.5, 0.015, 1);
			//	audio = Compander.ar (audio, pan,0.5, 0.5, 1, 0.25, 0.015, 1);
			Out.ar (0, audio);
		}
		).add;


		SynthDef (\bajoE, {|amp = 1, freq = 40, atk = 0.5, rel = 1, pan = 0, fnoise=0.003|
			var sin, env, out, randF;
			randF = Rand(1-fnoise,1+fnoise);
			sin = Pulse.ar(freq/2*randF, mul:amp.clip(0,0.5)) + SinOsc.ar (freq/2*randF, mul:amp.clip(0,0.5));
			env = EnvGen.ar(Env.perc(atk, rel), doneAction:2);
			out = Out.ar(0,Pan2.ar (sin*env,pan));
		}
		).add;

		SynthDef(\hi, {|amp =1 atk=0.01 rel=0.2 pan = 0 fil = 3900, fnoise=0.003| Out.ar(busArray,Pan2.ar
			(Compander.ar(HPF.ar(WhiteNoise.ar(amp.clip(0,0.5)),fil)*Env.perc(atk,rel).kr(2),mul:1),pan))}).add;

		SynthDef(\hiE, {|amp =1 atk=0.01 rel=0.2 pan = 0 fil = 3900, fnoise=0.003| Out.ar(0,Pan2.ar
			(Compander.ar(HPF.ar(WhiteNoise.ar(amp.clip(0,0.5)),fil)*Env.perc(atk,rel).kr(2),mul:1),pan))}).add;

		SynthDef(\tarola,{|freq, amp 1, pan 0, fnoise=0.003| Out.ar (busArray, (Compander.ar (Pan2.ar((SinOsc.ar(300*Rand(1-fnoise,1+fnoise))+ WhiteNoise.ar)*Env.perc(0.01,0.25,amp).kr(2),
			pan,1),0,0.8,0,1,0.1,0.1,1,0)))}).add;


		SynthDef(\tarola2,{| amp 1, atk = 0.001, rel = 0.15, pan 0, fnoise=0.003, out 0, freq 300|
			var audio;
			audio = SinOsc.ar(freq*Rand(1-fnoise, 1 + fnoise), mul: 0.25);
			audio = audio + WhiteNoise.ar(amp) + Impulse.ar (1, mul: 0.75);
			audio = audio * Env.perc(atk, rel, amp).kr(2);
			audio = LPF.ar (audio, 3500);
			audio = Pan2.ar (audio, pan);
			audio = Compander.ar (audio, pan, 0.5, 0.5, 1, 0.5, 0.1);
			Out.ar (busArray, audio);
		}).add;

		SynthDef(\kick, { arg freq = 60, out = 0, amp = 0.1, pan = 0;
			var audio;
			audio = SinOsc.ar(freq, mul: amp) + LFTri.ar(freq, mul: amp/24) + Impulse.ar (1, mul: 1)+ WhiteNoise.ar (mul: 0.00125);
			audio = audio * EnvGen.ar(Env.perc(0.0125, 0.35), doneAction: 2);
			audio = Pan2.ar (audio, pan);
			audio = Compander.ar (audio, pan, 0.5, 0.5, 1, 0.05, 0.1);
			Out.ar (busArray, audio);
		}).add;



		SynthDef(\tarolaE,{|freq, amp 1, pan 0, fnoise=0.003| Out.ar (0, (Compander.ar (Pan2.ar((SinOsc.ar(300*Rand(1-fnoise,1+fnoise))+ WhiteNoise.ar)*Env.perc(0.01,0.25,amp).kr(2),pan,1)
			,0,0.8,0,1,0.1,0.1,1,0)))}).add;







		SynthDef(\kickE, { arg freq = 60, out = 0, amp = 0.1, sustain = 0.101, pan = 0;
			var audio;
			audio = SinOsc.ar(freq, mul: amp);
			audio = audio * EnvGen.ar(Env.perc(0.001,sustain-0.001), doneAction: 2);
			Out.ar(0,Pan2.ar (audio,pan));
		}).add;

		/*SynthDef(\guira, {|amp atk=0.01 rel=0.2, dura=0.2| Out.ar(0,Pan2.ar (Compander.ar(HPF.ar(
		Klank.ar(`[10, 25, 35, 40], (LFPulse.ar(Rand(100, 150))* WhiteNoise.ar(amp/2)))+WhiteNoise.ar(amp/2), Rand(2500,2000),Rand(2900,1500)*Env([0,1, 1, 0], [atk, dura,rel]).kr(2),mul:1)),0))}).add;*/


		// Array.exprand(14,1000,15000).postln; freqs
		// Array.rand(14,0.1,0.5).postln;  amps
		// Array.rand(14,0.1,0.45).postln;  durs
		SynthDef(\guira, {|amp 1, atk=0.01, rel=0.2, dura=0.2, pan = 0, fnoise=0.003|
			var klank, sig, env;
			klank = Klank.ar(`[[3986,3429,4681,3798,4007,1953,1121,
				1608,2351,2582,1350,3783,6375,1610],
			[0.44,0.29,0.45,0.44,0.21,0.47,0.49,
				0.12,0.15,0.23,0.14,0.26,0.18,0.47],
			[0.36,0.14,0.22,0.19,0.22,0.25,0.16,
				0.16,0.14,0.28,0.43,0.34,0.21,0.37]
			],
			LFPulse.ar(20,0,0.5,Rand(0.03,0.045),mul: amp/8));
			sig = HPF.ar(klank+WhiteNoise.ar(amp/2), Rand(2500,2000));
			//sig = (Compander.ar(sig), mul: amp);
			env = Env([0,1, 1, 0], [atk, dura,rel]).kr(2);
			Out.ar(busArray,Pan2.ar (sig*env,pan));
		}).add;

		SynthDef(\guiraE, {|amp 1, atk=0.01, rel=0.2, dura=0.2, pan = 0, fnoise=0.003|
			var klank, sig, env;
			klank = Klank.ar(`[[3986,3429,4681,3798,4007,1953,1121,
				1608,2351,2582,1350,3783,6375,1610],
			[0.44,0.29,0.45,0.44,0.21,0.47,0.49,
				0.12,0.15,0.23,0.14,0.26,0.18,0.47],
			[0.36,0.14,0.22,0.19,0.22,0.25,0.16,
				0.16,0.14,0.28,0.43,0.34,0.21,0.37]
			],
			LFPulse.ar(20,0,0.5,Rand(0.03,0.045),mul: amp/8)
			);
			sig = HPF.ar(klank+WhiteNoise.ar(amp/2), Rand(2500,2000));
			//	sig = (Compander.ar(sig));
			env = Env([0,1, 1, 0], [atk, dura,rel]).kr(2);
			Out.ar(0,Pan2.ar (sig*env,pan));
		}).add;

		SynthDef(\mel, {|freq 200, amp 1, pan 0, atk 0.125, rel 0.25, fnoise=0.003|
			var audio, env;
			audio = Pulse.ar(freq:freq*Rand(1-fnoise,1+fnoise), mul:amp.clip(0,0.5));
			env = Env.perc(atk, rel).kr(2);
			audio = audio * env;
			audio = Compander.ar(audio);
			Out.ar(busArray,Pan2.ar(audio, pan));
		}).add;

		SynthDef(\melE, {|freq 200, amp 1, pan 0, atk 0.125, rel 0.25, fnoise=0.003|
			var audio, env;
			audio = Pulse.ar(freq:freq*Rand(1-fnoise,1+fnoise), mul:amp.clip(0,0.5));
			env = Env.perc(atk, rel).kr(2);
			audio = Compander.ar(audio);
			audio = audio * env;
			Out.ar(0,Pan2.ar(audio, pan));
		}).add;

		SynthDef(\mel2, {|freq 200, amp 1, pan 0, atk 0.025, rel 0.125, fnoise=0.003|
			var audio, env;
			audio = Pulse.ar(freq: freq*Rand(1-fnoise,1+fnoise), width: Line.ar(0.025,0.25,0.125), mul: amp.clip(0,0.5));
			env = Env.perc(atk, rel).kr(2);
			audio = audio * env;
			Out.ar(busArray,Pan2.ar(audio, pan));
		}).add;

		SynthDef(\mel2E, {|freq 200, amp 1, pan 0, atk 0.025, rel 0.125, fnoise=0.003|
			var audio, env;
			audio = Pulse.ar(freq: freq*Rand(1-fnoise,1+fnoise), width: Line.ar(0.025,0.25,0.125), mul: amp.clip(0,0.5));
			env = Env.perc(atk, rel).kr(2);
			audio = audio * env;
			Out.ar(0,Pan2.ar(audio, pan));
		}).add;

		SynthDef(\mel3, {|freq 200, amp 1, pan 0, atk 0.125, rel 0.25, start 0.01, end 0.125, fnoise=0.003|
			var audio, env;
			audio = Pulse.ar(freq*Rand(1-fnoise,1+fnoise), width: Line.ar(start, end, dur: 0.025), mul:amp.clip(0,0.5));
			env = Env.perc(atk, rel).kr(2);
			audio = audio * env;
			Out.ar(busArray,Pan2.ar(audio, pan));
		}).add;

		SynthDef(\mel3E, {|freq 200, amp 1, pan 0, atk 0.125, rel 0.25, start 0.01, end 0.125, fnoise=0.003|
			var audio, env;
			audio = Pulse.ar(freq*Rand(1-fnoise,1+fnoise), width: Line.ar(start, end, dur:0.025), mul:amp.clip(0,0.5));
			env = Env.perc(atk, rel).kr(2);
			audio = audio * env;
			Out.ar(0,Pan2.ar(audio, pan));
		}).add;

		SynthDef(\mel4, {|freq 200, amp 1, pan 0, atk 0.025, rel 0.125, fnoise=0.003|
			var audio, env, freq2;
			freq2 = Lag.ar(K2A.ar(freq), lagTime:0.25);
			audio = LFTri.ar (freq:freq2, iphase: Line.ar(0,50,0.5), mul: amp/2)+Pulse.ar(freq: freq*Rand(1-fnoise,1+fnoise), width: Line.ar(0.25,0.5,0.125), mul: amp.clip(0,0.5));
			audio = LPF.ar (audio, 10000);
			env = Env.perc(atk, rel).kr(2);
			audio = audio * env;
			Out.ar(busArray,Pan2.ar(audio, pan));
		}).add;

		SynthDef(\melGliss, {|freq 200, amp 1, pan 0, atk 0.125, rel 0.25, fnoise=0.003, gliss 100, dur  0|
			var audio, env, glissando, frequency;
			audio = Pulse.ar(freq:(XLine.kr(freq, gliss.midicps))*Rand(1-fnoise,1+fnoise), mul:amp.clip(0,0.5));
			env = Env.perc(atk, rel).kr(2);
			audio = audio * env;
			audio = Compander.ar(audio);
			Out.ar(busArray,Pan2.ar(audio, pan));
		}).add;

		//use this with low frequencies

		SynthDef(\pluck,{|freq 2, amp 0.25, pan 0, atk 0.025, rel 0.25 freqimp=3, fnoise=0.003|
			var audio, env;
			audio = Pluck.ar(BrownNoise.ar(amp.clip(0,0.5))+Pulse.ar(freq*Rand(1-fnoise,1+fnoise), mul:amp.clip(0,0.5)),
				Impulse.kr(freqimp),maxdelaytime: freq.reciprocal, delaytime: freq.reciprocal, decaytime: 2,coef: 0.15);
			audio = audio * Saw.ar(1);
			audio = LPF.ar(audio, 12000);
			env = EnvGen.ar(Env.perc(atk, rel), doneAction:2);
			audio = audio * env;
			audio = Compander.ar(audio, control:0, thresh: 0.2, slopeBelow: 1, slopeAbove:1, clampTime:0.5,relaxTime:0.1);
			Out.ar(busArray,Pan2.ar(audio, pan));
		}).add;

		//use this with low frequencies
		SynthDef(\pluckE,{|freq 2, amp 0.25, pan 0, atk 0.025, rel 0.25 freqimp=3, fnoise=0.003|
			var audio, env;
			audio = Pluck.ar(WhiteNoise.ar(amp.clip(0,0.5))+SinOsc.ar(freq*Rand(1-fnoise,1+fnoise), mul:amp.clip(0,0.5)),
				Impulse.kr(freqimp), maxdelaytime: freq.reciprocal, delaytime: freq.reciprocal, decaytime: 2,coef: 0.15);
			env = EnvGen.ar(Env.perc(atk, rel), doneAction:2);
			audio = audio * env;
			Out.ar(0,Pan2.ar(audio, pan));
		}).add;

		SynthDef(\pluckTri,{|freq 2, amp 0.55, pan 0, atk 0.025, rel 0.25 freqimp=4, fnoise=0.003|
			var audio, env;
			audio = Pluck.ar(LFTri.ar(freq*Rand(1-fnoise,1+fnoise), mul: amp.clip(0,0.5)), trig: Impulse.kr(freqimp), maxdelaytime: freq.reciprocal, delaytime: freq.reciprocal, decaytime: 2,coef: 0.15);
			env = EnvGen.ar(Env.perc(atk, rel), doneAction:2);
			audio = audio * env;
			Out.ar(busArray,Pan2.ar(audio, pan));
		}).add;

		SynthDef(\pluckTriE,{|freq 2, amp 0.75, pan 0, atk 0.025, rel 0.25 freqimp=4, fnoise=0.003|
			var audio, env;
			audio = Pluck.ar(LFTri.ar(freq*Rand(1-fnoise,1+fnoise), mul: amp.clip(0,0.75)), trig: Impulse.kr(freqimp), maxdelaytime: freq.reciprocal, delaytime: freq.reciprocal, decaytime: 2,coef: 0.15);
			env = EnvGen.ar(Env.perc(atk, rel), doneAction:2);
			audio = audio * env;
			Out.ar(0,Pan2.ar(audio, pan));
		}).add;

		SynthDef(\sharp, {|freq 440, amp 0.1, gate 1 atk 0.001, rel 0.005, pan = 0, fnoise=0.003|
			var env, audio, freq2;
			freq2 = Lag.ar(K2A.ar(freq), lagTime:0.5);
			env = EnvGen.ar(Env.adsr(0.001, 0.005, -1.dbamp, 0.3), doneAction:2, gate:gate);
			audio = Saw.ar(freq:freq*Rand(1-fnoise,1+fnoise), mul:amp.clip(0,0.5));
			audio = audio * env;
			Out.ar(busArray, Pan2.ar (audio, pan));
		}).add;

		SynthDef(\sharpE, {|freq 440, amp 0.1, gate 1 atk 0.001, rel 0.005, pan = 0, fnoise=0.003|
			var env, audio, freq2;
			freq2 = Lag.ar(K2A.ar(freq), lagTime:0.5);
			env = EnvGen.ar(Env.adsr(0.001, 0.005, -1.dbamp, 0.3), doneAction:2, gate:gate);
			audio = Saw.ar(freq:freq*Rand(1-fnoise,1+fnoise), mul:amp.clip(0,0.5));
			audio = audio * env;
			Out.ar(0, Pan2.ar (audio, pan));
		}).add;

		SynthDef(\sharp2, {|freq 440, amp 0.1, gate 1, atk 0.001, rel 0.005, pan = 0, fnoise=0.003, gliss 0, out 0, fil = 1500|
			var env, audio, freq2;
			freq2 = Lag.ar(K2A.ar(freq), lagTime:0.5);
			env = EnvGen.ar(Env.adsr(0.05, 0.005, -1.dbamp, 0.3), doneAction:2, gate:gate);
			audio = Pulse.ar (freq:(XLine.kr(freq, freq+gliss, 1))*Rand(1-fnoise,1+fnoise), mul:amp.clip(0,0.5))+LFTri.ar(freq:(XLine.kr(freq, freq+gliss, 1))*2*Rand(1-fnoise,1+fnoise), mul:amp.clip(0,0.5));
			audio = LPF.ar (audio,fil);
			audio = audio * env;
			audio = Pan2.ar (audio, pan);
			audio = Compander.ar (audio, pan, 0.5, 0.5, 1, 0.5, 0.015, mul: 0.75);
			Out.ar (busArray, audio);
		}).add;


		SynthDef(\pad, {|freq 80, amp = 0.75, pan 0, atk 0.25, rel 0.05, fnoise=0.003|
			var audio, env;
			audio = LFTri.ar(freq*Rand(1-fnoise,1+fnoise), 0, mul:amp.clip(0,0.75));
			env = EnvGen.ar(Env.perc(atk, rel), doneAction:2);
			audio = audio * env;
			Out.ar(busArray,Pan2.ar(audio,pan));
		}).add;

		SynthDef(\padE, {|freq 80, amp = 0.5, pan 0, atk 0.25, rel 0.05, fnoise=0.003|
			var audio, env;
			audio = LFTri.ar(freq*Rand(1-fnoise,1+fnoise), 0, mul:amp.clip(0,0.5));
			env = EnvGen.ar(Env.perc(atk, rel), doneAction:2);
			audio = audio * env;
			Out.ar(0,Pan2.ar(audio,pan));
		}).add;

		SynthDef(\pad2, {|freq 100, amp = 0.5, pan 0, atk 0.25, rel 0.05, fnoise=0.003|
			var audio, env;
			audio = Saw.ar(freq: freq*Rand(1-fnoise,1+fnoise), mul:amp.clip(0,0.5));
			env = EnvGen.ar(Env.perc(atk, rel), doneAction:2);
			audio = audio * env;
			Out.ar(busArray,Pan2.ar(audio,pan));
		}).add;

		SynthDef(\pad2E, {|freq 100, amp = 0.5, pan 0, atk 0.25, rel 0.05, fnoise=0.003|
			var audio, env;
			audio = Saw.ar(freq: freq*Rand(1-fnoise,1+fnoise), mul:amp.clip(0,0.5));
			env = EnvGen.ar(Env.perc(atk, rel), doneAction:2);
			audio = audio * env;
			Out.ar(0,Pan2.ar(audio,pan));
		}).add;

		SynthDef(\pad3, {|freq=100, amp=0.5,  pan 0, atk 0.25, rel 0.05, fnoise=0.003|
			var audio, env;
			audio = SinOsc.ar(freq*Rand(1-fnoise,1+fnoise),mul:amp.clip(0, 0.5));
			env = EnvGen.ar(Env.perc(atk, rel), doneAction:2);
			Out.ar(busArray,Pan2.ar(audio,pan));
		}).add;

		SynthDef(\pad3E, {|freq=100, amp=0.5,  pan 0, atk 0.25, rel 0.05, fnoise=0.003|
			var audio, env;
			audio = SinOsc.ar(freq*Rand(1-fnoise,1+fnoise),mul:amp.clip(0, 0.5));
			env = EnvGen.ar(Env.perc(atk, rel), doneAction:2);
			Out.ar(0,Pan2.ar(audio,pan));
		}).add;

		SynthDef(\pad4, {|freq 100, amp = 0.5, pan 0, atk 0.25, rel 0.05, fnoise=0.003|
			var audio, env;
			audio = Saw.ar(freq: freq*Rand(1-fnoise,1+fnoise)+Line.kr (1, 10, 1), mul:amp.clip(0,0.5));
			audio = Pulse.ar (freq: freq*Rand(1-fnoise,1+fnoise)*2+Line.kr (1, 10, 1), width: Line.kr(0,1, 0.5), mul:amp.clip(0,0.5)) + audio;
			audio = LFTri.ar(freq: freq*Rand(1-fnoise,1+fnoise)/2+Line.kr (1, 10, 1), mul:amp.clip(0,0.25)) + audio;
			audio = LPF.ar (audio, 2000);
			env = Env.perc(atk, rel).kr(2);
			audio = audio * env;
			Out.ar(0,Pan2.ar(audio,pan));
		}).add;


		SynthDef(\padG, {|freq 100, amp = 0.5, pan 0, atk 0.25, rel 0.05, fnoise=0.003, gliss = 0|
			var audio, env;
			audio = Saw.ar(freq: (XLine.kr(freq, gliss.midicps, 1))*Rand(1-fnoise,1+fnoise)+Line.kr (1, 10, 1), mul:amp.clip(0,0.5));
			audio = Pulse.ar (freq: freq*Rand(1-fnoise,1+fnoise)*2+Line.kr (1, 10, 1), width: Line.kr(0,1, 0.5), mul:amp.clip(0,0.5)) + audio;
			audio = LFTri.ar(freq: freq*Rand(1-fnoise,1+fnoise)/2+Line.kr (1, 10, 1), mul:amp.clip(0,0.25)) + audio;
			audio = LPF.ar (audio, 2000);
			env = Env.perc(atk, rel).kr(2);
			audio = audio * env;
			Out.ar(0,Pan2.ar(audio,pan));
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

		SynthDef (\wow, {
			arg atk = 2, sus = 0, rel = 3, c1 =1, c2 = (-1),
			freq= 500, detune= 0.2, pan = 0, cfhzmin=0.1, cfhzmax = 0.3, cfmin=500, cfmax=2000, rqmin= 0.1, rqmax=0.2, lsf=200, ldb=0, amp=1,
			out=0;
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

		// by  nicolaariutti, taken from https://sccode.org/1-5ay (2019)
SynthDef(\bell, {
	|fs=1, t60=1, pitchy=1, amp=0.25, gate=1|
	var sig, exciter;
	//exciter = Impulse.ar(0);
	exciter = WhiteNoise.ar() * EnvGen.ar(Env.perc(0.001, 0.05), gate) * 0.25;
	sig = Klank.ar(
		`[
			[1, 2, 2.803, 3.871, 5.074, 7.81, 10.948, 14.421],   // freqs
			[1, 0.044, 0.891, 0.0891, 0.794, 0.1, 0.281, 0.079], // amplitudes
			[1, 0.205, 1, 0.196, 0.339, 0.047, 0.058, 0.047]*t60     // ring times
		],
		exciter,
		freqscale:fs*pitchy);
	sig = FreeVerb.ar(sig) * amp;
	DetectSilence.ar(sig, 0.001, 0.5, doneAction:2);
	Out.ar(0, sig!2);
}).add;

				// by  nicolaariutti, taken from https://sccode.org/1-5ay (2019)

SynthDef(\violin, {
	| midinote=60, gate=1, amp=0.25, atk=0.1, sus=1, rel=0.1 |
	var env = EnvGen.kr(Env.asr(atk, sus, rel), gate, doneAction:2);
	var sig = VarSaw.ar(
		midinote.midicps,
		width:LFNoise2.kr(1).range(0.2, 0.8)*SinOsc.kr(5, Rand(0.0, 1.0)).range(0.7,0.8))*0.25;
	sig = sig * env * amp;
	Out.ar(0, sig!2);
}).add;

// Originally found at http://ecmc.rochester.edu/ecmc/docs/supercollider/scbook/Ch21_Interface_Investigations/ixi%20SC%20tutorial/ixi_SC_tutorial_10.html and https://github.com/brunoruviaro/SynthDefs-for-Patterns

SynthDef("flute", { arg scl = 0.125, freq = 440, ipress = 0.85, ibreath = 0.05, ifeedbk1 = 0.4, ifeedbk2 = 0.4,  rel = 0.5, gate = 1, amp = 0.5, pan = 0;

	var kenv1, kenv2, kenvibr, kvibr, sr, cr, block;
	var poly, signalOut, ifqc;
	var aflow1, asum1, asum2, afqc, atemp1, ax, apoly, asum3, avalue, atemp2, aflute1;
	var fdbckArray;

	sr = SampleRate.ir;
	cr = ControlRate.ir;
	block = cr.reciprocal;

	ifqc = freq;

	// noise envelope
	kenv1 = EnvGen.kr(Env.new(
		[ 0.0, 1.1 * ipress, ipress, ipress, 0.0 ], [ 0.06, 0.2, 0.46, 0.2 ], 'linear' )
	);
	// overall envelope
	kenv2 = EnvGen.kr(Env.new(
		[ 0.0, amp, amp, 0.0 ], [ 0.1, rel - 0.02, 0.1 ], 'linear' ), doneAction: 2
	);
	// vibrato envelope
	kenvibr = EnvGen.kr(Env.new( [ 0.0, 0.0, 1, 1, 0.0 ], [ 0.5, 0.5, rel - 1.5, 0.5 ], 'linear') );

	// create air flow and vibrato
	aflow1 = LFClipNoise.ar( sr, kenv1 );
	kvibr = SinOsc.ar( 5, 0, 0.1 * kenvibr );

	asum1 = ( ibreath * aflow1 ) + kenv1 + kvibr;
	afqc = ifqc.reciprocal - ( asum1/20000 ) - ( 9/sr ) + ( ifqc/12000000 ) - block;

	fdbckArray = LocalIn.ar( 1 );

	aflute1 = fdbckArray;
	asum2 = asum1 + ( aflute1 * ifeedbk1 );

	//ax = DelayL.ar( asum2, ifqc.reciprocal * 0.5, afqc * 0.5 );
	ax = DelayC.ar( asum2, ifqc.reciprocal - block * 0.5, afqc * 0.5 - ( asum1/ifqc/cr ) + 0.001 );

	apoly = ax - ( ax.cubed );
	asum3 = apoly + ( aflute1 * ifeedbk2 );
	avalue = LPF.ar( asum3, 2000 );

			aflute1 = DelayC.ar( avalue, ifqc.reciprocal - block, afqc );


	fdbckArray = [ aflute1 ];

	LocalOut.ar( fdbckArray );

	signalOut = avalue;

			OffsetOut.ar( 0, Pan2.ar([ signalOut * kenv2, signalOut * kenv2 ],pan ));

}).add;


		// from https://github.com/brunoruviaro/SynthDefs-for-Patterns/blob/master/all.scd, original name "plucking"

SynthDef("pluck2", {arg amp = 0.1, freq = 440, decay = 5, coef = 0.1, pan = 0, atk = 0, rel = 1;
var env, snd;
env = EnvGen.kr(Env.linen(atk, rel*2, rel), doneAction: 2);
snd = Pluck.ar(
        in: WhiteNoise.ar(amp),
        trig: Impulse.kr(0),

        maxdelaytime: 0.1,
        delaytime: freq.reciprocal,
        decaytime: decay,
        coef: coef);
			Out.ar(0, Pan2.ar ([snd, snd], pan));
}).add;


// taken from http://www.mcld.co.uk/cymbalsynthesis/
SynthDef (\crash, {arg freq, fil = 10000, out = 0, amp = 1, atk  = 0.5, rel = 1;
	var lodriver, locutoffenv, hidriver, hicutoffenv, freqs, res, thwack;
	locutoffenv = EnvGen.ar(Env.perc(atk, rel), doneAction: 2) * fil + 10;
	lodriver = LPF.ar(WhiteNoise.ar(0.1), locutoffenv);
	hicutoffenv = 10001 - (EnvGen.ar(Env.perc(atk, rel), doneAction: 2) * fil);
	hidriver = HPF.ar(WhiteNoise.ar(0.1), hicutoffenv);
	hidriver = hidriver * EnvGen.ar(Env.perc(atk*2, rel*2, amp/2), doneAction: 2);
	thwack = EnvGen.ar(Env.perc(0.001,0.001,1));
	freqs  = {exprand(300, 20000)}.dup(100);
	res    = Ringz.ar(lodriver + hidriver + thwack, freqs).mean;
	res = ((res * 1) + (lodriver * 2) + thwack).dup;
	Out.ar (0, Pan2.ar(res, 0, amp));
}).add;

		//________________________________________________________________________________________________________


		SynthDef(\dembow, {|tempo = 120, octava = -1, pos = 0, imp = #[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25], freq = 5000, amp = 1|
			var synth;
			synth = LPF.ar(
				Pan2.ar(
					PlayBuf.ar(2, ~dembow, BufRateScale.kr(~dembow) *
						Demand.kr(Impulse.kr((tempo/60)*0.5), 0, Dseq([0.75] * ((tempo/140) * octava), inf)),
						Impulse.kr((tempo/60)*Demand.kr(Impulse.kr((tempo/60)), 0, Dseq(imp, inf))),
						BufFrames.kr(~dembow)* pos, 1)).flat*0.4, freq);
			Out.ar(0, synth * amp)
		}).add;

		SynthDef(\colegiala, {|tempo = 110, octava = -1, pos = 0, imp = #[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25], freq = 5000, amp = 1|
			var synth;
			synth = LPF.ar(
				Pan2.ar(
					PlayBuf.ar(2, ~luislacolegiala, BufRateScale.kr(~luislacolegiala) *
						Demand.kr(Impulse.kr((tempo/60)*0.5), 0, Dseq([0.75] * (octava), inf)),
						Impulse.kr((tempo/60)*Demand.kr(Impulse.kr((tempo/60)), 0, Dseq(imp, inf))),
						BufFrames.kr(~luislacolegiala)* pos, 1)).flat*0.4, freq);
			Out.ar(0, synth * amp)
		}).add;

		SynthDef(\csf, {|tempo = 120, octava = -1, pos = 0, imp = #[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25], freq = 5000, amp = 1|
			var synth;
			synth = LPF.ar(
				Pan2.ar(
					PlayBuf.ar(2, ~csf, BufRateScale.kr(~csf) *
						Demand.kr(Impulse.kr((tempo/60) * 0.5), 0, Dseq([0.75] * ((tempo/140) * octava), inf)),
						Impulse.kr((tempo/60) * Demand.kr(Impulse.kr((tempo/60)), 0, Dseq(imp, inf))),
						BufFrames.kr(~csf)* pos, 1)).flat * 0.4, freq);
			Out.ar(0, synth * amp)
		}).add;

	}
}
