package com.pokulan.aliveinshelter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

/**
 * Created by Wojtek on 2017-04-02.
 */
public class Francuski {
    public static final BitmapFont czcionka = new BitmapFont(Gdx.files.internal("czcionka.fnt"));
    public static final String TEXT[] ={
            "Nouvelle partie", //1
            "Continue", //2
            "STATISTIQUES", //3
            "Collecte raté", //4
            "Abri raté", //5
            "Alive", //6
            "Partie commencer", //7
            "Son's deaths", //8
            "Partie non fini", //9
            "Plus longue partie", //10

            "Bob! depêche-toi!, \n Ramasse le plus de vivres  que tu peux!\n              Katrin", //11

            "Bob est mort, c'est triste...", //12
            "Ben est mort, pourquoi il? Pourquoi?..", //13
            "Katrin est morte, la dernière femme est morte...", //14
            "Bob est malade, où sont les pilules?", //15
            "Ben a une forte fièvre.", //16
            "Katrin ne se sent pas bien.", //17
            "Bob n'est pas revenu depuis longtemps.", //18
            "Ben est parti, il ne reviendra jamais.", //19
            "Katrin disparaît pour toujours...", //20

            "Nous sommes malade.", //21
            "Douche, pluie, douche, Nos murs sont mouillés.", //22
            "Quelqu'un a renverser de l'eau -0.25l", //23
            "De la nourriture a pourri -0.2kg", //24
            "Pas d'électricité, ouvrez la porte ou pas s'il y a une lampe de poche.", //25
            "Ben ne peux rester et regarder les autres mourrir et tuer pour survivre.", //26

            "La radio est reparé.", //27
            "Le masque a gaz est reparé.", //28
            "La radio est cassé.", //29

            "Nous devons vider les poubelles es-ce que c'est sûr?", //30
            "Nous avons un signal.", //31
            "Nous avons perdu la lampe.", //32
            "Nous avons volé une lampe.", //33
            "Nous avons volé un masque.", //34
            "Nous avons perdu une hache...", //35
            "La prochaine fois on échangera.", //36
            "Échange fini.", //37
            "Résurrection fini!", //38
            " doit être réssusciter\nAppuie Vite!", //39

            "Trop lent pour \n   exister", //40
            "Mes jeux", //41
            "S'il vous plaît, donnez un signal", //42

            "Bob", //43
            "Ben", //44
            "Katrin", //45
            "Faim", //46
            "Soif", //47
            "Fatigue", //48
            "Alcoolémie", //49

            "Matelas = Nouveau jour", //50
            "Ordures dégoutante", //51
            "Yikes! Sacré monstre!", //52
            "Nous pouvons manger ça?", //53
            "Carte seulement pour jouer", //54
            "Radio = communication", //55
            "Niveau de radiation: ", //56
            "Élevé", //57
            "Bas", //58
            "Grande carte", //58
            "Axe - SHARP!", //59
            "Masques, conditions:", //60
            "Outils:", //61
            "Premier soins:", //62
            "Lampe normale", //63
            "Reserve", //64
            "Eau", //65
            "Pétrole", //66

            "J'ai un équipement intéressant", //67
            "Pss... J'ai quelque chose", //68
            "Quelqu'un toc à la porte ??", //69
            "Il y a du bruit, de l'aide?",//70
            "Quelque chose touche le sol", //71
            "C'est calme dehors...", //72

            "Sans vivre, Ben ne reviendra pas...", //73
            "Sans vivre, Bob ne reviendra pas...", //74
            "Sans vivre, Katrin ne reviendra pas...", //75

            " Hé, ce qu'il se passe\n" +
                    "ici est plus compliqué,\n" +
                    "Ne crois pas le\n" +
                    "gouvernement ou les militaires.\n" +
                    "Tu peux venir avec nous.\n" +
                    "Chaque jour pair\n" +
                    "Nous laissons un paquet \n" +
                    "     ici", //76
            "Des personnes intéressante[?]...", //77
            "Va t-en! Tu n'es\n" +
                    "  pas avec nous!", //78

            "Il n'y avait rien dans la boîte.", //79
            "Il y avait des outils.", //80
            "Nous avons trouvé un detecteur.", //81
            "Nous avons trouvé des cartes.", //82
            "Nous avons trouvé une hache.", //83
            "Nous avons trouvé un masque.", //84
            "Nous avons trouvé une lampe.", //85
            "Nous avons trouvé une radio !", //86
            "Nous avons trouvé des soins.", //87
            "Nous avons trouvé du pétrole.", //88

            "Bol", //89
            "Pataes", //90
            "Alcool", //91
            "Chauffage, nous laisses pas avoir froid", //92
            "Notre vieux distillateur", //93
            "Sceau", //94
            "Ère glaciaire!?...", //95
            "Le temps passe...", //96

            "Le Hobo", //97
            "Blooby est parfois agressif!", //98
            "Chauffage", // 100
            " Plante",//101

            "Tu as survécu...", // 102
            "Tout le monde est mort...", // 103
            "Attaquer et tuer...", // 104
            "Tape pour le menu", // 105
            "Nous avons été attaqué.", // 106
            "Nous avons reçu de l'aide, patates!", // 107
            "Nous avons récolter des vivres.", // 108
            "Jour", // 109
            "Jours", //110
            "Balance ton doigt a gauche!",//111
            "Aéroport",//112
            "Ils vont nous sauver bientôt, Patates +1.",//113
            "La prochaine fois il viendra.",//114
            "Nous avons perdu la carte...", // 115
            "Abri seulement", // 116
            "Arme", // 117
            "Munition", // 118
            "Cuisinier", // 119
            "Eau sale", // 120
            "le filtre", // 121
            "Boîte de puissance", // 121

            "bois", // 123
            "le fer", // 124
            "atelier", // 125
            "la fumure", // 126
            "vase", // 127
            "TV", // 128
            "Fusée", // 129
            "Carburant de fusée", // 130
            "Trou", // 131
            "Autel", // 132
            "Condition", // 133
            "La soupape", // 134
            "Autres:", // 135
            "cuivre", // 136
            "fusible", // 137
            "fil", // 138
            "mineur", // 139
            "Chauve-souris", // 140
            "Clé d'or", // 141

            "La pelle", // 142
            "La tombe", // 142
            "Cœur", // 144
            "Zombie", // 145

            "Facile", // 146
            "Difficile", // 147
            "La tranchée", // 148
            "Les oiseau", // 149
            "Clé d'argent", // 150
            "Le chien", // 141
            "Le chenil", // 152
            "Chien est mort", //153
            "Or", // 154
            "Bar d'or", // 155
            "Le vélo, chaîne: ", // 156
            "Bob ne peux rester et regarder les\nautres" +
                    "mourrir et tuer pour survivre.", //157
            "Katrin ne peux rester et regarder les\nautres" +
                    "mourrir et tuer pour survivre.", //158
            "Le pont", // 159
            "Le radeau", // 160
            "La pêche", // 161
            "Le poisson", // 162
            "Gommi Myrtille", // 162
            "GommiBerry jus", // 164
            "Réduit la fatigue", // 165
            "FishBerry", // 166
            "Réduit la fatigue et la soif à 25%", // 167
            "GreenDirt", // 168
            "Une longue expédition ne dure que 1 jour", // 169
            "Alchimie", //170
            "MOYEN", //171
            "PissVision", // 172
            "Permet de numériser la trappe pendant 16 jours", //173
            "las assistance", //174
            "les attaquant", //175
            "Attaque", //176
            "Défense", //177
            "MashedPotatoes", // 178
            "Régénère les points de défense", // 179

            "Les os", // 180
            "La radio", // 181
            "La nappe", // 182
            "WastedSoul", // 183
            "InnocentSoul", // 184
            "WastedFish", //185
            "Donne 10000 dégâts", //186
            "InnocentPotato", // 187
            "Régénère 4000 points de défense", // 188

            "BrakeOut", // 189
            "Escape ne guérira pas le monstre", // 190
            "DoubleKick", // 191
            "2x plus de dégats", // 192
            "Sac de boxe", // 193
            "Le orateuraker", // 194
            "Otages, corde", // 195

            "Otages, message militaire", // 196
            "Nous avons 10 otages, nous sauvons! \nGdansk, Legendy 53", // 197
            "Envoyer", // 198
            "Nous allons vous sauver\nJournée: ", // 199
            "Ninja", //200
            "Vous éviterez les monstres extérieurs pendant 5 jours", //201
            "La couverture", //201
            "Pennywhistle", //203
            "Voiture cassée", //204
            "Pièces de voiture", //205
            "Le lance-pierres", //206
            "Le poulet", //207

            "Les plantes poussent sur le mur.", //208
            "L'eau coule!", //209
            "La nourriture est lentement à court!", //210
            "Nous devrions donner un signal lumineux militaire ou trouver un autre moyen de survivre.", //211
            "Trouvons un moyen de survivre, nous pouvons non seulement nous asseoir", //212

            "[TUTORIAL]\nHi! This is your shelter, you can move around it (swipe left/right). Touch/tap on item to know what it is. Touch/tap on characters to check theirs' stats. Tap on bed and go sleep.", //213
            "[TUTORIAL]\nMostly everything what you 'tick' or do will take effect after sleeping. Here you can read some important informations. Trapdoor is very important, you can go to the garden or open it to let somebody in or give light signal.", //214
            "[TUTORIAL]\nTap on the radio to check if military wants light signal if yes give it. Do it few times to win the game (there is a lot of more endings but find them out by yourself) :D", //215
            "[TUTORIAL]\nRemember to feed you characters! To get items/resources go on the expeditions (boots in the character's menu), remember to 'water' and feed one before going out!", //216
            "[TUTORIAL]\nIf you lose your map helpers (if you are lucky) will give you second one. Plant potatoes in the bowl you can use them to trade in the shop.", //217
            "[TUTORIAL]\nThis game isn't easy! Solve puzzles, try different ways and options, earn coins to unlock new special items. Tip: First buy Worktable ;) Have fun! - pokulan", //217
            "Points de style",//218
            "La hache", // 220
            "Bâton", // 221
            "Shuriken", // 222
            "Diable", // 223
            "Carottes", // 224
            "AlcoMist", // 225
            "Rend l'ennemi 30% plus faible.", // 226

            "Teddy", // 227
            "La échelle", // 228
            "Aimes-tu \n\n Alive In Shelter?\n    évaluer!", // 229
            "Aéroport", // 230
            "Forêt", // 231
            "Boutique", // 232
            "Aller plus loin", // 233
            "Souvenu: ", // 234
            "bus de secours: ", // 235
            "père Noël", // 236
            "J'ai besoin d'aide. Vous n'avez pas de décorations de Noël, alors non merci.", // 236
            "Attention! UN FEU!", // 237
            "Extincteur d'incendie", // 239
            "Bonhomme de neige nous tue.", // 240
            "Tueur de bonhomme de neige", // 241

            "1939 pommes de terre", // 242
            "Commencez le jeu avec 1939 pommes de terre.", // 243
            "Seul défi 8s", // 244
            "Vous n'avez que 8 secondes à collecter une partie.", // 245
            "Seulement de la nourriture et de l'eau", // 246
            "Commencez le jeu seulement avec 3l d'eau et 2 kg de nourriture.", // 247
            "Seulement les femmes!", // 248
            "Jouez seulement avec Katrin.", // 249
            "L'hiver arrive", // 250
            "Toujours est le vent glacial.", // 251
            "au hasard", // 252
            "Démarrer le jeu avec des éléments aléatoires.", // 253
            "BenHulk", // 254
            "Commencez le jeu avec Ben muté.", // 255
            "Garde de plante", // 256
            "La plante vous aide à protéger votre abri.", // 257
            "Danse macabre", // 258
            "Les personnages reviennent à la vie 6 jours après la mort.", // 259
            "Pas de moines", // 260
            "Il n'y a pas de moines!", // 261
            "Sécurité à l'extérieur", // 262
            "Rayonnement toujours faible.", // 263
            "Chauves-souris supplémentaires", // 264
            "Les chauves-souris sont mutées. Ils apportent Blooby.", // 265
            "Sans issue", // 266
            "Il n'y a pas de trappe.", // 267
            "Mode classique", // 268
            "Jouez en mode classique - vieux temps. Une seule pièce, etc..", // 269
            "Mode bac à sable", // 270
            "Jouez en mode bac à sable, faites ce que vous voulez!", // 271
            "Pas plus ces gars", // 272
            "Jouer sans chauves-souris, bonhomme de neige et Pennywhistle.", // 273
            "RPG", // 274
            "Gagnez des points d'expérience et améliorez les personnages.", // 275

            "Niveau", // 276
            "Niveau suivant", // 277
            "Points", // 278

            "Bonus quotidien", // 279
            "Bonus hebdomadaire", // 280
            "I am an indie game developer I spend my free time improving this game. If you want you can help me donating me = buying a premium. You will unlock all DLC items, all shelter items for 0 coins, renaming characters, remembered position and remove all ads. Thanks :)", // 281
            "Partager ID", // 282
            "Ajoute moi", // 283
            "Les voisins d'amis", // 284

            "Jouer au deathmatch - gagne qui dure plus longtemps!", // 285
    "En attente d'acceptation", // 286
            "Inviter à correspondre", // 287
            "est mort pour toujours ...", // 288
            "Deathmatch gagne:", // 289
            "CleanBerry", // 290
            "Nettoie les membres de la famille.", // 290
            "\"Gommi\" village", // 292
            "\"Nous allons vous donner un asile.\"", // 293
            "Weed", // 294
            "Dildo", // 295
            "Drugs", // 296

            "tête", // 297
            "bras", // 298
            "ventre", // 299
            "jambes", // 300

            "Montagne", // 301
             "Yard", // 302
             "Boutique # 2", // 303
             "Tombe", // 304
             "Abris", // 305
             "Cimetière", // 306
             "Plage", // 307
            "Santé", // 306
            "Énergie", // 307
            "boire", // 310
            "manger", // 311
            "guérir", // 312
            "sortir", // 313
            "Mined mine", // 314
            "Mine entrée est ouvert au début, sans artisanat.", // 315
            "Pièces de carte", // 316
            "Cheminée", // 317
            "Réserver un hôtel", // 318
            "Stock", //319
            "Prix", //320
            "Uranium", // 321
            "Portes fermées (j'ai besoin d'une clé bleue)", // 322
            "Touche bleue", // 323
            "Plus d'emplacements", // 324
            "Commencez le jeu avec 2 cartes supplémentaires aléatoires!", // 325
            "Disjoncteur de porte", // 326
            "Commencez le jeu avec toutes les clés!", // 327
            "Maître des expéditions", // 328
            "Démarrer le jeu avec toutes les parties de carte supplémentaires", // 329
            "Mauvais bonhomme de neige est revenu :(", // 330
            "Le compteur de pollution est cassé.", // 331
            "Nous devons prendre une douche! Utilisons de l'eau sale.", // 332
            "Porte", // 333
            "Poison", // 334

            "966 Gommi Blueberries", //335
            "Commencez le jeu avec 966 Gommi Blueberries.", // 336
            "Blobby the slime", //337
            "Commencez le jeu avec Blobby.", // 338
            "Dodge the dog", //339
            "Commencez le jeu avec un chien (vous devez avoir une niche)", // 340
            "Amis", // 341
            "Design", // 342
            "Extra", //343
            "Fuite de gaz et incendie ...", // 344
            "Pack de démarrage", // 345
            "Commencez le jeu avec de l'eau, de la nourriture, du bois, du fer et des pommes de terre!", // 346
            "Demain sera le beau temps ...", // 347
            "Demain sera glacial et venteux ...", // 348
            "Demain, la pluie nous attaquera ...", // 349

            "Toi, tu mourras ...", // 350
            "Nous avons besoin d'aide!", // 351
            "La trappe est cassée, il faut la réparer.", // 352
            "Plantes aquatiques", // 353
            "Douche", // 354
            "Faible", // 355
            "Mode Glitch", // 356
            "Survivrez-vous à tous les problèmes ... Redémarrez le jeu pour revenir à la normale!", // 357
            "Zemětřesení!", //358
            "Uchopte, co chcete uložit", // 359

            "Ben!? Comment c'est possible?", // 360
            "Les attaquants sont partout!", // 361
            "Chambre", // 362
            "Jardin", // 363
            "Sous-sol", // 364

            "Magazine", // 365
            "Hurricane arrive !!!", // 366
            "Tic Tac shut up", // 367
            "Ralentit les horloges!", // 368
            "Filtre à air", // 369
            "Nous devons réparer le filtre à air!", // 370
            "Cula", // 371
            "Soupe", //372
            "Squelette", // 373
            "Doge revive", // 374
            "Ravivez un chien mort!", // 375
            "Nous devons construire une fusée spatiale pour sortir ou demander de l'aide à d'autres créatures de l'extérieur. Le téléphone de Son peut aussi être utile. S'il vous plait, vérifiez quelqu'un quand le bus arrivera.", // 376
            "Les militaires devraient nous dire à travers la radio quand ouvrir la trappe et leur donner un signal lumineux la nuit.", // 377
            "Martha", // 378

            "Non! Martha est morte ...", // 379
            "Martha est malade. Nous devons la soigner!", // 380
            "Cacher", // 381
            "Ils ont kidnappé Martha!", // 382

            "Bonjour Martha. Je m'appelle Frebbie, je ne veux pas vous faire de mal. Je veux vous aider. Je vais vous montrer un endroit merveilleux mais vous devez faire quelque chose pour moi ...", // 383
            "S'il vous plaît, tuez votre frère. Ben est si grossier et ne vous aime pas ... Revenez ici la semaine prochaine.", // 384
            "Je préfère les femelles alors s'il te plait tue ton père Bob ... Reviens ici la semaine prochaine.", // 385
            "Nourris et arrose ta mère. Elle doit être forte ... Reviens ici la semaine prochaine.", // 386
            "J'aime l'alcool, s'il vous plaît, faites une bouteille d'alcool et apportez-le moi la semaine prochaine.", // 387
            "Merci beaucoup! Revenez ici après jour:", // 388
            "Guitare", // 389
            "POLICE! OUVERT!", // 390
            "Nous savons que vous volez des provisions! Donnez-nous une pomme de terre et une carotte pour que nous ne tenions pas compte de cela.", // 391
            "Peut-être leur donner un pot-de-vin?", // 392
            "Uhm ... Vous êtes très important pour nous. Nous viendrons pour vous.", // 393
            "D'accord", // 394
            "Pas d'accord", // 395
            "Peut-être leur tirer dessus?", // 396
            "CCTV", //397
            "Utilisez \"Boîte de puissance\" avant.", // 398


            "Houblon", // 399
            "Bière", // 400

            "Pioche",// 401
            "Une meilleure pioche", // 402

            "Charbon", // 403
            "Minerai de fer", // 404
            "Minerai de cuivre", // 405
            "Minerai d'uranium", // 406
            "Minerai d'or", // 407
            "Médecin", // 408
            "Pioche à l'uranium", //409
            "-Il rend saoul", // 410
            "-Bonne \n-Ajoute de l'énergie minière", // 411
            "Pomme grillé", // 412
            "Poisson grillé", // 413

            "Jouez à The Clicker inactif de Hobo, toute l’histoire du NUKE dans la ville de \"Whelylely\" et bien sûr de Hobo! Jeu en temps réel!",//414

            "Crowbar", // 415
            "Vol dans un magasin", // 416

            "Innocent Bomb", // 417
            "Donne 2000 dégâts.", // 418

            "ils ne peuvent pas entrer", // 419

            "Messages", // 420
            "GPS", // 421
            "Jeu", // 422
            "Snake", //423
            "Films", // 424

            "Téléphone", // 425
            "Appel", // 426

            "Bonjour [...] Vous avez donc besoin d'aide? [...] Hmmmm, je vous rappelle dans 3 semaines", // 427
            "Bonjour [...] je parle à mes amis [...] Oui L'Occident nous a attaqués [...] Je connais quelqu'un qui peut vous aider [...] Appelle Carl: +48 4392 Au revoir!", // 428
            "Bonjour Carl là-bas [...] Ahh, tu parles à John [...] La Terre est détruite, mais il y a des endroits sûrs. Appelle les militaires: 112112", // 429
            "Bonjour [...] Aïe vous venez de Carl [...] Je comprends. Préparez 6 bouteilles d'alcool et 2 de bière. Ensuite, nous vous sauverons la journée: ", // 430

            "Vêtements sales", // 431
            "La famille s'habille tous les jours avec des vêtements choisis au hasard et achetés auparavant.", // 432
            "Chargeur de téléphone", // 433
            "Champignons", // 434
            "Réveil", // 435

            "Salut humain. Je peux vous montrer un pays des merveilles, une meilleure parole sans guerres ni agression.", // 436
            "Nous ne pouvons pas consommer d’alcool, alors j’ai un peu soif.", // 437
            "J'y viendrai tous les 20 jours pour une bière et une bouteille de vodka.", // 438
            "Je viendrai 4 fois. Êtes-vous dedans?\n\n\nYES       NOT YET", // 439
            "Je vous remercie! Au revoir pour les 20 prochains jours.", // 440
            "Pas d'alcool, pas de secours ... Au revoir pour toujours.", // 441

            "Viande", // 442
            "Viande au four", // 443
            "Drop Bombs!", // 444
            "Commencez le jeu en tant que bombardier! Frappez les obstacles pour gagner des points de style supplémentaires!", // 445


            "Le chat a tué:", // 446
            "Martha a fait un mauvais rêve ... Elle a tellement peur quand elle a besoin de se cacher.", // 447
            "Riz", //448
            "La colle", // 449
            "Fermier", // 450
            "Démarrer le jeu avec toutes les graines.", // 451

            "Pommier", // 452
            "Pomme", // 453

            "Vous avez plus de récupération d'énergie demain!", // 454
            "Cidre", //455

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

            "Plus chaque:", // 481

            "Café", // 482
            "Graines de café", // 483
            "Récupère de l'énergie", // 484

            "Coronavirus", // 485
            "Essayez de survivre avec COVID-19! L'alcool aide!", // 486

            "Collez vos chansons là-bas", // 487
            "Donner aux paramètres l'accès au stockage", // 488

            "Le Hobo nous vole. Pouvez-vous faire quelque chose avec ça? ... Tuez-le, puis nous parlerons plus.", // 489
            "Nous avons besoin d'énergie! Apportez-nous 5 tasses de café.", // 490
            "Il y a quelque chose de cassé. 3 fusibles ont sauté. Pouvez-vous nous en donner un nouveau?", // 491
            "Les rats ont détruit quelques fils. Pour ouvrir la porte, nous avons besoin de 6 nouveaux fils.", // 492
            "Pour alimenter la porte, nous avons besoin de 10 pièces d'uranium.", // 493
            "La porte s'ouvre tous les dimanches!", // 494

            "Purple Power", // 495
            "Guérissez toutes les blessures", // 496

            "Valiant Heart", // 497
            "Il n'y a pas de suicide.",// 498

            "<cliquer>", // 499
            "<swipe>", // 500
            "Les fournitures sont les plus importantes pour la survie. N'oubliez pas de les suivre.", // 501
            "Vous pouvez changer de pièce ou de certains endroits à l'extérieur en faisant glisser votre doigt", // 502
            "Il existe de nombreux autres éléments que vous pouvez vérifier en appuyant / en cliquant.", // 503
            "Allez dormir pour le lendemain.", // 504
            "Vérifions l'état de Bob. Cliquez sur lui et donnez-lui un verre!", // 505
            "Il est important de garder une trace des membres de la famille. Oh regardez une plante ... mettez-la à la poubelle!", // 506
            "Certaines actions nécessitent du sommeil, plantons une pomme de terre puis passons au lendemain.", // 507
            "La trappe est très importante, si quelqu'un frappe, elle peut être ennemie ou aide, elle a aussi sa propre condition.", // 508
            "Vous pouvez risquer d'ouvrir la trappe ou vérifier qui est là en utilisant par exemple une potion.", // 509
            "Créez une potion: PissVision et buvez-la.", // 510
            "Regardez! Aides! Vous pouvez ouvrir la trappe en toute sécurité.", // 511
            "Il est temps de donner à manger et à boire à tous les membres de la famille.", // 512
            "Arrosons les pommes de terre.", // 513
            "Il est important de sortir les poubelles. Aller au jardin.", // 514
            "Il est temps d'envoyer quelqu'un en expédition pour le ravitaillement. Nous avons une carte alors allons en ville.", // 515
            "Vérifiez le rayonnement s'il est ÉLEVÉ, l'expédition vous coûtera un masque à gaz.", // 516
            "Prenez le paquet d'eau et de nourriture.", // 517
            "OK, vous connaissez les choses de base, maintenant vous pouvez démarrer le jeu. Lisez le journal et utilisez votre cerveau! Tuez tout le monde.", // 518

            "Trash killer", // 519
            "Il y a un poison puissant pour les monstres de déchets au début.", //520
            "Aveugle", // 521
            "Essayez de jouer sans la lampe.", // 522
            "Je volerai votre eau!", // 523
            "Pain", // 524

            "Je m'appelle Srak. S'il vous plaît, aidez-moi avec ce problème. Donnez-moi une nappe. Je vous donnerai des pommes de terre, une radio et de l'essence.", // 525
            "Ammunition keeper", // 526
            "Commencez le jeu avec des tonnes de munitions!", // 527
    };

    public static final String credits = "Traduction:\n-Nicolas Cassez";
}
