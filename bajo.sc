

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
	    version = "Mayo 4 2016";
		("Bajo : version 1.0").postln;
	}

	*cumbia {


Pdef(\bajo, Pbind(
			\instrument,  Pdefn (\bajoInst, \bajo),
			\amp, Pdefn (\bajoAmp, 0.75),
			\atk, Pdefn (\BajoAtk, 0.025),
			\rel, Pdefn (\bajoRel, Pseq (#[1, 0.5, 0.5], inf)),
			\midinote, Pdefn (\bajoNotas , Pseq((#[62, 65, 69]-12),inf)),
			\dur, Pdefn (\bajoDur, Pseq(#[1, 0.5, 0.5], inf)),
		)).play(quant:4);
Pdef (\bajo).fadeTime = Pdefn (\bajoFade, 0);

	}
}