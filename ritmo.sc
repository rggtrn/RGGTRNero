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
//cowbell amp should be 0.35 and guira 0.20
	*toca {arg bomboDb = -200, bomboFreq =  Pseq ([\r, 0.1, 0.1], inf), bomboDur = Pseq ([1, 0.5, 0.5], inf), bomboPan = 0, guiraDb = -200, guiraFreq = Pseq(#[ 1,r, 1, 1],inf), guiraDur= 0.25, guiraDura= Pseq([1/64,1/32,1/16,1/16]*(80/60) ,inf), guiraPan = 0, timbalesFreq = Prand(#[r,1, 1, 1, 1,1, 1, 3, 3],inf), timbalesDur = Pxrand([0.25, 0.5, 0.75, 0.25, 0.25],inf), timbalesNum = 0, timbalesAmp = 0, timbalesPan = -1, campanaDb = -200, campanaDur = 1, campanaFreq = Prand(#[7],inf), campanaPan = 0, congaCFreq = Pseq ([1.5, 1.5, 0, 1.5], inf),
		congaCDb = -300,congaOfreq = Pseq (#[r, r, r,r, r, r, 1,r], inf), congaODb = -300;

		Pbindef(\bombo,
			\instrument, \samples,
			\db, bomboDb,
			\buf, Pdefn (\bomboBuf, RGGTRN.bombo),
			\freq, bomboFreq,
			\dur, bomboDur,
			\pan, bomboPan,

		).play(quant:4);
		Pbindef(\bombo).quant = 4;

		Pbindef(\guira,
			\instrument, \guira,
			\db, guiraDb,
			\atk, Pdefn (\guiraAtk, 0.015),
			\dura, Pdefn (\guiraDura, Pseq([1/64,1/32,1/16,1/16]*(80/60) ,inf)),
			\rel, Pdefn (\guiraRel, 0.05),
			\freq, guiraFreq,
			\dur, guiraDur,
			\pan, guiraPan,

		).play(quant:4);
		Pbindef(\guira).quant = 4;

		Pbindef(\redoble,
			\instrument,  \timbal,
			\amp, Pseq([1, 0.25, 0.25, 1, 0.25, 0.25, 1, 0.25, 0.25 , 1,0.25, 0.5]/timbalesAmp, timbalesNum),
			\buf, RGGTRN.timbal,
			\pan, timbalesPan,
			\freq, timbalesFreq,
			\dur,  timbalesDur,
		).play(quant:4);
		Pbindef(\redoble).quant = 4;

		Pbindef(\cowBell,
			\instrument,  \timbal,
			\db,  campanaDb,
			\buf, RGGTRN.timbal,
			\freq, campanaFreq,
			\dur,  campanaDur,
			\pan, campanaPan,
		).play(quant:4);
		Pbindef(\cowBell).quant = 4;

Pbindef(\congaC,
	\instrument, \samples,
			\buf, Pseq ([RGGTRN.congaC, RGGTRN.congaC, RGGTRN.congaC, RGGTRN.congaC], inf),
    \speed, 100,
	\freq, congaCFreq,
			\db, congaCDb,
	\dur, 0.25,
		).play(quant:4);
		Pbindef(\congaC).quant = 4;


Pbindef(\congaO,
	\instrument, \samples,
	\buf, RGGTRN.congaS,
    \speed, 10000,
			\freq, congaOfreq,
			\db, congaODb,
	\dur, 0.25,
		).play(quant:4);
Pbindef(\congaO).quant = 4;

	}
	*detener {

		Pbindef(\bombo).stop;

		Pbindef(\guira).stop;

		Pbindef(\redoble).stop;

		Pbindef(\cowBell).stop;


	}
}