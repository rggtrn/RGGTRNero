Keyboard {
	var <>name, <>func;
	classvar <version;

	*initClass {
		super.initClass;
		version = "Mayo 4 2017";
		("Pad : version 1.0").postln;
	}

	*toca {arg inst = \pad, atk = 0.05, rel = 0.25, db = -5, pan = 0, nota = 62, dur = 1;

		Pbindef(\pad,
			\instrument, inst,

			\atk, atk,
			\rel, rel,
			\db, db,
			\pan, pan,
			\midinote, nota,
			\dur, dur,
		).play(quant:4);
		Pbindef(\pad).quant = 4;
	}

	*detener {

		Pbindef(\pad).stop(quant:4);
	}
}