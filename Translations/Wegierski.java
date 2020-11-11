package com.pokulan.aliveinshelter;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

/**
 * Created by Wojtek on 2017-03-11.
 */
public class Wegierski{
    public static final BitmapFont czcionka = new BitmapFont(Gdx.files.internal("czcionka.fnt"));
    public static final String TEXT[] ={
            "Új Játék", //1
            "Folytatás", //2
            "Statisztikák", //3
            "Elbukott gyűjtögetés", //4
            "Elbukott menedékek", //5
            "Túlélve", //6
            "Indított játékok", //7
            "A Fiú halálai", //8
            "Befejezetlen játékok", //9
            "Leghosszabb Játék", //10

            "Bob! siess, \n fogj annyi cuccot amennyit\n     csak tudsz!\n              Katrin", //11

            "Bob halott, ez szomorú.", //12
            "Ben halott, miért? Miért?...", //13
            "Katrin halott, az utolsó nő meghalt...", //14
            "Bob megbetegedett, hol vannak a tabletták?", //15
            "Ben magas lázzal rendelkezik.", //16
            "Katrin nem érzi jól magát.", //17
            "Bob nem sokáig maradt vissza.", //18
            "Ben elment, soha többé nem jön vissza.", //19
            "Katrin eltűnik örökre.", //20

            "Betegek lettünk.", //21
            "fürdés,eső,fürdés, a falaink szivárognak...", //22
            "Valaki kiöntötte a vizet-0.25l", //23
            "Kaja megromlott -0.2kg", //24
            "Nincs áram, nyissa ki az ajtót, vagy sem, ha van zseblámpa.", //25
            "Bem már nem bírta a halált és küzdést a túlélésért.", //26

            "A Rádió megjavítva.", //27
            "A Maszk megjavítva.", //28
            "A Rádió elromlott.", //29

            "Ki kell űritenünk a szemetet ez biztonságos?", //30
            "Jelzőfényt adtunk.", //31
            "Elvesztettük a zseblápát.", //32
            "Elloptunk egy zseblámpát.", //33
            "Elloptunk egy maszkot", //34
            "Elvesztettük a baltát...", //35
            "Következő alkalommal üzetelünk.", //36
            "Üzlet befejezve.", //37
            "A Mentőakció sikeres!", //38
            " meg kell menekülni!\nyomd gyorsan!", //39

            "Túl lassú vagy\n   A Létezéshez", //40
            "Játékaim", //41
            "Kérlek adj jelet!", //42

            "Bob", //43
            "Ben", //44
            "Katrin", //45
            "éhség", //46
            "szomj", //47
            "fáradtság", //48
            "ittasság", //49

            "Matrac = a következő csodás nap", //50
            "Undorító szemét", //51
            "Ahh! Micsoda szörny!", //52
            "Ez ehető??", //53
            "A Kártyák csak szórakoztatnak", //54
            "Rádio = kommunikáció", //55
            "Mérgezettségi szint: ", //56
            "MAGAS", //57
            "ALACSONY", //58
            "Térkép", //58
            "Balta - ÉLES!", //59
            "Maszk, állapot:", //60
            "Szerszámok:", //61
            "Gyógy csomag:", //62
            "Sima zseblámpa", //63
            "Megőrizve", //64
            "Víz", //65
            "Petróleum", //66

            "Van itt valami használható", //67
            "Pss... Valami megvan", //68
            "Valki kopog??", //69
            "Ez egy hang, segítség?", //70
            "valami ütögeti a földet", //71
            "Csend van kint...", //72

            "Utánótlás nékül, Ben nem jön vissza...", //73
            "Utánótlás nékül, Bob nem jön vissza...", //74
            "Utánótlás nékül, Katrin nem jön vissza...", //75

            " Helló, ami itt történik\n" +
                    "Az bonyolultabb mint hinnéd,\n" +
                    "Ne bízz a\n" +
                    "kormányban és a katonaságban.\n" +
                    "Velünk jöhetsz talán.\n" +
                    "minden tizedik napon \n" +
                    "itt hagyunk egy csomagot\n" +
                    "     itt", //76
            "Érdekes emberek[?]...", //77
            "Menj el! Te nem \n" +
                    "  vagy velünk!", //78

            "Nincs semmi a dobozban.", //79
            "Egy szerszám.", //80
            "Találtunk egy mérőt.", //81
            "Találtunk kártyát.", //82
            "Találtunk baltát.", //83
            "Találtunk maszkot.", //84
            "Találtunk lámpát.", //85
            "Találtunk rádiót!", //86
            "Találtunk elsősegély csomagot.", //87
            "Találtunk pertóleumot.", //88

            "Tál", //89
            "Krumplik", //90
            "Alkohol", //91
            "Kazán, hogy ne fázzunk meg", //92
            "A Mi régi desztillálónk", //93
            "Vödör", //94
            "Jégkorszak!?...", //95
            "Az ídő múlik lassan...", //96

            "A Hobo", //97
            "Blooby néha agresszív!", //98
            "Kemence", // 100
            " Ültess!",//101

            "Túlélted...", // 102
            "Mindenki meghalt...", // 103
            "Megtámadtak és meghaltál...", // 104
            "Lépj a menühöz", // 105
            "Támadást ért minket.", // 106
            "Kaptunk segítséget, krupli!", // 107
            "Leeresztettünk egy keveset.", // 108
            "Nap", // 109
            "Napok", //110
            "Told balra!",//111
            "Reptér",//112
            "Hamarosan megmentenek, Krumpli +1",//113
            "Következő alkalommal mi leszünk .",//114
            "Elvesztettünk egy lámpát...", // 115
            "Csak Menedék    ", // 116
            "Fegyver", // 117
            "Lőszer", // 118
            "Szakács", // 119
            "Retkes víz", // 120
            "Szűrő", //121
            "Áram forrás", // 122

            "Fa", // 123
            "Was", // 124
            "Dolgozóasztal", // 125
            "Kaka", // 126
            "Iszap", // 127
            "TV", // 128

            "Rakéta", // 129
            "Rakéta üzemanyaga", // 130
            "Lyuk", // 131
            "Oltár", // 132
            "Állapot", // 133
            "Szelep", // 134
            "Más cuccok:", // 135
            "Réz", // 136
            "Kanóc", // 137
            "Drót", // 138
            "Bányász", // 139
            "Denevérek", // 140
            "Arany kulcs", // 141

            "Lapátolás", // 142
            "Sír", // 142
            "Szív", // 144
            "Zombi", // 145

            "Könnyú", // 146
            "Nehéz", // 147
            "Árok", // 148
            "Madár", // 149
            "Ezüst kulcs", // 150

            "Kutya", // 141
            "Kutyaház", // 152
            "A kutyus halott", // 153
            "Arany", // 154
            "Arany rúd", // 155
            "Bicikli, lánc: " ,// 156
            "Bob már nem bírta\n" +
                    "a halált és a küzdést a túlélésért.", //157
            "Katrin már nem bírta\n" +
                    "a halált és a küzdést a túlélésért.", //`58
            "Híd", // 159
            "Tutaj", // 160
            "Horgászat", // 161
            "Hal", // 162
            "Gommi áfonya", // 163
            "Gommi áfonya ital", // 164
            "Csökkenti a fáradstágot", // 165
            "Halfonya", // 166
            "Csökkenti a fáradstágot és a szomjasságot 25%ra", // 167
            "Zöldföld", // 168
            "Az expedíció 1 napig tart", // 169
            "arany gyártás", //170
            "KÖZEPES", //171
            "pisinézet", // 172
            "16 napig láthatod a cspda ajtót valójában", //173
            "segítség", //174
            "támadók", //175
            "Támadás", //176
            "Védekezés", //177
            "Püréskrumpli", // 178
            "Védekező pontok újra100% on", // 179

            "Csontok", // 180
            "RÁdio", // 181
            "Asztalterítő", // 182
            "Elvesztegetettlélek", // 183
            "Ártatlanlélek", // 184
            "elvesztett hal", //185
            "Ad 10000 pont támadást.", //186
            "Ártatlan burgonya", // 187
            "újra fel tölti 4000rel a védekező pontokat", // 188

            "Kitörés", // 189
            "A menekülés nem gyógyítja a szörnyet", // 190
            "DuplaRúgás", // 191
            "2x több sebzés", // 192
            "Boxing bag", // 193
            "Hangszóró", // 194
            "Foglyok, kötél", // 195
            "Foglyok, üzenet a katonaságnak", // 196
            "Van 10 foglyunk, Mnetesetek meg minket! \nGdansk, Legendy 53", // 197
            "Elküldve", // 198
            "Megfogunk menteni a \nnapon: ", // 199
            "Nidzsa", //200
            "Elkerülöd a szörnyeket 5 napig", //201
            "Takaró", //201
            "Pennywhistle", //203
            "Összetört kocsi", //204
            "Kocsi részei", //205
            "csúzli", //206
            "csirke", //207

            "Növekszik a falon.", //208
            "Víz kifogy!", //209
            "Az élelmiszer lassan kifogy!", //210
            "Katonai fényjelzést kell adnunk, vagy más módot kell találnunk a túlélésre.", //211
            "Találjuk meg a túlélési módot, nem csak ott ülhetünk.", //212

            "[TUTORIAL]\nHi! This is your shelter, you can move around it (swipe left/right). Touch/tap on item to know what it is. Touch/tap on characters to check theirs' stats. Tap on bed and go sleep.", //213
            "[TUTORIAL]\nMostly everything what you 'tick' or do will take effect after sleeping. Here you can read some important informations. Trapdoor is very important, you can go to the garden or open it to let somebody in or give light signal.", //214
            "[TUTORIAL]\nTap on the radio to check if military wants light signal if yes give it. Do it few times to win the game (there is a lot of more endings but find them out by yourself) :D", //215
            "[TUTORIAL]\nRemember to feed you characters! To get items/resources go on the expeditions (boots in the character's menu), remember to 'water' and feed one before going out!", //216
            "[TUTORIAL]\nIf you lose your map helpers (if you are lucky) will give you second one. Plant potatoes in the bowl you can use them to trade in the shop.", //217
            "[TUTORIAL]\nThis game isn't easy! Solve puzzles, try different ways and options, earn coins to unlock new special items. Tip: First buy Worktable ;) Have fun! - pokulan", //217
            "stílusos pontokat",//218
            "Fejsze", // 220
            "Rúd", // 221
            "Shuriken", // 222
            "Ördög", // 223
            "Sárgarépa", // 224
            "AlcoMist", // 225
            "Az ellenséget 30% -kal gyengébbé teszi.", // 226

            "Teddy", // 227
            "Létra", // 228
            "Szereted-e\n Alive In Shelter?\n   Értékeld!", // 229
            "Repülőtér", // 230
            "Erdő", // 231
            "Üzlet", // 232
            "Menj tovább", // 233
            "Emlékezik: ", // 234
            "mentő busz: ", // 235
            "Mikulás", // 236
            "Segítségre van szükségem. Nincsenek karácsonyi díszek, tehát nem köszönöm.", // 236
            "Vigyázz! TŰZ!", // 237
            "Tűzoltó készülék", // 239
            "A hóember megöli minket.", // 240
            "Hóember gyilkos", // 241

            "1939 burgonya", // 242
            "Indítsa el a játékot 1939-es burgonyával.", // 243
            "Csak 8s kihívás", // 244
            "A részek összegyűjtésében csak 8 másodperc van", // 245
            "Csak élelmiszer és víz", // 246
            "Indítsa el a játékot csak 3l vízzel és 2kg élelmiszerrel", // 247
            "Csak a nők!", // 248
            "Csak Katrin játszani.", // 249
            "Tél jön", // 250
            "Mindig fagyos szél", // 251
            "Véletlen", // 252
            "Indítsa el a játékot véletlenszerű elemekkel.", // 253
            "BenHulk", // 254
            "Indítsa el a játékot mutált Ben",  //255
            "Növényőr", // 256
            "A növény segít megvédeni a menedéket.", // 257
            "Danse macabre", // 258
            "A karakterek újra életre kelnek 6 nappal a halála után.", // 259
            "Nem szerzetesek", // 260
            "Nincsenek szerzetesek!", // 261
            "Biztonsági kívül", // 262
            "Mindig alacsony sugárzás", // 263
            "Extra denevérek", // 264
            "A denevérek mutálódnak, hoznak Bloobyt.", // 265
            "Nincs kilépés", // 266
            "Nincs csapóajtó.", // 267
            "Klasszikus mód", // 268
            "Játssz klasszikus módban - régi időkben, csak egy szobában stb.", // 269
            "Sandbox mód", // 270
            "A homokozó módban játssz, csináld, amit akarsz!", // 271
            "Nem ezek a srácok", // 272
            "Játssz denevérek, hóember és Pennywhistle nélkül.", // 273
            "RPG", // 274
            "Keress tapasztalatpontokat és felfelé karaktereket.", // 275

            "Szint", // 276
            "Következő szint", // 277
            "Pont", // 278

            "Napi bónusz", // 279
            "Heti bónusz", // 280
            "I am an indie game developer I spend my free time improving this game. If you want you can help me donating me = buying a premium. You will unlock all DLC items, all shelter items for 0 coins, renaming characters, remembered position and remove all ads. Thanks :)", // 281
            "Ossza meg", // 282
            "Elintézetlen", // 283
            "Barátok szomszédai", // 284

            "Play deathmatch - nyer, aki tovább tart!", // 285
    "Várakozás az elfogadásra", // 286
        "Meghívni a mérkőzést", // 287
           "örökre meghalt", // 288
            "Deathmatch nyer:", // 289
            "CleanBerry", // 290
            "Tisztítja a családtagokat.", // 290
            "\"Gommi\" falu", // 292
            "\"Majd menedékjogot adunk neked.\"", // 293
            "Weed", // 294
            "Dildo", // 295
            "Drugs", // 296

            "fej", // 297
            "karok", // 298
            "has", // 299
            "lábak", // 300

            "Hegy", // 301
            "Yard", // 302
            "Shop #2", // 303
            "Tomb", // 304
            "Menhelyek", // 305
            "Temető", // 306
            "Strand", // 307
            "Egészség", // 306
            "Energia", // 307
            "inni", // 310
            "enni", // 311
            "gyógyítani", // 312
            "kimenni", // 313
            "Mined mine", // 314
            "Az én beléptetésem kezdetén nyitva van, anélkül, hogy kidolgozna.", // 315
            "Extra térképdarabok", // 316
            "Tűzhely", // 317
            "Szállást foglal", // 318
            "Stock", //319
            "Díj", //320
            "Urán", // 321
            "Ajtók zárva (kék kulcsra van szükségem)", // 322
            "Kék kulcs", // 323
            "További helyek", // 324
            "Indítsa el a játékot 2 véletlenszerű extra térképekkel!", // 325
            "Ajtókapcsoló", // 326
            "Indítsa el a játékot minden billentyűvel!", // 327
            "Expedíciók mestere", // 328
            "Indítsa el a játékot az összes extra térképrészével", // 329
            "Rossz hóember jött vissza :(", // 330
            "A szennyezőmérő hibás.", // 331
            "Mi kell zuhanyozni, használjunk piszkos vizet.", // 332
            "Ajtó", // 333
            "Poison", // 334

            "966 Gommi Blueberries", //335
            "Indítsa el a játékot 966 Gommi Blueberries", // 336
            "Blobby a mocsok", // 337
	    "Indítsa el a játékot Blobby-val.", // 338
            "Dodge the dog", //339
            "Indítsd el a játékot kutyával! (Meg kell szerezned egy kutyaházat).", //340
            "Barátok", // 341
            "Testreszabás", // 342
            "Extra", //343
            "Gázszivárgás és tűz ...", // 344
            "Starter pack", // 345
            "Indítsa el a játékot extra: víz, élelmiszer, fa, vas és burgonya", // 346
            "Holnap jó idő lesz ...", // 347
            "Holnap lesz fagyos és szeles ...", // 348
            "Holnap eső fog támadni minket ...", // 349

            "Te, alll, die ...", // 350
            "Segítségre van szükségünk!", // 351
            "A csapóajtó megszakadt, meg kell oldanunk.", // 352
            "Vízi növények", // 353
            "Zuhany", // 354
            "Gyenge", // 355
            "Glitch mód", // 356
            "El fogsz élni? Mindenütt hiba ... Indítsa újra a játékot, hogy visszatérjen a normálisba!", // 357
            "Földrengés!", // 358
            "Fogd meg, mit akarsz menteni", // 359

            "Ben !? Hogy lehetséges?", // 360
            "A támadók mindenütt vannak!", // 361
            "Szoba", // 362
            "Garden", // 363
            "Basement", // 364
            "Magazine", // 365

            "Hurrikán jön !!!", // 366
            "Tic Tac shut up", // 367

            "Lassítja az órákat!", // 368
            "Légszűrő", // 369
            "Meg kell javítanunk a levegőszűrőt!", // 370
            "Cula", // 371
            "Leves", //372
            "Csontváz", // 373
            "Doge újraéleszteni", // 374
            "Higgadt kutya újjászületése!", // 375
            "Dışarı çıkmak için bir uzay roketi yapmalıyız ya da dışarıdaki diğer canlılara yardım etmeliyiz. Oğlunun telefonuna da yardımcı olabiliriz. Lütfen otobüsün ne zaman geleceğini kontrol edin.", // 376
            "Asker bize radyoyu ne zaman kapının açılacağını ve gece ışık sinyali vereceğini söylemeli.", // 377
            "Martha", // 378

            "Nem, Martha meghalt ...", // 379
            "Martha beteg, meg kell gyógyítanunk!", // 380
            "Hide", // 381
            "Elrabolták Marthát!", // 382

            "Helló Martha, a nevem Frebbie vagyok, nem akarlak bántani, segíteni akarok neked, csodálatos helyet fogok mutatni neked, de neked valamit kell megtenned ...", // 383
            "Kérlek, öld meg a testvéredet, Ben annyira durva, és nem szeretlek ... Visszamegyünk a jövő héten.", // 384
            "Én kedvelem a nõket, kérlek, öld meg Apát Bobot ... Jöjjön ide a héten", // 385
            "Tápláld és vizes anyádat, erősnek kell lennie ... Jöjjön ide a jövő héten.", // 386
            "Szeretem az alkoholt, kérlek, készíts el egy pohár alkoholt és hozd el nekem a következő héten.", // 387
            "Köszönöm szépen, gyere vissza itt nap után:", // 388
            "Gitár", //389
            "POLICE! OPEN!", // 390
            "Tudjuk, hogy ellopja a készleteket! Adjon nekünk 1 burgonyát és 1 sárgarépát, hogy ezt figyelmen kívül hagyjuk.", // 391

            "Talán megvesztegetni őket?", // 392
            "Uhm ... Te jöttél hozzánk:", // 393
            "Elfogadom", // 394
            "Nem értenek egyet", // 395
            "Talán lőni?", // 396
            "CCTV", //397
            "Korábban használja a \"Áram forrás\"", // 398

            "Komló", // 399
            "Sör", // 400

            "Csákány",// 401
            "Jobb csákány", // 402

            "Szén", // 403
            "Vasérc", // 404
            "Réz érc", // 405
            "Uránérc", // 406
            "Aranyérc", // 407
            "Orvos", // 408
            "Uranium pickaxe", //409
            "-A részeg", // 410
            "-A Részeg\n-bányászati energiát ad", // 411
            "Pörkölt burgonya", // 412
            "Pörkölt hal", // 413

            "Play The Hobo idle Clicker, whole story about the NUKE in Whelylely city and of course Hobo! Real time game!",//414

            "Crowbar", // 415
            "Shop rablás", // 416

            "Innocent Bomb", // 417
            "Ad 2000 pont támadást.", // 418

            "nem mehetnek be", // 419

            "Üzenetek", // 420
            "GPS", // 421
            "Játék", // 422
            "Snake", //423
            "Filmek", // 424

            "Telefon", // 425
            "Hívás", // 426

            "Helló [...] Szóval segítségre van szüksége? [...] Hmmmm 3 hét után hívlak vissza", // 427
            "Szia [...] Beszélek a barátaimmal [...] Igen A Nyugat megtámadott minket [...] Ismerek valakit, aki segíthet [...] Hívd Carlot: +48 4392 Bye!", // 428
            "Helló Carl ott [...] Ahh beszélsz Jánosval [...] A Földet elpusztítják, de vannak biztonságos helyek. Hadsereg: 112112 ", // 429
            "Helló [...] Hát, hogy Carlból jöttél ... ... értem. Készítsünk 6 üveg alkoholt és 2 sört. Ezután megmentjük a napot: ", // 430

            "Piszkos ruhák", // 431
            "A család minden nap véletlenszerű ruhákba öltözik, amelyeket korábban vásároltak.", // 432
            "Telefon töltő", // 433
            "Gomba", // 434
            "Ébresztőóra", // 435

            "Szia ember. Meg tudom mutatni egy csodaországot, jobb szavakat háborúk és agresszió nélkül.", // 436
            "Nem használhatunk alkoholt, ezért kicsit szomjas vagyok.", // 437
            "Minden 20 nap alatt jönni fogok 1 sörre és 1 vodka palackra.", // 438
            "4-szer fogok jönni. Benne vagy?\n\n\nIgen           nem", // 439
            "Köszönöm! A következő 20 nap.", // 440
            "Nincs alkohol, nincs mentés ... Viszlát örökké.", // 441
            "Hús", // 442
            "Sült hús", // 443
            "Dobd le a bombákat!", // 444
            "Indítsd el a játékot bombázóként! Üssd meg a célokat, hogy extra stíluspontot szerezzenek!", // 445
            "A macska megölt:", // 446
            "Martha rossz álma volt ... Annyira fél, amikor el kell rejtenie.", // 447
            "Pirinç", //448
            "Ragasztó", // 449

            "Farmer", // 450
            "Indítsa el a játékot az összes maggal.", // 451

            "Almafa", // 452
            "Alma", // 453

            "Holnap több energia-visszanyerést kapsz!", // 454
            "Almabor", //455

            "Expedition take place next day after letting it.", // 456
            "Open the trapdoor and go sleep to give light signal if radio says.", // 457
            "Be sure you are safe when you are giving light signal.", // 458
            "You can set alarm clock to feed the dog in the night.", // 459
            "You can not use shop in the city when the doctor is in the shelter.", // 460
            "You can rob the shop with crowbar when the doctor is in the shelter.", // 461
            "Go further and first click to draw a map then you unlock more loctions.", // 462
            "Hide Martha when she is alone before you open the trapdoor for night.", // 463
            "Silver key may be carry by the bird or The Doctor in the shop.", // 464
            "Get The Cook to get golden key.", // 465
            "To get blue key exchange in the hotel.", // 466
            "Check the wiki page to see all endings.", // 467
            "In the main in cellar dig to get coal, bones and metal ores.", // 468
            "Drink Beer or Cider to recover mining energy.", // 469
            "Always check your characters stats.", // 470
            "Some actions you can make instantly and some needs sleep.", // 471
            "Click on trash can in garden to move out the rubbish and monster.", // 472
            "Look for supply drop in the garden.", // 473
            "Try to craft a rocket and escape from Earth..", // 474
            "Try to craft and prepare a raft on the beach to escape.", // 475
            "Helpers who knock to trapdoor can give you potatoes and map.", // 476
            "Cat kills trash monsters and bats..", // 477
            "Be careful on expeditions!", // 478
            "Look for car parts on expeditions to fix the car on junkyard.", // 479
            "Remember about potions! You can craft and use them.", //480

            "Több minden:",//481
            "Kávé", // 482
            "Kávémag", // 483
            "Visszanyeri az energiát", // 484

            "Coronavirus", // 485
            "Próbáld túlélni a COVID-19 segítségével! Az alkohol segít!", // 486

            "Illessze be dalait oda", // 487
            "Hozzáférés a tároláshoz", // 488

            "A Hobo minket. Meg tudsz csinálni valamit ezzel? ... Öld meg, akkor beszélünk tovább.", // 489
            "Energiara van szükségünk! Hozz nekünk 5 csésze kávét.", // 490
            "Van valami törött. 3 biztosíték kiégett. Tudsz adni nekünk újat?", // 491
            "A patkányok megsemmisítettek néhány vezetéket. A kapu kinyitásához 6 új huzalra van szükségünk.", // 492
            "A kapu bekapcsolásához 10 urándarabra van szükségünk.", // 493
            "A kapu minden vasárnap nyitva van!", // 494

            "Purple Power", // 495
            "Gyógyítson meg minden sérülést", // 496

            "Valiant Heart", // 497
            "Nincs öngyilkosság.",// 498

            "<click>", // 499
            "<swipe>", // 500
            "A kellékek a legfontosabbak a túlélésben. Ne felejtsd el nyomon követni őket.", // 501
            "Ujjcsúsztatással megváltoztathatja a helyiséget vagy néhány helyet kívül", // 502
            "Sok más elem is ellenőrizhető érintés / kattintással.", // 503
            "Aludj, hogy eljöjjön másnap.", // 504
            "Ellenőrizzük Bob állapotát. Kattintson rá, és igyon neki!", // 505
            "Fontos, hogy nyomon kövessük a családtagokat. Ó, nézz egy növényt ... helyezze a kukába!", // 506
            "Egyes tevékenységek alvást igényelnek, ültessünk burgonyát, és menjünk a következő napra.", // 507
            "A csapóajtó nagyon fontos, ha valaki kopogtathat ellenséget vagy segítőt, akkor is megvan a maga állapota.", // 508
            "Kockáztathatja a csapdaajtó kinyitását, vagy például egy főzet használatával ellenőrizheti, ki van ott.", // 509
            "Készítsen bájitalt: PissVision és igya meg.", // 510
            "Nézd! Segítők! Biztonságosan kinyithatja a csapóajtót.", // 511
            "Ideje minden családtagnak ételt és italt adni.",// 512
            "Vízzük ki a burgonyát.", // 513
            "Fontos, hogy kikerülje a kukát. Menj kertbe.", // 514
            "Ideje elküldeni valakit az expedícióra, hogy szállítson. Van egy térképünk, szóval menjünk a városba.", // 515
            "Ellenőrizze a sugárzást, ha HIG, akkor az expedíció egy gázálarcba kerül.", // 516
            "Vegye ki a víz- és ételcsomagot.", // 517
            "Rendben, tudod az alapvető dolgokat, most elkezdheti a játékot. Olvassa el a naplót és használja az agyát! Öld meg mindenkit.", // 518

            "Trash killer", // 519
            "Az elején erős méreg van a szemétszörnyekre.", //520

            "Vak", // 521
            "Próbálj meg lámpa nélkül játszani.", // 522

            "Ellopom a vizét!", // 523
            "Kenyér", // 524

    };

    public static final String credits = "Fordítás:\n-Ádám Kolozsi\n-Botond Kurucz";
}
