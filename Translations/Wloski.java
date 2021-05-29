package com.pokulan.aliveinshelter;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

/**
 * Created by Wojtek on 2017-03-11.
 */
public class Wloski {
    public static final BitmapFont czcionka = new BitmapFont(Gdx.files.internal("czcionka.fnt"));
    public static final String TEXT[] ={
            "Nuova Partita", //1
            "Continua", //2
            "STATISTICHE", //3
            "Raccolta fallita", //4
            "Rifugio perso", //5
            "Sopravvissuti", //6
            "Partita iniziata", //7
            "Morti del figlio", //8
            "Partite non completate", //9
            "Partita più lunga", //10

            "Bob svelto! \n     Prendi velocemente\nle cose necessarie.\n              Katrin", //11

            "Bob è morto, maledizione.", //12
            "Ben è morto, perché? Perché?", //13
            "Katrin è morta, l'ultima donna è morta.", //14
            "Bob si è ammalato, dove sono pillole?", //15
            "Ben ha la febbre alta.", //16
            "Katrin non si sente bene.", //17
            "Bob non torna da molto tempo.", //18
            "Ben se n'è andato, non tornerà mai.", //19
            "Katrin se n'è andata per sempre.", //20

            "Ci siamo ammalati.", //21
            "Pioggia, pioggia, e ancora pioggia, le nostre pareti stanno perdendo...", //22
            "Qualcuno ha versato l'acqua a terra - 0.25l", //23
            "Cibo marcito - 0.2kg", //24
            "Assenza di elettricità, apri la porta per illuminare il rifugio, sennò usa una torcia elettrica.", //25
            "Ben non è resistito alla depressione", //26

            "La radio è stata riparata.", //27
            "La maschera antigas è stata riparata.", //28
            "La radio si è rotta.", //29

            "Dobbiamo buttare la spazzatura, è sicuro?", //30
            "Abbiamo mandato un segnale di luce.", //31
            "Abbiamo perso la torcia.", //32
            "Abbiamo rubato una torcia.", //33
            "Abbiamo rubato una maschera.", //34
            "Abbiamo perso l'ascia.", //35
            "Faremo affari la prossima volta.", //36
            "Scambio concluso.", //37
            "Resuscitazione completata.", //38
            " deve essere resuscitato!\nPremi velocemente!", //39

            "Sei stato\n  troppo lento", //40
            "I miei giochi", //41
            "Invia un segnale di luce", //42

            "Bob", //43
            "Ben", //44
            "Katrin", //45
            "Fame", //46
            "Sete", //47
            "Stanchezza", //48
            "Alcol", //49

            "Materassi = Giornata epica!", //50
            "Immondizia", //51
            "Ugh! Un mostro!", //52
            "Sarà commestibile?", //53
            "Carte da gioco", //54
            "Radio = comunicazione", //55
            "Livello Radiazioni: ", //56
            "ALTO", //57
            "BASSO", //58
            "Grande mappa", //58
            "Ascia - Affilata!", //59
            "Maschera antigas, stato:", //60
            "Utensili:", //61
            "Medikit:", //62
            "Torcia", //63
            "Provviste di cibo", //64
            "Acqua", //65
            "Benzina", //66

            "Pss... Ho qualcosa per te", //67
            "Ho della roba utile", //68
            "Qualcuno sta bussando alla porta!?", //69
            "Ci sono dei rumori, sarà un aiuto?", //70
            "Qualcosa è caduta a terra", //71
            "C'è silenzio fuori...", //72

            "Senza cibo Ben non tornerà...", //73
            "Senza cibo Bob non tornerà...", //74
            "Senza cibo Katrin non tornerà...", //75

            " Ciao, la situazione é\n" +
                    "complicata, non fidarti\n" +
                    "del governo o\n" +
                    "dell'esercito...potrai\n" +
                    "essere aiutato da noi.\n" +
                    "Tutti i giorni pari\ndepositeremo delle \nprovviste.",//76
            "Persone interessanti[?]...", //77
            "Vattene! Non sei dei nostri!", //78

            "Non c'era nulla nella scatola.", //79
            "Hai trovato un' utensile.", //80
            "Abbiamo trovato un misuratore.", //81
            "Abbiamo trovato delle carte.", //82
            "Abbiamo trovato un' ascia.", //83
            "Abbiamo trovato una maschera antigas.", //84
            "Abbiamo trovato una torcia.", //85
            "Abbiamo trovato una radio..", //86
            "Abbiamo trovato un medikit.", //87
            "Abbiamo trovato della benzina.", //88

            "Ciotola", //89
            "Patate", //90
            "Alcol", //91
            "Caminetto - non farci raffreddare", //92
            "la nostra vecchia distilleria", //93
            "Secchio", //94
            "L'Era glaciale?!", //95
            "Il tempo vola...", //96

            "Barbone", //97
            "Blooby, è aggressivo!", //98
            "Caminetto", // 100
            "Pianta",//101

            "Sei sopravvissuto...", // 102
            "Sono morti tutti...", // 103
            "Aggredito e ucciso...", // 104
            "Tocca lo schermo per il menu", // 105
            "Siamo stati attaccati.", // 106
            "Abbiamo ricevuto aiuto, patate!", // 107
            "Abbiamo ricevuto scorte", // 108
            "Giorno", // 109
            "Giorni", //110
            "Scorri verso sinistra!",//111
            "Aeroporto",//112
            "Forse ci salveranno... Patate +1.",//113
            "La prossima volta sarà uno di noi.",//114
            "Abbiamo perso la mappa...", // 115
            "Solo riparo",//116
            "Fucile", // 117
            "Cartucce", // 118
            "Cucinare", // 119
            "Acqua sporca", // 120
            "Il filtro", // 121
            "Alimentazione elettrica", // 121

            "Il legno", // 123
            "Il ferro", // 124
            "Banco da lavoro", // 125
            "Letame", // 126
            "Il limo", // 127
            "TV", // 128
            "Razzo", // 129
            "Carburante per missili", // 130
            "Buco", // 131
            "L' altare", // 132
            "lo stato", // 133
            "La valvola", // 134
            "Altre cose:", // 135
            "rame", // 136
            "fusibile", // 137
            "filo", // 138
            "minatore", // 139
            "Pipistrello", // 140
            "Chiave d'oro", // 141

            "La pala", // 142
            "La tomba", // 143
            "Il cuore", // 144
            "Zombie", // 14

            "Facile", // 146
            "Duro", // 147
            "La trincea", // 148
            "Uccello", // 149
            "Tasto d'argento", // 150
            "Cane", // 151
            "Canile", // 152
            "Il cane è morto", //153
            "L'oro", // 154
            "Bar d'oro", // 155
            "La bicicletta, catena: ", // 156
            "Bob non è resistito alla depressione", //157
            "Katrin non è resistita alla depressione", //158
            "Il ponte", // 159
            "La zattera", // 160
            "Di pesca", // 161
            "Il pesce", // 162
            "Gommi Mirtillo", // 162
            "Succo GommiBerry", // 164
            "Riduce la stanchezza", // 165
            "FishBerry", // 166
            "Riduce la stanchezza e la sete al 25%", // 167
            "GreenDirt", // 168
            "Le spedizioni lunghe prendono solo 1 giorno", // 169
            "Alchimia", //170
            "MEDIO", //171
            "PissVision", // 172
            "Consente di eseguire la scansione della porta per 16 giorni", //173
            "Aiuto", //174
            "attaccanti", //175
            "Attaccare", //176
            "Difesa", //177
            "MashedPotatoes", // 178
            "Rigenera i punti di difesa", // 179

            "Osso", // 180
            "Lo radio", // 181
            "Tovaglia", // 182
            "WastedSoul", // 183
            "InnocentSoul", // 184
            "WastedFish", //185
            "Dà 10000 danni.", //186
            "InnocentPotato", // 187
            "Rigenerizza 4000 punti di difesa", // 188
            "BrakeOut", // 189
            "La fuga non guarisce il mostro", // 190
            "DoubleKick", // 191
            "2x più danni", // 192
            "Il sacco", // 193
            "L'altoparlante", // 194
            "Ostaggi, corda", // 195

            "Ostaggi, messaggio per militari", // 196
            "Abbiamo 10 ostaggi, ci salvi! \nGdansk, Legendy 53", // 197
            "Inviare", // 198
            "Ti salveremo\nGiorno: ", // 199
            "Ninja", //200
            "Eviterete i mostri esterni per 5 giorni", //201
            "La Coperta", //201
            "Pennywhistle", //203
            "Automobile rotta", //204
            "Ricambi auto", //205
            "La fionda", //206
            "Il pollo", //207

            "Una pianta sta crescendo sulla parete.", //208
            "L'acqua sta esaurendo!", //209
            "Il cibo sta lentamente esaurendo!", //210
            "Dobbiamo mandare un segnale luminoso ai militari o trovare almeno un altro modo per sopravvivere.", //211
            "Dobbiamo trovare un modo per sopravvivere, non possiamo rimanere qui.", //212

            "[TUTORIAL]\nCiao! Questo è il tuo rifugio antiatomico, per cambiare la visuale scorri il dito a destra o sinistra. Tocca un oggetto per scoprire di cosa si tratta. Tocca i personaggi per scoprire come stanno. Tocca il letto e vai a dormire.", //213
            "[TUTORIAL]\nQuasi tutto quello che fai avrà effetto dopo aver dormito. Qui sopra puoi leggere le cose importanti. La porta è molto importante, con questa puoi raggiungere il giardino o lasciare entrare qualcuno dentro, oppure mandare segnali di luce.", //214
            "[TUTORIAL]\nTocca la radio per controllare se i militari vogliono un segnale di luce per salvarti. Se si mandaglielo. Fallo un po' di volte per vincere (ci sono un sacco di altri finali,ma devi scoprirli tu) 😀", //215
            "[TUTORIAL]\nRicorda di nutrire il gruppo! Per ottenere oggetti/risorse vai in spedizione (attivabile con gli stivali del menù di un personaggio), ricorda di dare da bere e mangiare chi mandi in spedizione!", //216
            "[TUTORIAL]\nSe perdi la mappa (e se sei fortunato) degli aiutanti te ne daranno un'altra. Pianta le patate nella ciotola, potrai usare le patate come merce di scambio al negozio.", //217
            "[TUTORIAL]\nQuesto gioco non è semplice! Risolvi enigmi, prova tanti diversi sistemi ed opzioni, e guadagna monete per sbloccare tante cose nuove. Consiglio: comincia con il banco da lavoro 😉 Divertiti! - pokulan", //218
            "Punti di stile",//219
            "L'ascia", // 220
            "Il bastone", // 221
            "Shuriken", // 222
            "Diavolo", // 223
            "Carote", // 224
            "AlcoMist", // 225
            "Rende il nemico più debole del 30%.", // 226

            "Teddy", // 227
            "La scala", // 228
            "Ti piace\n Alive In Shelter?\n     allora valuta!", // 229
            "Aeroporto", // 230
            "Foresta", // 231
            "Negozio", // 232
            "Vai oltre", // 233
            "Ricorda: ", // 234
            "autobus di salvataggio: ", // 235
            "Babbo Natale", // 236
            "Ho bisogno di aiuto. Non hai decorazioni natalizie, quindi no grazie.", // 236
            "Attenzione! UN FUOCO!", // 237
            "Estintore", // 239
            "Il pupazzo di neve ci uccide.", // 240
            "Pupazzo di neve killer", // 241

            "1939 patate", // 242
            "Inizia la partita con 1939 patate.", // 243
            "Solo 8s,la Sfida", // 244
            "Hai solo 8 secondi per  raccogliere quello che ti serve.", // 245
            "Solo cibo e acqua", // 246
            "Inizia il gioco solamente con 3 litri di acqua e 2 kg di cibo.", // 247
            "Solo donne!", // 248
            "Gioca solo con Katrin.", // 249
            "L'inverno sta arrivando", // 250
            "È sempre vento gelido", // 251
            "Casuale", // 252
            "Inizia il gioco con oggetti casuali.", // 253
            "BenHulk", // 254
            "Inizia il gioco con Ben mutato.", // 255
            "Protezione delle piante", // 256
            "La pianta ti aiuta a proteggere il tuo rifugio.", // 257
            "Danza macabra", // 258
            "I personaggi tornano in vita 6 giorni dopo la morte.", // 259
            "Nessun monaco", // 260
            "Non ci sono monaci!", // 261
            "Sicurezza fuori", // 262
            "Sempre radiazione bassa.", // 263
            "Pipistrelli extra", // 264
            "I pipistrelli sono mutati e portano Blooby", // 265
            "Nessuna uscita", // 266
            "La botola è bloccata", // 267
            "Modalità classica", // 268
            "Gioca in modalità classica - vecchi tempi, solo una stanza ecc.", // 269
            "Modalità sandbox", // 270
            "Gioca in modalità sandbox, fai quello che vuoi!", // 271
            "No more these guys", // 272
            "Gioca senza pipistrelli,il pupazzo di neve o Pennywhistle.", // 273
            "RPG", // 274
            "Guadagna punti esperienza e sali di livello.", // 275

            "Livello", // 276
            "Prossimo livello", // 277
            "Punti", // 278

            "Bonus giornaliero", // 279
            "Bonus settimanale", // 280
            "I am an indie game developer I spend my free time improving this game. If you want you can help me donating me = buying a premium. You will unlock all DLC items, all shelter items for 0 coins, renaming characters, remembered position and remove all ads. Thanks 🙂", // 281
            "Condividere", // 282
            "In attesa di", // 283
            "Amici vicini", // 284

            "Gioca a deathmatch - vince chi dura più a lungo!", // 285
    "In attesa di accettazione", // 286
          "Invita per abbinare", // 287
         "morto per sempre ...", // 288
           "Deathmatch vince:", // 289
            "CleanBerry", // 290
            "Pulisce i membri della famiglia.", // 291
            "\"Gommi\" villaggio", // 292
            "\"Ti daremo un asilo.\"", // 293
            "Weed", // 294
            "Dildo", // 295
            "Drugs", // 296

            "testa", // 297
            "braccia", // 298
            "pancia", // 299
            "gambe", // 300

            "Montagna", // 301
            "Yard", // 302
            "Negozio #2", // 303
            "Tomba", // 304
            "Ripari", // 305
            "Cimitero", // 306
            "Spiaggia", // 307
            "Salute", // 306
            "Energia", // 307
            "bevi", // 310
            "mangia", // 311
            "guarisci", // 312
            "esci", // 313
            "Mined mine", // 314
            "Il mio ingresso è aperto all'inizio, senza creazione.", // 315
            "Pezzi di mappa extra", // 316
            "Camino", // 317
            "Prenotare un hotel", // 318
            "Magazzino", //319
            "Premio", //320
            "Uranio", // 321
            "Porte chiuse (ho bisogno di una chiave blu)", // // 322
            "Chiave blu", // 323
            "Altre posizioni", // 324
            "Inizia il gioco con 2 mappe extra casuali!", // 325
            "Interruttore porta", // 326
            "Avvia il gioco con tutte le chiavi!", // 327
            "Maestro di spedizioni", // 328
            "Avvia il gioco con tutte le parti extra della mappa", // 329
            "Bad Snowman è tornato :(", // 330
            "Il contatore dell'inquinamento è rotto.", // 331
            "Dobbiamo fare una doccia, usiamo acqua sporca", // 332
            "Porta", // 333
            "Veleno", // 334

            "966 Gommi Blueberries", //335
            "Inizia il gioco con 966 Gommi Blueberries.", // 336
            "Blobby the slime", //337
            "Inizia il gioco con Blobby.", // 338
            "Dodge the dog", //339
            "Inizia il gioco con il cane! (Devi avere una casa per cani)", // 340
            "Amici", // 341
            "Personalizza", // 342
            "Extra", //343
            "Perdita di gas e fuoco ...", // 344
            "Pacchetto iniziale", // 345
            "Inizia il gioco con extra: acqua, cibo, legna, ferro e patate!", // 346
            "Domani sarà bel tempo ...", // 347
            "Domani sarà gelido e ventoso ...", // 348
            "Domani la pioggia ci attaccherà ...", // 349

            "Tu, morirai tutto ...", // 350
            "Abbiamo bisogno di aiuto! Per favore!", // 351
            "La botola è rotta, dobbiamo aggiustarla.", // 352
            "Piante acquatiche", // 353
            "Doccia", // 354
            "Debole", // 355
            "Glitch mode", // 356
            "Will you survive? Everywhere glitch...", // 357
            "Modalità Glitch", // 356
            "Sopravviveresti? Ovunque glitch ... riavvia il gioco per tornare alla normalità!", // 357
            "Terremoto!", // 358
            "Prendi ciò che vuoi salvare", // 359

            "Ben !? Com'è possibile?", // 360
            "Gli aggressori sono ovunque!", // 361
            "Stanza", // 362
            "Giardino", // 363
            "Basement", // 364
            "Rivista", // 365

            "L'uragano sta arrivando !!!", // 366
            "Tic Tac shut up", // 367

            "Rallenta gli orologi!", // 368
            "Filtro dell'aria", // 369
            "Dobbiamo riparare il filtro dell'aria!", // 370
            "Cula", // 371
            "La minestra", //372
            "Scheletro", // 373
            "Doge rivive", // 374
            "Fai rivivere un cane morto!", // 375
            "Dobbiamo costruire un razzo spaziale per uscire o chiedere aiuto ad altre creature dall'esterno, anche il telefono del figlio può essere utile, per favore controlla qualcuno quando arriverà l'autobus.", // 376
            "I militari dovrebbero dirci attraverso la radio quando aprire la botola e dare loro un segnale luminoso durante la notte.", // 377
            "Martha", // 378

            "No, Martha è morta ...", // 379
            "Martha è malata, dobbiamo guarirla!", // 380
            "Nascondi", // 381
            "Hanno rapito Martha!", // 382

            "Ciao Martha, mi chiamo Frebbie, non voglio ferirti, voglio aiutarti, ti mostrerò un posto meraviglioso ma devi fare qualcosa per me ...", // 383
            "Per favore uccidi tuo fratello, Ben è così maleducato e non ti amo ... Torna qui la prossima settimana.", // 384
            "Preferisco le femmine quindi per favore uccidi tuo padre Bob ... Torna qui la prossima settimana.", // 385
            "Nutri e abbi cura di tua madre, deve essere forte ... Torna qui la prossima settimana.", // 386
            "Mi piace l'alcol, per favore prepara una bottiglia di alcol e portamela per la prossima settimana.", // 387
            "Grazie mille, torna qui dopo il giorno:", // 388
            "Chitarra", //389
            "POLICE! OPEN!", // 390
            "Sappiamo che rubi i rifornimenti! Dacci 1 patata e 1 carota, così ignoreremo quello.", // 391

            "Forse dare loro una bustarella?", // 392
            "Uhm ... sei molto importante per noi, verremo per te:", // 393
            "Accetto", // 394
            "Disaccordo", // 395
            "Forse li spara?", // 396
            "CCTV", //397
            "Usa \"Alimentazione elettrica\" prima.", // 398

            "Luppolo", // 399
            "Birra", // 400

            "Piccone",// 401
            "Un migliore piccone", // 402

            "Carbone", // 403
            "Minerale di ferro", // 404
            "Minerale di rame", // 405
            "Minerale di uranio", // 406
            "Minerale d'oro", // 407
            "Medico", // 408
            "Uranium Piccone", // 409
            "-Makes ubriaco", // 410
            "-Makes ubriaco\n-aggiunge energia mineraria", // 411
            "Patata arrostita", // 412
            "Pesce arrosto", // 413

            "Play The Hobo idle Clicker, whole story about the NUKE in Whelylely city and of course Hobo! Real time game!",//414

            "Crowbar", // 415
            "Furto di negozio", // 416

            "Innocent Bomb", // 417
            "Dà 2000 danni.", // 418

            "non possono entrare", // 419

            "Messaggi", // 420
            "GPS", // 421
            "Gioco", // 422
            "Snake", //423
            "Film", // 424

            "Telefono", // 425
            "Calling", // 426

            "Ciao [...] Quindi hai bisogno di aiuto? [...] Hmmmm ti richiamerò dopo 3 settimane", // 427
            "Ciao [...] parlo con i miei amici [...] Sì, l'Occidente ci ha attaccato [...] conosco qualcuno che può aiutarti [...] Chiama Carl: +48 4392", // 428
            "Ciao Carl ci [...] Ahh parli con John [...] La Terra è distrutta ma ci sono luoghi sicuri Chiamata militare: 112112", // 429
            "Ciao [...] Ouch tu vieni da Carl [...] Capisco, prepara 6 bottiglie di alcol e 2 di birra, poi ti salveremo il giorno: ", // 430

            "Vestiti sporchi", // 431
            "La famiglia veste ogni giorno vestiti casuali che erano stati precedentemente acquistati.", // 432
            "Caricatore del telefono", // 433
            "Funghi", // 434
            "Sveglia", // 435

            "Ciao umano. Posso mostrarti un paese delle meraviglie, una parola migliore senza guerre e aggressioni.", // 436
            "Non possiamo usare alcolici, quindi ho un po 'di sete.", // 437
            "Verrò lì ogni 20 giorni per 1 birra e 1 bottiglia di vodka.", // 438
            "Verrò 4 volte. Ci stai?\n\n\nsì             no", // 439
            "Grazie! Ciao per i prossimi 20 giorni.", // 440
            "Niente alcool, niente salvataggio ... Arrivederci per sempre.", // 441
            "Carne", // 442
            "Carne cotta", // 443
            "Drop Bombs!", // 444
            "Inizia il gioco come bombardiere! Colpisci gli obiettivi per guadagnare punti stile extra!", // 445
            "Il gatto ha ucciso:", // 446
            "Martha ha fatto un brutto sogno ... È così spaventata quando ha bisogno di nascondersi.", // 447
            "Riso", //448
            "Colla", // 449

            "Farmer", // 450
            "Inizia il gioco con tutti i semi.", // 451

            "Albero di mele", // 452
            "Mela", // 453

            "Hai più recupero di energia domani!", // 454
            "Cedro", //455

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

            "Più ogni:",// 481
            "Caffè", // 482
            "Semi di caffè", // 483
            "Recupera energia", // 484

            "Coronavirus", // 485
            "Prova a sopravvivere con COVID-19! L'alcool aiuta!", // 486

            "Incolla qui le tue canzoni", // 487
            "Dai accesso allo spazio di archiviazione", // 488

            "Gli Hobo ci. Puoi farci qualcosa? ... Uccidilo, poi parleremo di più.", // 489
            "Abbiamo bisogno di energia! Portaci 5 tazze di caffè.", // 490
            "C'è qualcosa di rotto. 3 fusibili sono bruciati. Puoi darcene uno nuovo?", // 491
            "I topi hanno distrutto alcuni fili. Per aprire il cancello abbiamo bisogno di 6 nuovi fili.", // 492
            "Per alimentare il cancello abbiamo bisogno di 10 pezzi di uranio.", // 493
            "Il cancello si apre ogni domenica!", // 494

            "Purple Power", // 495
            "Guarisci tutte le lesioni", // 496

            "Valiant Heart", // 497
            "Non c'è suicidio.",// 498

            "<clic>", // 499
            "<swipe>", // 500
            "Le scorte sono le più importanti per la sopravvivenza. Ricordati di tenerne traccia.", // 501
            "Puoi cambiare la stanza o alcune posizioni all'esterno con il dito", // 502
            "Ci sono molti altri elementi, che puoi controllare con tocco / clic.", // 503
            "Vai a dormire per il giorno dopo.", // 504
            "Controlliamo le condizioni di Bob. Cliccaci sopra e dagli da bere!", // 505
            "È importante tenere traccia dei membri della famiglia. Oh guarda una pianta ... spostala nella spazzatura!", // 506
            "Alcune azioni richiedono sonno, piantiamo una patata e poi andiamo al giorno successivo.", // 507
            "La botola è molto importante, se qualcuno sta bussando può essere nemico o aiutante, ha anche la sua condizione.", // 508
            "Puoi rischiare di aprire la botola o controllare chi c'è usando ad esempio una pozione.", // 509
            "Crea pozione: PissVision e bevila.", // 510
            "Guarda! Aiutanti! Puoi aprire la botola in sicurezza.", // 511
            "È ora di dare da mangiare e da bere a tutti i membri della famiglia.", // 512
            "Annaffiamo le patate.", // 513
            "È importante spostare la spazzatura. Vai in giardino.", // 514
            "È ora di mandare qualcuno alla spedizione per i rifornimenti. Abbiamo una mappa quindi andiamo in città.", // 515
            "Controlla la radiazione se è ALTA, la spedizione ti costerà una maschera antigas.", // 516
            "Prendi l'acqua e il cibo.", // 517
            "OK, sai le cose di base, ora puoi iniziare il gioco. Leggi il diario e usa il cervello! Uccidi tutti.", // 518

            "Trash killer", // 519
            "All'inizio c'è un forte veleno per i mostri della spazzatura.", //520
            "Cieco", // 521
            "Prova a giocare senza la lampada.", // 522
            "Ti ruberò l'acqua!", // 523
            "Pane", // 524

            "Mi chiamo Srak. Per favore aiutami con questo problema. Dammi una tovaglia. Ti darò delle patate, una radio e della benzina.", // 525
            "Ammunition keeper", // 526
            "Inizia il gioco con un sacco di munizioni!", // 527

            "Tieni premuto per acquistare", // 528

            "Oggi fa un caldo soffocante, dobbiamo BERE di più oggi!", // 529

    };

    public static final String credits = "Traduzione: Nicolò Giunta, Andrea Lacava\nJhonny Elendu, Finn Norkel,\nFederico Ragonesi";
}
