package com.pokulan.aliveinshelter;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

/**
 * Vyrobeno by: Wojtek, 2017-03-13.
 *  Jan Mihalik
 *  Adam Dufek
 */
public class Czeski {
    public static final BitmapFont czcionka = new BitmapFont(Gdx.files.internal("czcionka.fnt"));
    public static final String TEXT[] ={
            "Nová hra", //1
            "Pokračovat", //2
            "STATISTIKY", //3
            "Počet neúspěšných začátků", //4
            "Počet nevydařených příprav", //5
            "Počet přežití: ", //6
            "Celkem her spuštěno", //7
            "Počet smrtí Syna", //8
            "Počet Nedohraných her", //9
            "Nejdelší hra", //10

            "Bobe! honem, \n vem sebou co nejvíce zásob!\n     co pobereš!\n              Katrin", //11

            "Bob zemřel, je to smutné...", //12
            "Ben zemřel, proč on? Proč..", //13
            "Katrin zemřela, poslední žena zemřela...", //14
            "Bob onemocněl, kde jsou nějaké pilulky?", //15
            "Ben má vysokou horečku.", //16
            "Katrin se necítí dobře.", //17
            "Bob se už dlouho nevrátil.", //18
            "Ben je pryč, nikdy se nevrátí.", //19
            "Katrin navždy zmizela..", //20

            "Jsme nemocní, sakra!", //21
            "Prší a prší a pořád prší, náš bunkr protéká.", //22
            "Někdo rozlil vodu -0.25l", //23
            "Nějaké jídlo se zkazilo -0.2kg", //24
            "Žádná elektřina, otevřete otvor, pokud nemáte baterku.", //25
            "Ben už nevydržel všechny ty úmrtí nebo pokusy o přežití.", //26

            "Rádio bylo konečně opraveno.", //27
            "Plynová maska byla opravena.", //28
            "Rádio je znovu rozbité...", //29

            "Musíme vynést ten pytel od odpadků, jinak nás zabije plíseň!", //30
            "Dali jsme světelný signál.", //31
            "Ztratili jsme baterku.", //32
            "Ukradli jsme baterku.", //33
            "Ukradli jsme plynovou masku.", //34
            "Ztratili jsme sekeru.", //35
            "Příště obchod uskutečníme.", //36
            "Obchod proběhl úspěšně.", //37
            "Resuscitace byla úspěšná!", //38
            " musí být resuscitován!\nRychle klikej!", //39

            "Byl moc pomalí\n  aby to zvládl", //40
            "Moje hry", //41
            "Prosím dejte nám světelný signál", //42

            "Bob", //43
            "Ben", //44
            "Katrin", //45
            "Hlad", //46
            "Žízeň", //47
            "Unavený", //48
            "Opilý", //49

            "Matrace = vyspat se pro další *epický* den", //50
            "Hnusný odpadky", //51
            "Aaa! Co je to za monstrum?", //52
            "Můžeme to sníst?", //53
            "Karty jsou naše jediná zábava", //54
            "Rádio = komunikace", //55
            "Úroveň nemocí: ", //56
            "VYSOKÁ", //57
            "NÍZKÁ", //58
            "Obří mapa", //58
            "Sekera", //59
            "Plynová maska, Stav:", //60
            "Nástroje:", //61
            "První pomoc", //62
            "Absolutně Normální Baterka", //63
            "Jídlo", //64
            "Pití", //65
            "Petrol", //66

            "Mám zajímavé věci, chceš se kouknout?", //67
            "Hej ty... Něco mám", //68
            "Někdo klepe", //69
            "Něco jsme zaslechli, je to pomoc?", //70
            "Něco spadlo na zem", //71
            "Venku je ticho...", //72

            "Bez zásob, se Ben už nevrátí...", //73
            "Bez zásob, se Bob už nevrátí...", //74
            "Bez zásob, se Katrin už nevrátí...", //75

            " Ahoj, co se děje\n" +
                    "je to trochu komplikované,\n" +
                    "nevěř té\n" +
                    "vládě nebo armádě.\n" +
                    "Můžeš jít s námi.\n" +
                    "Každý den, přijď\n" +
                    "a necháme tu zásilku\n" +
                    " přímo pro tebe.", //76
            "Zajímaví lidé[?]...", //77
            "Vypadni!\n" +
                    "  ty nejsi jeden z nás!", //78

            "Nic nebylo v té krabici.", //79
            "Bylo tam jedno nářadí.", //80
            "Našli jsme měřič nemocí.", //81
            "Našli jsme karty.", //82
            "Našli jsme sekeru.", //83
            "Našli jsme masku.", //84
            "Našli jsme baterku.", //85
            "Našli jsme rádio!", //86
            "Našli jsme první pomoc.", //87
            "Našli jsme nějaký petrol.", //88

            "Květináč", //89
            "Brambora", //90
            "Alkohol", //91
            "Kamna, nenech nás umrznout", //92
            "Náš starý věrný destilér", //93
            "Kbelík", //94
            "Doba ledová!?...", //95
            "Čas utíká. Sezení tady je hrozně nudný...", //96

            "Bezďák", //97
            "Blooby je občas agresivní!", //98
            "Kamna", // 100
            " Rostlina",//101

            "Přežil jsi...", // 102
            "Všichni umřeli...", // 103
            "Zaútočily a zabily...", // 104
            "Klikni pro menu", // 105
            "Někdo na nás zautočil.", // 106
            "Někdo nám pomohl, a dal nám bramboru a mapu!", // 107
            "Strčily jsme do toho co spadlo.", // 108
            "Den", // 109
            "Dny", //110
            "Prejeď prstem do leva!",//111
            "Letiště",//112
            "Brzy už nás někdo zachrání, Brambora +1.",//113
            "Příště to budeme my.",//114
            "Ztratili jsme mapu...", // 115
            "Pouze bunkr", // 116
            "Zbraň",//117
            "Náboje", //118
            "Kuchař", // 119
            "Špinavá voda", // 120
            "Filtr", // 121
            "Pojistky", // 121

            "Dřevo", // 123
            "Železo", // 124
            "Pracovní stůl", // 125
            "Hnůj", // 126
            "Sliz", // 127
            "Televize", // 128
            "Raketa", // 129
            "Raketové palivo", // 130

            "Otvor", // 131
            "Oltář", // 132
            " Podmínka", // 133
            "Ventil", // 134
            "Ostatní věci:", // 135
            "Měď", // 136
            "Pojistka", // 137
            "Drát", // 138
            "Horník", // 139
            "Netopýr", // 140
            "Zlatý klíč", // 141

            "Lopata", // 142
            "Hrob", // 142
            "Srdce", // 144
            "Zombie", // 145

            "Snadné", // 146
            "Těžké", // 147
            "Příkop", // 148
            "Pták", // 149
            "Stříbrný klíč", // 150
            "Pes", // 141
            "Bouda pro psa", // 152
            "Pes zemřel", // 153
            "Zlato", // 154
            "Zlatá cihla", // 155
            "Kolo, řetěz: ", // 156
            "Bob už nevydržel všechno ty\n" +
                    "smrti a pokusy o přežití.", //157
            "Katrin už nevydržela všechno ty\n" +
                    "smrti a pokusy o přežití.", //158
            "Most", // 159
            "Vor", // 160
            "Rybolov", // 161
            "Ryba", // 162
            "Gommi Borůvka", // 162
            "Gommi Borůvkový Džus", // 164
            "Snižuje únavu", // 165
            "Rybí Borůvka", // 166
            "Snižuje únavu a žízeň o 25%", // 167
            "Zelená Hlína", // 168
            "Dlouhá expedice trvá pouze 1 den", // 169
            "Alchymie", //170
            "STŘEDNÍ", //171
            "Orlí Oko", // 172
            "Umožňuje skenování dveří závěrky po dobu 16 dnů", //173
            "Pomoc", //174
            "Útočníci", //175
            "Útok", //176
            "Obrana", //177
            "Bramborový Salát", // 178
            "Regeneruje obranné body", // 179

            "Ostatky", // 180
            "Rádio", // 181
            "Ubrus", // 182
            "Ztracená Duše", // 183
            "Nevinná Duše", // 184
            "Shnilá Ryba", //185
            "Udělí 10000 škod", //186
            "Dobrá Brambora", // 187
            "Regeneruje 4000 obranných bodů", // 188

            "BrakeOut", // 189
            "Útěk nevyléčí monstrum", // 190
            "DoubleKick", // 191
            "2x větší škody", // 192
            "Boxovací taška", // 193
            "Rozhlas", // 194
            "Rukojmí, lano", // 195

            "Rukojmí, zpráva pro armádu", // 196
            "Máme 2 rukojmí, zachraňte nás! \nGdansk, Legendy 53", // 197
            "Poslat", // 198
            "Chystáme se vás zachránit\nDen: ", // 199
            "Ninja", //200
            "Vyhnete se vnějším příšerám po dobu 5 dnů", //201
            "Deka", //201
            "Klaun?", //202
            "Rozbité auto", //203
            "Díly auta", //204
            "Prak", //205
            "Kuře", //206

            "Rostlina rostla na zdi", //207
            "Voda běží!", //208
            "Jídlo se pomalu vyčerpává!", //209
            "Měli bychom dát vojenský signál nebo najít jiný způsob, jak přežít.", //210
            "Najdeme způsob, jak přežít, nemůžeme jen sedět.", //212

            "[TUTORIAL]\nAhoj! Tohle je tvůj bunkr, můžeš se v něm pohybovat (švihni prstem do leva/prava). Dotkni nebo klikni na věc abys věděl co to je. Dotkni nebo klikni na charaktery aby si věděl jak na tom jsou. Klikni na postel abys usnul.", //213
            "[TUTORIAL]\nSkoro všechno na co klikneš a nebo uděláš vytvoří efekt po probuzení ze spánku. Tady jsi teď můžeš přečíst nějaké důležité informace. Poklop je velmi užitečný, můžeš jít na zahradu nebo poklop otevři aby někdo přišel nebo vydej světelný signál.", //214
            "[TUTORIAL]\nKlikni na rádio, jestli Armáda nechce světelný signál. Párkrát to uďelej abys dohrál tuto hru (je tady mnohem víc konců, ale najdi si je sám) :D", //215
            "[TUTORIAL]\nNezapoměn nakrmit charaktery! Abys získal věci/jídlo musíš jít na expedice (boty v charakterovo menu), nezapomeň toho charaktera který jde na expedici nakrmit a dát mu vodu", //216
            "[TUTORIAL]\nPokud stratíš mapu, pomocníci (pokud máš štestí) ti dají druhou. Zasaď brambory do květináče můžeš je potom použít jako materiál na obchodování.", //217
            "[TUTORIAL]\nTato hra není lehká! Vyreš hádanky, skus jiné cesty ke koncům, vydělej peníze a kup si speciální věci. Tip: Jako první si kup pracovní stolek ;) Užij si hru! - Pokulan a AdamDufek", //217
            "Stylové body",//218
            "Sekera", // 220
            "hůl", // 221
            "Shuriken", // 222
            "Ďábel", // 223
            "Mrkve", // 224
            "AlcoMist", // 225
            "Snižte nepřítele o 30%.", // 226

            "Teddy", // 227
            "Žebřík", // 228
            "Máš rád\n\n Alive In Shelter?\n Zhodnoť mě!", // 229
            "Letiště", // 230
            "Les", // 231
            "Prodejna", // 232
            "Jdi dál", // 233
            "Vzpomínka: ", // 234
            "záchranný autobus: ", // 235
            "Ježíšek\n", // 236
            "Potřebuji pomoci. Nemáte dekorace X-Mas, takže ne děkujeme.", // 236
            "Pozor! POŽÁR!", // 237
            "Hasicí přístroj", // 239
            "Sněhulák nás zabije.", // 240
            "Sněhulák zabiják", // 241

            "1939 brambor", // 242
            "Spusťte hru s 1939 bramborami.", // 243
            "Pouze 8s výzva", // 244
            "Máte jen 8 sekund na shromažďování části.", // 245
            "Jen potraviny a voda", // 246
            "Spusťte hru jen s 3 litry vody a 2 kg jídla.", // 247
            "Pouze ženy!", // 248
            "Hrajte pouze s Katrinem.", // 249
            "Zima přichází", // 250
            "Vždy je mrazivý vítr.", // 251
            "Náhodný", // 252
            "Spusťte hru s náhodnými položkami.", // 253
            "BenHulk", // 254
            "Spusťte hru s mutovaným Benem.", // 255
            "Plant guard", // 256
            "Rostlina pomáhá chránit váš úkryt.", // 257
            "Danse macabre", // 258
            "Charaktery se vrátí k životu 6 dní po smrti.", // 259
            "Žádní mnichové", // 260
            "Neexistují mnichové!", // 261
            "Bezpečnost venku", // 262
            "Vždy nízké záření.", // 263
            "Extra netopýři", // 264
            "Netopýři jsou mutovaní. Přinášejí Bloobyy.", // 265
            "Žádný východ\n", // 266
            "Neexistuje žádná zásuvka.", // 267
            "Klasický režim", // 268
            "Přehrávání v klasickém režimu - staré časy. Pouze jedna místnost atd.", // 269
            "Režim Sandbox", // 270
            "Hrajte v režimu sandbox, udělejte to, co chcete!", // 271
            "Už žádné tyhle kluky", // 272
            "Hrajte bez netopýrů, sněhuláka a Pennywhistle.", // 273
            "RPG", // 274
            "Získejte zkušební body a úrovně nahoru.", // 275

            "Úroveň", // 276
            "Další úroveň", // 277
            "Body", // 278

            "Denní bonus", // 279
            "Týdenní bonus", // 280
            "I am an indie game developer I spend my free time improving this game. If you want you can help me donating me = buying a premium. You will unlock all DLC items, all shelter items for 0 coins, renaming characters, remembered position and remove all ads. Thanks :)", // 281
            "Podíl ID", // 282
            "Přidala mě", // 283
            "Přátelé sousedy", // 284

            "Play deathmatch - vyhraje, kteří vydrží déle!", // 285
            "Čekání na přijetí", // 286
            "Pozvánka ke shodě", // 287
            "zemřel navždy ...", // 288
            "Deathmatch vyhrává:",// 289
            "CleanBerry", // 290
            "Čistí členy rodiny.", // 291
            "\"Gommi\" vesnice", // 292
            "\"Dáme vám azyl.\"", // 293
            "Weed", // 294
            "Dildo", // 295
            "Drugs", // 296

            "hlava", // 297
            "paže", // 298
            "břicho", // 299
            "nohy", // 300

            "Hora", // 301
            "Yard", // 302
            "Shop # 2", // 303
            "Hrob", // 304
            "Úkryty", // 305
            "Hřbitov", // 306
            "Pláž", // 307
            "Zdraví", // 306
            "Energie", // 307
            "pít", // 310
            "jíst", // 311
            "léčit", // 312
            "jít ven", // 313
            "Mined mine", // 314
            "Důl vstup je otevřen na začátku, bez crafting.", // 315
            "Další mapy", // 316
            "Krb", // 317
            "Rezervujte si hotel", // 318
            "Sklad", //319
            "Cena", //320
            "Uran", // 321
            "Dveře zavřené (potřebuji modrý klíč)", // 322
            "Modré tlačítko", // 323
            "Další umístění", // 324
            "Spusťte hru se 2 náhodnými extra mapami!", // 325
            "Jistič dveří", // 326
            "Spusťte hru se všemi klíči!", // 327
            "Mistr expedic", // 328
            "Spusťte hru se všemi dalšími částmi mapy", // 329
            "Bad sněhulák se vrátil :(", // 330
            "Měřič znečištění je poškozen.", // 331
            "Musíme se sprchovat! Použijeme špinavou vodu.", // 332
            "Door", // 333
            "Poison", // 334

            "966 Gommi Borůvek", // 335
            "Spusťte hru s 966 Gommi Borůvkami.", // 336
            "Blobby the slime", //337
            "Spusťte hru s Blobby.", // 338
            "Braň se psovi!", //339
            "Spusťte hru se psem (musíte mít psí dům)", // 340
            "Přátelé", // 341
            "Přizpůsobit", // 342
            "Extra", //343
            "Únik plynu a požár ...", //344
            "Starter pack", // 345
            "Spusťte hru s extra: voda, jídlo, dřevo, železo a brambory!", // 346
            "Zítra bude dobré počasí ...", //347
            "Zítra bude mrazivý a větrný ...", // 348
            "Zítra nás napadne déšť ...", //349


            "Vy, všichni zemřete ...", // 350
            "Potřebujeme pomoc! Prosím!", // 351
            "Klapka je rozbitá, musíme to opravit.", // 352
            "Vodní rostliny", // 353
            "Sprcha", // 354
            "Slabá", // 355
            "Režim Glitch", // 356
            "Budete přežít? Všude, kde je závada ... Restartujte hru, abyste se vrátili k normálu!", //357
            "Zemětřesení!", //358
            "Uchopte, co chcete uložit", // 359

            "Ben !, jak je to možné?", //360
            "Útočníci jsou všude!", //361
            "Pokoj", // 362
            "Zahrada", // 363
            "Suterén", // 364
            "Magazine", // 365
            "Hurikán přichází !!!", // 366
            "Tic Tac shut up", // 367

            "Zpomaluje hodiny!", // 368
            "Vzduchový filtr", // 369
            "Musíme opravit vzduchový filtr!", //370
            "Cula", // 371
            "Polévka", //372
            "Kostra", // 373
            "Doge revive", // 374
            "Oživte mrtvého psa!", //375
            "Musíme postavit vesmírnou raketu, abychom se dostali ven, nebo požádali o pomoc nějaké jiné bytosti zvenčí... Syn telefonu může být také užitečný.", // 376
            "Armáda by nám měla říkat rádio, kdy otevřít vchody a dát jim v noci světelný signál.", //377
            "Martha", // 378

            "Ne, Martha zemřel ...", //379
            "Martha je nemocná, musíme ji uzdravit!", //380
            "Skrýt", // 381
            "Unesli Martha!", //382

            "Dobrý den, Martha, jmenuji se Frebbie, nechci tě ublížit, chci ti pomoct, ukážu ti nádherné místo, ale pro mě musíš udělat něco ...", //383
            "Prosím, zabijte svého bratra. Ben je tak hrubý a nemiluje vás ... Vraťte se příští týden.", //384
            "Dávám přednost ženám, prosím, zabijte svého otce Bobe ... Přijďte sem příští týden.", //385
            "Krmte a vodou svou matku. Musí být silná ... Vraťte se sem příští týden.", //386
            "Mám rád alkohol, připravte si láhev alkoholu a přineste si ho příští týden.", //387
            "Děkuji vám moc! Vraťte se sem za den:", //388
            "Kytara", //389
            "POLICIE! OTEVŘETE! DĚLEJTE!", // 390
            "Víme, že ukradnete zásoby, dejte nám 1 brambor a 1 mrkvu, abychom to ignorovali.", // 391

            "Možná jim dát úplatek?",// 392
            "Uhm ... Jsi pro nás velmi důležitý. Přijdeme pro vás:", //393
            "Souhlasím", // 394
            "Nesouhlasím", // 395
            "Možná je zastřelit?",// 396
            "CCTV", //397
            "Použijte předtím \"Pojistky\".", // 398


            "Chmel", //399
            "Pivo", //400

            "Krumpáč",// 401
            "Těžký výběr", // 402

            "Uhlí", // 403
            "Železná ruda", // 404
            "Měděná ruda", // 405
            "Uranová ruda", // 406
            "Zlatá ruda", // 407
            "Doktor", // 408

            "Uranový Krumpáč", //409
            "- Opilý", //410
            "-Potřebuje pitnou energii \n-přidává těžební energii", // 411
            "Pečené brambory",// 412
            "Pečené ryby", //413

            "Play The Hobo idle Clicker, whole story about the NUKE in Whelylely city and of course Hobo! Real time game!",//414

            "Přepínač", // 415
            "Lupa v obchodě", //416

            "Innocent Bomb", // 417
            "Udělí 2000 škod.", // 418

            "nemohou jít dovnitř", // 419

            "Zprávy", // 420
            "GPS", // 421
            "Hra", // 422
            "Snake", //423
            "Filmy", // 424

            "Telefon", // 425
            "Volání", // 426

            "Ahoj [...] Takže budete potřebovat pomoc? [...] Hmmmm Zavolám vám po 3 týdnech", // 427
            "Ahoj [...] Mluvím se svými přáteli [...] Ano Západ nás napadl [...] Znám někoho, kdo vám může pomoci [...] Volejte Carl: +48 4392 Bye!", // 428
            "Ahoj Carl tam [...] Ahh mluvíš s Johnem [...] Země je zničena, ale jsou tam bezpečná místa. Voják: 112112", // 429
            "Ahoj [...] Au, ty pocházíš z Carla [...] Rozumím. Připrav si 6 lahví Alkoholu a 2 Pivo. Pak ti zachráníme den: ", // 430

            "Špinavé oblečení", // 431
            "Rodina se každý den obléká do náhodných šatů, které byly dříve zakoupeny.",//432
            "Nabíječka telefonu", // 433
            "Houby",// 434
            "Budík", // 435

            "Ahoj člověče. Můžu vám ukázat divu, lepší slovo bez válek a agrese.", // 436
            "Nemůžeme tam používat žádný alkohol, takže jsem trochu žíznivý.", // 437
            "Budu tam chodit každých 20 dní na 1 pivo a 1 láhev vodky.", // 438
            "Přijdu 4 krát. Jste v?\n\n\nANO       JEŠTĚ NE!", // 439
            "Děkuji! Ahoj na dalších 20 dní.", // 440
            "Žádný alkohol, žádná záchrana ... Sbohem navždy.", // 441
            "Maso", // 442
            "Pečené maso", // 443
            "Drop Bomby!", // 444
            "Spusťte hru jako bombardér! Hit thetargets získat extra styl body!", // 445
            "Kočka zabila:", // 446
            "Martha měla špatný sen ... Je tak vystrašená, když se potřebuje skrýt.", // 447
            "Rýže", //448
            "Lepidlo", // 449

            "Farmář", // 450
            "Zahajte hru se všemi semeny.", // 451

            "Jabloň", // 452
            "Jablko", // 453

            "Zítra máš další využití energie!", // 454
            "Jablečný mošt", //455

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

            "Více každý:", // 481
            "Káva", // 482
            "Kávová semínka", // 483
            "Obnovuje energii", // 484

            "Coronavirus", // 485
            "Pokuste se přežít s COVID-19! Alkohol pomáhá!", // 486

            "Vložte tam své písničky", // 487
            "Poskytněte v nastavení přístup k úložišti", // 488

            "Hobo nás okrádá. Můžeš s tím něco udělat? ... Zabij ho, pak si promluvíme víc.", // 489
            "Potřebujeme energii! Přineste nám 5 šálků kávy.", // 490
            "Něco je rozbité. Jsou spáleny 3 pojistky. Můžete nám dát nový?", // 491
            "Krysy zničily některé dráty. K otevření brány potřebujeme 6 nových vodičů.", // 492
            "K zapnutí brány potřebujeme 10 kusů uranu.", // 493
            "Brána se otevírá každou neděli!", // 494

            "Purple Power", // 495
            "Uzdravte všechna zranění", // 496

            "Valiant Heart", // 497
            "Neexistuje sebevražda.",// 498

            "<click>", // 499
            "<swipe>", // 500
            "Dodávky jsou nejdůležitější v přežití. Nezapomeňte na ně sledovat.", // 501
            "Můžete změnit pokoj nebo některá místa venku prstem", // 502
            "Existuje mnoho dalších položek, které můžete zkontrolovat dotykem / klepnutím.", // 503
            "Jdi spát a příští den si odpočiň.", // 504
            "Pojďme zkontrolovat Bobův stav. Klikněte na něj a dejte mu drink!", // 505
            "Je důležité sledovat členy rodiny. Oh, podívejte se na rostlinu ... přesuňte ji do koše!", // 506
            "Některé akce vyžadují spánek, zasadíme brambor a jdeme na další den.", // 507
            "Trapdoor je velmi důležitý, pokud někdo klepe, může to být nepřítel nebo pomocník, má také svůj vlastní stav.", // 508
            "Můžete riskovat otevření poklopu nebo zjistit, kdo tam je, například pomocí lektvaru.", // 509
            "Vytvořte lektvar: PissVision a vypijte ho.", // 510
            "Podívej! Pomocníci! Můžete bezpečně otevřít poklop.", // 511
            "Je čas dát všem členům rodiny jídlo a pití.", // 512
            "Vysypeme brambory.", // 513
            "Je důležité vyhodit odpadky. Jdi do zahrady.“", // 514
            "Je čas poslat někoho na výpravu za zásoby. Máme mapu, tak pojďme do města.", // 515
            "Zkontrolujte záření, pokud je VYSOKÉ, pak vás expedice bude stát jednu plynovou masku.", // 516
            "Vezměte si balíček vody a jídla.", // 517
            "Dobře, znáte základní věci, nyní můžete začít hru. Přečtěte si deník a používejte svůj mozek! Zabijte každého.", // 518

            "Trash killer", // 519
            "Na začátku je silný jed pro odpadkové příšery.", //520
            "Slepý", // 521
            "Zkuste hrát bez lampy.", // 522
            "Ukradnu ti vodu!", // 523
            "Chléb", // 524

            "Jmenuji se Srak. Prosím, pomozte mi s tímto problémem. Dejte mi ubrus. Dám vám nějaké brambory, rádio a benzín.", // 525
            "Ammunition keeper", // 526
            "Spusťte hru se spoustou munice!", // 527
    };

    public static final String credits = "Překlad:\n-Adam Dufek\n-Jan Mihalik\n-Ondřej Turek";
}
