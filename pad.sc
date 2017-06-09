

Pad {
var <>name, <>func;
classvar <version;

	*initClass {
	 super.initClass;
	    version = "Mayo 4 2017";
		("Pad : version 1.0").postln;
	}

	*toca {arg sinte = \pad, atk = 0.05, rel = 0.25, db = -20, pan = 0, nota = 62, dur = 1;

	Pbindef(\pad, Pbind(
			\instrument, sinte,
			\fase, 0.7,
			\num, 2,
			\atk, atk,
			\rel, rel,
			\db, db,
			\pan, pan,
			\midinote, nota,
			\dur, dur,
		)).play(quant:4);
				^super.newCopyArgs(db, atk, rel, nota, dur, pan);


	}

	*detener {

	Pbindef(\pad).stop(quant:4);
	}
}