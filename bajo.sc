Bajo {

classvar <version;
classvar <s;
classvar <r;
classvar <y;
classvar <a;
classvar <x;
classvar <v;

	*initClass {
	 super.initClass;
	    version = "Mayo 4 2017";
		("Bajo : version 1.0").postln;
	}

	*toca {arg db = -15, atk = 0.025, rel = Pseq (#[1, 0.5, 0.5], inf), nota = Pseq((#[62, 65, 69]-12),inf), dur = Pseq(#[1, 0.5, 0.5], inf);

Pbindef(\bajo,
			\instrument,  Pdefn (\bajoInst, \bajo),
			\db, db,
			\atk, atk,
			\rel, rel,
			\midinote, nota,
			\dur, dur,
		).play(quant:4);


		^super.newCopyArgs(db, atk, rel, nota, dur);

	}
* fade {arg fadeTime = 0;
		   Pbindef (\bajo).fadeTime = fadeTime;
			^super.newCopyArgs(fadeTime);
	}
*detener {

		Pbindef(\bajo).stop;
	}
}