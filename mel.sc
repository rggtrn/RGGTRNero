

Mel {

classvar <version;
classvar <escala;


	*initClass {
	 super.initClass;
	    version = "Mayo 4 2016";
		("Bajo : version 1.0").postln;
	}

	*toca {arg inst = \mel, db = -15, atk = 0.025, rel = Pseq(#[1, 0.5, 0.5], inf), nota = 62, dur = 0.5, legato = 0, arpegiar = 0;


Pbindef(\mel,
			\instrument,  inst,
			\db, db,
			\atk, atk,
			\rel, rel,
			\midinote, nota,
			\dur, dur,
			\legato, legato,
			//\octave, Pdefn (\melOctava, 5),
			//\scale, Pdefn (\melEsc, Pfunc ({Scale.ionian}, inf));
			\strum, arpegiar
		).play(quant:4);
				^super.newCopyArgs(inst, db, atk, rel, nota, dur, legato, arpegiar);

	}

*detener {

		Pbindef (\mel).stop;
	}

}