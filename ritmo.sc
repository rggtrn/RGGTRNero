

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
			\db, Pdefn (\bomboDb, -10),
			\buf, Pdefn (\bomboBuf, RGGTRN.bombo),
			\freq, Pdefn (\bomboFreq, Pseq ([\r, 0.1, 0.1], inf)),
			\dur, Pdefn (\bomboDur, Pseq ([1, 0.5, 0.5], inf)),
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

	Pdef(\redoble, Pbind(
			\instrument,  \timbal,
			\amp, Pseq([1, 0.25, 0.25, 1, 0.25, 0.25, 1, 0.25, 0.25 , 1,0.25, 0.5], 4),
			\buf, RGGTRN.timbal,
			\pan, -1,
			\freq, Prand(#[r,1, 1, 1, 1,1, 1, 3, 3],inf),
			\dur,  Pxrand([0.25, 0.5, 0.75, 0.25, 0.25],inf),
		)).play(quant:4);

	Pdef(\jamBlock, Pbind(
			\instrument,  \timbal,
			\amp, Pseq([1, 0.5, 0.5, 1, 0.5, 0.5, 1, 0.5, 0.5 , 1,0.5, 0.5]-0.20, inf),
			\buf, RGGTRN.timbal,
			\pan, 0,
			\freq, Prand(#[7],inf),
			\dur,  Pseq([1],inf),
		)).play(quant:4);


	}
*detener {

	Pdef(\bombo, Pbind(
			\instrument,  Pdefn (\bomboInst, \samples),
			\db, Pdefn (\bomboDb, -20),
			\buf, Pdefn (\bomboBuf, RGGTRN.bombo),
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

	Pdef(\redoble, Pbind(
			\instrument,  \timbal,
			\amp, Pseq([2, 0.5, 0.5, 2, 0.5, 0.5, 2, 0.5, 0.5 , 2,0.5, 1], inf),
			\buf, RGGTRN.timbal,
			\pan, -1,
			\freq, Prand(#[r,1, 1, 1, 1,1, 1, 3, 3],inf),
			\dur,  Pxrand([0.25, 0.5, 0.75, 0.25, 0.25],inf),
		)).stop(quant:4);

	Pdef(\jamBlock, Pbind(
			\instrument,  \timbal,
			\amp, Pseq([1, 0.5, 0.5, 1, 0.5, 0.5, 1, 0.5, 0.5 , 1,0.5, 0.5], inf),
			\buf, RGGTRN.timbal,
			\pan, -1,
			\freq, Prand(#[7],inf),
			\dur,  Pseq([1],inf),
		)).stop(quant:4);


	}
}