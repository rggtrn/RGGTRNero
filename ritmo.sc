

Ritmo {

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
		("ritmo : version 1.0").postln;
	}

	*cumbia {

	Pdef(\bombo, Pbind(
			\instrument,  Pdefn (\bomboInst, \samples),
			\db, Pdefn (\bomboDb, -20),
			\buf, Pdefn (\bomboBuf, ~bombo),
			\freq, Pdefn (\bomboFreq, 1),
			\dur, Pdefn (\bomboDur, 1),
		)).play(quant:4);

	Pdef(\guira, Pbind(
			\instrument,  Pdefn (\guiraInst, \guira),
			\amp, Pdefn (\guiraAmp, Pseq([0.7,0,0.5,0.5], inf)),
			\atk, Pdefn (\guiraAtk, 0.015),
			\dura, Pdefn (\guiraDura, Pseq([1/64,1/32,1/16,1/16]*(80/60) ,inf)),
			\rel, Pdefn (\guiraRel, 0.05),
			\freq, Pdefn (\guiraFreq, Pseq(#[ 1,r, 1, 1],inf)),
			\dur, Pdefn (\guiraDur, 0.25),
		)).play(quant:4);
	}
*detener {

	Pdef(\bombo, Pbind(
			\instrument,  Pdefn (\bomboInst, \samples),
			\db, Pdefn (\bomboDb, -20),
			\buf, Pdefn (\bomboBuf, ~bombo),
			\freq, Pdefn (\bomboFreq, 1),
			\dur, Pdefn (\bomboDur, 1),
		)).play(quant:4);

	Pdef(\guira, Pbind(
			\instrument,  Pdefn (\guiraInst, \guira),
			\amp, Pdefn (\guiraAmp, Pseq([0.7,0,0.5,0.5], inf)),
			\atk, Pdefn (\guiraAtk, 0.015),
			\dura, Pdefn (\guiraDura, Pseq([1/64,1/32,1/16,1/16]*(80/60) ,inf)),
			\rel, Pdefn (\guiraRel, 0.05),
			\freq, Pdefn (\guiraFreq, Pseq(#[ 1,r, 1, 1],inf)),
			\dur, Pdefn (\guiraDur, 0.25),
		)).stop(quant:4);

	}
}