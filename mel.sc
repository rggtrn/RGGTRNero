

Mel {

classvar <version;
classvar <escala;


	*initClass {
	 super.initClass;
	    version = "Mayo 4 2016";
		("Bajo : version 1.0").postln;
	}

	*cumbia {


Pdef(\mel, Pbind(
			\instrument,  Pdefn (\melInst, \mel),
			\amp, Pdefn (\melAmp, 0.75),
			\atk, Pdefn (\melAtk, 0.025),
			\rel, Pdefn (\melRel, Pseq(#[1, 0.5, 0.5], inf)),
			\midinote, Pdefn (\melNotas),
			\dur, Pdefn (\melDur, 0.5),
			\legato, Pdefn (\melLeg, 0),
			//\octave, Pdefn (\melOctava, 5),
			//\scale, Pdefn (\melEsc, Pfunc ({Scale.ionian}, inf));
		)).play(quant:4);

	}

*detener {

		Pdef (\mel).stop;
	}

}