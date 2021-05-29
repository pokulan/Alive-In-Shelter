package com.pokulan.aliveinshelter;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

/**
 * Created by Wojtek on 2020-05-11.
 */
public class Holenderski {
    public static final BitmapFont czcionka = new BitmapFont(Gdx.files.internal("czcionka.fnt"));
    public static final String TEXT[] ={
            "Nieuwe game", //1
            "Ga verder", //2
            "STATISTIEKEN", //3
            "Gefaald te verzamelen", //4
            "Bunker gefaald", //5
            "In leven: ", //6
            "Spellen gespeeld", //7
            "Keren dat zoon is overleden", //8
            "Niet afgemaakte games", //9
            "Langste spel", //10

            "Bob! schiet op, \n pak zo veel mogelijk voorraden\n     als je kan!\n              Katrin", //11

            "Bob is overleden, dat is jammer...", //12
            "Ben is overleden, waarom hij, Waarom...?", //13
            "Katrin is overleden, de laatste gezonde vrouw is overleden...", //14
            "Bob is ziek geworden, waar zijn wat pillen?", //15
            "Ben heeft hoge koorts.", //16
            "Katrin voelt zich niet goed.", //17
            "Bob is al te lang niet terug.", //18
            "Ben is weg, hij zal nooit meer terugkomen.", //19
            "Katrin is voor altijd verdwenen...", //20

            "We zijn ziek geworden, verdomme!", //21
            "Stortregen, het stroomt buiten en onze bunker lekt.", //22
            "Iemand heeft met water geknoeid -0.25l!", //23
            "Er is wat eten verrot -0.2kg.", //24
            "Geen electriciteit, open het valluik of hou hem dicht als er een zaklamp is.", //25
            "Ben kon de strijd om te overleven niet langer volhouden.", //26

            "De radio is eindelijk gerepareerd.", //27
            "Masker is gerepareerd!", //28
            "De radio is weer stuk...", //29

            "We moeten het afval buiten zetten, anders zal meeldauw ons vermoorden.", //30
            "We hebben een licht signaal gegeven, misschien zullen ze ons redden.", //31
            "We zijn de zaklamp kwijtgeraakt.", //32
            "We hebben een zaklamp gestolen.", //33
            "We hebben een masker gestolen.", //34
            "We zijn de bijl kwijtgeraakt...", //35
            "Volgende keer zullen we handelen.", //36
            "Handel succesvol.", //37
            "Reanimatie succesvol!", //38
            " moet gereanimeerd worden!\nTik snel!", //39

            "Was te langzaam\n   om het te halen", //40
            "Mijn games", //41
            "Geef een licht signaal", //42

            "Bob", //43
            "Ben", //44
            "Katrin", //45
            "honger", //46
            "dorst", //47
            "slaap", //48
            "dronken", //49

            "Matrassen = slaap voor de volgende epische dag", //50
            "Smerige rotzooi", //51
            "Afval monster", //52
            "Kunnen we dit eten?", //53
            "Kaarten zijn ons enige plezier", //54
            "Radio = communicatie", //55
            "Pestniveau: ", //56
            "HOOG", //57
            "LAAG", //58
            "Grote kaart", //58
            "Bijl", //59
            "Masker, conditie:", //60
            "Gereedschappen:", //61
            "Verbanddoos:", //62
            "Normale zaklamp", //63
            "Voorraad", //64
            "Water", //65
            "Benzine", //66

            "I heb handige spullen.", //67
            "Psst... Ik heb iets!", //68
            "Iemand klopt aan??", //69
            "Er is een geluid, is het hulp?", //70
            "Iets heeft de grond geraakt.", //71
            "Het is stil buiten...", //72

            "Zonder voorraad, zal Ben niet terugkomen...", //73
            "Zonder voorraad, zal Bob niet terugkomen...", //74
            "Zonder voorraad, zal Katrin niet terugkomen...", //75

            " Hallo, wat hier gebeurt\n" +
                    "is best ingewikkeld,\n" +
                    "vertrouw de\n" +
                    "regering of het leger niet.\n" +
                    "Je kan met ons meegaan.\n" +
                    "Elke even genummerde dag, kom\n" +
                    "en we laten hier een pakket\n" +
                    "  voor je achter.", //76
            "Interessante mensen[?]...", //77
            "Ga weg, je bent\n" +
                    "  niet een van ons!", //78

            "Er was niks in de kist.", //79
            "Er was een gereedschap.", //80
            "We hebben een meter gevonden.", //81
            "We hebben kaarten gevonden.", //82
            "We hebben een bijl gevonden.", //83
            "We hebben een masker gevonden.", //84
            "We hebben een zaklamp gevonden.", //85
            "We hebben een radio gevonden!", //86
            "We hebben een verbanddoos gevonden.", //87
            "We hebben wat benzine gevonden.", //88

            "Planter", //89
            "Aardappel", //90
            "Alcohol", //91
            "Oven, laat ons niet bevriezen", //92
            "Onze oude distillateur", //93
            "Emmer", //94
            "Ijs tijd!?...", //95
            "De tijd gaat voorbij, hier zitten is zo saai...", //96

            "De Zwerver", //97
            "Blobby is soms iets te aggressief!", //98
            "Oven", // 100
            " Plant",//101

            "Je hebt het overleefd...", // 102
            "Iedereen is overleden...", // 103
            "Aangevallen en vermoord...", // 104
            "Tik voor menu", // 105
            "We zijn aangevallen.", // 106
            "We hebben hulp gekregen, een aardappel en een nieuwe kaart!", // 107
            "We hebben wat gevallen is weggeduwd.", // 108
            "Dag", // 109
            "Dagen", //110
            "Veeg naar links!",//111
            "Vliegveld",//112
            "Ze zullen ons binnenkort redden, +1 aardappel.",//113
            "Volgende keer zal het bij ons komen.",//114
            "We zijn een kaart kwijtgeraakt...", // 115
            "Alleen de bunker", // 116
            "Geweer", // 117
            "Ammunitie", // 118
            "Kok", // 119
            "Vervuild water", // 120
            "Filter", // 121
            "Meterkast", // 122

            "Hout", // 123
            "Ijzer", // 124
            "Werkbank", // 125
            "Mest", // 126
            "Slijm", // 127
            "TV", // 128

            "Raket", // 129
            "Raket brandstof", // 130
            "Mijn gat", // 131
            "Altaar", // 132
            "Conditie", // 133
            "Klep", // 134
            "Andere spullen:", // 135
            "Koper", // 136
            "Zekering", // 137
            "Draad", // 138
            "Mijnwerker", // 139
            "Vleermuizen", // 140
            "Gouden sleutel", // 141

            "Schep", // 142
            "Graf", // 142
            "Hart", // 144
            "Zombie", // 145

            "Makkelijk", // 146
            "Moeilijk", // 147
            "Loopgraaf", // 148
            "Vogel", // 149
            "Zilveren sleutel", // 150

            "Hond", // 141
            "Hondehok", // 152
            "De hond is doodgegaan", // 153
            "Goud", // 154
            "Goudstaaf", // 155
            "Fiets, ketting: " ,// 156
            "Bob kon de strijd om te overleven\n" +
                    "niet langer volhouden.", //157
            "Katrin kon de strijd om te overleven\n" +
                    "niet langer volhouden.", //`58
            "Brug", // 159
            "Vlot", // 160
            "Vissen", // 161
            "Vis", // 162
            "Gommi Blauwe Bes", // 163
            "GommiBessen Sap", // 164
            "Verlaagt moeheid", // 165
            "VisBessen", // 166
            "Verlaag moeheid en dorst naar 25%", // 167
            "GroenAarde", // 168
            "Lange expedities duren maar 1 dag", // 169
            "Alchimie", //170
            "GEMIDDELD", //171
            "PisVisie", // 172
            "Staat je toe om het valluik te scannen voor 16 dagen", //173
            "help", //174
            "aanvallers", //175
            "Aanval", //176
            "Verdedigin", //177
            "AardappelPuree", // 178
            "Regenereert verdediging punten tot 100%", // 179

            "Botten", // 180
            "Radio", // 181
            "Tafelkleed", // 182
            "VerspildeZiel", // 183
            "OnschuldigeZiel", // 184
            "VerspildeVis", //185
            "Geeft 10000 Schade", //186
            "OnschuldigeAardappel", // 187
            "Regenereert 4000 Verdedigingspunten", // 188

            "UitBreken", // 189
            "Ontsnappen zal het monster niet genezen", // 190
            "DubbelSchop", // 191
            "2x meer schade", // 192
            "Bokszak", // 193
            "Luidspreker", // 194
            "Gijzelaars, touw", // 195
            "Gijzelaars, Bericht aan het leger", // 196
            "We hebben 10 gijzelaars, kom ons redden! \nGdansk, Legioen 53", // 197
            "Verzenden", // 198
            "We gaan je redden\nDag: ", // 199
            "Ninja", //200
            "Je zult monster buiten 5 dagen ontwijken", //201
            "Deken", //201
            "Pennywhistle", //203
            "Kapotte auto", //204
            "Auto delen", //205
            "Katapult", //206
            "Kip", //207

            "Een plant groeit op de muur.", //208
            "Het water is op aan het raken!", //209
            "Het voedsel is langzaam op aan het raken!", //210
            "We zouden het leger een licht signaal moeten geven of een andere manier vinden om te overleven of te ontsnappen.", //211
            "Laten we een manier vinden om te overleven, we kunnen hier niet zomaar blijven zitten", //212

            "[TUTORIAL]\nHallo! Dit is je bunker, je kunt erin rondbewegen (veeg links/rechts). Raak en houd vast op een item om er meer over te weten te komen. Raak/houd vast op Karakters om hun statistieken te checken. Tik op het bed om de tijd te versnellen.", //213
            "[TUTORIAL]\nMeeste acties die je aanvinkt of doet zullen pas effect nemen NADAT je slaapt.  Het valluik is erg belangrijk, Je kunt naar plekken gaan zoals het hof, openzetten om iemand binnen te laten of een lichtsignaal te geven. Je kunt daar zijn stevigheid zien en hem repareren.", //214
            "[TUTORIAL]\nKlik op de radio om te checken of het leger een lichtsignaal wilt, Open de deur om er een te geven. Verander de zender om te controleren! Dit moet een paar keur gebeuren om hun aandacht te trekken voordat je gered word. Andere manieren zijn er om zelf te ontdekken! :D", //215
            "[TUTORIAL]\nVergeet niet om je familie eten te geven! Om spullen/grondstoffen te krijgen, Ga op expedities (Schoenen in het karaktermenu)-Let op hun status voordat je weggaat! Als je niet genoeg voorraad hebt, zullen ze niet terugkomen!", //216
            "[TUTORIAL]\nAls je de landkaart kwijtraakt, zullen helpers (als je geluk hebt) je een tweede geven. Laat aardappelen groeien in de planter, je kunt ze gebruiken om te ruilen in de winkel.", //217
            "[TUTORIAL]\nDeze game is niet makkelijk! Los puzzels op, probeer verschillende manieren en opties, verdien munten om nieuwe speciale spullen vrij te kopen. Tip: Koop de werkbank als eerste! ;) Veel plezier! - pokulan", //218

            "Stijl punten",//219
            "Bijl", // 220
            "Stok", // 221
            "Shuriken", // 222
            "Duivel", // 223
            "Wortels", // 224
			"AlcoMist", // 225
            "Maakt vijanden 30% zwakker.", // 226

            "Teddy", // 227
            "Ladder", // 228
            "vind jij\n Alive In Shelter?\n leuk    BEORDEEL HET!", // 229
            "Vliegveld", // 230
            "Bos", // 231
            "Winkel", // 232
            "Ga verder", // 233
            "Onthouden: ", // 234
            "Reddingsbus: ", // 235
            "De Kerstman", // 236
            "Ik heb hulp nodig. Je hebt geen vakantie versieringen, dus nee bedankt.", // 237
            "Pas op! EEN VUUR!", // 238
            "Brandblusser", // 239
            "Sneeuwpop vermoord ons.", // 240
            "Sneeuwpop doder", // 241
            "1939 aardappelen", // 242
            "Start het spel met 1939 aardappelen.", // 243
            "Slechts 8s uitdaging", // 244
            "Je hebt slechts 8 seconden in het verzamel deel.", // 245
            "Alleen maar voedsel en water", // 246
            "Start de game met alleen maar 3l water en 2kg voedsel.", // 247
            "Vrouwen aan de top!", // 248
            "Speel alleen maar met Katrin.", // 249
            "Winter staat voor de deur", // 250
            "Altijd is er een koude wind.", // 251
            "Willekeurig", // 252
            "Start de game met willekeurige spullen.", // 253
            "BenHulk", // 254
            "Start de game met gemuteerde Ben.", // 255
            "Plant bewaker", // 256
            "Plant helpt je schuilplaats te beschermen.", // 257
            "Danse macabre", // 258
            "Karakters komen 6 dagen na de dood weer tot leven.", // 259
            "Geen monniken", // 260
            "Er zijn geen monniken!", // 261
            "Buiten veilig", // 262
            "Altijd lage radiatielevels.", // 263
            "Extra vleermuizen", // 264
            "Bats zijn gemuteerd. Ze brengen Blobby.", // 265
            "Geen uitgang", // 266
            "Er is geen valluik.", // 267
            "Klassieke modus", // 268
            "Speel in de klassieke modus - oude tijden. Maar een kamer enz.", // 269
            "Zandbak modus", // 270
            "Speel in zandbak modus, doe wat je wilt!", // 271
            "Geen griezels meer", // 272
            "Speel zonder vleermuizen, sneeuwpop en Pennywhistle.", // 273
            "RPG", // 274
            "Verdien ervaringspunten en level karakters.", // 275

            "Level", // 276
            "Volgende level", // 277
            "Punten", // 278

            "Dagelijkse bonus", // 279
            "Wekelijkse bonus", // 280
            "Ik ben een indie game-ontwikkelaar. Ik besteed mijn vrije tijd aan het verbeteren van dit spel. Je kunt helpen door aan mij te doneren = premium kopen. Je ontgrendelt alle DLC spullen, alle schuilplaatsspullen voor 0 munten, karakters een andere naam geven, onthouden positie en alle advertenties verwijderen. Dankjewel :)", // 281
            "Deel ID", // 282
            "Mij toegevoegd", // 283
            "Vrienden buren", // 284

            "Speel deathmatch - winnaar is degene die het langste overleeft!", // 285
            "Wachten voor acceptatie", // 286
            "Uitnodigen tot spel", // 287
            " is voor altijd doodgegaan...", // 288
            "Keren deathmatch gewonnen:", // 289
            "SchoonBes", // 290
            "Maakt alle familieleden schoon.", // 291
            "\"Gommi\" dorp", // 292
            "\"We zullen je een thuishaven geven.\"", // 293
            "Wiet", // 294
            "Dildo", // 295
            "Drugs", // 296

            "Hoofd", // 297
            "Armen", // 298
            "Buik", // 299
            "Benen", // 300

            "Berg", // 301
            "Hof", // 302
            "Winkel #2", // 303
            "Tombe", // 304
            "Schuilplaatsen", // 305
            "Begraafplaats", // 306
            "Strand", // 307
            "Levenspunten", // 306
            "Energie", // 307
            "drinken", // 310
            "eten", // 311
            "genezen", // 312
            "ga naar buiten", // 313
            "Mijn geopend", // 314
            "Mijningang is geopend op het begin, zonder het te maken.", // 315

            "Extra landkaart delen", // 316
            "Vuurplaats", // 317
            "Boek een hotel", // 318
            "Voorraad", //319
            "Prijs", //320
            "Uranium", // 321
            "Deuren op slot (Ik heb een blauwe sleutel nodig)", // 322
            "Blauwe sleutel", // 323
            "Meer locaties", // 324
            "Start de game met 2 willekeurige extra landkaart delen!", // 325
            "Slot breker", // 326
            "Start de game met alle sleutels!", // 327
            "Meester Ontdekker", // 328
            "Start de game met alle extra landkaart delen", // 329
            "Slechte Sneeuwpop is teruggekomen :(", // 330
            "Verontreinigingsmeter is kapot.", // 331
            "We moeten douchen! Laten we vies water gebruiken.", // 332
            "Valluik", //333
            "Vergif", //334

            "966 Gommi Blauwebessen", //335
            "Start de game met 966 Gommi Blauwebessen.", //336
            "Blobby de slijm", //337
            "Start de game met Blobby.", //338
            "Dodge de hond", //339
            "Start de game met de hond! (Je moet een hondenhok hebben)", //340
            "Vrienden", // 341
            "Aanpassen", // 342
            "Extra's", //343
            "Gaslek en brand...", // 344
            "Starterspakket", //345
            "Start de game met extra: water, voedsel, hout, ijzer en aardappelen!", //346
            "Morgen zal er mooi weer zijn...", //347
            "Morgen zal het koud en winderig zijn...", //348
            "Morgen zal de regen ons kwellen...", //349

            "Jullie, zullen allemaal, sterven...", //350
            "We hebben hulp nodig! Asjeblieeeft!", //351
            "Het valluik is kapot, we moeten het repareren.", //352
            "Planten water geven", //353
            "Douchen", //354
            "Imbeciel", // 355
            "Glitch modus", // 356
            "Zal jij overleven? Overal glitcht het... Herstart de game om terug te gaan naar het normale!", // 357
            "Aardbeving!", // 358
            "Pak wat je redden wilt", // 359
            "Ben!? Hoe is het mogelijk?", //360
            "Aanvallers zijn overal!", //361
            "Kamer", //362
            "Tuin", //363
            "Kelder", //364
            "Magazijn", //365
            "Er komt een orkaan aan!!!", // 366
            "Tic Tac ben stil", // 367
            "vertraagt de klokken!", // 368
            "Luchtfilter", // 369
            "We moeten de luchtfilter repareren die in het magazijn is!", //370
            "Cula", // 371
            "Soep", //372
            "Skelet", // 373
            "Doge herleef", // 374
            "Laat een dode hond herleven!", // 375
            "We moeten een ruimteraket bouwen om hier weg te komen, of vragen om hulp van andere schepsels buiten. Telefoon van zoon kan ook nuttig zijn. Iemand check even wanneer de bus arriveert.", //376
            "Het leger zou ons moeten vertellen door de radio wanneer we ons valluik moeten openen zodat we hun snacht's een lichtsignaal kunnen geven.", // 377
            "Martha", // 378

            "Nee! Martha is overleden...", //379
            "Martha is ziek. We moeten haar genezen!", //380
            "verstoppen", // 381
            "Ze hebben Martha ontvoerd!", //382

            "Hallo Martha. Mijn naam is Frebbie, Ik wil je geen pijn doen. Ik wil je helpen. Ik zal je een prachtige plek laten zien, maar dan moet je wel iets voor me doen...", // 383
            "Vermoord asjeblieft je broer. Ben is zo gemeen en houdt niet van jou... Kom hier volgende week terug.", // 384
            "Ik heb liever vrouwen, dus vermoord alsjeblieft je vader Bob... Kom hier volgende week terug.", // 385
            "Geef je moeder water en voedsel. Ze moet sterk zijn... Kom hier volgende week terug.", //386
            "Ik hou van alcohol, maak me alsjeblieft een fles alcohol en breng het volgende week naar mij.", //387
            "Heel erg bedankt! Kom hier morgen weer terug:",//388
            "Gitaar", //389
            "POLITIE! DOE OPEN!", // 390
            "We weten dat je spullen steelt! Geef ons 1 aardappel en 1 wortel en dan doen we net of er niks is gebeurd.", //391

            "Misschien kunnen we ze omkopen?", //392
            "Uhm... Je bent voor ons erg belangrijk. We zullen komen voor jou: ",// 393
            "Instemmen", //394
            "Afkeuren", //395
            "Misschien hun neerschieten?", //396
            "Beveiligingscamera", //397
            "Gebruik \"Powerbox\" van te voren.", //398

            "Hop", // 399
            "Bier", // 400

            "Pikhouweel",// 401
            "Stevige pikhouweel", // 402

            "Kool", // 403
            "Ijzererts", // 404
            "Kopererts", // 405
            "Uraniumerts", // 406
            "Gouderts", // 407
            "Doktor", //408
            "Uranium Pikhouweel", // 409
            "-Maakt je dronken", // 410
            "-Maakt je dronken\n-Voegt mijnenergie toe", // 411
            "Geroosterde aardappel", // 412
            "Geroosterde vis", // 413

            "Speel De Hobo idle Clicker, heel verhaal over de NUKE in Whelylely stad en natuurlijk Hobo! Real-time game!",//414

            "Koevoet", //415
            "Winkeloverval", // 416

            "Onschuldige Bom", // 417
            "Geeft vijand 2000 schade.", // 418

            "ze kunnen hier niet in gaan", // 419

            "Berichten", //420
            "GPS", //421
            "Game", //422
            "Snake", //423
            "Films", //424

            "Telefoon", //425
            "Bellen", //426

            "Hallo [...] Dus jij hebt hulp nodig? [...] Hmmmm Ik bel je over 3 weken terug", //427
            "Hoi [...] Ik praat tegen mijn vrienden [...] Ja Het Westen heeft ons vandaag aangevallen [...] Ik ken iemand die je kan helpen [...] Bel Carl: +48 4392 Doei!", //428
            "Hallo Carl hier [...] Ahh jij praat met John [...] De aarde is kapotgemaakt maar er zijn veilige plekken. Bel het leger: 112112", //429
            "Hallo [...] Ouch jij komt van Carl [...] Ik snap het. Bereid 6 flessen alcohol en 2 flessen bier voor. Dan zullen we je redden op dag: ", //430

            "Vieze kleren", // 431
            "De familie kleedt zich elke dag in willekeurige kleding die eerder al was gekocht.", // 432
            "Telefoon oplader", // 433
            "Champignons", // 434

            "Alarmklok", // 435"Alarmklok", // 435

            "Hoi mens. Ik kan je een wonderland laten zien, betere wereld, zonder oorlogen of aggressie.", // 436
            "We kunnen daar geen alcohol gebruiken, dus ben ik een beetje dorstig.", // 437
            "Ik zal hier elke 20 dagen langskomen voor 1 fles bier en 1 fles vodka.", // 438
            "Ik zal 4 keer langskomen. Doe je mee?\n\n\nJA       NOG NIET", // 439
            "Dankjewel! Doei tot over 20 dagen.", // 440
            "Geen alcohol, Geen redding... Vaarwel voor altijd.", // 441
            "Vlees", //442
            "Gebakken vlees", //443
            "Laat De Bommen vallen!", //444
            "Start de game als bommenwerper! Raak de doelwitten om extra stijl punten te krijgen!", //445
            "Kat is vermoord:", // 446
            "Martha had een slechte droom... Ze is zo bang wanneer ze zichzelf moet verstoppen.", //447
            "Rijst", //448
            "Lijm", // 449

            "Boer", // 450
            "Start de game met alle zaden.", // 451

            "Appel boom", // 452
            "Appel", // 453

            "Je krijgt meer energie terug morgen!", // 454
            "Cider", //455

            "Expeditie neemt de dag na besluit plaats.", // 456
            "Open het valluik en ga slapen om een lichtsignaal te geven als de radio erom vraagt.", // 457
            "Zorg ervoor dat je veilig bent wanneer je een lichtsignaal geeft.", // 458
            "Je kunt je alarmklok zetten om de hond snacht's eten te geven.", // 459
            "Je kunt niet de winkel in de stad gebruiken wanneer De Doktor in je schuiplaats is.", // 460
            "Je kunt de winkel beroven met de koevoet wanneer De Doktor in je schuilplaats is.", // 461
            "Ga verder en klik eerst om een landkaart te tekenen en dan ontgrendel je extra locaties.", // 462
            "Verstop Martha wanneer ze alleen is voordat je het valluik open laat vannacht.", // 463
            "Zilveren sleutel word gedragen door de vogel of door De Doktor in de winkel.", // 464
            "Vind De Kok voor de gouden sleutel.", // 465
            "Om de blauwe sleutel te krijgen ruil in het hotel.", // 466
            "Check de wiki pagina om alle mogelijke eindes te zien.", // 467
            "In de mine in de kelder graaf om kool, botten en ijzererts te vinden.", // 468
            "Drink Bier of Cider om mijnenergie te herstellen.", // 469
            "Check altijd je karakter stats.", // 470
            "Sommige acties kun je direct maken en sommige hebben slaap nodig.", // 471
            "klik op de vuilnisbak in de tuin om Het Rotzooimonster en het vuilnis weg te doen.", // 472
            "Kijk voor een supplydrop in de tuin.", // 473
            "Probeer een raket te maken om van de aarde te ontsnappen..", // 474
            "Probeer een vlot te maken en te prepareren op het strand om te ontsnappen.", // 475
            "Helpers die op het valluik kloppen kunnen je aardappels en een landkaart geven.", // 476
            "Kat vermoord Het Rotzooimonster en vleermuizen..", // 477

            "Ben voorzichtig op expedities!", // 478
            "Zoek naar auto onderdelen zodat je de auto in de schroothoop kan repareren.", // 479
            "Vergeet de drankjes niet! Ze kunnen je redden dus maak er zeker een paar.", //480
			
			"Meer slots elke:", //481
            "Koffie", // 482
            "Koffie zaden", // 483
            "Hervult energie", // 484
            "Coronavirus", // 485
            "Probeer te overleven met COVID-19! Alcohol helpt!", // 486
            "Plak je liedjes hier", // 487
            "Geef in de instellingen toegang tot je opslag", // 488

            "De Hobo berooft ons. Kun je daar iets mee doen? ... Dood hem, dan praten we meer.", // 489
            "We hebben energie nodig! Breng ons 5 kopjes koffie.", // 490
            "Er is iets kapot. Er zijn 3 zekeringen gesprongen. Kunt u ons een nieuwe geven?", // 491
            "De ratten hebben wat draden vernietigd. Om de poort te openen hebben we 6 nieuwe draden nodig.", // 492
            "Om de poort aan te zetten hebben we 10 uraniumstukken nodig.", // 493
            "De poort gaat elke zondag open!", // 494

            "Purple Power", // 495
            "Genees alle verwondingen", // 496

            "Valiant Heart", // 497
            "There is no suicide.",// 498

            "<klik>", // 499
            "<swipe>", // 500
            "Voorraden zijn de belangrijkste om te overleven. Vergeet niet om ze in de gaten te houden.", // 501
            "Je kunt de kamer of sommige locaties buiten veranderen door met je vinger te vegen", // 502
            "Er zijn veel andere items die u kunt controleren met aanraking / klik.", // 503
            "Ga slapen om de volgende dag te krijgen.", // 504
            "Laten we de toestand van Bob bekijken. Klik op hem en geef hem wat te drinken!", // 505
            "Het is belangrijk om familieleden in de gaten te houden. Oh kijk eens naar een plant ... verplaats hem naar de prullenbak!", // 506
            "Sommige acties hebben slaap nodig, laten we een aardappel planten en dan naar de volgende dag gaan.", // 507
            "Trapdoor is erg belangrijk, als iemand klopt, kan het een vijand of helper zijn, het heeft ook zijn eigen toestand.", // 508
            "Je kunt het risico lopen het luik te openen of kijken wie er is door bijvoorbeeld een drankje te gebruiken.", // 509
            "Maak toverdrank: PissVision en drink het.", // 510
            "Kijk! Helpers! Je kunt het luik veilig openen.", // 511
            "Het is tijd om alle gezinsleden eten en drinken te geven.", // 512
            "Laten we aardappelen water geven.", // 513
            "Het is belangrijk om het vuilnis buiten te zetten. Ga naar de tuin.", // 514
            "Het is tijd om iemand op expeditie te sturen voor bevoorrading. We hebben een kaart, dus laten we naar de stad gaan.", // 515
            "Controleer de straling als deze HOOG is, dan kost expeditie je één gasmasker.", // 516
            "Pak de water- en voedselbundel.", // 517
            "OK, je kent de basisdingen, nu kun je het spel starten. Lees het dagboek en gebruik je hersenen! Dood iedereen.", // 518

            "Trash killer", // 519
            "In het begin is er een sterk gif voor afvalmonsters.", //520
            "Blind", // 521
            "Probeer te spelen zonder de lamp.", // 522
            "Ik zal je water stelen!", // 523
            "Brood", // 524

            "Mijn naam is Srak. Help me alstublieft met dit probleem. Geef me een tafelkleed. Ik zal je wat aardappelen, een radio en benzine geven.", // 525
            "Ammunition keeper", // 526
            "Start het spel met heel veel munitie!", // 527

            "Lang indrukken om te kopen", // 528

            "Het is zinderende hitte vandaag, we moeten vandaag meer DRINKEN!", // 529
    };

    public final static String credits = "Vertaling:\n-Faas";
}
