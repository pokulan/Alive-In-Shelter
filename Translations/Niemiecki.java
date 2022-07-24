package com.pokulan.aliveinshelter;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

/**
 * Created by Wojtek on 3/13/2017.
 */
public class Niemiecki {
    public static final BitmapFont czcionka = new BitmapFont(Gdx.files.internal("czcionka.fnt"));
    public static final String TEXT[] ={
            "Neues Spiel", //1
            "Fortfahren", //2
            "Statistiken", //3
            "Sammeln gescheitert", //4
            "Bunker gescheitert", //5
            "Überlebt", //6
            "Spiele gestartet", //7
            "Sohn gestorben", //8
            "Unvollendete Runden", //9
            "Längste Runde", //10

            "Bob! Schnell, schnapp\ndir so viele Vorräte, wie\ndu nur kannst!\n              Katrin", //11

            "Bob ist gestorben, das ist traurig.", //12
            "Ben ist gestorben, warum er? Warum?..", //13
            "Katrin ist gestorben, letzte Frau ist gestorben.", //14
            "Bob wurde krank, wo sind Pillen?", //15
            "Ben hat hohes Fieber.", //16
            "Katrin fühlt sich nicht gut.", //17
            "Bob war lange nicht mehr zurück.", //18
            "Ben ist weg, er wird nie wieder kommen.", //19
            "Katrin verschwindet für immer.", //20

            "Wir sind Krank.", //21
            "Regenschauer, unsere Wände sind undicht...", //22
            "Jemand hat Wasser verschüttet! -0.25l", //23
            "Essen ist verdorben -0.2kg", //24
            "Kein Strom, öffnen Sie die Tür oder nicht, wenn es Taschenlampe gibt.", //25
            "Ben konnte es nicht mehr aushalten.All diese Kämpfe und Tode ums Überlebene..", //26

            "Das Radio wurde repariert!", //27
            "Die Gasmaske wurde repariert!", //28
            "Das Radio ist kaputt gegangen.", //29

            "Wir müssen den Müll entsorgen, ist es sicher draußen?", //30
            "Wir gaben ein Lichtsignal.", //31
            "Wir haben die Taschenlampe verloren.", //32
            "Wir haben eine Taschenlampe gestohlen.", //33
            "Wir haben eine Gasmaske gestohlen.", //34
            "Wir haben die Axt verloren...", //35
            "Nächstes mal werden wir handeln.", //36
            "Handel abgeschlossen..", //37
            "Wiederbelebung geschafft!", //38
            " muss wiederbelebt werden!\nTippe schnell!", //39

            "War zu langsam\nzum existieren", //40
            "Meine Spiele", //41
            "Bitte gebe sie ein Lichtsignal.", //42

            "Bob", //43
            "Ben", //44
            "Katrin", //45
            "Hunger", //46
            "Durst", //47
            "Müde", //48
            "Betrunken", //49

            "Matratzen = nächster Tag", //50
            "Ekliger Müll", //51
            "Huch! Was für ein Monster!", //52
            "Können wir das essen?", //53
            "Nur Karten machen Spaß", //54
            "Radio = Kommunikation", //55
            "Seuchen Level: ", //56
            "HOCH", //57
            "NIEDRIG", //58
            "Große Karte", //58
            "Scharfe Axt", //59
            "Gasmasken Zustand:", //60
            "Werkzeug:", //61
            "Verbandskasten:", //62
            "Normale Taschenlampe", //63
            "Nahrung", //64
            "Wasser", //65
            "Kraftstoff", //66

            "Ich habe nützliche Sachen", //67
            "Psst... Ich habe etwas", //68
            "Jemand klopft??", //69
            "Da ist ein Geräusch, hilfe?!", //70
            "Etwas ist auf den Boden eingeschlagen", //71
            "Ruhig draußen...", //72

            "Ohne Vorräte wird Ben nicht zurückkommen...", //73
            "Ohne Vorräte wird Bob nicht zurückkommen...", //74
            "Ohne Vorräte wird Katrin nicht zurückkommen...", //75

            " Hallo, was hier passiert\n" +
                    "ist sehr kompliziert.\n" +
                    "Vertraue weder der\n" +
                    "Regierung noch dem Militär.\n" +
                    "Du kannst mit uns kommen.\n" +
                    "Jeden graden Tag werden \n" +
                    "wir hier ein Paket\n" +
                    "hinterlassen.", //76
            "Interessante Leute[?]...", //77
            "Verschwinde! Du gehörst\n   nicht zu uns!", //78

            "Da war nichts in der Box.", //79
            "Da war ein Werkzeug.", //80
            "Wir haben ein Messgerät gefunden.", //81
            "Wir haben eine Karte gefunden.", //82
            "Wir haben eine Axt gefunden.", //83
            "Wir haben eine Gasmaske gefunden.", //84
            "Wir haben eine Taschenlampe gefunden.", //85
            "Wir haben ein Radio gefunden.", //86
            "Wir haben einen Verbandskasten gefunden.", //87
            "Wir haben Kraftstoff gefunden.", //88

            "Schüssel", //89
            "Kartoffeln", //90
            "Alkohol", //91
            "Ofen, lass uns nicht erfrieren!", //92
            "Unser alter Brenner", //93
            "Eimer", //94
            "Eiszeit!?...", //95
            "Die Zeit vergeht...", //96

            "Der Obdachlose", //97
            "Blooby ist manchmal etwas aggressiv", //98
            "Ofen", // 100
            "Pflanze",//101
            "Du hast Überlebt...", // 102
            "Alle sind gestorben...", // 103
            "Angegriffen und getötet...", // 104
            "Tippen für Menü", // 105
            "Wir wurden angegriffen.", // 106
            "Wir haben etwas Hilfe bekommen, Kartoffel!", // 107
            "Wir erhielten Vorräte.", // 108
            "Tage", // 109
            "Tag", //110
            "Streiche nach Links!",//111
            "Flughafen",//112
            "Sie werden uns bald retten, Kartoffeln +1.",//113
            "Nächstes mal wird es mit uns sein.",//114
            "Wir haben die Karte verloren...", // 115
            "Nur Bunker", // 116
            "Gewehr", // 117
            "Munition", // 118
            "Köchin", // 119
            "Schmutziges Wasser", // 120
            "Der Filter", // 121
            "Sicherungskasten", // 121

            "Holz", // 123
            "Eisen", // 124
            "Arbeitstisch", // 125
            "Dünger", // 126
            "Schleim", // 127
            "TV", // 128
            "Rakete", // 129
            "Raketentreibstoff", // 130
            "Loch", // 131
            "Altar", // 132
            "Bedingung", // 133
            "Das Ventil", // 134
            "Andere Sachen:", // 135
            "Kupfer", // 136
            "Sicherung", // 137
            "Draht", // 138
            "Bergmann", // 139
            "Fledermaus", // 140
            "Goldener Schlüssel", // 141

            "Schaufel", // 142
            "Grab", // 143
            "Herz", // 144
            "Zombie", // 145

            "Einfach", // 146
            "Hart", // 147
            "Graben", // 148
            "Vogel", // 149
            "Silberner Schlüssel", // 150
            "Hund", // 141
            "Hundehütte", // 152
            "Hund ist gestorben", //153
            "Gold", // 154
            "Goldbarren", // 155
            "Fahrrad, Kette: ", // 156
            "Bob konnte es nicht mehr aushalten.\nAll diese Kämpfe und Tode ums Überlebene..", //157
            "Katrin konnte es nicht mehr aushalten.\nAll diese Kämpfe und Tode ums Überlebene..", //158
            "Brücke", // 159
            "Floss", // 160
            "Angeln", // 161
            "Fisch", // 162
            "Gommi Blaubeere", // 162
            "GommiBerry Saft", // 164
            "Reduziert die Müdigkeit", // 165
            "FishBerry", // 166
            "Reduziert Müdigkeit und Durst auf 25%", // 167
            "GreenDirt", // 168
            "Lange Expedition dauert nur 1 Tag", // 169
            "Alchimie", //170
            "MITTEL", //171
            "PissVision", // 172
            "Ermöglicht es Ihnen, die Falltür für 16 Tage zu scannen", //173
            "Hilfe", //174
            "Angreifer", //175
            "Attacke", //176
            "Abwehr", //177
            "MashedPotatoes", // 178
            "Regeneriert Verteidigungspunkte", // 179

            "Knochen", // 180
            "Radio", // 181
            "Tischdecke", // 182
            "WastedSoul", // 183
            "InnocentSoul", // 184
            "WastedFish", //185
            "Gibt 10000 Schaden an.", //186
            "InnocentPotato", // 187
            "Regeneriert 4000 Verteidigungspunkte", // 188

            "BrakeOut", // 189
            "Flucht wird das Monster nicht heilen", // 190
            "DoubleKick", // 191
            "2x mehr Schaden", // 192
            "Box-Tasche", // 193
            "Lautsprecher", // 194
            "Geiseln, Seil", // 195

            "Geiseln, Botschaft für Militär", // 196
            "Wir haben 10 Geiseln, retten uns! \nGdansk, Legendy 53", // 197
            "Senden", // 198
            "Wir werden dich retten\nTag: ", // 199
            "Ninja", //200
            "Du wirst außerhalb von Monstern für 5 Tage vermeiden", //201
            "Decke", //201
            "Pennywhistle", //203
            "Gebrochenes Auto", //204
            "Autoteile", //205
            "Schleuder", //206
            "Hähnchen", //207

            "Pflanze wächst an der Wand.", //208
            "Wasser läuft aus!", //209
            "Das Essen läuft langsam aus!", //210
            "Wir sollten militärisches Lichtsignal geben oder einen anderen Weg finden, um zu überleben.", //211
            "Lasst uns einen Weg finden um zu überleben, wir können nicht nur dort sitzen.", //212

            "[TUTORIAL]\nHi! This is your shelter, you can move around it (swipe left/right). Touch/tap on item to know what it is. Touch/tap on characters to check theirs' stats. Tap on bed and go sleep.", //213
            "[TUTORIAL]\nMostly everything what you 'tick' or do will take effect after sleeping. Here you can read some important informations. Trapdoor is very important, you can go to the garden or open it to let somebody in or give light signal.", //214
            "[TUTORIAL]\nTap on the radio to check if military wants light signal if yes give it. Do it few times to win the game (there is a lot of more endings but find them out by yourself) :D", //215
            "[TUTORIAL]\nRemember to feed you characters! To get items/resources go on the expeditions (boots in the character's menu), remember to 'water' and feed one before going out!", //216
            "[TUTORIAL]\nIf you lose your map helpers (if you are lucky) will give you second one. Plant potatoes in the bowl you can use them to trade in the shop.", //217
            "[TUTORIAL]\nThis game isn't easy! Solve puzzles, try different ways and options, earn coins to unlock new special items. Tip: First buy Worktable ;) Have fun! - pokulan", //217
            "Style Punkte",//218
            "Axt", // 220
            "Stock", // 221
            "Shuriken", // 222
            "Teufel", // 223
            "Möhren", // 224
            "AlcoMist", // 225
            "Macht den Feind 30% schwächer.", // 226

            "Teddy", // 227
            "Leiter", // 228
            "Mögen Sie  \n Alive In Shelter?\n   Bewertung!", // 229
            "Flughafen", // 230
            "Wald", // 231
            "Geschäft", // 232
            "Weiter gehen", // 233
            "Merken: ", // 234
            "Rettungsbus: ", // 235
            "Weihnachtsmann", // 236
            "Ich brauche Hilfe. Sie haben keine Weihnachtsdekoration, also nein danke.", // 236
            "Achtung! EIN FEUER!", // 237
            "Feuerlöscher", // 239
            "Schneemann tötet uns.", // 240
            "Schneemann Mörder", // 241

            "1939 Kartoffeln", // 242
            "Starten Sie das Spiel mit 1939 Kartoffeln.", // 243
            "Nur 8er Herausforderung", // 244
            "Sie haben nur 8 Sekunden im Sammeln.", // 245
            "Nur Essen und Wasser", // 246
            "Starte das Spiel nur mit 3 l Wasser und 2 kg Futter.", // 247
            "Nur Frauen!", // 248
            "Spiele nur mit Katrin.", // 249
            "Der Winter kommt", // 250
            "Immer ist frostiger Wind.", // 251
            "Zufällig", // 252
            "Starte das Spiel mit zufälligen Gegenständen.", // 253
            "BenHulk", // 254
            "Beginne das Spiel mit dem mutierten Ben.", // 255
            "Pflanzenwächter", // 256
            "Pflanze hilft dir, deinen Schutz zu schützen.", // 257
            "Danse macabre", // 258
            "Charaktere werden 6 Tage nach dem Tod wieder lebendig.", // 259
            "Keine Mönche", // 260
            "Es gibt keine Mönche!", // 261
            "Sicherheit draußen", // 262
            "Immer geringe Strahlung.", // 263
            "Zusätzliche Fledermäuse", // 264
            "Fledermäuse sind mutiert. Sie bringt Blooby.", // 265
            "Kein Ausgang", // 266
            "Es gibt keine Falltür.", // 267
            "Klassischer Modus", // 268
            "Spiele im klassischen Modus - alte Zeiten. Nur ein Zimmer usw.", // 269
            "Sandbox-Modus\n", // 270
            "Spiele im Sandbox-Modus, mach was du willst!", // 271
            "Nicht mehr diese Jungs", // 272
            "Spielen Sie ohne Fledermäuse, Schneemann und Pennywhistle.", // 273
            "RPG", // 274
            "Verdiene Erfahrungspunkte und levele Charaktere.", // 275

            "Ebene", // 276
            "Nächste Ebene", // 277
            "Punkte", // 278

            "Täglicher Bonus", // 279
            "Wöchentlicher Bonus", // 280
            "I am an indie game developer I spend my free time improving this game. If you want you can help me donating me = buying a premium. You will unlock all DLC items, all shelter items for 0 coins, renaming characters, remembered position and remove all ads. Thanks :)", // 281
            "Aktie ID", // 282
            "Steht aus", // 283
            "Freunde Nachbarn", // 284

            "Spielt Deathmatch - gewinnt, wer länger hält!", // 285
     "Warten auf Annahme", // 286
             "Invite to match", // 287
             "starb für immer ...", // 288
            "Deathmatch gewinnt:", // 289
            "CleanBerry", // 290
            "Reinigt Familienmitglieder.", // 290
            "\"Gommi\" Dorf", // 292
            "\"Wir werden dir Asyl geben.\"", // 293
            "Weed", // 294
            "Dildo", // 295
            "Drugs", // 296

            "Kopf", // 297
            "Arme", // 298
            "Bauch", // 299
            "Beine", // 300

            "Berg", // 301
             "Hof", // 302
             "Shop # 2", // 303
             "Grab", // 304
             "Unterstände", // 305
             "Friedhof", // 306
             "Strand", // 307
            "Gesundheit", // 306
            "Energie", // 307
            "trinken", // 310
            "essen", // 311
            "heilen", // 312
            "ausgehen", // 313
            "Mined mine", // 314
            "Mine Enter wird am Anfang geöffnet, ohne zu craften.", // 315
            "Zusätzliche Kartenstücke", // 316
            "Kamin", // 317
            "Ein Hotel buchen", // 318
            "Stock", //319
            "Preis", //320
            "Uran", // 321
            "Türen geschlossen (ich brauche einen blauen Schlüssel)", // 322
            "Blauer Schlüssel", // 323
            "Weitere Standorte", // 324
            "Starten Sie das Spiel mit 2 zufälligen Zusatzkarten!", // 325
            "Türunterbrecher", // 326
            "Starte das Spiel mit allen Schlüsseln!", // 327
            "Meister der Expeditionen", // 328
            "Starten Sie das Spiel mit allen zusätzlichen Kartenteilen", // 329
            "Schlechter Schneemann kam zurück :(", // 330
            "Verschmutzungsmesser ist kaputt.", // 331
            "Wir müssen duschen! Lass uns schmutziges Wasser benutzen.", // 332
            "Tür", // 333
            "Gift", // 334

            "966 Gommi Blaubeeren", // 335
            "Starten Sie das Spiel mit 966 Gommi Blueberries.", // 336
            "Blobby the slime", //337
            "Starte das Spiel mit Blobby.", // 338
            "Dodge the dog", //339
            "Starten Sie das Spiel mit Hund! (Sie müssen ein Hundehaus haben)", // 340
            "Freunde", // 341
            "Anpassung", // 342
            "Extra", //343
            "Gasleck und Feuer ...", // 344
            "Starterpack", // 345
            "Beginne das Spiel mit extra: Wasser, Essen, Holz, Eisen und Kartoffeln!", // 346
            "Morgen wird gutes Wetter ...", // 347
            "Morgen wird frostig und windig ...", // 348
            "Morgen wird der Regen uns angreifen ...", // 349

            "Du, allmächtig, stirb ...", // 350
            "Wir brauchen Hilfe! Bitte!", // 351
            "Die Falltür ist kaputt, wir müssen es reparieren.", // 352
            "Wasserpflanzen", // 353
            "Dusche", // 354
            "Schwach", // 355
            "Glitch mode", // 356
            "Will you survive? Everywhere glitch...", // 357
            "Glitch-Modus", // 356
            "Wirst du überleben? Überall Glitch ... Starte das Spiel neu, um wieder normal zu werden!", // 357
            "Erdbeben!", // 358
            "Ergreifen Sie, was Sie speichern möchten", // 359

            "Ben !? Wie ist es möglich?", // 360
            "Angreifer sind überall!", // 361
            "Zimmer", // 362
            "Garten", // 363
            "Keller", // 364

            "Zeitschrift", // 365

            "Hurricane kommt !!!", // 366
            "Tic Tac shut up", // 367
            "Verlangsamt die Uhren!", // 368
            "Luftfilter", // 369
            "Wir müssen Luftfilter reparieren!", // 370
            "Cula", // 371
            "Suppe", //372
            "Skelett", // 373
            "Doge revive", // 374
            "Belebe einen toten Hund!", // 375
            "Wir müssen eine Weltraumrakete bauen, um rauszukommen oder um Hilfe von anderen Wesen von draußen zu bitten. Sons Telefon ist vielleicht auch hilfreich. Bitte überprüfen Sie jemanden, wenn der Bus ankommt.", // 376
            "Das Militär sollte uns über das Radio sagen, wann wir die Falltür öffnen und ihnen in der Nacht ein Lichtsignal geben sollen.", // 377
            "Martha", // 378

            "Nein! Martha starb ...", // 379
            "Martha ist krank. Wir müssen sie heilen!", // 380
            "Verstecken", // 381
            "Sie haben Martha entführt!", // 382

            "Hallo Martha. Mein Name ist Frebbie, ich will dich nicht verletzen. Ich will dir helfen. Ich werde dir einen wundervollen Ort zeigen, aber du musst etwas für mich tun ...", // 383
            "Bitte töte deinen Bruder. Ben ist so unhöflich und liebt dich nicht ... Komm nächste Woche wieder hierher.", // 384
            "Ich bevorzuge Frauen, bitte töte deinen Vater Bob ... Komm nächste Woche wieder hierher.", // 385
            "Füttere und trinke deine Mutter. Sie muss stark sein ... komm nächste Woche wieder hierher.", // 386
            "Ich mag Alkohol, bitte machen Sie eine Flasche Alkohol und bringen Sie es für mich nächste Woche.", // 387
            "Vielen Dank! Kommen Sie hier nach dem Tag zurück:", // 388
            "Gitarre", //389
            "POLIZEI! OFFEN!", // 390
            "Wir wissen, dass Sie Vorräte stehlen! Geben Sie uns 1 Kartoffel und 1 Karotte, damit wir das ignorieren.", // 391
            "Vielleicht geben sie Bestechungsgeld?", // 392
            "Ähm ... Du bist sehr wichtig für uns. Wir werden für dich kommen:", // 393
            "Stimme zu", // 394
            "Nicht zustimmen", // 395
            "Vielleicht schießen sie?", // 396
            "CCTV", //397
            "Verwenden Sie zuvor die \"Sicherungskasten\".", // 398
            "Hopfen", // 399
            "Bier", // 400

            "Spitzhacke",// 401
            "Bessere Spitzhacke", // 402

            "Kohle", // 403
            "Eisenerz", // 404
            "Kupfererz", // 405
            "Uranerz", // 406
            "Golderz", // 407
            "Arzt", // 408
            "Uran-Spitzhacke", // 409
            "-Makes betrunken", // 410
            "-Makes Drink \n-Fügt Bergbau-Energie hinzu", // 411
            "Gebratene Kartoffel", // 412
            "Gebratener Fisch", // 413

            "Play The Hobo idle Clicker, whole story about the NUKE in Whelylely city and of course Hobo! Real time game!",//414

            "Brechstange", // 415
            "Ladenraub", // 416

            "Innocent Bomb", // 417
            "Gibt 2000 Schaden an.", // 418

            "Sie können nicht hineingehen", // 419

            "Nachrichten", // 420
            "GPS", // 421
            "Spiel", // 422
            "Snake", //423
            "Filme", // 424

            "Telefon", // 425
            "Anrufen", // 426

            "Hallo [...] Sie brauchen Hilfe? [...] Hmmmm, ich rufe Sie nach 3 Wochen zurück", // 427
            "Hi [...] ich spreche mit meinen Freunden [...] ja Der Westen hat uns angegriffen [...] ich kenne jemanden, der Ihnen helfen kann [...] Carl anrufen: +48 4392", // 428
            "Hallo Carl dort [...] Ahh, du sprichst mit John [...] Die Erde ist zerstört, aber es gibt sichere Orte. Ruf Militär: 112112", // 429
            "Hallo [...] Autsch, du kommst von Carl [...] ich verstehe. Bereite 6 Flaschen Alkohol und 2 Bier vor. Dann werden wir dich Tag retten: ", // 430

            "Schmutzige Kleidung", // 431
            "Die Familie kleidet sich jeden Tag in zufällige Klamotten, die vorher gekauft wurden.", // 432
            "Telefon Ladegerät", // 433
            "Pilze", // 434
            "Wecker", // 435

            "Hallo Mensch. Ich kann Ihnen ein Wunderland zeigen, ein besseres Wort ohne Kriege und Aggressionen.", // 436
            "Da wir dort keinen Alkohol konsumieren können, bin ich etwas durstig.", // 437
            "Ich werde dort alle 20 Tage für 1 Bier und 1 Flasche Wodka kommen.", // 438
            "Ich werde 4 mal kommen. Bist du dabei?\n\n\nYES       NOT YET", // 439
            "Vielen Dank! Tschüss für die nächsten 20 Tage.", // 440
            "Kein Alkohol, keine Rettung ... Auf Wiedersehen für immer.", // 441
            "Fleisch", // 442
            "Gebackenes Fleisch", // 443
            "Bomben abwerfen!", // 444
            "Starte das Spiel als Bomber! Schlage die Ziele, um zusätzliche Stilpunkte zu erhalten!", // 445
            "Die Katze hat getötet:", // 446
            "Martha hatte einen bösen Traum ... Sie hat solche Angst, wenn sie sich verstecken muss.", // 447
            "Reis", //448
            "Kleben", // 449

            "Bauer", // 450
            "Starte das Spiel mit allen Samen.", // 451

            "Apfelbaum", // 452
            "Apfel", // 453

            "Sie haben morgen mehr Energie zurück!", // 454
            "Apfelwein", //455

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

            "Mehr alle:", // 481

            "Kaffee", // 482
            "Kaffeesamen", // 483
            "Stellt Energie wieder her", // 484

            "Coronavirus", // 485
            "Versuche mit COVID-19 zu überleben! Alkohol hilft!", // 486

            "Fügen Sie dort Ihre Songs ein", // 487
            "Zugriff auf Speicher gewähren", // 488

            "Der Hobo raubt uns. Kannst du etwas damit anfangen? ... Töte ihn, dann werden wir mehr reden.", // 489
            "Wir brauchen Energie! Bring uns 5 Tassen Kaffee.", // 490
            "Da ist etwas kaputt. 3 Sicherungen sind durchgebrannt. Können Sie uns eine neue geben?", // 491
            "Die Ratten zerstörten einige Drähte. Um das Tor zu öffnen, benötigen wir 6 neue Drähte.", // 492
            "Um das Tor einzuschalten, benötigen wir 10 Uranstücke.", // 493
            "Das Tor öffnet jeden Sonntag!", // 494

            "Purple Power", // 495
            "Heile alle Verletzungen", // 496

            "Valiant Heart", // 497
            "Es gibt keinen Selbstmord.",// 498

            "<Klick>", // 499
            "<swipe>", // 500
            "Vorräte sind die wichtigsten für das Überleben. Denken Sie daran, sie im Auge zu behalten.", // 501
            "Sie können den Raum oder einige Orte außerhalb mit einem Fingerwisch ändern", // 502
            "Es gibt viele andere Elemente, die Sie durch Berühren / Klicken überprüfen können.", // 503
            "Geh schlafen, um am nächsten Tag zu kommen.", // 504
            "Lassen Sie uns Bobs Zustand überprüfen. Klicken Sie auf ihn und geben Sie ihm etwas zu trinken!", // 505
            "Es ist wichtig, die Familienmitglieder im Auge zu behalten. Oh, sieh dir eine Pflanze an ... bring sie in den Müll!", // 506
            "Einige Aktionen brauchen Schlaf, pflanzen wir eine Kartoffel und gehen dann zum nächsten Tag.", // 507
            "Falltür ist sehr wichtig, wenn jemand klopft, kann es Feind oder Helfer sein, es hat auch seinen eigenen Zustand.", // 508
            "Sie können riskieren, die Falltür zu öffnen oder zu überprüfen, wer dort ist, indem Sie beispielsweise einen Trank verwenden.", // 509
            "Trank herstellen: PissVision und trink ihn.", // 510
            "Schau! Helfer! Du kannst die Falltür sicher öffnen.", // 511
            "Es ist Zeit, allen Familienmitgliedern Essen und Trinken zu geben.", // 512
            "Lassen Sie uns Kartoffeln verwässern.", // 513
            "Es ist wichtig, den Müll rauszuholen. Geh in den Garten.", // 514
            "Es ist Zeit, jemanden zur Expedition zu schicken, um Nachschub zu holen. Wir haben eine Karte, also lass uns in die Stadt gehen.", // 515
            "Überprüfen Sie die Strahlung, wenn sie HOCH ist, dann kostet die Expedition eine Gasmaske.", // 516
            "Nehmen Sie das Wasser- und Lebensmittelbündel.", // 517
            "OK, du kennst die grundlegenden Dinge, jetzt kannst du das Spiel starten. Lies Tagebuch und benutze dein Gehirn! Töte alle.", // 518

            "Trash killer", // 519
            "Am Anfang gibt es ein starkes Gift für Müllmonster.", //520
            "Blind", // 521
            "Versuche ohne die Lampe zu spielen.", // 522
            "Brot", // 524

            "Mein Name ist Srak. Bitte helfen Sie mir bei diesem Problem. Geben Sie mir eine Tischdecke. Ich werde Ihnen Kartoffeln, ein Radio und Benzin geben.", // 525
            "Ammunition keeper", // 526
            "Starte das Spiel mit viel Munition!", // 527

            "Lange drücken, um zu kaufen", // 528

            "Es ist drückende Hitze heute, wir müssen heute mehr TRINKEN!", // 529
            "Hallo! Ich heiße Skylight. Können Sie mich mit Ihrer Taschenlampe aufladen? Ich bin immer sonntags hier. Ich werde Ihnen im Austausch mit den Lichtsignalen helfen.", // 530

            "Banditen", // 531
            "Gib uns 2 Liter Wasser, damit wir weg sind. Wenn nicht, dann kämpfe!", // 532

            "Schuppen", // 533
            "Food Pack", // 534
            "Aktuelle Speicherung überschreiben?", //535

            "Rüstung", // 536
            "Sonnenkollektor", // 537
            "Sonnenkollektor kaputt.", // 538

            "Kartoffelstempel", // 539
            "Wir haben aufgehört, Ihnen zu helfen, weil Sie die Tür nicht geöffnet haben. Bist du noch am Leben?", //540
    };

    public static final String credits = "Übersetzung:\n-GeriMcFly\n-Pascal Weißendung";
}
