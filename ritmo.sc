Ritmo {

	classvar <version;
	classvar <s;
	classvar <r;
	classvar <y;
	classvar <a;
	classvar <x;
	classvar <v;
	classvar <>claveRumba;
	classvar <> montuno;
	classvar<> montunoM;

	*initClass {
		super.initClass;
		version = "Mayo 4 2016";
		("ritmo : version 1.0").postln;
		claveRumba = Pseq (#[r, r, 4, r, 4, r, r, r, 4, r, r, 4, r, r, r, 4], inf);
		montuno =  Pseq (#[1.5, 1.5, 1, 3, 1]/2, inf);
		montunoM =  Pseq (#[1.5, 1.5, 13]/2, inf);
	}
	//cowbell amp should be 0.35 and guira 0.20
	*toca {arg bomboDb = -200, bomboFreq =  Pseq ([\r, 0.1, 0.1], inf), bomboDur = Pseq ([1, 0.5, 0.5], inf), bomboPan = 0,
		hiFreq = 1,  hiDur = 0.5, hiRel = Pseq ([0.1, 0.50], inf), hiPan = -0.8,
		hiFil = Pseq ([10000, 5000], inf), hiDb = -200, guiraDb = -200, guiraFreq = Pseq(#[ 1,r, 1, 1],inf), guiraDur= 0.25, guiraDura= Pseq([1/64,1/32,1/16,1/16]*(80/60) ,inf), guiraPan = 0, timbalesFreq = Prand(#[r,1, 1, 1, 1,1, 1, 3, 3],inf), timbalesDur = Pxrand([0.25, 0.5, 0.75, 0.25, 0.25],inf), timbalesNum = 0, timbalesAmp = 0, timbalesPan = -1, campanaDb = -200, campanaDur = 1, campanaFreq = Prand(#[7],inf), campanaPan = 0, congaCFreq = claveRumba, congaCDur = 0.25,
		congaCDb = -300 ,congaOfreq = Pseq (#[r, r, r,r, r, r, 1,r], inf), congaODb = -300, congaODur = 0.25, congaCPan = 0, congaOPan = 0,
		crashDur = 1, crashFil = 10000, crashDb = -15, crashPan = -1, crashRel = 1, crashAtk = 0.5, crashFreq  = \r;

		Pbindef(\bombo,
			\instrument, \samplesStereo,
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
			\instrument, \samplesMono,
			\buf, Pseq ([RGGTRN.congaC, RGGTRN.congaC, RGGTRN.congaC, RGGTRN.congaC], inf),
			\speed, 100,
			\freq, congaCFreq,
			\db, congaCDb,
			\dur, congaCDur,
			\pan, congaCPan,
		).play(quant:4);
		Pbindef(\congaC).quant = 4;


		Pbindef(\congaO,
			\instrument, \samplesStereo,
			\buf, RGGTRN.congaS,
			\speed, 10000,
			\freq, congaOfreq,
			\db, congaODb,
			\dur, congaODur,
			\pan, congaOPan,
		).play(quant:4);
		Pbindef(\congaO).quant = 4;

		Pbindef (\hi,
			\instrument,  \hi,
			\freq, hiFreq,
			\dur, hiDur,
			\rel, hiRel,
			\fil, hiFil,
			\db, hiDb,
			\pan, hiPan,
		).play(quant:4);
		Pbindef(\hi).quant = 4;

		Pbindef (\crash,
			\instrument,  \crash,
			\freq, crashFreq,
			\dur, crashDur,
			\rel, crashRel,
			\fil, crashFil,
			\db, crashDb,
			\pan, crashPan,
			\atk, crashAtk,
		).play(quant:4);
		Pbindef(\crash).quant = 4;

	}

	*detener {
		Pbindef(\bombo).stop;
		Pbindef(\guira).stop;
		Pbindef(\redoble).stop;
		Pbindef(\cowBell).stop;
		Pbindef(\congaO).stop;
		Pbindef(\congaC).stop;
		Pbindef(\hi).stop;
		Pbindef(\crash).stop;



	}
}