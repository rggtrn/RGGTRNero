RitmoE {

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
	*toca {arg bomboDb = -200, bomboFreq =  Pseq ([\r, 0.1, 0.1], inf), bomboDur = Pseq ([1, 0.5, 0.5], inf), bomboPan = 0, guiraDb = -200, guiraFreq = Pseq(#[ 1,r, 1, 1],inf), guiraDur= 0.25, guiraPan = 0, timbalesDur = Pxrand([0.25, 0.5, 0.75, 0.25, 0.25],inf), timbalesNum = 0, timbalesPan = -1, campanaDb = -200, campanaDur = 1, campanaPan = 0;

		Pbindef(\bombo,
			\instrument, \samplesE,
			\db, bomboDb,
			\buf, Pdefn (\bomboBuf, RGGTRN.bombo),
			\freq, bomboFreq,
			\dur, bomboDur,
			\pan, bomboPan,

		).play(quant:4);
		Pbindef(\bombo).quant = 4;

		Pbindef(\guira,
			\instrument, \guiraE,
			\db, Pseq([0.7,0,0.5,0.5]*guiraDb, inf),
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
			\db, Pseq([1, 0.25, 0.25, 1, 0.25, 0.25, 1, 0.25, 0.25 , 1,0.25, 0.5]/4, timbalesNum),
			\buf, RGGTRN.timbal,
			\pan, timbalesPan,
			\freq, Prand(#[r,1, 1, 1, 1,1, 1, 3, 3],inf),
			\dur,  timbalesDur,
		).play(quant:4);
		Pbindef(\redoble).quant = 4;

		Pbindef(\cowBell,
			\instrument,  \timbalE,
			\db,  campanaDb,
			\buf, RGGTRN.timbal,
			\freq, Prand(#[7],inf),
			\dur,  campanaDur,
			\pan, campanaPan,
		).play(quant:4);
		Pbindef(\cowBell).quant = 4;


	}
	*detener {

		Pbindef(\bombo).stop;

		Pbindef(\guira).stop;

		Pbindef(\redoble).stop;

		Pbindef(\cowBell).stop;


	}
}