Ch {

classvar <version;
classvar <s;
classvar <r;
classvar <y;
classvar <a;
classvar <x;
classvar <v;

classvar <>uno = "Bajo.toca(inst: 'bajo2', db: -20, nota:Pseq ([Pseq ([62, 69, 65], 1),  Pseq ([62, 69, 65, 60], 1)], inf), dur: Pseq ([Pseq ([1.5, 1.5,  13]/2,1), Pseq ([1.5, 1.5,  13]/2,1)], inf), rel:Pseq ([Pseq ([1.5, 1.5, 13]/1.5,1), Pseq ([1.5, 1.5,  13]/1.5,1)], inf));";

	classvar <>dos = "(
Bajo.toca(inst: 'bajo2', db: -20, nota:Pseq ([Pseq ([62, 69, 65], 1),  Pseq ([62, 69, 65, 60], 1)], inf), dur: Pseq ([Pseq ([1.5, 1.5,  13]/2,1), Pseq ([1.5, 1.5,  13]/2,1)], inf), rel:Pseq ([Pseq ([1.5, 1.5, 13]/1.5,1), Pseq ([1.5, 1.5,  13]/1.5,1)], inf));


Mel2.toca(inst: Pseq (['mel3'], inf), pan: 0.8, nota: Pstutter (1, Pseq (#[74, 74, 81, 72, 77, 81, 72, 72, 79, 79, 76, 79]-12, inf)), dur: Pseq	([1.5, 1.5, 1]/4,inf),  db:  Pseq ([-24, -27, -30, -34]*0.65, inf), atk: 0.0005, rel: Pseq ([1.5, 1.5, 1]/1,inf) + Prand ((0.01 .. 0.025),inf));
)";

	classvar <>tres = "(
Ritmo.toca(campanaPan: -0.8, campanaDb: -12, campanaDur: Pseq([Pseq ([4], 1), Pseq ([1], inf)], inf), guiraDb: -100, guiraPan: -0.8, timbalesDur: Pseq ([0.25], inf), timbalesNum: 0, congaCPan: -0.8, congaCDb: Pseq([Pseq ([-100], 1), Pseq ([-14, -17, -15, -20 ]*100, inf)], inf), congaOfreq: Pseq (#[r,r,r,r,  r, r, r,r,   r,r,r,r,   r, r, r,r], inf), congaOPan: -0.8, congaODb: Pseq([Pseq ([-100], 1), Pseq ([-19], inf)]));


Mel2.toca(inst: Pseq (['mel3'], inf), pan: 0.8, nota: Pstutter (1, Pseq (#[74, 74, 81, 72, 77, 81, 72, 72, 79, 79, 76, 79]-12, inf)), dur: Pseq	([1.5, 1.5, 1]/4,inf),  db:  Pseq ([-24, -27, -30, -34]*0.65, inf), atk: 0.0005, rel: Pseq ([1.5, 1.5, 1]/1,inf) + Prand ((0.01 .. 0.025),inf));


Mel3.toca(inst: Pseq (['mel3'], inf), pan: 0.8, nota: Pstutter (1, Pseq (#[74, 74, 81, 72, 77, 81, 72, 72, 79, 79, 76, 79]-24, inf)), dur: Pseq ([1.5, 1.5, 1]/4,inf),  db:  Pseq ([-24, -27, -30, -34]*0.60, inf), atk: 0.0005, rel: Pseq ([1.5, 1.5, 1]/1,inf) + Prand ((0.01 .. 0.025),inf));
)";
	classvar <>cuatro = "(
Ritmo.toca(campanaPan: -0.8, campanaDb: -12, campanaDur: 1, guiraDb: -25, guiraPan: -0.8, timbalesDur: Pseq ([0.25], inf), timbalesNum: 0, congaCDb: Pseq ([-14, -17, -15, -20 ], inf), congaOfreq: Pseq (#[r,r,r,r,  r, r, 1,r,   r,r,r,r,   r, r, 1,1], inf), congaODb: -19, congaOPan: -0.8, congaCDb: -0.8);

Bajo.toca(inst: 'bajo2', db: -20, nota: Pseq ([62, 69, 65, 60, 64], inf), dur: Pseq ([1.5, 1.5, 1,  3, 1]/2,inf), rel: Pseq ([1.5, 1.5, 1, 3, 1]/1.5,inf) + Prand ((0.01 .. 0.025),inf));


Teclado.toca(inst: 'pad3', pan: -0.8, db: Pseq ([-24, -27, -30, -34]*1.05, inf),  nota: Pseq ([[62, 74], [65, 77], [69, 81], [62, 72], [65, 77], [69, 81], [60, 72], [64, 76], [67, 79], [60, 72], [64, 76], [67, 79]]-12, inf), dur: Pseq ([1.5, 1.5, 1]/4,inf), rel: Pseq ([1.5, 1.5, 1]/4,inf));


Mel2.toca(inst: Pseq (['mel3'], inf), pan: 0.8, nota: Pstutter (1, Pseq (#[74, 74, 81, 72, 77, 81, 72, 72, 79, 79, 76, 79]-12, inf)), dur: Pseq	([1.5, 1.5, 1]/4,inf),  db:  Pseq ([-24, -27, -30, -34]*0.65, inf), atk: 0.0005, rel: Pseq ([1.5, 1.5, 1]/1,inf) + Prand ((0.01 .. 0.025),inf));


Mel3.toca(inst: Pseq (['mel3'], inf), pan: 0.8, nota: Pstutter (1, Pseq (#[74, 74, 81, 72, 77, 81, 72, 72, 79, 79, 76, 79]-24, inf)), dur: Pseq ([1.5, 1.5, 1]/4,inf),  db:  Pseq ([-24, -27, -30, -34]*0.60, inf), atk: 0.0005, rel: Pseq ([1.5, 1.5, 1]/1,inf) + Prand ((0.01 .. 0.025),inf));
)";

	classvar <>cinco = "(
Ritmo.toca(campanaPan: -0.8, campanaDb: -12, campanaDur: 1, guiraDb: -25, guiraPan: -0.8, timbalesDur: Pseq ([0.25], inf), timbalesNum: 0, congaCDb: Pseq ([-14, -17, -15, -20 ], inf), congaOfreq: Pseq (#[r,r,r,r,  r, r, 1,r,   r,r,r,r,   r, r, 1,1], inf), congaODb: -19, congaOPan: -0.8, congaCDb: -0.8);

Bajo.toca(inst: 'bajo2', db: -20, nota: Pseq ([62, 69, 65, 60, 64], inf), dur: Pseq ([1.5, 1.5, 1,  3, 1]/2,inf), rel: Pseq ([1.5, 1.5, 1, 3, 1]/1.5,inf) + Prand ((0.01 .. 0.025),inf));

Teclado.toca(inst: 'pad3', pan: -0.8, db: Pseq ([-24, -27, -30, -34]*1.05, inf),  nota: Pseq ([[62, 74], [65, 77], [69, 81], [62, 72], [65, 77], [69, 81], [60, 72], [64, 76], [67, 79], [60, 72], [64, 76], [67, 79]]-12, inf), dur: Pseq ([1.5, 1.5, 1]/4,inf), rel: Pseq ([1.5, 1.5, 1]/4,inf));


Mel3.toca(inst: Pseq (['mel3'], inf), pan: 0.8, nota: Pstutter (1, Pseq (#[74, 74, 81, 72, 77, 81, 72, 72, 79, 79, 76, 79]-24, inf)), dur: Pseq ([1.5, 1.5, 1]/4,inf),  db:  Pseq ([-24, -27, -30, -34]*0.60, inf), atk: 0.0005, rel: Pseq ([1.5, 1.5, 1]/1,inf) + Prand ((0.01 .. 0.025),inf));

Mel2.toca(inst: Pseq (['mel3'], inf), pan: 0.8, nota: Pstutter (1, Pseq (#[74, 74, 81, 72, 77, 81, 72, 72, 79, 79, 76, 79]-12, inf)), dur: Pseq	([1.5, 1.5, 1]/4,inf),  db:  Pseq ([-24, -27, -30, -34]*0.65, inf), atk: 0.0005, rel: Pseq ([1.5, 1.5, 1]/1,inf) + Prand ((0.01 .. 0.025),inf));

Mel.toca(inst: 'pluck', pan: 0.8, nota: Pseq ([69, 62], inf) + Pseq ([0, 12], inf), dur: Pseq ([0.5, 0.25, 0.75, 0.5], inf), rel: Pseq ([0.5, 1], inf), db:-18, atk: 0.01);
)";

	classvar <>seis = "(
Ritmo.toca(campanaPan: -0.8, campanaDb: -12, campanaDur: 1, guiraDb: -25, guiraPan: -0.8, timbalesDur: Pseq ([0.25], inf), timbalesNum: 0, congaCDb: Pseq ([-14, -17, -15, -20 ], inf), congaOfreq: Pseq (#[r,r,r,r,  r, r, 1,r,   r,r,r,r,   r, r, 1,1], inf), congaODb: -19, congaOPan: -0.8, congaCDb: -0.8);

Bajo.toca(inst: 'bajo2', db: -19, nota: Pseq ([62, 69, 65, 60, 64], inf), dur: Pseq ([1.5, 1.5, 1,  3, 1]/2,inf), rel: Pseq ([1.5, 1.5, 1, 3, 1]/1.5,inf) + Prand ((0.01 .. 0.025),inf));

Teclado.toca(inst: 'pad3', pan: -0.8, db: Pseq ([-24, -27, -30, -34]*1.1, inf),  nota: Pseq ([[62, 74], [65, 77], [69, 81], [62, 72], [65, 77], [69, 81], [60, 72], [64, 76], [67, 79], [60, 72], [64, 76], [67, 79]]-12, inf), dur: Pseq ([1.5, 1.5, 1]/4,inf), rel: Pseq ([1.5, 1.5, 1]/3,inf));

Mel.toca(inst: 'pluck', pan: 0.8, nota: Pseq ([69, 62], inf) + Pseq ([0, 12], inf), dur: Pseq ([0.5, 0.25, 0.75, 0.5], inf), rel: Pseq ([0.5, 1], inf), db:-18, atk: 0.01);

Mel2.detener; Mel3.detener;

Mel3.toca(inst: Pseq (['pluck2'], inf), pan: 1, nota: Pstutter (Prand([1], inf), Pseq (#[65, 60, 65, 60], inf)), dur: Pseq([1.5, 1.5], inf)*Pseq ([4, 2, 2, 2], inf),  db:  Prand ([-24, -27, -30, -34]*0.35, inf), atk: 0, rel: 1 + Prand ([0.05, 0.1], inf));
//
// Mel3.toca(inst: Pseq (['pluck2'], inf), pan: 1, nota: Pstutter (Prand([1], inf), Pseq([Pseq (#[65, 60, 65, 67, 65, 60], 2),  Pseq (#[65, 60, r, r, r, r], 1)], 1)), dur: Pseq([1.5, 1.5], inf)*Pseq ([1, 0.5], inf),  db:  Prand ([-24, -27, -30, -34]*0.35, inf), atk: 0, rel: 1 + Prand ([0.05, 0.1], inf));


// Mel3.toca(inst: Pseq (['pluck2'], inf), pan: 1, nota: Pstutter (Prand([1], inf), Pseq (#[65, 60, 65, 60], inf)), dur: Pseq([1.5, 1.5], inf)*Pseq ([4, 2, 2, 2], inf),  db:  Prand ([-24, -27, -30, -34]*0.35, inf), atk: 0, rel: 1 + Prand ([0.05, 0.1], inf));

// Mel.toca(inst: Pseq (['pluck2'], inf), pan: 1, nota: Pstutter (Prand([1], inf), Pseq (#[72, 67, 72, 67]+12, inf)), dur: Pseq([1.5, 1.5], inf)*Pseq ([4, 2, 2, 2], inf),  db:  Prand ([-24, -27, -30, -34]*0.35, inf), atk: 0, rel: 1 + Prand ([0.05, 0.1], inf));

// Mel3.toca(inst: Pseq (['pluck2'], inf), pan: 1, nota: Pstutter (Prand([1], inf), Pseq([Pseq (#[65, 60, 65, 67, 65, 60], 2),  Pseq (#[65, 60, r, r, r, r], 1)], 1)), dur: Pseq([1.5, 1.5], inf)*Pseq ([1, 0.5], inf),  db:  Prand ([-24, -27, -30, -34]*0.35, inf), atk: 0, rel: 1 + Prand ([0.05, 0.1], inf));

// Mel.toca(inst: Pseq (['pluck2'], inf), pan: -1, nota: Pstutter (Prand([1], inf), Pseq ([Pseq (#[72, 67, 72, 74, 72, 67], 2), Pseq (#[72, 67, r, r, r, r], 1)], 1)), dur: Pseq([1.5, 1.5], inf)*Pseq ([1, 0.5], inf),  db:  Prand ([-24, -27, -30, -34]*0.35, inf), atk: 0, rel:1 + Prand ([0.05, 0.1], inf));
//
// Mel3.detener;
// Mel.detener;

// Mel2.toca(inst: Pseq (['pluck2'], inf), pan: 0, nota: Pstutter (Prand([1, 2], inf), Prand (#[74, 77, 79]-12, inf)), dur: Pseq([1.5, 1.5], inf)*Prand ([1, 0.5], inf),  db:  Prand ([-24, -27, -30, -34]*0.35, inf), atk: 0, rel: 1 + Prand ([0.05, 0.08], inf));

// Mel2.toca(inst: Pseq (['pluck2'], inf), pan: 0, nota: Pstutter (Prand([2, 3], inf), Prand (#[71, 74, 77, 79], inf)), dur: Pseq([1.5, 1], inf)*Prand ([1, 0.5], inf),  db:  Prand ([-24, -27, -30, -34]*0.35, inf), atk: 0, rel: 1 + Prand ([0.05, 0.08], inf));

// Mel2.toca(inst: Pseq (['pluck2'], inf), pan: 0, nota: Pstutter (Prand([4, 5], inf), Prand (#[72, 79, 74], inf)), dur: Pseq([1.5, 1.5], inf)*Prand ([1/3, 0.5], inf),  db:  Prand ([-24, -27, -30, -34]*0.35, inf), atk: 0, rel: 1 + Prand ([0.05, 0.08], inf));

// Mel2.toca(inst: Pseq (['pluck2'], inf), pan: -1, nota: Pstutter (Prand([1], inf), Pseq (#[72, 67, 72, 74, 72, 67], inf)), dur: Pseq([1.5, 1.5], inf)*Pseq ([1/3, 0.5], inf),  db:  Prand ([-24, -27, -30, -34]*0.35, inf), atk: 0, rel: 1 + Prand ([0.05, 0.08], inf));

// Mel2.toca(inst: Pseq (['pluck2'], inf), pan: 0, nota: Pstutter (Prand([1], inf), Pseq (#[[72, 65], [67, 60], [72, 65], [74, 67],  [72, 65], [60,67]]+12, inf)), dur: Pseq([1.5, 1.5], inf)*Pseq ([1, 0.5], inf),  db:  Prand ([-24, -27, -30, -34]*0.35, inf), atk: 0, rel: 1 + Prand ([0.05, 0.08], inf));
)";

	classvar <>siete= "(//solo tocalo una vez y ve al siguiente
~vol = 1.125;
// Ritmo.toca(campanaPan: -0.8, campanaDb: -12, campanaDur: 1, guiraDb: -25, guiraPan: -0.8, timbalesDur: Pseq ([0.25], inf), timbalesNum: 0, congaCDb: Pseq ([-14, -17, -15, -20 ], inf), congaOfreq: Pseq (#[r,r,r,r,  r, r, 1,r,   r,r,r,r,   r, r, 1,1], inf), congaODb: -19, congaOPan: -0.8, congaCDb: -0.8);

Bajo.toca(inst: 'bajo2', db: -19, nota:Pseq ([Pseq ([62, 69, 65], 1),  Pseq ([62, 69, 65, 60], 1)], inf), dur: Pseq ([Pseq ([1.5, 1.5,  13]/2,1), Pseq ([1.5, 1.5,  13]/2,1)], inf), rel:Pseq ([Pseq ([1.5, 1.5, 13]/1.5,1), Pseq ([1.5, 1.5,  13]/1.5,1)], inf));

Teclado.toca(inst: 'pad3', pan: -0.8, db: Pseq ([-24, -27, -30, -34]*1.1*~vol, inf),  nota: Pseq ([[62, 74], [65, 77], [69, 81], [62, 72], [65, 77], [69, 81], [60, 72], [64, 76], [67, 79], [60, 72], [64, 76], [67, 79]]-12, inf), dur: Pseq ([1.5, 1.5, 1]/4,inf), rel: Pseq ([1.5, 1.5, 1]/3,inf));

Mel.detener; Mel2.detener; Mel3.detener;
Mel.toca(inst: Pseq (['pluck2'], inf), pan: -1, nota: Pstutter (Prand([1], inf), Pseq (#[72, 67, 72, 74, 72, 67], inf)), dur: Pseq([1.5, 1.5], inf)*Pseq ([1, 0.5], inf),  db:  Prand ([-24, -27, -30, -34]*0.35*~vol, inf), atk: 0, rel: 1 + Prand ([0.05, 0.08], inf));
)";

	classvar <>ocho = "( //solo tocalo una vez
~vol = 1.5;

Teclado.toca(inst: 'pad3', pan: -0.8, db: Pseq ([-24, -27, -30, -34]*1.1*~vol, inf),  nota: Pseq ([[62, 74], [65, 77], [69, 81], [62, 72], [65, 77], [69, 81], [60, 72], [64, 76], [67, 79], [60, 72], [64, 76], [67, 79]]-12, inf), dur: Pseq ([1.5, 1.5, 1]/4,inf), rel: Pseq ([1.5, 1.5, 1]/3,inf));

Mel.detener; Mel2.detener; Mel3.detener;
// Mel.toca(inst: Pseq (['pluck2'], inf), pan: -1, nota: Pstutter (Prand([1], inf), Pseq ([Pseq (#[72, 67, 72, 74, 72, 67], 2), Pseq (#[72, 67, r, r, r, r], 1)], 1)), dur: Pseq([1.5, 1.5], inf)*Pseq ([1, 0.5], inf),  db:  Prand ([-24, -27, -30, -34]*0.35*~vol, inf), atk: 0, rel: 1 + Prand ([0.05, 0.08], inf));

Ritmo.toca(campanaDb:-150, campanaDur: Prand ([1], inf), guiraDb: -26, timbalesAmp: 2.5, timbalesPan: Prand ([-0.8, 0.8], inf),timbalesFreq: Prand (#[0, 1], inf), timbalesDur: Pseq ([0.25, 0.25], inf), timbalesNum: 1, congaCDb: Pxrand ([-14, -17, -15, -20 ]*2, inf),  congaODb: Prand ([-20,-25, -20, -30], inf), congaOfreq: Pseq (#[0.5, r, 0, r, 1], inf), crashFreq: \\r);

Mel.toca(inst: Pseq (['pluck2'], inf), pan: -1, nota: Pstutter (Prand([1], inf), Pseq (#[72, 67, 72, 74, 72, 67], inf)), dur: Pseq([1.5, 1.5], inf)*Pseq ([1, 0.5], inf),  db:  Prand ([-24, -27, -30, -34]*0.5*~vol, inf), atk: 0, rel: 1 + Prand ([0.05, 0.08], inf));
)";

	classvar <>nueve = "( //tocalo hasta el 3
~vol = 2;

Teclado.toca(inst: 'pad3', pan: -0.8, db: Pseq ([-24, -27, -30, -34]*1.1*~vol, inf),  nota: Pseq ([[62, 74], [65, 77], [69, 81], [62, 72], [65, 77], [69, 81], [60, 72], [64, 76], [67, 79], [60, 72], [64, 76], [67, 79]]-12, inf), dur: Pseq ([1.5, 1.5, 1]/4,inf), rel: Pseq ([1.5, 1.5, 1]/3,inf));

Mel.toca(inst: Pseq (['pluck2'], inf), pan: -1, nota: Pstutter (Prand([1], inf), Pseq (#[72, 67, 72, 74, 72, 67], inf)), dur: Pseq([1.5, 1.5], inf)*Pseq ([1, 0.5], inf),  db:  Prand ([-24, -27, -30, -34]*0.7*~vol, inf), atk: 0, rel: 1 + Prand ([0.05, 0.08], inf));


Mel.detener; Mel2.detener; Mel3.detener;
// Mel.toca(inst: Pseq (['pluck2'], inf), pan: -1, nota: Pstutter (Prand([1], inf), Pseq ([Pseq (#[72, 67, 72, 74, 72, 67], 2), Pseq (#[72, 67, r, r, r, r], 1)], 1)), dur: Pseq([1.5, 1.5], inf)*Pseq ([1, 0.5], inf),  db:  Prand ([-24, -27, -30, -34]*0.35*~vol, inf), atk: 0, rel: 1 + Prand ([0.05, 0.08], inf));

Ritmo.toca(campanaDb:-150, campanaDur: Prand ([1], inf), guiraDb: -30, timbalesAmp: 2, timbalesPan: Prand ([-0.8, 0.8], inf),timbalesFreq: Prand (#[0, 1, -1], inf), timbalesDur: Pseq ([0.75, 0.5], inf), timbalesNum: 4, congaCDb: Pxrand ([-14, -17, -15, -20 ]*2, inf),  congaODb: Prand ([-20,-25, -20, -30], inf), congaOfreq: Pseq (#[0.5, r, 0, r, 1], inf), crashFreq: \\r);
)";

	classvar <>diez = "(
Ritmo.toca(campanaDb:-150, campanaDur: Prand ([1], inf), guiraDb: -70, timbalesAmp: 0.5, timbalesPan: Prand ([-0.8, 0.8], inf),timbalesFreq: Prand (#[0, -1], inf), timbalesDur: Pseq ([0.75, 0.5], inf), timbalesNum: inf, congaCDb: Pxrand ([-14, -17, -15, -20 ]*5, inf),  congaODb: Prand ([-20,-25, -20, -30]*5, inf), congaOfreq: Pseq (#[0.5, r, 0, r, 1], inf), crashDur: Pseq ([0.5, 0.25], inf), crashFreq: Pxrand (#[r, r,r ,r, r, r, r, r, r, 1], inf), crashDb: -25, crashFil: Prand ((10000 .. 4000), inf), crashAtk: Pseq ([0.25, 0.30], inf), crashRel: Prand ([0.125, 0.25], inf));

Bajo.toca(inst: 'bajo2', db: -20, nota: Pseq ([62, 69, 65, 60, 64], inf), dur: Pseq ([1.5, 1.5, 1,  3, 1]/2,inf), rel: Pseq ([1.5, 1.5, 1, 3, 1]/1.5,inf) + Prand ((0.01 .. 0.025),inf));
)";

	classvar <>once = "(
~vol = 1.75;
// Ritmo.toca(campanaPan: -0.8, campanaDb: -12, campanaDur: 1, guiraDb: -25, guiraPan: -0.8, timbalesDur: Pseq ([0.25], inf), timbalesNum: 0, congaCDb: Pseq ([-14, -17, -15, -20 ], inf), congaOfreq: Pseq (#[r,r,r,r,  r, r, 1,r,   r,r,r,r,   r, r, 1,1], inf), congaODb: -19, congaOPan: -0.8, congaCDb: -0.8);

Bajo.toca(inst: 'bajo2', db: -20, nota: Pseq ([62, 69, 65, 60, 64], inf), dur: Pseq ([1.5, 1.5, 1,  3, 1]/2,inf), rel: Pseq ([1.5, 1.5, 1, 3, 1]/1.5,inf) + Prand ((0.01 .. 0.025),inf));
Teclado.toca(inst: 'pad3', pan: -0.8, db: Pseq ([-24, -27, -30, -34]*1.1*~vol, inf),  nota: Pseq ([[62, 74], [65, 77], [69, 81], [62, 72], [65, 77], [69, 81], [60, 72], [64, 76], [67, 79], [60, 72], [64, 76], [67, 79]]-12, inf), dur: Pseq ([1.5, 1.5, 1]/4,inf), rel: Pseq ([1.5, 1.5, 1]/3,inf));

Mel.detener; Mel2.detener; Mel3.detener;
// Mel.toca(inst: Pseq (['pluck2'], inf), pan: -1, nota: Pstutter (Prand([1], inf), Pseq (#[65, 60, 65, 67, 65, 60]+12, inf)), dur: Pseq([1.5, 1.5], inf)*Pseq ([1, 0.5], inf),  db:  Prand ([-24, -27, -30, -34]*0.35*~vol, inf), atk: 0, rel: 1.1 + Prand ([0.05, 0.08], inf));
)";

	classvar <>doce = "(
~vol = 1;
Bajo.toca(inst: 'bajo2', db: -20*~vol, nota: Pseq ([62, 69, 65, 60, 64], inf), dur: Pseq ([1.5, 1.5, 1,  3, 1]/2,inf), rel: Pseq ([1.5, 1.5, 1, 3, 1]/1.5,inf) + Prand ((0.01 .. 0.025),inf));

Teclado.toca(inst: 'pad3', pan: -0.8, db: Pseq ([-24, -27, -30, -34]*1*~vol, inf),  nota: Pseq ([[62, 74], [65, 77], [69, 81], [62, 72], [65, 77], [69, 81], [60, 72], [64, 76], [67, 79], [60, 72], [64, 76], [67, 79]]-12, inf), dur: Pseq ([1.5, 1.5, 1]/4,inf), rel: Pseq ([1.5, 1.5, 1]/3,inf));

Mel2.toca(inst: Pseq (['pluck2'], inf), pan: -1, nota: Pstutter (Prand([1], inf), Pseq (#[72, 67, 72, 74, 72, 67], inf)), dur: Pseq([1.5, 1.5], inf)*Pseq ([1/3, 0.5], inf),  db:  Prand ([-24, -27, -30, -34]*0.35*~vol, inf), atk: 0, rel: 1 + Prand ([0.05, 0.08], inf));

Ritmo.toca(campanaDb:-150, campanaDur: Prand ([1], inf), guiraDb: -23*~vol, timbalesAmp: 1*~vol, timbalesPan: Prand ([-0.8, 0.8], inf),timbalesFreq: Prand (#[0, 1, -1], inf), timbalesDur: Pseq ([0.25, 0.5], inf), timbalesNum: inf, congaCDb: Pxrand ([-14, -17, -15, -20 ]*2*~vol, inf),  congaODb: Prand ([-20,-25, -20, -30]*~vol, inf), congaOfreq: Pseq (#[0.5, r, 0, r, 1], inf), crashFreq: \\r);
)";


	// classvar <intro =

	*initClass {
	 super.initClass;
	    version = "Mayo 4 2017";
		("Bajo : version 1.0").postln;


	}

	*load { arg section;
		Document.current.insertText("\n" ++ section, 0);
}

}