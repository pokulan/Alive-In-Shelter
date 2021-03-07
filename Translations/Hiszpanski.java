package com.pokulan.aliveinshelter;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

/**
 * Created by Wojtek on 2017-03-11.
 */
public class Hiszpanski {
    public static final BitmapFont czcionka = new BitmapFont(Gdx.files.internal("czcionka.fnt"));
    public static final String TEXT[] ={
            "Nueva partida", //1
            "Continuar", //2
            "Estadísticas", //3
            "Recolección fallida", //4
            "Refugio fallido", //5
            "Con vida", //6
            "Juego iniciado", //7
            "Muertes de hijo", //8
            "Partidas sin terminar", //9
            "Partida más larga", //10

            "Bob, rápido!\n   Agarra las cosas que\nsean necesarias, y no\n              Katrin", //11

            "Bob murió, eso es triste.", //12
            "Ben murió, ¿por qué él? ¿Por qué?", //13
            "Katrin murió, la última mujer murió.", //14
            "Bob se enfermó, ¿dónde están las píldoras?", //15
            "Ben tiene fiebre alta.", //16
            "Katrin no se siente bien.", //17
            "Bob no ha vuelto en mucho tiempo.", //18
            "Ben se fue, nunca volverá.", //19
            "Katrin desaparece para siempre...", //20

            "Estamos enfermos.", //21
            "Ducha, lluvia, ducha, nuestras paredes están goteando.", //22
            "Alguien ha derramado agua -0.25l", //23
            "Comida caducada -0.2kg", //24
            "No hay electricidad, abra la puerta o no si hay una linterna.", //25
            "Ben no ha podido soportar la vista del cuerpo y el hambre.", //26

            "La radio se ha reparado...", //27
            "La mascara se ha reparado.", //28
            "La radio esta rota.", //29

            "Tenemos que sacar la basura, será seguro?", //30
            "Dimos una señal de luz tal vez nos salvará.", //31
            "Perdimos una linterna.", //32
            "Robamos una linterna.", //33
            "Robamos una máscara.", //34
            "Perdimos un hacha.", //35
            "La próxima vez negociaremos.", //36
            "Intercambio finalizado.", //37
            "Resucitación completada!", //38
            " debe ser resucitado!\nPulsa rápido!", //39

            "Fue muy lento\npara existir", //40
            "Más juegos", //41
            "Por favor de una señal de luz", //42

            "Bob", //43
            "Ben", //44
            "Katrin", //45
            "hambre", //46
            "sed", //47
            "Cansadop", //48
            "Borracho", //49

            "Colchones = siguiente dia épico", //50
            "Basura asquerosa", //51
            "Vaya, menudo monstruo!", //52
            "Podremos comer esto?", //53
            "Cartas, solo entretenimiento", //54
            "Radio = comunicación", //55
            "Nivel de plaga: ", //56
            "ALTO", //57
            "BAJO", //58
            "Mapa grande", //58
            "Hacha - AFILADA!", //59
            "Máscara, condicion:", //60
            "Herramientas:", //61
            "Primeros auxilios:", //62
            "Linterna normal", //63
            "Reservas", //64
            "Agua", //65
            "Petróleo", //66

            "Tengo cosas útiles", //67
            "Psst... Tengo algo", //68
            "Alguien está tocando??", //69
            "Hay un ruido, ayuda?", //70
            "Algo ha golpeado el suelo", //71
            "Silencio afuera...", //72

            "Sin comestibles, Ben no volverá...", //73
            "Sin comestibles, Bob no volverá...", //74
            "Sin comestibles, Katrin no volverá...", //75

            " Hola, lo que está\n" +
                    "pasando aqui es más\ncomplicado, limítese\n" +
                    "a confiar en el gobierno\n" +
                    "y el ejército. Puedes venir\n" +
                    "con nosotros. Cada dia un\npaquete estará\n" +
                    "esperando aqui.", //76
            "Gente interesante[?]...", //77
            "Lárgate!\n" +
                    " No estás con nosotros!", //78

            "No había nada en la caja.", //79
            "Hemos una harramienta.", //80
            "Hemos encontrado un medidor.", //81
            "Hemos encontrado cartas.", //82
            "Hemos encontrado un hacha.", //83
            "Hemos encontrado una máscara.", //84
            "Hemos encontrado una linterna.", //85
            "Hemos encontrado una radio!", //86
            "Hemos encontrado un kit de primeros auxilios.", //87
            "Hemos encontrado petróleo.", //88

            "Macetero", //89
            "Patatas", //90
            "Alcohol", //91
            "Horno - calentamiento", //92
            "Antiguo destilería", //93
            "Cubeta", //94
            "Es la edad de hielo?!", //95
            "El tiempo vuela, está bien...", //96

            "Vagabundo", //97
            "Blooby a veces agresiva!", //98
            "Horno", // 100
            "Planta",//101

            "Has sobrevivido...", // 102
            "Todos han muerto...", // 103
            "Atacados y asesinados...", // 104
            "Toca para ir al menú", // 105
            "Fuimos atacados.", // 106
            "Hemos recibido algo de ayuda, Patatas!", // 107
            "Se ha soltado una gota.", // 108
            "Día", // 109
            "Días", //110
            "Mover a la izquierda!",//111
            "Aeropuerto",//112
            "Nos salvarán..., Patatas +1.",//113
            "La próxima vez será nosotros.",//114
            "Perdimos un mapa...", // 115
            "Abrigo solamente", // 116
            "Pistola", // 117
            "Munición", // 118
            "Cocinero", // 119
            "Agua sucia", // 120
            "el filtro", // 121
            "Caja de poder", // 121

            "la madera", // 123
            "el hierro", // 124
            "taller", // 125
            "el abono", // 126
            "limo", // 127
            "TV", // 128
            "Cohete", // 129
            "Combustible para cohetes", // 130
            "Agujero", // 131
            "Altar", // 132
            "Condición", // 133
            "La válvula", // 134
            "Otras materias:", // 135
            "Cobre", // 136
            "Fusible", // 137
            "Alambre", // 138
            "Minero", // 139
            "Murciélago", // 140
            "Llave dorada", // 141

            "La pala", // 142
            "La tumba", // 143
            "El corazón", // 144
            "Zombie", // 145

            "Fácil", // 146
            "Difícil", // 147
            "La zanja", // 148
            "El pájaro", // 149
            "Llave de plata", // 150
            "El perro", // 141
            "La perrera", // 152
            "Perro ha muerto", //153
            "El oro", // 154
            "Barra de oro", // 155
            "La bicicleta, cadena: ", // 156
            "Bob no ha podido soportar la\n" +
                    "vista del cuerpo y el hambre.", //157
            "Katrin no ha podido soportar la\n" +
                    "vista del cuerpo y el hambre.", //158
            "Le puente", // 159
            "La balsa", // 160
            "Pescar", // 161
            "El pescado", // 162
            "Gommi Arándano", // 162
            "GommiBerry Jugo", // 164
            "Reduce el cansancio", // 165
            "FishBerry", // 166
            "Reduce el cansancio y la sed al 25%", // 167
            "GreenDirt", // 168
            "Larga expedición dura solo 1 día", // 169
            "Alquimia", //170
            "MEDIO", //171
            "PissVision", // 172
            "Le permite escanear la trampilla durante 16 días", //173
            "la ayuda", //174
            "el agresor", //175
            "Ataque", //176
            "Defensa", //177
            "MashedPotatoes", // 178
            "Regenera puntos de defensa", // 179

            "Los huesos", // 180
            "La radio", // 181
            "Mantel", // 182
            "WastedSoul", // 183
            "InnocentSoul", // 184
            "WastedFish", //185
            "Da 10000 de daño", //186
            "InnocentPotato", // 187
            "Regenera 4000 puntos de defensa", // 188

            "BrakeOut", // 189
            "El escape no curará al monstruo", // 190
            "DoubleKick", // 191
            "2x mas daño", // 192
            "Bolsa de boxeo", // 193
            "El altavoz", // 194
            "Rehenes, cuerda", // 195

            "Rehenes, mensaje para los militares", // 196
            "Tenemos 10 rehenes, rescate nosotros! \nGdansk, Legendy 53", // 197
            "Enviar", // 198
            "Te vamos a rescatar\nDía: ", // 199
            "Ninja", //200
            "Evitarás los monstruos exteriores durante 5 días", //201
            "La manta", //201
            "Pennywhistle", //203
            "Coche roto", //204
            "Piezas de automóvil", //205
            "La honda", //206
            "El pollo", //207

            "La planta está creciendo en la pared.", //208
            "¡El agua se está acabando!", //209
            "¡La comida se está acabando lentamente!", //210
            "Debemos dar señales de luz militar o encontrar otra forma de sobrevivir.", //211
            "Busquemos una forma de sobrevivir, no solo podemos sentarnos allí.", //212

            "[TUTORIAL]\nHi! This is your shelter, you can move around it (swipe left/right). Touch/tap on item to know what it is. Touch/tap on characters to check theirs' stats. Tap on bed and go sleep.", //213
            "[TUTORIAL]\nMostly everything what you 'tick' or do will take effect after sleeping. Here you can read some important informations. Trapdoor is very important, you can go to the garden or open it to let somebody in or give light signal.", //214
            "[TUTORIAL]\nTap on the radio to check if military wants light signal if yes give it. Do it few times to win the game (there is a lot of more endings but find them out by yourself) :D", //215
            "[TUTORIAL]\nRemember to feed you characters! To get items/resources go on the expeditions (boots in the character's menu), remember to 'water' and feed one before going out!", //216
            "[TUTORIAL]\nIf you lose your map helpers (if you are lucky) will give you second one. Plant potatoes in the bowl you can use them to trade in the shop.", //217
            "[TUTORIAL]\nThis game isn't easy! Solve puzzles, try different ways and options, earn coins to unlock new special items. Tip: First buy Worktable ;) Have fun! - pokulan", //217
            "Puntos de estilo",//218
            "Las hacha", // 220
            "El palo", // 221
            "Shuriken", // 222
            "Diablo", // 223
            "Zanahorias", // 224
            "AlcoMist", // 225
            "Hace que el enemigo sea un 30% más débil.", // 226

            "Osito de peluche", // 227
            "La escalera", // 228
            "¿Te gusta \n Alive In Shelter?\n    califica!", // 229
            "Aeropuerto", // 230
            "Bosque", // 231
            "Tienda", // 232
            "Ir más allá", // 233
            "Recordado: ", // 234
            "autobús de rescate: ", // 235
            "Papá Noel", // 236
            "Necesito ayuda. No tienes decoraciones navideñas, así que no, gracias.", // 236
            "¡Estar atento! ¡UN INCENDIO!", // 237
            "Extintor de incendios", // 239
            "Muñeco de nieve nos mata.", // 240
            "Asesino de muñecos de nieve", // 241

            "1939 patatas", // 242
            "Comience el juego con 1939 patatas.", // 243
            "Solo desafío 8s", // 244
            "Tienes solo 8 segundos para recolectar parte.", // 245
            "Solo comida y agua", // 246
            "Comience el juego solo con 3 l de agua y 2 kg de comida.", // 247
            "¡Solo mujeres!", // 248
            "Juega solo con Katrin.", // 249
            "Viene el invierno", // 250
            "Siempre es viento helado.", // 251
            "Aleatorio", // 252
            "Comience el juego con elementos aleatorios.", // 253
            "BenHulk", // 254
            "Comienza el juego con Ben mutado.", // 255
            "Plant guard", // 256
            "La planta te ayuda a proteger tu refugio.", // 257
            "Danse macabre", // 258
            "Los personajes vuelven a la vida 6 días después de la muerte.", // 259
            "Sin monjes", // 260
            "No hay monjes!", // 261
            "Seguridad afuera", // 262
            "Siempre baja radiación.", // 263
            "Murciélagos extra", // 264
            "Los murciélagos están mutados. Traen a Blooby.", // 265
            "Sin salida", // 266
            "No hay trampilla.", // 267
            "Classic mode", // 268
            "Juega en modo clásico - los viejos tiempos. Solo una habitación, etc.", // 269
            "Sandbox mode", // 270
            "Juega en el modo de espacio aislado, ¡haz lo que quieras!", // 271
            "No más estos tipos", // 272
            "Juega sin murciélagos, muñeco de nieve y Pennywhistle.", // 273
            "RPG", // 274
            "Gana puntos de experiencia y sube de nivel personajes.", // 275

            "Nivel", // 276
            "Siguiente nivel", // 277
            "Puntos", // 278

            "Bonus diario", // 279
            "Bono semanal", // 280
            "I am an indie game developer I spend my free time improving this game. If you want you can help me donating me = buying a premium. You will unlock all DLC items, all shelter items for 0 coins, renaming characters, remembered position and remove all ads. Thanks :)", // 281
            "Compartir ID", // 282
            "Me añadió", // 283
            "Amigos vecinos", // 284

            "¡Juega deathmatch, gana quien dure más tiempo!", // 285
     "Esperando la aceptación", // 286
             "Invitar a combinar", // 287
             "murió para siempre ...", // 288
            "Deathmatch gana:", // 289
            "CleanBerry", // 290
            "Limpia a los miembros de la familia.", // 290
            "\"Gommi\" pueblo", // 292
            "\"Le daremos un asilo.\"", // 293
            "Weed", // 294
            "Dildo", // 295
            "Drugs", // 296

            "cabeza", // 297
            "brazos", // 298
            "barriga", // 299
            "piernas", // 300

            "Montaña", // 301
             "Yarda", // 302
             "Tienda n. ° 2", // 303
             "Tumba", // 304
             "Refugios", // 305
             "Cementerio", // 306
             "Playa", // 307
            "Salud", // 306
            "Energía", // 307
            "beber", // 310
            "comer", // 311
            "sanar", // 312
            "salir", // 313
            "Mined mine", // 314
            "La entrada de Mine se abre al inicio, sin necesidad de crear.", // 315
            "Piezas adicionales del mapa", // 316
            "Chimenea", // 317
            "Reservar un hotel", // 318
            "Stock", //319
            "Premio", //320
            "Uranio", // 321
            "Puertas cerradas (necesito una llave azul)", // 322
            "Tecla azul", // 323
            "Más ubicaciones", // 324
            "¡Comienza el juego con 2 mapas extra aleatorios!", // 325
            "Interruptor de puerta", // 326
            "¡Comienza el juego con todas las llaves!", // 327
            "Maestro de expediciones", // 328
            "Comience el juego con todas las partes adicionales del mapa", // 329
            "Bad Snowman regresó :(", // 330
            "El medidor de contaminación está roto.", // 331
            "¡Tenemos que tomar una ducha! Usemos agua sucia", // 332
            "Puerta", // 333
            "Veneno", // 334

            "966 Gommi Blueberries", //335
            "Comienza el juego con 966 Gommi Blueberries.", // 336
            "Blobby the slime", //337
            "Comienza el juego con Blobby.", // 338
            "Dodge the dog", //339
            "¡Comienza el juego con perro! (Tienes que tener una casa de perro)", // 340
            "Amigos", // 341
            "Diseño", // 342
            "Extra", //343
            "Fuga de gas y fuego ...", // 344
            "Paquete de inicio", // 345
            "¡Comienza el juego con más: agua, comida, madera, hierro y patatas!", // 346
            "Mañana será buen tiempo ...", // 347
            "Mañana estará helado y ventoso ...", // 348
            "Mañana la lluvia nos atacará ...", // 349

            "Tú, alii, morirás ...", // 350
            "¡Necesitamos ayuda! ¡Por favor!", // 351
            "La trampilla está rota, tenemos que arreglarla", // 352
            "Plantas de agua", // 353
            "Ducha", // 354
            "Débil", // 355
            "Modo de fallo", // 356
            "¿Sobrevivirás? Por todos lados ... ¡reinicia el juego para volver a la normalidad!", // 357

            "¡Terremoto!", // 358
            "Toma lo que quieras guardar", // 359

            "¿Ben? ¿Cómo es posible?", // 360
            "¡Los atacantes están en todas partes!", // 361
            "Habitación", // 362
            "Jardín", // 363
            "Sótano", // 364
            "Revista", // 365

            "¡Huracán viene!", // 366
            "Tic Tac shut up", // 367

            "¡Ralentiza los relojes!", // 368
            "Filtro de aire", // 369
            "¡Tenemos que reparar el filtro de aire!", // 370
            "Cula", // 371
            "Sopa", //372
            "Esqueleto", // 373
            "Doge revive", // 374
            "¡Revive un perro muerto!", // 375
            "Tenemos que construir un cohete espacial para salir, o pedir ayuda a otras criaturas del exterior. El teléfono de Son puede ser útil también. Por favor, revise a alguien cuando llegue el autobús", // 376
            "Los militares deberían decirnos a través de la radio cuándo abrir la trampilla y darles luz a la noche", // 377
            "Martha", // 378

            "¡No! Martha murió ...", // 379
            "Marta está enferma. ¡Necesitamos sanarla!", // 380
            "Ocultar", // 381
            "¡Secuestraron a Martha!", // 382

            "Hola Martha. Mi nombre es Frebbie, no quiero hacerte daño. Quiero ayudarte. Te mostraré un lugar maravilloso pero tienes que hacer algo por mí ...", // 383
            "Por favor mata a tu hermano. Ben es tan grosero y no te amo ... Vuelve aquí la próxima semana", // 384
            "Prefiero las hembras así que por favor mata a tu padre Bob ... Vuelve aquí la próxima semana", // 385
            "Alimenta y riega a tu madre. Necesita ser fuerte ... Vuelve aquí la próxima semana", // 386
            "Me gusta el alcohol, por favor, haga una botella de alcohol y tráigala la próxima semana", // 387
            "¡Muchas gracias! Vuelve aquí día tras día:", // 388
            "Guitarra", //389
            "¡POLICÍA! ¡ABIERTA!", // 390
            "¡Sabemos que robas suministros! Danos 1 papa y 1 zanahoria para que ignoremos eso", // 391

            "¿Tal vez darles soborno?", // 392
            "Uhm ... usted es muy importante para nosotros. Vendremos por usted:", // 393
            "De acuerdo", // 394
            "En desacuerdo", // 395
            "¿Tal vez dispararles?", // 396
            "CCTV", //397
            "Usa \"Caja de poder\" antes", // 398
            "Saltos", // 399
            "Cerveza", // 400

            "Piqueta",// 401
            "Un mejor pico", // 402

            "Carbón", // 403
            "Mineral de hierro", // 404
            "Mineral de cobre", // 405
            "Mineral de uranio", // 406
            "Mineral de oro", // 407
            "Doctor", // 408
            "Pico de uranio", //409
            "-Se emborracha", // 410
            "-Hace borracho \n-Agrega energía minera", // 411
            "Patata asada", // 412
            "Pescado asado", // 413

            "¡Juega a The Hobo en inactividad Clicker, toda la historia sobre NUKE en la ciudad \"Whelylely\" y, por supuesto, Hobo! Juego en tiempo real!",//414

            "Palanca", // 415
            "Robo de tienda", // 416

            "Innocent Bomb", // 417
            "Da 2000 de daño.", // 418

            "no pueden entrar", // 419

            "Mensajes", // 420
            "GPS", // 421
            "Juego", // 422
            "Snake", //423
            "Películas", // 424

            "Teléfono", // 425
            "Llamando", // 426

            "Hola [...] ¿Entonces necesitas ayuda? [...] Hmmmm, te llamaré luego de 3 semanas", // 427
            "Hola [...] hablo con mis amigos [...] Sí, Occidente nos atacó, [...] conozco a alguien que puede ayudarte [...] Llama a Carl: +48 4392 ¡Adiós!", // 428
            "Hola Carl, ahí [...] Ahh, hablas con John [...] La Tierra está destruida pero hay lugares seguros. Llama al ejército: 112112", // 429
            "Hola [...] Ouch, vienes de Carl, entiendo. Prepara 6 botellas de alcohol y 2 de cerveza. Luego te rescataremos el día: ", // 430

            "Ropa sucia", // 431
            "La familia se viste todos los días con ropa que compró anteriormente", // 432
            "Cargador de teléfono", // 433
            "Setas", // 434
            "Despertador", // 435

            "Hola humano Puedo mostrarte un país de las maravillas, mejor palabra sin guerras ni agresión.", // 436
            "No podemos usar alcohol allí, así que tengo un poco de sed.", // 437
            "Iré allí cada 20 días por 1 cerveza y 1 botella de vodka.", // 438
            "Vendré 4 veces. ¿Está usted en?\n\n\nYES       NOT YET", // 439
            "¡Gracias! Adiós para los próximos 20 días.", // 440
            "Sin alcohol, sin rescate ... Adiós por siempre.", // 441
            "Carne", // 442
            "Carne al horno", // 443
            "¡Lanza bombas!", // 444
            "¡Comienza el juego como bombardero! ¡Golpea los objetivos para ganar puntos de estilo extra!", // 445

            "El gato ha matado:", // 446
            "Martha tuvo un mal sueño ... Está muy asustada cuando necesita esconderse", // 447
            "Arroz", //448
            "Pegamento", // 449

            "Agricultor", // 450
            "Comienza el juego con todas las semillas", // 451

            "Árbol de manzana", // 452
            "Manzana", // 453

            "¡Tienes más recuperación de energía mañana!", // 454
            "Sidra", //455

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

            "Más cada:", // 481

            "Café", // 482
            "Semillas de café", // 483
            "Recupera energía", // 484

            "Coronavirus", // 485
            "¡Intenta sobrevivir con COVID-19! El alcohol ayuda!", // 486

            "Pega tus canciones allí", // 487
            "Dar acceso al almacenamiento", // 488

            "El Hobo nos roba. ¿Puedes hacer algo con eso? ... Mátalo, luego hablaremos más.", // 489
            "¡Necesitamos energía! Tráenos 5 tazas de café.", // 490
            "Hay algo roto Se han fundido 3 fusibles. ¿Puedes darnos uno nuevo?", // 491
            "Las ratas destruyeron algunos cables. Para abrir la puerta necesitamos 6 cables nuevos.", // 492
            "Para encender la puerta necesitamos 10 piezas de uranio.", // 493
            "¡La puerta se abre todos los domingos!", // 494

            "Purple Power", // 495
            "Cura todas las heridas", // 496

            "Valiant Heart", // 497
            "No hay suicidio.",// 498

            "<clic>", // 499
            "<deslizar>", // 500
            "Los suministros son los más importantes para la supervivencia. Recuerda llevar un registro de ellos", // 501
            "Puedes cambiar la habitación o algunas ubicaciones en el exterior con solo deslizar el dedo", // 502
            "Hay muchos otros elementos, que puede comprobar al tocar o hacer clic", // 503
            "Vete a dormir para el día siguiente", // 504
            "Vamos a comprobar el estado de Bob. ¡Haz clic en él y dale de beber!", // 505
            "Es importante hacer un seguimiento de los miembros de la familia. Oh, mira una planta ... ¡muévela a la basura!", // 506
            "Algunas acciones necesitan dormir, plantemos una papa y luego pasemos al día siguiente", // 507
            "La trampilla es muy importante, si alguien está golpeando puede ser enemigo o ayudante, también tiene su propia condición", // 508
            "Puedes arriesgarte a abrir la trampilla o comprobar quién está allí usando, por ejemplo, una poción", // 509
            "Crea una poción: PissVision y bébela", // 510
            "¡Miren! ¡Ayudantes! Pueden abrir la trampilla con seguridad.", // 511
            "Es hora de dar de comer y beber a todos los miembros de la familia", // 512
            "Vamos a regar las patatas", // 513
            "Es importante sacar la basura. Ve al jardín", // 514
            "Es hora de enviar a alguien a una expedición por suministros. Tenemos un mapa, así que vayamos a la ciudad", // 515
            "Verifique la radiación si es ALTA, entonces la expedición le costará una máscara de gas", // 516
            "Coge el paquete de agua y comida", // 517
            "Bien, ya sabes las cosas básicas, ahora puedes comenzar el juego. ¡Lee el diario y usa tu cerebro! Mata a todos", // 518

            "Trash killer", // 519
            "Hay un veneno fuerte para los monstruos basura al principio.", //520
            "Ciego", // 521
            "Intenta jugar sin la lámpara.", // 522
            "¡Te robaré el agua!", // 523
            "Pan", // 524

            "Mi nombre es Srak. Por favor ayúdame con este problema. Dame un mantel. Te daré unas patatas, una radio y gasolina", // 525
            "Ammunition keeper", // 526
            "¡Comienza el juego con un montón de municiones!", // 527
    };

    public final static String credits = "Traducción: \n-Brunno Valente\n-Ricardo Velázquez";

}
