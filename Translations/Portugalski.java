package com.pokulan.aliveinshelter;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

/**
 * Created by Wojtek on 2017-03-11.
 */
public class Portugalski {
    public static final BitmapFont czcionka = new BitmapFont(Gdx.files.internal("czcionka.fnt"));
    public static final String TEXT[] ={
            "Novo Jogo", //1
            "Continuar", //2
            "Estatísticas", //3
            "Buscas falhadas", //4
            "Abrigos falhados", //5
            "Vivo", //6
            "Jogo começou", //7
            "Filho morreu", //8
            "Jogos não terminados", //9
            "Jogo mais longo", //10

            "Rápido Bob!\n   Traga o essencial o\nmais rápido possível.\n              Katrin", //11

            "Bob morreu, isso é triste.", //12
            "Ben morreu, por que ele? Por quê?", //13
            "Katrin morreu, a última mulher morreu.", //14
            "Bob ficou doente, onde estão as pílulas?", //15
            "Ben tem febre alta.", //16
            "Katrin não se sente bem.", //17
            "Bob não voltou há muito tempo.", //18
            "Ben se foi, ele nunca mais voltará.", //19
            "Katrin desaparece para sempre ...", //20

            "Estamos doente.", //21
            "Chuva, nossas paredes estão vazando.", //22
            "Alguém derrubou água -0.25l", //23
            "Comida apodreceu -0.2kg", //24
            "Sem Luz, abra a porta ou não, se houver uma lanterna.", //25
            "Ben não suportou a vista, do corpo e da fome.", //26

            "Rádio foi consertado.", //27
            "Máscara foi consertada.", //28
            "Rádio está quebrado.", //29

            "Precisamos jogar o lixo, será seguro?", //30
            "Demos um sinal.", //31
            "Perdemos a lanterna.", //32
            "Roubamos uma lanterna.", //33
            "Roubamos uma máscara.", //34
            "Perdemos o machado.", //35
            "Próxima vez trocaremos.", //36
            "Troca finalizada.", //37
            "Ressuscitação completa!", //38
            " Devem ser ressuscitados!\nAperte rápido!", //39

            "Muito lento\n    pra existir", //40
            "Meus jogos", //41
            "Por favor mande um sinal", //42

            "Bob", //43
            "Ben", //44
            "Katrin", //45
            "fome", //46
            "sede", //47
            "fatigado", //48
            "bêbado", //49

            "Colchões = O próximo dia épico", //50
            "Lixo nojento", //51
            "Eita! Olha o monstro!", //52
            "Podemos comer isso?", //53
            "Cartas apenas diversão", //54
            "Rádio = comunicação", //55
            "Nível praga: ", //56
            "ALTO", //57
            "BAIXO", //58
            "Mapa gigante", //58
            "Machado - AFIADO!", //59
            "Máscara , condição:", //60
            "Ferramentas:", //61
            "Primeiros socorros:", //62
            "Lanterna normal", //63
            "Enlatados", //64
            "Água", //65
            "Gasolina", //66

            "Tenho coisas úteis", //67
            "Psiu... tenho algo aqui", //68
            "Alguém está batendo??", //69
            "Um barulho, ajuda?", //70
            "Algo acertando o chão", //71
            "Silêncio lá fora...", //72

            "Sem comida Ben não voltará...", //73
            "Sem comida Bob não voltará...", //74
            "Sem comida Katrin não voltará...", //75

            " Olá, o que está\n" +
                    "acontecendo aqui É\ncomplicado,\n" +
                    "não confie no governo\n" +
                    "e no exército. Você pode\n" +
                    "ir com a gente. Todos\ndia um\n" +
                    "pacote estará aqui.", //76
            "Pessoas interessantes[?]...", //77
            "Vá embora! Você não\n" +
                    "    é um de nós!", //78

            "Não tinha nada na caixa.", //79
            "Tinha ferramentas.", //80
            "Achamos um medidor.", //81
            "Achamos cartas.", //82
            "Achamos um machado.", //83
            "Achamos uma máscara.", //84
            "Achamos uma lanterna.", //85
            "Achamos um radio!", //86
            "Achamos primeiros socorros.", //87
            "Achamos gasolina.", //88

            "Flowerpot", //89
            "Batatas", //90
            "álcool", //91
            "Aquecedor - aquecimento", //92
            "Velho destilaria", //93
            "Balde", //94
            "Ice Age!?...", //95
            "O Tempo voa, está tudo bem...", //96

            "Sem casa", //97
            "Blooby, Ele é agressivo", //98
            "Aquecedor", // 100
            "Planta",//101

            "Você sobreviveu...", // 102
            "Todo mundo morreu...", // 103
            "Atacado e morto...", // 104
            "Aperte para ir ao menu", // 105
            "Fomos atacados.", // 106
            "Recebemos ajuda, batata!", // 107
            "Pegamos uma caixa.", // 108
            "Dia", // 109
            "Dias", //110
            "Deslize para a esquerda!",//111
            "Aeroporto",//112
            "Eles nos salvarão, Batatas +1.",//113
            "Da próxima vez será nós.",//114
            "Perdemos um mapa...", // 115
            "Abrigo apenas", // 116
            "Pistola", // 117
            "Munição", // 118
            "Cozinheiro", // 119
            "Água suja", // 120
            "Filtro", // 121
            "Caixa de energia", // 121

            "A madeira", // 123
            "O ferro", // 124
            "Bancada de trabalho", // 125
            "O estrume", // 126
            "Limo", // 127
            "TV", // 128
            "Foguete", // 129
            "Combustível de foguete", // 130
            "Buraco", // 131
            "O Altar", // 132
            " Condição", // 133
            "A válvula", // 134
            "Outros materiais:", // 135
            "Cobre", // 136
            "Fusível", // 137
            "Fio", // 138
            "Mineiro", // 139
            "Morcego", // 140
            "Chave de ouro", // 141

            "Pá", // 142
            "Grave", // 143
            "O coração", // 144
            "Zombie", // 14

            "Fácil", // 146
            "Difícil", // 147
            "A trincheira", // 148
            "O pássaro", // 149
            "Chave de prata", // 150
            "O cão", // 141
            "Casinha de cachorro", // 152
            "Cão morreu", //153
            "O ouro", // 154
            "Bar de ouro", // 155
            "Bicicleta, cadeia: ", // 156
            "Bob não suportou a vista, do\n" +
                    "corpo e da fome.", //157
            "Katrin não suportou a vista, do\n" +
                    "corpo e da fome.", //158
            "O ponte", // 159
            "A jangada", // 160
            "Pescaria", // 161
            "O peixe", // 162
            "Gommi Mirtilo", // 162
            "GommiBerry Suco", // 164
            "Reduz o cansaço", // 165
            "FishBerry", // 166
            "Reduz o cansaço e a sede de 25%", // 167
            "GreenDirt", // 168
            "Longa expedição leva apenas 1 dia", // 169
            "Alquimia", //170
            "MÉDIO", //171
            "PissVision", // 172
            "Permite-lhe digitalizar o alçapão durante 16 dias", //173
            "ajuda", //174
            "atacante", //175
            "Ataque", //176
            "Defesa", //177
            "MashedPotatoes", // 178
            "Regenera pontos de defesa", // 179

            "O osso", // 180
            "O rádio", // 181
            "Toalha de mesa", // 182
            "WastedSoul", // 183
            "InnocentSoul", // 184
            "WastedFish", //185
            "Dá 10000 de dano.", //186
            "InnocentPotato", // 187
            "Regenera 4000 pontos de defesa", // 188

            "BrakeOut", // 189
            "Escape não curará o monstro", // 190
            "DoubleKick", // 191
            "2x mais danos", // 192
            "Bolsa de boxe", // 193
            "Alto falante", // 194
            "Refém, corda", // 195

            "Refém, mensagem para militares", // 196
            "Nós temos 10 reféns, resgate-nos! \nGdansk, Legendy 53", // 197
            "Enviar", // 198
            "Nós vamos te resgatar\nDia: ", // 199
            "Ninja", //200
            "Você evitará monstros externos por 5 dias", //201
            "O Cobertor", //201
            "Pennywhistle", //203
            "Carro quebrado", //204
            "Peças do carro\n", //205
            "O bala", //206
            "O frango", //207

            "A planta está crescendo na parede.", //208
            "A água está acabando!", //209
            "A comida está se esgotando lentamente!", //210
            "Devemos dar sinal de luz militar ou encontrar outra maneira de sobreviver.", //211
            "Vamos encontrar uma maneira de sobreviver, não podemos apenas sentar lá.", //212

            "[TUTORIAL]\nHi! This is your shelter, you can move around it (swipe left/right). Touch/tap on item to know what it is. Touch/tap on characters to check theirs' stats. Tap on bed and go sleep.", //213
            "[TUTORIAL]\nMostly everything what you 'tick' or do will take effect after sleeping. Here you can read some important informations. Trapdoor is very important, you can go to the garden or open it to let somebody in or give light signal.", //214
            "[TUTORIAL]\nTap on the radio to check if military wants light signal if yes give it. Do it few times to win the game (there is a lot of more endings but find them out by yourself) :D", //215
            "[TUTORIAL]\nRemember to feed you characters! To get items/resources go on the expeditions (boots in the character's menu), remember to 'water' and feed one before going out!", //216
            "[TUTORIAL]\nIf you lose your map helpers (if you are lucky) will give you second one. Plant potatoes in the bowl you can use them to trade in the shop.", //217
            "[TUTORIAL]\nThis game isn't easy! Solve puzzles, try different ways and options, earn coins to unlock new special items. Tip: First buy Worktable ;) Have fun! - pokulan", //217
            "Pontos de estilo",//218
            "O machado", // 220
            "O bastão", // 221
            "Shuriken", // 222
            "Diabo", // 223
            "Cenouras", // 224
            "AlcoMist", // 225
            "Isso torna o inimigo 30% mais fraco.", // 226

            "Teddy", // 227
            "A escada", // 228
            "Você gosta\n Alive In Shelter?\n    Me avalie!", // 229
            "Aeroporto", // 230
            "Floresta", // 231
            "Loja", // 232
            "Ir além", // 233
            "Lembrar: ", // 234
            "ônibus de resgate: ", // 235
            "Papai Noel", // 236
            "Eu preciso de ajuda. Você não tem decorações de Natal, então não, obrigado.", // 236
            "Tenha cuidado! UM FOGO!", // 237
            "Extintor de incêndio", // 239
            "O boneco de neve nos mata.", // 240
            "Assassino de bonecos de neve", // 241

            "1939 batatas", // 242
            "Comece o jogo com as batatas de 1939.", // 243
            "Apenas 8 desafios", // 244
            "Você tem apenas 8 segundos na parte coletora.", // 245
            "Apenas comida e água", // 246
            "Comece o jogo apenas com 3l de água e 2kg de comida.", // 247
            "Apenas mulheres!", // 248
            "Jogue apenas com Katrin.", // 249
            "O inverno está chegando", // 250
            "Sempre é vento gelado.", // 251
            "Aleatória", // 252
            "Comece o jogo com itens aleatórios.", // 253
            "BenHulk", // 254
            "Comece o jogo com ben mutado.", // 255
            "A planta", // 256
            "A planta ajuda você a proteger seu abrigo.", // 257
            "Danse macabre", // 258
            "Os personagens voltam à vida 6 dias após a morte.", // 259
            "Sem monges", // 260
            "Não há monges!", // 261
            "Segurança fora", // 262
            "Sempre baixa radiação.", // 263
            "Bastões extras", // 264
            "Os morcegos estão mutantes. Eles trazem Blooby.", // 265
            "Sem saída", // 266
            "Não há trampolim.", // 267
            "Classic mode", // 268
            "Jogue no modo clássico - tempos antigos. Apenas um quarto etc.", // 269
            "Sandbox mode", // 270
            "Jogue no modo sandbox, faça o que quiser!", // 271
            "Não mais esses caras", // 272
            "Jogue sem morcegos, boneco de neve e Pennywhistle.", // 273
            "RPG", // 274
            "Ganhe pontos de experiência e agrupe caracteres.", // 275

            "Nível", // 276
            "Próximo nível", // 277
            "Pontos", // 278

            "Bônus diário", // 279
            "Bônus semanal", // 280
            "I am an indie game developer I spend my free time improving this game. If you want you can help me donating me = buying a premium. You will unlock all DLC items, all shelter items for 0 coins, renaming characters, remembered position and remove all ads. Thanks :)", // 281
            "Compartilhar", // 282
            "Me adicionou", // 283
            "Amigos vizinhos", // 284

            "Jogue deathmatch - ganha quem dura mais tempo!", // 285
    "Esperando a aceitação", // 286
             "Convidar para combinar", // 287
             "morreu para sempre ...", // 288
            "Deathmatch ganha:", // 289
            "CleanBerry", // 290
            "Limpa os membros da família.", // 290
            "\"Gommi\" aldeia", // 292
            "\"Vamos dar-lhe um asilo.\"", // 293
            "Weed", // 294
            "Dildo", // 295
            "Drugs", // 296

            "cabeça", // 297
            "braços", // 298
            "barriga", // 299
            "pernas", // 300

            "Montanha", // 301
             "Yard", // 302
            "Loja # 2", // 303
             "Tomb", // 304
             "Abrigos", // 305
             "Cemitério", // 306
             "Praia", // 307
            "Saúde", // 306
            "Energia", // 307
            "beber", // 310
            "comer", // 311
            "curar", // 312
            "sair", // 313
            "Mined mine", // 314
            "A entrada de mina é aberta no início, sem crafting.", // 315
            "Peças extra do mapa", // 316
            "Lugar de fogo", // 317
            "Reserve um hotel", // 318
            "Estoque", ///319
            "Prêmio", //320
            "Urânio", // 321
            "Portas fechadas (preciso de uma chave azul)", // 322
            "Chave azul", // 323
            "Mais localizações", // 324
            "Comece o jogo com 2 mapas extras aleatórios!", // 325
            "Disjuntor de porta", // 326
            "Comece o jogo com todas as chaves!", // 327
            "Mestre de expedições", // 328
            "Comece o jogo com todas as partes extras do mapa", // 329
            "Bad Snowman voltou :(", // 330
            "O medidor de poluição está quebrado", // 331
            "Temos que tomar um banho! Vamos usar água suja.", // 332
            "Porta", // 333
            "Veneno", // 334

            "966 Gommi Blueberries", //335
            "Comece o jogo com 966 Gommi Blueberries.", // 336
            "Blobby the slime", //337
            "Comece o jogo com Blobby.", // 338
            "Dodge the dog", //339
            "Comece o jogo com cachorro! (Você tem que ter uma casa de cachorro)", // 340
            "Amigos", // 341
            "Personalizar", // 342
            "Extra", //343
            "Vazamento de gás e fogo ...", // 344
            "Pacote inicial", // 345
            "Comece o jogo com extras: água, comida, madeira, ferro e batatas!", // 346
            "Amanhã será bom tempo ...", // 347
            "Amanhã será gelado e ventoso ...", // 348
            "A chuva de amanhã nos atacará ...", // 349

            "Você, alll, morrerá ...", // 350
            "Precisamos de ajuda! Por favor!", // 351
            "O alçapão está quebrado, temos que consertar isso.", // 352
            "Plantas aquáticas", // 353
            "Chuveiro", // 354
            "Fraco", // 355
            "Modo de falha", // 356
            "Você vai sobreviver? Em todo lugar falha ... Reinicie o jogo para voltar ao normal!", // 357
            "Terremoto!", // 358
            "Pegue o que você deseja salvar", // 359

            "Ben! Como é possível?", // 360
            "Atacantes estão em toda parte!", // 361
            "Quarto", // 362
            "Jardim", // 363
            "Porão", // 364

            "Revista", // 365

            "O furacão está chegando !!!", // 366
            "Tic Tac shut up", // 367
            "Retarda os relógios!", // 368
            "Filtro de ar", // 369
            "Temos que reparar o filtro de ar!", // 370
            "Cula", // 371
            "Sopa", //372
            "Esqueleto", // 373
            "Doge revive", // 374
            "Revive um cachorro morto!", // 375
            "Temos que construir um foguete espacial para sair, ou pedir ajuda a algumas outras criaturas do lado de fora. O telefone do filho talvez seja útil também. Por favor, marque alguém quando o ônibus chegar.", // 376
            "Os militares devem nos dizer através do rádio quando abrir o alçapão e dar-lhes sinal luminoso à noite.", // 377
            "Martha", // 378

            "Não! Martha morreu ...", // 379
            "Martha está doente. Precisamos curar ela!", // 380
            "Ocultar", // 381
            "Eles seqüestraram Martha!", // 382

            "Olá Martha. Meu nome é Frebbie, eu não quero te machucar. Eu quero te ajudar. Eu vou te mostrar um lugar maravilhoso, mas você precisa fazer algo para mim ...", // 383
            "Por favor, mate seu irmão. Ben é tão rude e não te ama ... Volte aqui na próxima semana.", // 384
            "Eu prefiro mulheres, então por favor, mate seu pai, Bob ... Volte aqui na próxima semana.", // 385
            "Alimente e regue sua mãe. Ela precisa ser forte ... Volte aqui na próxima semana.", // 386
            "Eu gosto de álcool, por favor, faça uma garrafa de álcool e traga para mim na próxima semana.", // 387
            "Muito obrigado! Volte aqui depois do dia:", // 388
            "Violão", //389
            "POLÍCIA! ABRA!", // 390
            "Nós sabemos que você rouba suprimentos! Dê-nos 1 batata e 1 cenoura, então vamos ignorar isso.", // 391

            "Talvez lhes dê suborno?", // 392
            "Uhm ... Você é muito importante para nós. Vamos atrás de você:", // 393
            "Concordo", // 394
            "Discordo", // 395
            "Talvez atire neles?", // 396
            "CCTV", //397
            "Use \"Caixa de energia\" antes.", // 398

            "Lúpulo", // 399
            "Cerveja", // 400

            "Picareta",// 401
            "Picareta melhor", // 402

            "Carvão", // 403
            "Minério de ferro", // 404
            "Minério de cobre", // 405
            "Minério de urânio", // 406
            "Gold Ore", // 407
            "Médico", // 408
            "Picareta de urânio", // 409
            "-Faz bêbado", // 410
            "-Faz bêbado \n-adiciona energia mineira", // 411
            "Batata assada", // 412
            "Peixe assado", // 413

            "Jogue o Hobo Clicker ocioso, toda a história sobre o NUKE na cidade \"Whelylely\" e, claro, Hobo! Jogo em tempo real!",//414

            "Crowbar", // 415
            "Roubo de loja", // 416

            "Innocent Bomb", // 417
            "Dá 2000 de dano.", // 418

            "eles não podem entrar", // 419

            "Mensagens", // 420
            "GPS", // 421
            "Jogo", // 422
            "Snake", //423
            "Filmes", // 424

            "Telefone", // 425
            "Chamando", // 426

            "Olá [...] Então você precisa de ajuda? [...] Hmmmm eu te ligo de volta depois de 3 semanas", // 427
            "Oi [...] falo com meus amigos [...] sim O ocidente nos agrediu [...] conheço alguém que pode te ajudar [...] Ligue para o Carl: +48 4392", // 428
            "Olá Carl lá [...] Ahh você fala com o John [...] A Terra está destruída mas tem lugares seguros. Chame militar: 112112", // 429
            "Olá [...] você vem de Carl [...] eu entendo. Prepare 6 garrafas de Álcool e 2 de Cerveja. Então vamos te resgatar dia: ", // 430

            "Roupa suja", // 431
            "A família veste todos os dias roupas aleatórias que foram compradas anteriormente", // 432
            "Carregador de telefone", // 433
            "Cogumelos", // 434
            "Despertador", // 435

            "Oi humano. Eu posso te mostrar um país das maravilhas, uma palavra melhor sem guerras e agressões.", // 436
            "Não podemos usar álcool, então estou com um pouco de sede.", // 437
            "Eu estarei chegando lá a cada 20 dias para 1 cerveja e 1 garrafa de vodka.", // 438
            "Eu irei 4 vezes. Estás dentro?\n\n\nYES       NOT YET", // 439
            "Obrigado! Tchau pelos próximos 20 dias.", // 440
            "Sem álcool, sem resgate ... Adeus para sempre.", // 441
            "Carne", // 442
            "Carne assada", // 443
            "Largar bombas!", // 444
            "Comece o jogo como bombardeiro! Atinja os alvos para ganhar pontos de estilo extras!", // 445


            "O gato matou:", // 446
            "Martha teve pesadelo ... Ela está com tanto medo quando precisa se esconder.", // 447
            "Arroz", //448
            "Cola", // 449

            "Agricultor", // 450
            "Comece o jogo com todas as sementes.", // 451

            "Árvore de maçã", // 452
            "Maçã", // 453

            "Você tem mais recuperação de energia amanhã!", // 454
            "Cidra", //455

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

            "Mais a cada:", // 481

            "Café", // 482
            "Sementes de café", // 483
            "Recupera energia", // 484

            "Coronavirus", // 485
            "Tente sobreviver com o COVID-19! O álcool ajuda!", // 486

            "Cole suas músicas lá", // 487
            "Conceder acesso ao armazenamento", // 488

            "O Hobo nos rouba. Você pode fazer algo com isso? ... Mate-o, depois conversaremos mais.", // 489
            "Nós precisamos de energia! Traga-nos 5 xícaras de café.", // 490
            "Há algo quebrado. 3 fusíveis estão queimados. Você pode nos dar um novo?", // 491
            "Os ratos destruíram alguns fios. Para abrir o portão, precisamos de 6 novos fios.", // 492
            "Para ligar o portão, precisamos de 10 peças de urânio.", // 493
            "O portão abre todos os domingos!", // 494

            "Purple Power", // 495
            "Cure todas as lesões", // 496

            "Valiant Heart", // 497
            "Não há suicídio.",// 498

            "<clique>", // 499
            "<swipe>", // 500
            "Os suprimentos são os mais importantes para a sobrevivência. Lembre-se de mantê-los sob controle.", // 501
            "Você pode alterar a sala ou alguns locais externos com o deslizar do dedo", // 502
            "Existem muitos outros itens, que você pode verificar com toque / clique.", // 503
            "Vá dormir para o dia seguinte.", // 504
            "Vamos verificar o estado de Bob. Clique nele e dê-lhe de beber!", // 505
            "É importante manter o controle sobre os membros da família. Olhe uma planta ... mova-a para o lixo!", // 506
            "Algumas ações precisam dormir, vamos plantar uma batata e depois ir para o dia seguinte.", // 507
            "O alçapão é muito importante, se alguém está batendo pode ser inimigo ou ajudante, ele também tem sua própria condição.", // 508
            "Você pode arriscar abrir o alçapão ou verificar quem está lá usando, por exemplo, uma poção.", // 509
            "Criar poção: PissVision e beber.", // 510
            "Olhem! Ajudantes! Vocês podem abrir o alçapão com segurança.", // 511
            "É hora de dar comida e bebida a todos os membros da família.", // 512
            "Vamos regar as batatas.", // 513
            "É importante retirar o lixo. Vá para o jardim.", // 514
            "É hora de enviar alguém para expedição de suprimentos. Temos um mapa, então vamos para a cidade.", // 515
            "Verifique se a radiação está ALTA, então a expedição custará uma máscara de gás.", // 516
            "Pegue o pacote de água e comida.", // 517
            "OK, você sabe o básico, agora pode iniciar o jogo. Leia o diário e use o cérebro! Mate todos.", // 518

            "Trash killer", // 519
            "Existe um forte veneno para monstros de lixo no início.", //520
            "Cego", // 521
            "Tente jogar sem a lâmpada.", // 522
            "Vou roubar sua água!", // 523
            "Pão", // 524

            "Meu nome é Srak. Por favor, me ajude com este problema. Dê-me uma toalha de mesa. Vou lhe dar algumas batatas, um rádio e gasolina.", // 525
            "Ammunition keeper", // 526
            "Comece o jogo com muita munição!", // 527
    };

    public static final String credits = "Tradução: -Lucas Silva\n#juriteam\n-João Soutello";
}
