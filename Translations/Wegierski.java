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
            "Sikertelen gyűjtögetés", //4
            "Sikertelen menedékek", //5
            "Túlélve", //6
            "Elindított játékok", //7
            "A Fiúk halálai", //8
            "Befejezetlen játékok", //9
            "Leghosszabb Játék", //10

            "Bob! siess, \n fogj annyi felszerelést amennyit\n     csak tudsz!\n              Katrin", //11

            "Bob meghalt, ez szomorú.", //12
            "Ben meghalt, miért pont ő? Miért...?", //13
            "Katrin halott, az utolsó egészséges nő meghalt...", //14
            "Bob megbetegedett, hol van a gyógyszer?", //15
            "Bennek magas láza van.", //16
            "Katrin nem érzi jól magát.", //17
            "Bob túl sok ideig nem ért vissza.", //18
            "Ben elment, soha többé nem jön vissza.", //19
            "Katrin örökre eltűnt...", //20

            "A fenébe, betegek lettünk!", //21
            "Eső és a zuhany kicsurog, a menhelyünk pedig szivárog...", //22
            "Valaki kiöntötte a vizet -0.25l", //23
            "Pár kaja megromlott -0.2kg", //24
            "Nincs áram, nyisd ki az ajtót hogy be jöjjön a fény, vagy hadd zárva egy égő zseblámpával.", //25
            "Ben már nem bírta többé a halálokat és a túlélés fentartásának a szenvedését.", //26

            "A Rádió végre meg lett megjavítva.", //27
            "A Maszk meg lettjavítva!", //28
            "A Rádió megint elromlott.", //29

            "Ki kell űritenünk a szemetet, mert ha nem, akkor a penész megöl minket!", //30
            "Jelzőfényt adtunk, lehet hogy megmentenek.", //31
            "Elvesztettük a zseblápát.", //32
            "Elloptunk egy zseblámpát.", //33
            "Elloptunk egy maszkot", //34
            "Elvesztettük a baltát...", //35
            "Következő alkalommal majd üzetelünk.", //36
            "Üzlet teljesítve.", //37
            "A Mentőakció sikeres!", //38
            "Meg kell őt mentenünk!\\gyorsan nyomd meg!", //39

            "Túl lassú vagy\n   A Létezéshez", //40
            "Játékaim", //41
            "Kérlek integess a zsebláapával hogy fényjelzést adjon!", //42

            "Bob", //43
            "Ben", //44
            "Katrin", //45
            "éhség", //46
            "szomjasság", //47
            "fáradtság", //48
            "részeg", //49

            "Matrac = alugy a következő csodás napig", //50
            "Undorító szemét", //51
            "Ahh! Micsoda szörny!", //52
            "Ezt megehetjük??", //53
            "A Kártyák csak szórakoztatni tudnak", //54
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
            "Konzerv", //64
            "Víz", //65
            "Petróleum", //66

            "Nekem vannak pár használható cuzzaim", //67
            "Pss... Van valamim!", //68
            "Valki kopog??", //69
            "Vannak hangok, ez segítség?", //70
            "valami le esett az égből", //71
            "Csend van kint...", //72

            "Kellékek nékül, Ben nem jön vissza...", //73
            "Kellékek nékül, Bob nem jön vissza...", //74
            "Kellékek nékül, Katrin nem jön vissza...", //75

            " Helló, mi a hejzet\n" +
                    "Az bonyolultabb mint hinnéd,\n" +
                    "Ne bízz a\n" +
                    "kormányban és a katonaságban.\n" +
                    "Velünk jöhetsz.\n" +
                    "minden tizedik napon, gyere \n" +
                    "és itt hagyunk egy csomagot\n" +
                    "     itt, csak neked.", //76
            "Érdekes emberek[?]...", //77
            "Menj el! Te nem \n" +
                    "  vagy közöttünk valósi!", //78

            "Nem volt semmi a dobozban.", //79
            "Volt egy szerszám.", //80
            "Találtunk egy métert.", //81
            "Találtunk kártyákat.", //82
            "Találtunk egy baltát.", //83
            "Találtunk egy maszkot.", //84
            "Találtunk egy lámpát.", //85
            "Találtunk egy rádiót!", //86
            "Találtunk egy elsősegély csomagot.", //87
            "Találtunk néhány pertóleumot.", //88

            "Ültetvényes", //89
            "Krumpli", //90
            "Alkohol", //91
            "Kazán, megóv a fagytól", //92
            "A Mi régi desztillálónk", //93
            "Vödör", //94
            "Ez egy jégkorszak!?...", //95
            "Az ídő lassan múlik, és olyan unalmas itt ülni...", //96

            "Cibuk (csavargó)", //97
            "Blooby néha agresszív!", //98
            "Kemence", // 100
            "Nővény",//101

            "Túlélted...", // 102
            "Mindenki meghalt...", // 103
            "Megtámadtak és meghaltál...", // 104
            "Lépj a menühöz", // 105
            "Megtámattak minket.", // 106
            "Kaptunk segítséget, krupli és egy új térkép!", // 107
            "El nyomtuk ami esett.", // 108
            "Nap", // 109
            "Napok", //110
            "Csúztazsd balra!",//111
            "Reptér",//112
            "Hamarosan megmentenek, Krumpli +1",//113
            "Következő alkalommal mi leszünk .",//114
            "Elvesztettünk egy térképet...", // 115
            "Csak Menedék    ", // 116
            "Puska", // 117
            "Lőszer", // 118
            "Szakács", // 119
            "Szaros víz", // 120
            "Szűrő", //121
            "Áram doboz", // 122

            "Fa", // 123
            "Vas", // 124
            "Dolgozóasztal", // 125
            "Kaka (Műtrágya)", // 126
            "Nyálka", // 127
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
            "Sírhalom", // 142
            "Szív", // 144
            "Zombi", // 145

            "Könnyú", // 146
            "Nehéz", // 147
            "Árok", // 148
            "Madár", // 149
            "Ezüst kulcs", // 150

            "Kutya", // 141
            "Kutyaház", // 152
            "A kutyus meghalt", // 153
            "Arany", // 154
            "Arany rúd", // 155
            "Bicikli, lánc: " ,// 156
            "Bob már nem bírta látni a sok\n" +
                    "halálokat és a túlélés fentartásának a szenvedését..", //157
            "Katrin már nem bírta látni a sok\n" +
                    "halálokat és a túlélés fentartásának a szenvedését.", //`58
            "Híd", // 159
            "Tutaj", // 160
            "Horgászat", // 161
            "Hal", // 162
            "Gommi áfonya", // 163
            "Gommi áfonya lé", // 164
            "Csökkenti a fáradstágot", // 165
            "Halfonya", // 166
            "Csökkenti a fáradstágot és a szomjasságot 25%ra", // 167
            "Zöldföld", // 168
            "A hosszú felfedezés csak 1 napig tart", // 169
            "arany gyártás", //170
            "KÖZEPES", //171
            "pisinézet", // 172
            "16 napig láthatod a csapóajtó veszélyeit", //173
            "segítség", //174
            "támadók", //175
            "Támadás", //176
            "Védekezés", //177
            "Krumplipüre", // 178
            "Regenerálja a védekező pontokat 100%-ra", // 179

            "Csontok", // 180
            "Rádió", // 181
            "Asztalterítő", // 182
            "ElvesztegetettLélek", // 183
            "ÁrtatlanLélek", // 184
            "elvesztettHal", //185
            "Ad 10000 pont támadást.", //186
            "ÁrtatlanBurgonya", // 187
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
            "Az élelmiszer lassan ki fog fogyni!", //210
            "Katonai fényjelzést kell adnunk, vagy más módot kell találnunk a túlélésre.", //211
            "Találjuk meg a túlélési módot, nem csak ott ülhetünk.", //212

            "[TUTORIAL]\nSzia! Ez az Ön menedékhelye, mozoghat rajta (csúsztassa balra/jobbra). Érintse meg/koppintson rá, hogy megtudja, mi az. Érintse meg/koppintson a karakterekre a statisztikáik ellenőrzéséhez. Koppintson az ágyra, és menjen aludni.", //213
            "[TUTORIAL]\nTöbbnyire minden, amit \"kipipál\" vagy tesz, az alvás után hat. Itt olvashat néhány fontos információt. A csapóajtó nagyon fontos, ki lehet menni a kertbe vagy kinyitni, hogy beengedjen valakit, vagy fényjelzést adjon.", //214
            "[TUTORIAL]\nÉrintse meg a rádiót, hogy ellenőrizze, hogy a katonaság kér-e fényjelzést, ha igen, adja meg. Tedd meg néhányszor, hogy megnyerd a játékot (sok vége van, de találd ki magad)", //215
            "[TUTORIAL]\nNe felejts el karaktereket etetni! Ahhoz, hogy tárgyakat/erőforrásokat szerezzen, menjen az expedícióra (bakancs a karakter menüjében), ne felejtse el \"itatni\" és megetetni egyet, mielőtt kimegy!", //216
            "[TUTORIAL]\nHa elveszíted a térképedet, a segítők (ha szerencséd van) adnak egy másodikat. Ültess burgonyát a tálba, és használhatod a bolti kereskedéshez.", //217
            "[TUTORIAL]\nEz a játék nem könnyű! Rejtvények megoldása, különféle módok és lehetőségek kipróbálása, érmék gyűjtése új különleges tárgyak feloldásához. Tipp: Először vegyél munkaasztalt Jó szórakozást! - pokulan (lefordítva)", //217
            "stílus pontok",//218
            "Fejsze", // 220
            "Bot", // 221
            "Suriken", // 222
            "Ördög", // 223
            "Sárgarépa", // 224
            "AlcoMist", // 225
            "Az ellenséget 30%-kal gyengébbé teszi.", // 226

            "Teddy Maci", // 227
            "Létra", // 228
            "Szereted-e\n Alive In Shelter?\n   Értékeld!", // 229
            "Repülőtér", // 230
            "Erdő", // 231
            "Üzlet", // 232
            "További út", // 233
            "Emlékezik: ", // 234
            "mentő busz: ", // 235
            "Mikulás", // 236
            "Segítségre van szükségem. Nincsenek karácsonyi díszek, sajnos tehát segíthetsz.", // 236
            "Vigyázz! TŰZ!", // 237
            "Tűzoltó készülék", // 239
            "A hóember megöl minket.", // 240
            "A gyilkos hóember", // 241

            "1939 burgonya", // 242
            "Indítsd el a játékot 1939 burgonyával.", // 243
            "Csak 8mp kihívás", // 244
            "A szerszámok összegyűjtésében csak 8 másodperc van", // 245
            "Csak kaja és pia", // 246
            "Indítsa el a játékot csak 3l vízzel és 2kg élelmiszerrel", // 247
            "Csak nők!", // 248
            "Csak a Katrinnal lehet játszani.", // 249
            "Jön a tél", // 250
            "Mindig fagyos szél lessz", // 251
            "Véletlen", // 252
            "Indítsa el a játékot véletlenszerű dolgokkal.", // 253
            "BenHulk", // 254
            "Indítsa el a játékot mutált Bennel",  //255
            "Növény őr", // 256
            "A növény segít megvédeni a bunkert.", // 257
            "Danse macabre", // 258
            "A karakterek újra életre kelnek 6 nappal a haláluk után.", // 259
            "szerzetelek nélkül", // 260
            "Nincsenek szerzetesek!", // 261
            "Kint biztonságos", // 262
            "Mindig alacsony a sugárzás", // 263
            "Extra denevérek", // 264
            "A denevérek mutálódnak, és hoznak Bloobyt.", // 265
            "Nincs kilépés", // 266
            "Nincs csapóajtó.", // 267
            "Klasszikus mód", // 268
            "Játssz klasszikus módban - régi idők, csak egy szoba van stb.", // 269
            "Sandbox mód", // 270
            "Játssz a homokozó módban, Azt Csinálhatod, amit akarsz!", // 271
            "Nincs többé fura emberek", // 272
            "Játssz denevérek, hóember és Pennywhistle nélkül.", // 273
            "RPG", // 274
            "Keress tapasztalatpontokat és frissítsd fel a karaktereket.", // 275

            "Szint", // 276
            "Következő szint", // 277
            "Pontok", // 278

            "Napi bónusz", // 279
            "Heti bónusz", // 280
            "Indie játékfejlesztő vagyok, szabadidőmet a játék fejlesztésével töltöm. Ha akarod, segíthetsz nekem adományozni = prémium vásárlás. Feloldod az összes DLC-elemet, az összes menedéktárgyat 0 érméért, átnevezed a karaktereket, a megjegyzett pozíciót, és eltávolítod az összes hirdetést. Köszönöm 🙂", // 281
            "IDt megosztani", // 282
            "Addolj be engem", // 283
            "Barátok szomszédok", // 284

            "Játsz deathmatchet - az nyer, aki tovább tart!", // 285
            "Várakozás az elfogadásra", // 286
            "Meghívni a mérkőzésre", // 287
            "örökre meghalt", // 288
            "Deathmatchet nyeri:", // 289
            "TisztíttóBogyó", // 290
            "Kitisztítja a családtagokat.", // 290
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
            "Üzlet #2", // 303
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
            "Rossz hóember jött vissza 🙁", // 330
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
            "Dişari çikmak için bir uzay roketi yapmaliyiz ya da dişaridaki diger canlilara yardim etmeliyiz. Oglunun telefonuna da yardimci olabiliriz. Lütfen otobüsün ne zaman gelecegini kontrol edin.", // 376
            "Asker bize radyoyu ne zaman kapinin açilacagini ve gece işik sinyali verecegini söylemeli.", // 377
            "Martha", // 378

            "Nem, Martha meghalt ...", // 379
            "Martha beteg, meg kell gyógyítanunk!", // 380
            "Hide", // 381
            "Elrabolták Marthát!", // 382

            "Helló Martha, a nevem Frebbie vagyok, nem akarlak bántani, segíteni akarok neked, csodálatos helyet fogok mutatni neked, de neked valamit kell megtenned ...", // 383
            "Kérlek, öld meg a testvéredet, Ben annyira durva, és nem szeretlek ... Visszamegyünk a jövő héten.", // 384
            "Én kedvelem a noket, kérlek, öld meg Apát Bobot ... Jöjjön ide a héten", // 385
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
            "Kő, papír, olló", // 422
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
            "Ébresztő", // 435

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
            "Marthának rossz álma volt ... Nagyon fél, mikor el kell bújnia.", // 447
            "Pirinç", //448
            "Ragasztó", // 449

            "Farmer", // 450
            "Indítsd el a játékot az összes maggal.", // 451

            "Almafa", // 452
            "Alma", // 453

            "Holnap több energia-visszanyerést kapsz!", // 454
            "Almabor", //455

            "Az expedíció az engedélyezés után következő napon zajlik.", // 456
            "Nyisd ki a csapóajtót és menj aludni, hogy fényjelzést adj, ha a rádió mondja.", // 457
            "Győződjön meg róla, hogy biztonságban van, amikor fényjelzést ad.", // 458
            "Beállíthatja az ébresztőórát, hogy éjszaka etesse a kutyát.", // 459
            "Nem használhatsz boltot a városban, ha az orvos a menhelyen van.", // 460
            "A boltot feszítővassal kirabolhatod, ha az orvos a menhelyen van.", // 461
            "Menjen tovább, és először kattintson a térkép megrajzolásához, majd további helyeket nyit meg.", // 462
            "Bújtsa el Mártát, amikor egyedül van, mielőtt kinyitná a csapóajtót éjszakára.", // 463
            "Ezüst kulcsot hordhat a madár vagy az orvos a boltban.", // 464
            "Get The Cook get golden key.", // 465
            "Kék kulcscsere a szállodában.", // 466
            "Nézze meg a wiki oldalt az összes végződés megtekintéséhez.", // 467
            "Főleg a pincében áss szén, csontok és fémércek előállítása érdekében.", // 468
            "Igyál sört vagy almabort a bányászati ​​energia visszanyeréséhez.", // 469
            "Mindig ellenőrizze a karakterstatisztikát.", // 470
            "Néhány cselekvés azonnal elvégezhető, és néhányhoz alvásra van szükség.", // 471
            "Kattintson a kukára a kertben, hogy elmozdítsa a szemetet és a szörnyet.", // 472
            "Keresd a készletcsökkenést a kertben.", // 473
            "Próbálj meg rakétát készíteni és menekülj a Földről...", // 474
            "Próbálj meg kézművesíteni és előkészíteni egy tutajt a tengerparton, hogy elmenekülj.", // 475
            "A csapóajtóhoz kopogtató segítők krumplit és térképet adhatnak.", // 476
            "A macska megöli a szemetes szörnyeket és a denevéreket...", // 477
            "Vigyázzatok az expedíciókon!", // 478
            "Keressen autóalkatrészeket az expedíciókon, hogy megjavítsa az autót a roncstelepen.", // 479
            "Ne feledje a bájitalokat! Készítheti és használhatja őket.", //480

            "Több minden:",//481
            "Kávé", // 482
            "Kávémag", // 483
            "Visszanyeri az energiát", // 484

            "Koronavírus", // 485
            "Próbáld túlélni a COVID-19 vírust! Az alkohol segíthet benne!", // 486

            "Itt tárolhatod a zenéidet", // 487
            "Hozzáférés a tároláshoz", // 488

            "A Cibuk kifosztott minket. Tudsz evvel csinálni valamit? ... Öld meg, akkor továbbig beszélgethetünk.", // 489
            "Energiára van szükségünk! Hozz nekünk 5 csésze kávét.", // 490
            "Van valami törött. 3 biztosíték kiégett. Tudsz adni nekünk újat?", // 491
            "A patkányok megsemmisítettek néhány vezetéket. A kapu kinyitásához 6 új huzalra van szükségünk.", // 492
            "A kapu bekapcsolásához 10 urándarabra van szükségünk.", // 493
            "A kapu minden vasárnap nyitva van!", // 494

            "Lila virág", // 495
            "Gyógyítson meg minden sérülést", // 496

            "Vitézi szív", // 497
            "Összes sebeket meg gyógyítja.",// 498

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

            "Szemét ölő", // 519
            "Az elején erős méreg van a szemétszörnyekre.", //520
            "Vak", // 521
            "Próbálj meg lámpa nélkül játszani.", // 522
            "Ellopom a vized!", // 523
            "Kenyér", // 524

            "A nevem Srak. Kérem, segítsen nekem ebben a bajban. Adj egy terítőt. Adok neked egy kis krumplit, rádiót és benzint.", // 525
            "lőszertartó", // 526
            "Kezd el a játékot rengeteg lőszerrel!", // 527

            "Nyomd és tartsd lenyomva a vásárláshoz", // 528

            "Ma rekkenő hőség van, ma többet kell innunk!", // 529
            "Szia! Skylight vagyok. Fel tudsz tölteni az elemlámpáddal? Itt vagyok mindig vasárnap. Cserébe segítek a fényjelzésekben.", // 530

            "Banditák", // 531
            "Adj 2L vizet, hogy eltűnjünk. Ha nem, akkor harcolj!", // 532

            "Kunyhó", // 533
            "Élelmiszer Pack", // 534
            "Áttírja az aktuális mentést?", //535

            "Páncél", // 536
            "Napelem", // 537
            "Elromlott a napelem.", // 538

            "Burgonya bélyegző", // 539
            "Abba hagytuk a kopogást, hogy meg mentsünk, mert senki sem nyitotta az ajtót. Még mindig élsz?", //540

    };

    public static final String credits = "Fordítás:\n-Ádám Kolozsi\n-Botond Kurucz\n-Császár Botond";
}
