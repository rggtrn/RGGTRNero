Vox {

classvar <version;
classvar <s;
classvar <r;
classvar <y;
classvar <a;
classvar <x;
classvar <v;

	*initClass {
	 super.initClass;
	    version = "Jul 27 2017";
		("vox : version 1.0").postln;
	}

	*decir {arg buffer = RGGTRN.internacional, db = -10, atk = 0.001, rel =Pseq([4],1), rate = 0, dur = Pseq([4],1), pan = 0;

Pbindef(\vox,
	\instrument, \samples,
	\db, -10,
	\buf, buffer,
	\freq, rate,
	\dur, dur,
	\rel, rel,
	\pan, pan,
).play;
Pbindef(\vox).quant = 0;

	}

*detener {

		Pbindef(\vox).stop;
	}
}