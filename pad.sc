

Pad {
var <>name, <>func;
classvar <version;

	*initClass {
	 super.initClass;
	    version = "Mayo 4 2016";
		("Pad : version 1.0").postln;
	}

	*cumbia {

	Pdef(\pad, Pbind(
			\instrument, Pdefn (\padInst, \pad),
			\fase, Pdefn (\padFase, 0.7),
			\num, Pdefn (\padNum, 2),
			\atk, Pdefn (\padAtk, 0.05),
			\rel, Pdefn (\padRel, 0.25),
			\amp, Pdefn (\padAmp, 0.95),
			\pan, Pdefn (\padPan, Pseq([0], inf)),
			\midinote, Pdefn(\padNotas, 62),
			\dur, Pdefn (\padDur, 1/4),
	)).play(quant:4);
	Pdef (\pad).fadeTime = Pdefn (\padFade, 0);
	}
}