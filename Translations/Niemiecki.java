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
            "Fehlgeschlagene Sammlungen", //4
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
            "Bob wurde krank, wo ist Medizin?", //15
            "Ben hat hohes Fieber.", //16
            "Katrin fühlt sich nicht gut.", //17
            "Bob war lange nicht mehr zurück.", //18
            "Ben ist weg, er wird nie wieder kommen.", //19
            "Katrin ist für immer verschwunden...", //20

            "Wir wurden krank, verdammt!", //21
            "Regenschauer, unsere Wände sind undicht...", //22
            "Jemand hat Wasser verschüttet! -0.25l", //23
            "Etwas Essen ist verdorben -0.2kg", //24
            "Kein Strom, öffnen Sie die Tür für Licht oder lassen Sie es zu wenn Sie eine Taschenlampe haben.", //25
            "Ben konnte den Tod und den Kampf ums überleben nicht mehr ertragen.", //26

            "Das Radio wurde endlich repariert.", //27
            "Die Gasmaske wurde repariert!", //28
            "Das Radio ist wieder kaputt gegangen...", //29

            "Wir müssen den Müll rausbringen, sonst bringt uns der Schimmel um.", //30
            "Wir haben ein Lichtsignal gegeben, vielleicht retten sie uns.", //31
            "Wir haben die Taschenlampe verloren.", //32
            "Wir haben eine Taschenlampe gestohlen.", //33
            "Wir haben eine Gasmaske gestohlen.", //34
            "Wir haben eine Axt verloren...", //35
            "Nächstes mal werden wir handeln.", //36
            "Handel abgeschlossen.", //37
            "Wiederbelebung geschafft!", //38
            " muss wiederbelebt werden!\nTippe schnell!", //39

            "War zu langsam\n   zum überleben", //40
            "Meine Spiele", //41
            "Bitte gebe sie ein Lichtsignal", //42

            "Bob", //43
            "Ben", //44
            "Katrin", //45
            "hunger", //46
            "durst", //47
            "müde", //48
            "betrunken", //49

            "Matratzen = schlafe für den nächsten epischen Tag", //50
            "Ekliger Müll", //51
            "Müllmonster", //52
            "Können wir das essen?", //53
            "Karten sind unsere einzige Unterhaltung", //54
            "Radio = Kommunikation", //55
            "Seuchen Level: ", //56
            "HOCH", //57
            "NIEDRIG", //58
            "Große Karte", //58
            "Axt", //59
            "Gasmasken, Zustand:", //60
            "Werkzeuge:", //61
            "Verbandskasten:", //62
            "Normale Taschenlampe", //63
            "Nahrung", //64
            "Wasser", //65
            "Benzin", //66

            "Ich habe ein paar nützliche Sachen.", //67
            "Psst... Ich habe etwas!", //68
            "Jemand klopft??", //69
            "Da ist ein Geräusch, ist es hilfe?", //70
            "Etwas ist auf den Boden gefallen.", //71
            "Ruhig draußen...", //72

            "Ohne Vorräte wird Ben nicht zurückkommen...", //73
            "Ohne Vorräte wird Bob nicht zurückkommen...", //74
            "Ohne Vorräte wird Katrin nicht zurückkommen...", //75

            " Hallo, was hier passiert\n" +
                    "ist sehr kompliziert.\n" +
                    "Vertraue weder der\n" +
                    "Regierung noch dem Militär.\n" +
                    "Du kannst mit uns kommen.\n" +
                    "Jeden graden Tag, komm\n" +
                    "und wir werden hier ein\n" +
                    "Paket hinterlassen.", //76
            "Interessante Leute[?]...", //77
            "Verschwinde! Du gehörst\n   nicht zu uns!", //78

            "Da war nichts in der Box.", //79
            "Da war ein Werkzeug.", //80
            "Wir haben ein Messgerät gefunden.", //81
            "Wir haben Karten gefunden.", //82
            "Wir haben eine Axt gefunden.", //83
            "Wir haben eine Gasmaske gefunden.", //84
            "Wir haben eine Taschenlampe gefunden.", //85
            "Wir haben ein Radio gefunden.", //86
            "Wir haben einen Verbandskasten gefunden.", //87
            "Wir haben Benzin gefunden.", //88

            "Anbaubeet", //89
            "Kartoffeln", //90
            "Alkohol", //91
            "Ofen, schützt uns vor dem Frieren", //92
            "Unser alter Brenner", //93
            "Eimer", //94
            "Ist es eine Eiszeit...!?", //95
            "Zeit verging. Hier zu sitzen ist so langweilig...", //96

            "Der Obdachlose", //97
            "Blooby ist manchmal zu aggressiv!", //98
            "Ofen", // 100
            " Pflanze", // 101
            "Du hast Überlebt...", // 102
            "Alle sind gestorben...", // 103
            "Angegriffen und getötet...", // 104
            "Tippen für Menü", // 105
            "Wir wurden angegriffen.", // 106
            "Wir haben etwas Hilfe bekommen, eine Kartoffel und neue Karte!", // 107
            "Wir schoben weg, was fiel.", // 108 // Not sure
            "Tag", // 109
            "Tage", //110
            "Streiche nach Links!",//111
            "Flughafen",//112
            "Sie werden uns bald retten, Kartoffeln +1.",//113
            "Das nächste Mal kommt es mit uns.",//114
            "Wir haben eine Karte verloren...", // 115
            "Nur Bunker", // 116
            "Waffe", // 117
            "Munition", // 118
            "Köchin", // 119
            "Schmutziges Wasser", // 120
            "Filter", // 121
            "Sicherungskasten", // 121

            "Holz", // 123
            "Eisen", // 124
            "Arbeitstisch", // 125
            "Dünger", // 126
            "Schleim", // 127
            "TV", // 128
            "Rakete", // 129
            "Raketentreibstoff", // 130
            "Minen Loch", // 131
            "Altar", // 132
            "Bedingung", // 133
            "Ventil", // 134
            "Andere Sachen:", // 135
            "Kupfer", // 136
            "Sicherung", // 137
            "Kabel", // 138
            "Bergmann", // 139
            "Fledermäuse", // 140
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
            "Der Hund ist gestorben", //153
            "Gold", // 154
            "Goldbarren", // 155
            "Fahrrad, Kette: ", // 156
            "Bob konnte den ganzen Tod und den Kampf ums\nüberleben nicht ertragen.", //157
            "Katrin konnte den ganzen Tod und den Kampf ums\nüberleben nicht ertragen.", //158
            "Brücke", // 159
            "Floss", // 160
            "Angeln", // 161
            "Fisch", // 162
            "Gommi Blaubeere", // 162
            "GommiBeere Saft", // 164
            "Reduziert die Müdigkeit", // 165
            "FishBerry", // 166
            "Reduziert Müdigkeit und Durst auf 25%", // 167
            "GreenDirt", // 168
            "Lange Expedition dauern nur 1 Tag", // 169
            "Alchimie", //170
            "MITTEL", //171
            "PissVision", // 172
            "Ermöglicht es Ihnen, die Falltür für 16 Tage zu scannen", //173
            "Hilfe", //174
            "Angreifer", //175
            "Attackieren", //176
            "Abwehr", //177
            "MashedPotatoes", // 178
            "Regeneriert Verteidigungspunkte zu 100%", // 179

            "Knochen", // 180
            "Radio", // 181
            "Tischdecke", // 182
            "WastedSoul", // 183
            "InnocentSoul", // 184
            "WastedFish", //185
            "Gibt 10000 Schaden", //186
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
            "Wir haben 10 Geiseln, retten Sie uns! \nGdansk, Legion 53", // 197
            "Senden", // 198
            "Wir werden dich retten\nTag: ", // 199
            "Ninja", //200
            "Du wirst 5 Tage lang Monstern von außen aus dem Weg gehen", //201
            "Decke", //201
            "Pennywhistle", //203
            "Kaputtes Auto", //204
            "Autoteile", //205
            "Schleuder", //206
            "Huhn", //207

            "Pflanze wächst an der Wand.", //208
            "Wasser läuft aus!", //209
            "Das Essen läuft langsam aus!", //210
            "Wir sollten dem Militär ein Lichtsignal geben oder einen anderen Weg finden, um zu überleben oder zu fliehen.", //211
            "Lasst uns einen Weg finden um zu überleben, wir können nicht nur hier sitzen.", //212

            "[TUTORIAL]\nHallo! Dies ist dein Unterschlupf. Du kannst dich darin bewegen (nach links/rechts wischen). Berühre und halte ein Item, um herauszufinden, was es ist und seinen Status zu erfahren. Berühre/tippe auf Charaktere, um ihre Statistiken einzusehen. Tippe auf das Bett, um die Zeit voranzutreiben.", //213
            "[TUTORIAL]\nDie meisten Aktionen, die du ausführst, haben erst NACH dem Schlafen Wirkung. Die Falltür ist sehr wichtig. Damit kannst du an Orte wie den Hof gelangen, öffne sie, um jemanden hereinzulassen oder gebe ein Lichtsignal. Du kannst auch ihre Stärke überprüfen und sie reparieren.", //214
            "[TUTORIAL]\nTippe auf das Radio, um zu überprüfen, ob das Militär ein Lichtsignal möchte. Öffne die Tür, um es zu geben. Suche nach ihrem Stationsignal! Es wird einige Male dauern, bis du ihre Aufmerksamkeit für eine Rettung erlangst. Es gibt noch andere Möglichkeiten, die du entdecken kannst! :D", //215
            "[TUTORIAL]\nVergiss nicht, deine Familie zu ernähren! Um Gegenstände/Ressourcen zu erhalten, gehe auf Expeditionen (Stiefel im Menü des Charakters) - achte vor deiner Abreise auf ihren Status! Wenn du keine Vorräte hast, kommen sie nicht zurück!", //216
            "[TUTORIAL]\nFalls du deine Karte verlierst, geben dir Helfer (wenn du Glück hast) eine zweite. Baue Kartoffeln im Anbaubeet an, du kannst sie im Laden zum Handeln verwenden.", //217
            "[TUTORIAL]\nDieses Spiel ist nicht einfach! Löse Rätsel, probiere verschiedene Wege und Taktiken aus, verdiene Münzen, um neue spezielle Gegenstände freizuschalten. Probiere zuerst die Werkbank aus! ;) Viel Spaß! - pokulan", //217

            "Style Punkte",//218
            "Axt", // 220
            "Stock", // 221
            "Shuriken", // 222
            "Teufel", // 223
            "Möhren", // 224
            "AlcoMist", // 225
            "Macht einen Feind 30% schwächer.", // 226

            "Teddy", // 227
            "Leiter", // 228
            "Mögen Sie  \n Alive In Shelter?\n   Bewerten Sie es!", // 229
            "Flughafen", // 230
            "Wald", // 231
            "Laden", // 232
            "Weiter gehen", // 233
            "Gemerkt: ", // 234
            "Rettungsbus: ", // 235
            "Weihnachtsmann", // 236
            "Ich brauche Hilfe. Du hast keine Weihnachtsdekoration, schade, dass du nicht helfen kannst.", // 236
            "Achtung! EIN FEUER!", // 237
            "Feuerlöscher", // 239
            "Schneemann tötet uns.", // 240
            "Schneemann Mörder", // 241

            "1939 Kartoffeln", // 242
            "Starten Sie das Spiel mit 1939 Kartoffeln.", // 243
            "Nur 8s Herausforderung", // 244
            "Sie haben nur 8 Sekunden zum Sammeln.", // 245
            "Nur Essen und Wasser", // 246
            "Starte das Spiel nur mit 3 l Wasser und 2 kg Proviant.", // 247
            "Nur Frauen!", // 248
            "Spiele nur mit Katrin.", // 249
            "Der Winter kommt", // 250
            "Habe immer einen frostigen Wind.", // 251
            "Zufällig", // 252
            "Starte das Spiel mit zufälligen Gegenständen.", // 253
            "BenHulk", // 254
            "Beginne das Spiel mit dem mutierten Ben.", // 255
            "Pflanzenwächter", // 256
            "Pflanze hilft dir, deinen Bunker zu schützen.", // 257
            "Tanz des Todes", // 258
            "Charaktere werden 6 Tage nach dem Tod wieder lebendig.", // 259
            "Keine Mönche", // 260
            "Es gibt keine Mönche!", // 261
            "Sicherheit draußen", // 262
            "Immer geringe Strahlung.", // 263
            "Zusätzliche Fledermäuse", // 264
            "Fledermäuse sind mutiert. Sie bringen Blooby.", // 265
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
            "Ich bin ein Indie-Spielentwickler und verbringe meine Freizeit damit, dieses Spiel zu verbessern. Wenn du möchtest, kannst du mir helfen, indem du Premium kaufst und mich unterstützt. Dadurch erhältst du Zugriff auf alle DLC-Gegenstände, alle Unterschlupf-Objekte für 0 Münzen, die Möglichkeit, Charaktere umzubenennen, eine Positionserinnerung und die Entfernung aller Werbeanzeigen. Vielen Dank :)", // 281
            "ID teilen", // 282
            "Steht aus", // 283 // Not sure how to translate this
            "Freunde Nachbarn", // 284

            "Spielen Sie Deathmatch - Sieger ist, wer länger durchhält!", // 285
            "Warten auf Annahme", // 286
            "Zum Match einladen", // 287
            " starb für immer...", // 288
            "Deathmatch gewinnt:", // 289
            "CleanBerry", // 290
            "Cleans Familienmitglieder.", // 290
            "\"Gommi\" Dorf", // 292
            "\"Wir werden dir ein Hafen geben.\"", // 293
            "Weed", // 294
            "Dildo", // 295
            "Drogen", // 296

            "Kopf", // 297
            "Arme", // 298
            "Bauch", // 299
            "Beine", // 300

            "Berg", // 301
            "Hof", // 302
            "Laden #2", // 303
            "Grab", // 304
            "Unterschlupfe", // 305
            "Friedhof", // 306
            "Strand", // 307
            "Gesundheit", // 306
            "Energie", // 307
            "trinken", // 310
            "essen", // 311
            "heilen", // 312
            "raus gehen", // 313
            "Mine geöffnet", // 314
            "Minen eingang wird am Anfang geöffnet, ohne zu craften.", // 315
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
            "Schlossknacker", // 326
            "Starte das Spiel mit allen Schlüsseln!", // 327
            "Meister der Expeditionen", // 328
            "Starten Sie das Spiel mit allen zusätzlichen Kartenteilen", // 329
            "Böser Schneemann kam zurück :(", // 330
            "Der Kontaminationsmesser ist defekt.", // 331
            "Wir müssen duschen! Lass uns etwas schmutziges Wasser benutzen.", // 332
            "Falltür", // 333
            "Gift", // 334

            "966 Gommi Blaubeeren", // 335
            "Starten Sie das Spiel mit 966 Gommi Blaubeeren.", // 336
            "Blobby der Schleim", // 337
            "Starte das Spiel mit Blobby.", // 338
            "Dodge der Hund", // 339
            "Starten Sie das Spiel mit dem Hund! (Sie müssen ein Hundehaus haben)", // 340
            "Freunde", // 341
            "Anpassen", // 342
            "Extras", //343
            "Gasleck und Feuer verursachten eine Explosion...", // 344
            "Starterpacket", // 345
            "Beginne das Spiel mit extra: Wasser, Essen, Holz, Eisen und Kartoffeln!", // 346
            "Morgen wird gutes Wetter ...", // 347
            "Morgen wird es frostig und windig ...", // 348
            "Morgen wird der Regen uns angreifen ...", // 349

            "Ihr werdet alle sterbeeen...", // 350
            "Wir brauchen Hilfe! Bitte!", // 351
            "Die Falltür ist kaputt, wir müssen es reparieren.", // 352
            "Pflanzen bewässern", // 353
            "Dusche", // 354
            "Sehr einfach", // 355
            "Glitch modus", // 356
            "Wirst du überleben? Überall glitches...", // 357
            "Glitch-Modus", // 356
            "Wirst du überleben? Überall Glitches... Starte das Spiel neu, damit alles wieder normal wird!", // 357
            "Erdbeben!", // 358
            "Schnappen Sie sich, was Sie retten möchten", // 359

            "Ben!? Wie ist das möglich?", // 360
            "Angreifer sind überall!", // 361
            "Zimmer", // 362
            "Garten", // 363
            "Keller", // 364

            "Zeitschrift", // 365

            "Hurrikan kommt!!!", // 366
            "Tic Tac sei still", // 367
            "Verlangsamt die Uhren!", // 368
            "Luftfilter", // 369
            "Wir müssen den Luftfilter mit den Informationen aus der Zeitschrift reparieren!", // 370
            "Cula", // 371
            "Suppe", //372
            "Skelett", // 373
            "Doge revive", // 374
            "Belebe einen toten Hund!", // 375
            "Wir müssen eine Raumrakete bauen, um zu entkommen, oder um Hilfe von anderen Kreaturen von außen zu bitten. Das Handy des Sohnes könnte auch hilfreich sein. Bitte frage jemanden, wann der Bus ankommen wird.", // 376
            "Das Militär sollte uns über das Radio sagen, wann wir die Falltür öffnen und ihnen in der Nacht ein Lichtsignal geben sollen.", // 377
            "Martha", // 378

            "Nein! Martha ist gestorben...", // 379
            "Martha ist krank. Wir müssen sie heilen!", // 380
            "verstecken", // 381
            "Sie haben Martha entführt!", // 382

            "Hallo Martha. Mein Name ist Frebbie. Ich möchte dir nicht schaden. Ich möchte dir helfen. Ich werde dir einen wunderbaren Ort zeigen, aber du musst etwas für mich tun...", // 383
            "Bitte töte deinen Bruder. Ben ist so unhöflich und liebt dich nicht... Komm nächste Woche wieder hierher.", // 384
            "Ich bevorzuge Frauen, bitte töte deinen Vater Bob... Komm nächste Woche wieder hierher.", // 385
            "Füttere und gebe deiner Mutter Wasser.. Sie muss stark sein... komm nächste Woche wieder hierher.", // 386
            "Ich mag Alkohol, bitte mache eine Flasche Alkohol und bringe es für mich nächste Woche.", // 387
            "Vielen Dank! Komm hier zurück nach Tag:", // 388
            "Gitarre", //389
            "Das ist die Polizei! AUFMACHEN!", // 390
            "Wir wissen, dass du Vorräte stiehlst! Gib uns 1 Kartoffel und 1 Karotte und wir werden dich ignorieren.", // 391
            
            "Vielleicht Bestechung geben?", // 392
            "Ähm... Du bist sehr wichtig für uns. Wir werden für dich kommen:", // 393
            "Zustimmen", // 394
            "Nicht zustimmen", // 395
            "Vielleicht Sie abschießen?", // 396
            "CCTV", //397
            "Verwenden Sie zuvor den \"Sicherungskasten\".", // 398

            "Hopfen", // 399
            "Bier", // 400

            "Spitzhacke",// 401
            "Robuste Spitzhacke", // 402

            "Kohle", // 403
            "Eisenerz", // 404
            "Kupfererz", // 405
            "Uranerz", // 406
            "Golderz", // 407
            "Arzt", // 408
            "Uran-Spitzhacke", // 409
            "-Macht betrunken", // 410
            "-Macht betrunken\n-Fügt Bergbauenergie hinzu", // 411
            "Gebratene Kartoffel", // 412
            "Gebratener Fisch", // 413

            "Spiele The Hobo Idle Clicker, erfahre die Geschichte über die Atombombe in der Stadt Whelylely und natürlich über Hobo! Echtzeit-Spiel!",//414

            "Brechstange", // 415
            "Ladenraub", // 416

            "Unschuldige Bombe", // 417
            "Fügt Gegner 2000 Schaden zu.", // 418

            "sie können nicht hineingehen", // 419

            "Nachrichten", // 420
            "GPS", // 421
            "Spiel", // 422
            "Snake", //423
            "Filme", // 424

            "Telefon", // 425
            "Anrufen", // 426

            /* This shows up in the Extra menu for some reason */
            "Hallo [...] Brauchst du Hilfe? [...] Hmmmm, ich rufe dich in 3 Wochen zurück.", // 427
            "Hi [...] Ich habe mit meinen Freunden gesprochen [...] Ja, der Westen hat uns angegriffen [...] Ich kenne jemanden, der dir helfen kann [...] Ruf Carl an: +48 4392 Tschüss!", // 428
            "Hallo, hier ist Carl [...] Ah, du hast also mit John gesprochen [...] Die Erde mag verwüstet sein, aber es gibt sichere Orte. Ruf die Armee an: 112112.", // 429
            "Hallo [...] Aua, Carl hat dich empfohlen? [...] Ich verstehe. Bereite uns 6 Flaschen Alkohol und 2 Bier vor. Dann werden wir dich retten an Tag: ", // 430
            /* ... */

            "Schmutzige Kleidung", // 431
            "Die Familie zieht jeden Tag zufällige Kleidung an, die sie zuvor gekauft hat.", // 432
            "Handy Ladegerät", // 433
            "Pilze", // 434

            "Wecker", // 435

            "Hallo Mensch. Ich kann dir ein Wunderland zeigen, eine bessere Welt ohne Kriege und Aggression.", // 436
            "Wir können dort keinen Alkohol verwenden, also habe ich ein wenig Durst.", // 437
            "Ich werde alle 20 Tage für 1 Bier und 1 Flasche Wodka dorthin kommen.", // 438
            "Ich werde 4 Mal kommen. Bist du dabei?\n\n\nJA       NOCH NICHT", // 439
            "Vielen Dank! Wir sehen uns in 20 Tagen. Vergiss es nicht!", // 440
            "Kein Alkohol, keine Rettung... Auf Wiedersehen für immer.", // 441
            
            "Fleisch", // 442
            "Gekochtes Fleisch", // 443
            "Bomben abwerfen!", // 444
            "Starte das Spiel als Bomber! Treffe die Ziele, um zusätzliche Stilpunkte zu erhalten!", // 445
            "Katze hat getötet:", // 446
            "Martha hatte einen Albtraum... Sie hat solche Angst, wenn sie sich verstecken muss.", // 447
            
            "Reis", //448
            "Kleber", // 449

            "Bauer", // 450
            "Starte das Spiel mit allen Samen.", // 451

            "Apfelbaum", // 452
            "Apfel", // 453

            "Du hast mehr Energie, Erholung morgen!", // 454
            "Apfelwein", //455

            "Die Expedition findet am nächsten Tag nach der Planung statt.", // 456
            "Öffne die Falltür und schlafe, um ein Lichtsignal für die Radio Übertragung zu geben.", // 457
            "Stelle sicher, dass du sicher bist, wenn du ein Signal gibst.", // 458
            "Du kannst einen Wecker stellen, um den Hund nachts zu füttern.", // 459
            "Du kannst nicht in der Stadt einkaufen, wenn sich der Arzt im Bunker befindet.", // 460
            "Du kannst den Laden mit einem Brecheisen ausrauben, wenn sich der Arzt im Bunker befindet.", // 461
            "Gehe weiter, um bei der ersten Reise eine Karte zu zeichnen und weitere Orte freizuschalten.", // 462
            "Verstecke Martha, wenn sie alleine ist, bevor du die Falltür für die Nacht öffnest.", // 463
            "Der silberne Schlüssel kann vom Vogel oder dem Arzt im Laden getragen werden.", // 464
            "Hole die Köchin, um den goldenen Schlüssel zu bekommen.", // 465
            "Um den blauen Schlüssel zu bekommen, handle im Hotel.", // 466
            "Schau auf der Wiki-Seite nach einer Anleitung für Enden und mehr.", // 467
            "Im Keller kannst du graben, um Kohle, Knochen und Metallerz zu bekommen.", // 468
            "Trinke Bier oder Apfelwein, um Bergbauenergie wiederherzustellen.", // 469
            "Überprüfe immer den Status deiner Charaktere.", // 470
            "Einige Aktionen kannst du sofort ausführen, andere erfordern Schlaf.", // 471
            "Überprüfe den Müllcontainer in deinem Garten, um den Müll und das Müllmonster zu entfernen.", // 472
            "Suche nach Vorratslieferungen im Garten.", // 473
            "Versuche eine Rakete zu bauen und der Erde zu entkommen...", // 474
            "Versuche ein Floß am Strand bauen und dich auf die Flucht aus der Stadt vorzubereiten.", // 475
            "Helfer, die an der Falltür anklopfen, können dir Kartoffeln und eine Karte geben.", // 476
            "Die Katze tötet das Müllmonster und Fledermäuse..", // 477
            "Sei vorsichtig bei Expeditionen!", // 478
            "Suche bei Expeditionen nach Autoteilen, um das Auto auf dem Schrottplatz zu reparieren.", // 479
            "Denke an Tränke! Sie können dich retten, also stelle sicher, dass du sie herstellst.", //480

            "Mehr slots jeden:", // 481

            "Kaffee", // 482
            "Kaffeesamen", // 483
            "Stellt Energie wieder her", // 484

            "Coronavirus", // 485
            "Versuche mit COVID-19 zu überleben! Alkohol hilft!", // 486

            "Speichern Sie dort Ihre Songs", // 487
            "Zugriff auf Speicher gewähren", // 488

            "Der Hobo hat uns ausgeraubt. Kannst du etwas dagegen tun? ... Töte ihn, dann können wir weiterreden.", // 489
            "Wir brauchen Energie! Bring uns 5 Tassen Kaffee.", // 490
            "Unser Sicherungskasten muss repariert werden. 3 Sicherungen sind durchgebrannt. Kannst du uns neue geben?", // 491
            "Die Ratten haben einige Kabel zerstört. Um das Tor zu öffnen, benötigen wir 6 neue Kabel.", // 492
            "Um das Tor mit Energie zu versorgen, brauchen wir 10 Uranstücke.", // 493
            "Das Tor öffnet sich jeden Sonntag!", // 494

            "Purple Power", // 495
            "Heile alle Verletzungen", // 496

            "Valiant Heart", // 497
            "Es gibt keinen Selbstmord.",// 498

            "<click>", // 499
            "<swipe>", // 500

            "Vorräte sind der wichtigste Aspekt beim überleben. Denke daran, sie im Auge zu behalten.", // 501
            "Du kannst den Raum oder bestimmte Orte außerhalb durch Wischen verändern", // 502
            "Es gibt viele andere Gegenstände, die du mit Berührung/Klick überprüfen kannst.", // 503
            "Gehe schlafen, um den nächsten Tag zu erreichen.", // 504
            "Lass uns Bobs Zustand überprüfen. Klicke auf ihn und gib ihm etwas zu trinken!", // 505
            "Es ist wichtig, die Familienmitglieder im Blick zu behalten. Oh, schau mal, eine Pflanze... werfe sie in den Müll!", // 506
            "Einige Aktionen erfordern Schlaf. Lass uns eine Kartoffel pflanzen und dann für den nächsten Tag schlafen.", // 507
            "Die Falltür ist sehr wichtig. Wenn jemand anklopft, kann es ein Feind oder Helfer sein. Sie hat auch einen Gesundheitszustand.", // 508
            
            "Du kannst das Risiko eingehen, die Falltür zu öffnen oder mithilfe eines Tranks oder der Kamera nachzusehen, wer dort ist.", // 509
            "Stelle den Trank im Kessel her: PissVision und trinke ihn.", // 510
            "Schau! Helfer! Du kannst die Fallür sicher öffnen.", // 511
            "Es ist Zeit, allen Familienmitgliedern Essen und Trinken zu geben.", // 512
            
            "Lass uns unsere Kartoffeln gießen.", // 513
            "Es ist wichtig, den Müll rauszubringen. Geh in den Garten.", // 514
            "Es ist Zeit, jemanden auf Expedition nach Vorräten zu schicken. Wir haben eine Karte, also lasst uns in die Stadt gehen.", // 515
            "Überprüfe die Strahlung! Wenn sie HOCH ist, kostet die Expedition einen Einsatz der Gasmaske.", // 516
            
            /* This also shows up in the Extra menu for some reason */
            "Nimm das Wasser- und Lebensmittelpaket.", // 517
            "OK, du kennst die Grundlagen, jetzt kannst du das Spiel starten. Lies das Tagebuch und nutze deinen Verstand! Töte jeden.", // 518
            /* ... */

            "Trash killer", // 519
            "Am Anfang gibt es ein starkes Gift für das Müllmonster.", //520
            "Blind", // 521
            "Versuche ohne die Lampe zu spielen.", // 522
            "Brot", // 524

            /* This shows ups in the Extra menu too, why? */
            "Mein Name ist Srak. Bitte hilf mir bei \"diesem\" Problem. Gib mir eine Tischdecke. Ich werde dir dafür einige Kartoffeln, ein Radio und Benzin geben.", // 525
            "Ammunition keeper", // 526
            /* ... */

            "Starte das Spiel mit viel Munition!", // 527
            "Lange drücken, um zu kaufen", // 528

            "Heute ist es zu heiß, wir müssen heute mehr TRINKEN!", // 529
            "Hallo! Ich heiße Skylight. Können Sie mich mit Ihrer Taschenlampe aufladen? Ich bin immer sonntags hier. Ich werde Ihnen im Austausch mit den Lichtsignalen helfen.", // 530

            "Banditen", // 531
            "Gib uns 2L Wasser, dann werden wir verschwinden. Wenn nicht, dann kämpfe!", // 532

            "Schuppen", // 533
            "Lebensmittelpaket", // 534
            "Aktuellen Spielstand überschreiben?", //535

            "Rüstung", // 536
            "Solarpanel", // 537
            "Solarpanel ist kaputt gegangen.", // 538

            "Kartoffelstempel", // 539
            "Wir haben aufgehört zu klopfen, um dir zu helfen, weil niemand die Tür geöffnet hat. Bist du noch am Leben?", //540
    };

    public static final String credits = "Übersetzung:\n-GeriMcFly\n-Pascal Weißendung\n-DG3001"; // Lol
}
