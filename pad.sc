Teclado {
	var <>name, <>func;
	classvar <version;
	classvar<>chichiricha;
	classvar<>montuno;

	*initClass {
		super.initClass;
		chichiricha = Pseq ([Pseq ([[62, 62+12], [65, 65+12], [69, 69+12]], 2), Pseq ([[60, 60+12],[64, 64+12],[67, 67+12]], 2)], inf)-24;
		montuno =  Pseq (#[1.5, 1.5, 1], inf);

		version = "Mayo 4 2017";
		("Pad : version 1.0").postln;
	}

	*toca {arg inst = \pad, atk = 0.05, rel = 0.35, db = -32, pan = 0, nota = 62, dur = 1;

		Pbindef(\pad,
			\instrument, inst,

			\atk, atk,
			\rel, rel,
			\db, db,
			\pan, pan,
			\midinote, nota+12,
			\dur, dur,
		).play(quant:4);
		Pbindef(\pad).quant = 4;
	}

	*detener {

		Pbindef(\pad).stop(quant:4);
	}
}