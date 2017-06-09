

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

	*toca {arg bDb = -20, bFreq =  Pseq ([\r, 0.1, 0.1], inf), bDur = Pseq ([1, 0.5, 0.5], inf), gAmp = 0, gFreq = Pseq(#[ 1,r, 1, 1],inf), gDur= 0.25, rNum = 0, rPan = -1, jAmp = 0;

	Pbindef(\bombo,
			\instrument, \samples,
			\db, bDb,
			\buf, Pdefn (\bomboBuf, RGGTRN.bombo),
			\freq, bFreq,
			\dur, bDur,
		).play(quant:4);

	Pbindef(\guira,
			\instrument, \guira,
			\amp, Pseq([0.7,0,0.5,0.5]*gAmp, inf),
			\atk, Pdefn (\guiraAtk, 0.015),
			\dura, Pdefn (\guiraDura, Pseq([1/64,1/32,1/16,1/16]*(80/60) ,inf)),
			\rel, Pdefn (\guiraRel, 0.05),
			\freq, gFreq,
			\dur, gDur,
		).play(quant:4);

	Pbindef(\redoble,
			\instrument,  \timbal,
			\amp, Pseq([1, 0.25, 0.25, 1, 0.25, 0.25, 1, 0.25, 0.25 , 1,0.25, 0.5], rNum),
			\buf, RGGTRN.timbal,
			\pan, rPan,
			\freq, Prand(#[r,1, 1, 1, 1,1, 1, 3, 3],inf),
			\dur,  Pxrand([0.25, 0.5, 0.75, 0.25, 0.25],inf),
		).play(quant:4);

	Pbindef(\jamBlock,
			\instrument,  \timbal,
			\amp,  Pseq([1, 0.5, 0.5]-0.20* jAmp, inf),
			\buf, RGGTRN.timbal,
			\pan, 0,
			\freq, Prand(#[7],inf),
			\dur,  Pseq([1],inf),
		).play(quant:4);
				^super.newCopyArgs(bDb, bFreq, bDur, gAmp, gFreq, gDur, rNum, rPan, jAmp);


	}
*detener {

	Pbindef(\bombo).stop;

	Pbindef(\guira).stop;

	Pbindef(\redoble).stop;

	Pbindef(\jamBlock).stop;


	}
}