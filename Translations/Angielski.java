package com.pokulan.aliveinshelter;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

/**
 * Created by Wojtek on 2017-03-11.
 */
public class Angielski {
    public static final BitmapFont czcionka = new BitmapFont(Gdx.files.internal("czcionka.fnt"));
    public static final String TEXT[] ={
            "New game", //1
            "Continue", //2
            "STATISTICS", //3
            "Failed collecting", //4
            "Failed shelter", //5
            "Alive: ", //6
            "Games started", //7
            "Son's deaths", //8
            "Unfinished games", //9
            "Longest game", //10

            "Bob! hurry, \n grab as many supplies\n     as you can!\n              Katrin", //11

            "Bob died, that is sad...", //12
            "Ben died, why him? Why...?", //13
            "Katrin died, the last healthy woman died...", //14
            "Bob got ill, where's the medicine?", //15
            "Ben has a high fever.", //16
            "Katrin doesn't feel good.", //17
            "Bob has not been back for too long.", //18
            "Ben is gone, he will never come back.", //19
            "Katrin disappeared forever...", //20

            "We got sick, damn!", //21
            "Showers, rain, it's pouring out and our shelter is leaking.", //22
            "Someone spilled our water -0.25l!", //23
            "Some food rotted -0.2kg.", //24
            "No electricity, open the door for light or keep it shut with a flashlight.", //25
            "Ben couldn't stand any more death or struggle for survival.", //26

            "Radio has been finally repaired.", //27
            "Mask has been repaired!", //28
            "Radio is broken again...", //29

            "We have to take out the rubbish, otherwise mildew will kill us.", //30
            "We gave a light signal, maybe they will save us.", //31
            "We lost our flashlight.", //32
            "We stole a flashlight.", //33
            "We stole a mask.", //34
            "We lost an axe...", //35
            "Next time, we will trade.", //36
            "Trade completed.", //37
            "Resuscitation done!", //38
            " must be resuscitated!\nTap fast!", //39

            "Was too slow\n   to make it", //40
            "My games", //41
            "Please wave to give us a light signal", //42

            "Bob", //43
            "Ben", //44
            "Katrin", //45
            "hunger", //46
            "thirst", //47
            "tired", //48
            "drunk", //49

            "Mattresses = sleep for the next epic day", //50
            "Disgusting rubbish", //51
            "Trash monster", //52
            "Can we eat this?", //53
            "Cards are our only fun", //54
            "Radio = communication", //55
            "Plague levels: ", //56
            "HIGH", //57
            "LOW", //58
            "Huge map", //58
            "Axe", //59
            "Mask, condition:", //60
            "Tools:", //61
            "Aid kit:", //62
            "Normal flashlight", //63
            "Preserves", //64
            "Water", //65
            "Petrol", //66

            "I have some useful stuff.", //67
            "Psst... I have something!", //68
            "Someone is knocking??", //69
            "There is some noise, is it help?", //70
            "Something hit the ground.", //71
            "Silence outside...", //72

            "With no supplies, Ben will not come back...", //73
            "With no supplies, Bob will not come back...", //74
            "With no supplies, Katrin will not come back...", //75

            " Hi, what's going on\n" +
                    "here is fairly complicated,\n" +
                    "don't trust the\n" +
                    "government or the military.\n" +
                    "You can come with us.\n" +
                    "Every even-numbered day, come\n" +
                    "and we'll leave a package\n" +
                    "  here for you.", //76
            "Interesting people[?]...", //77
            "Get out! You are\n" +
                    "  not one of us!", //78

            "There was nothing in the box.", //79
            "There was a tool.", //80
            "We found a meter.", //81
            "We found cards.", //82
            "We found a axe.", //83
            "We found a mask.", //84
            "We found a lashlight.", //85
            "We found a radio!", //86
            "We found a aid kit.", //87
            "We found some petrol.", //88

            "Planter", //89
            "Potato", //90
            "Alcohol", //91
            "Furnace, protects us from freezing", //92
            "Our old Distiller", //93
            "Bucket", //94
            "Is it an ice age...!?", //95
            "Time passed. Sitting there is so boring...", //96

            "The Hobo", //97
            "Blooby is sometimes too aggressive!", //98
            "Furnace", // 100
            " Plant",//101

            "You survived...", // 102
            "Everyone died...", // 103
            "Attacked and killed...", // 104
            "Tap for menu", // 105
            "We were attacked.", // 106
            "We received some help, a potato and new map!", // 107
            "We pushed away what fell.", // 108
            "Day", // 109
            "Days", //110
            "Swipe left!",//111
            "Airport",//112
            "They will save us soon, Potatoes +1.",//113
            "Next time it'll come be with us.",//114
            "We lost a map...", // 115
            "Shelter only", // 116
            "Gun", // 117
            "Ammunition", // 118
            "Cook", // 119
            "Dirty water", // 120
            "Filter", // 121
            "Power box", // 122

            "Wood", // 123
            "Iron", // 124
            "Worktable", // 125
            "Manure", // 126
            "Slime", // 127
            "TV", // 128

            "Rocket", // 129
            "Rocket fuel", // 130
            "Mine hole", // 131
            "Altar", // 132
            "Condition", // 133
            "Valve", // 134
            "Other stuff:", // 135
            "Copper", // 136
            "Fuse", // 137
            "Wire", // 138
            "Miner", // 139
            "Bats", // 140
            "Golden key", // 141

            "Shovel", // 142
            "Grave", // 142
            "Heart", // 144
            "Zombie", // 145

            "Easy", // 146
            "Hard", // 147
            "Trench", // 148
            "Bird", // 149
            "Silver key", // 150

            "Dog", // 141
            "Doghouse", // 152
            "Dog died", // 153
            "Gold", // 154
            "Gold bar", // 155
            "Bike, chain: " ,// 156
            "Bob couldn't stand seeing all the\n" +
                    "death and struggle for survival.", //157
            "Katrin couldn't stand seeing the\n" +
                    "death and struggle for survival.", //`58
            "Bridge", // 159
            "Raft", // 160
            "Fishing", // 161
            "Fish", // 162
            "Gommi Blueberry", // 163
            "GommiBerry Juice", // 164
            "Reduces tiredness", // 165
            "FishBerry", // 166
            "Reduces tiredness and thirst to 25%", // 167
            "GreenDirt", // 168
            "Long expeditions take only 1 day", // 169
            "Alchemy", //170
            "MEDIUM", //171
            "PissVision", // 172
            "Allows you to scan the trapdoor for 16 days", //173
            "help", //174
            "attackers", //175
            "Attack", //176
            "Defense", //177
            "MashedPotatoes", // 178
            "Regenerates defense points to 100%", // 179

            "Bones", // 180
            "Radio", // 181
            "Tablecloth", // 182
            "WastedSoul", // 183
            "InnocentSoul", // 184
            "WastedFish", //185
            "Gives 10000 damage", //186
            "InnocentPotato", // 187
            "Regenerates 4000 defense points", // 188

            "BreakOut", // 189
            "Escape will not heal the monster", // 190
            "DoubleKick", // 191
            "2x more damage", // 192
            "Boxing bag", // 193
            "Speaker", // 194
            "Hostages, rope", // 195
            "Hostages, message for military", // 196
            "We have 10 hostages, come rescue us! \nGdansk, Legion 53", // 197
            "Send", // 198
            "We are going to rescue you\nDay: ", // 199
            "Ninja", //200
            "You will avoid outside monsters for 5 days", //201
            "Blanket", //201
            "Pennywhistle", //203
            "Broken car", //204
            "Car parts", //205
            "Slingshot", //206
            "Chicken", //207

            "Plant's growing on the wall.", //208
            "Water is running out!", //209
            "Food is slowly running out!", //210
            "We should give military a light signal or find another way to survive or escape.", //211
            "Let's find a way to survive, we can't only sit there", //212

            "[TUTORIAL]\nHi! This is your shelter, you can move around it (swipe left/right). Touch and hold on an item to know what it is and its status. Touch/tap on characters to check their stats. Tap on the bed to advance time.", //213
            "[TUTORIAL]\nMost actions you 'tick' or do will take effect AFTER sleeping.  The trapdoor is very important, you can go places like the yard, open it to let somebody in or give a light signal. You can read its strength there and repair it.", //214
            "[TUTORIAL]\nTap the radio to check if military wants a light signal, open the door to give it. Change the station around to check! It will take a few times to get their attention for rescue. Other ways are out there for you to discover! :D", //215
            "[TUTORIAL]\nRemember to feed the family! To get items/resources, go on expeditions (boots in the character's menu)-watch their status before you leave! If you don't have any supplies, they won't come back!", //216
            "[TUTORIAL]\nIf you lose your map, helpers (if you are lucky) will give you second one. Grow potatoes in the planter, you can use them to trade in the shop.", //217
            "[TUTORIAL]\nThis game isn't easy! Solve puzzles, try different ways and options, earn coins to unlock new special items. Tip: Buy the Worktable first! ;) Have fun! - pokulan", //217

            "Style points",//219
            "Axe", // 220
            "Stick", // 221
            "Shuriken", // 222
            "Devil", // 223
            "Carrots", // 224
            "AlcoMist", // 225
            "Makes enemy 30% weaker.", // 226

            "Teddy", // 227
            "Ladder", // 228
            "Do you like\n Alive In Shelter?\n     RATE IT!", // 229
            "Airport", // 230
            "Forest", // 231
            "Shop", // 232
            "Go further", // 233
            "Remembered: ", // 234
            "Rescue bus: ", // 235
            "Santa Claus", // 236
            "I need help. You don't have holiday decorations, too bad you can't help.", // 237
            "Look out! A FIRE!", // 238
            "Fire extinguisher", // 239
            "Snowman kills us.", // 240
            "Snowman killer", // 241
            "1939 potatoes", // 242
            "Start the game with 1939 potatoes.", // 243
            "Only 8s challenge", // 244
            "You have only 8 seconds in collecting part.", // 245
            "Only food and water", // 246
            "Start the game only with 3l of water and 2kg of food.", // 247
            "Only women!", // 248
            "Play only with Katrin.", // 249
            "Winter is coming", // 250
            "Always have a frosty wind.", // 251
            "Random", // 252
            "Start the game with random items.", // 253
            "BenHulk", // 254
            "Start the game with a mutated Ben.", // 255
            "Plant guard", // 256
            "Plant helps you protect your shelter and won't hurt you.", // 257
            "Danse macabre", // 258
            "Characters come back to life 6 days after death.", // 259
            "No monks", // 260
            "There are no monks!", // 261
            "Safety outside", // 262
            "Always low radiation.", // 263
            "Extra bats", // 264
            "Bats are mutated. They bring Blooby.", // 265
            "No exit", // 266
            "There is no trapdoor.", // 267
            "Classic mode", // 268
            "Play in classic mode - old times. Only one room etc.", // 269
            "Sandbox mode", // 270
            "Play in sandbox mode, do what you want!", // 271
            "No more creepies", // 272
            "Play without bats, snowman and Pennywhistle.", // 273
            "RPG", // 274
            "Earn experience points and level up characters.", // 275

            "Level", // 276
            "Next level", // 277
            "Points", // 278

            "Daily bonus", // 279
            "Weekly bonus", // 280
            "I am an indie game developer, I spend my free time improving this game. If you want you can help by donating me by buying a premium. You will unlock all DLC items, all shelter items for 0 coins, renaming characters, remembered position and remove all ads. Thanks :)", // 281
            "Share ID", // 282
            "Add me", // 283
            "Friends neighbors", // 284

            "Play deathmatch - winner is who lasts longer!", // 285
            "Waiting for acceptance", // 286
            "Invite to match", // 287
            " died forever...", // 288
            "Deathmatch wins:", // 289
            "CleanBerry", // 290
            "Cleans family members.", // 291
            "\"Gommi\" village", // 292
            "\"We will give you a harbor.\"", // 293
            "Weed", // 294
            "Dildo", // 295
            "Drugs", // 296

            "Head", // 297
            "Arms", // 298
            "Belly", // 299
            "Legs", // 300

            "Mountain", // 301
            "Yard", // 302
            "Shop #2", // 303
            "Tomb", // 304
            "Shelters", // 305
            "Graveyard", // 306
            "Beach", // 307
            "Health", // 306
            "Energy", // 307
            "drink", // 310
            "eat", // 311
            "heal", // 312
            "go out", // 313
            "Opened mine", // 314
            "Mine entrance is opened at start, without crafting.", // 315

            "Extra map pieces", // 316
            "Fire place", // 317
            "Book a hotel", // 318
            "Stock", //319
            "Prize", //320
            "Uranium", // 321
            "Doors locked (I need a blue key)", // 322
            "Blue key", // 323
            "More locations", // 324
            "Start the game with 2 random extra maps!", // 325
            "Lockpicker", // 326
            "Start the game with all keys!", // 327
            "Master Explorer", // 328
            "Start the game with all extra map parts", // 329
            "Evil Snowman came back :(", // 330
            "Contaminant meter is broken.", // 331
            "We have to take a shower! Let's use some dirty water.", // 332
            "Trapdoor", //333
            "Poison", //334

            "966 Gommi Blueberries", //335
            "Start the game with 966 Gommi Blueberries.", //336
            "Blobby the slime", //337
            "Start the game with Blobby.", //338
            "Dodge the dog", //339
            "Start the game with dog! (You need to have a dog house)", //340
            "Friends", // 341
            "Customize", // 342
            "Extras", //343
            "Gas leak and fire caused an explosion...", // 344
            "Starter pack", //345
            "Start the game with extra: water, food, wood, iron and potatoes!", //346
            "Tomorrow will be good weather...", //347
            "Tomorrow will be frosty and windy...", //348
            "Tomorrow rain will attack us...", //349

            "Youuu wiill alll dieee...", //350
            "We need help! Please!", //351
            "The trapdoor is broken, we have to fix it.", //352
            "Water crops", //353
            "Shower", //354
            "Retard", // 355
            "Glitch mode", // 356
            "Will you survive? Glitches everywhere... Restart the game to come back to normal!", // 357
            "Earthquake!", // 358
            "Grab what do you want to save", // 359
            "Ben!? How is this possible?", //360
            "Attackers are everywhere!", //361
            "Room", //362
            "Garden", //363
            "Basement", //364
            "Magazine", //365
            "Hurricane is coming!!!", // 366
            "Tic Tac shut up", // 367
            "Slows down the clocks!", // 368
            "Air filter", // 369
            "We have to repair the air filter with the magazine's info!", //370
            "Cula", // 371
            "Soup", //372
            "Skeleton", // 373
            "Doge revive", // 374
            "Revive a dead dog!", // 375
            "We have to build a space rocket to get out, or ask for help some other creatures from outside. Son's phone maybe helpful too. Please check someone when the bus will arrive.", //376
            "The military should tell us throught the radio when to open the trapdoor and give them light signal at the night.", // 377
            "Martha", // 378

            "No! Martha died...", //379
            "Martha is sick. We need to heal her!", //380
            "hide", // 381
            "They kidnapped Martha!", //382

            "Hello Martha. My name is Frebbie, I do not want to hurt you. I want to help you. I will show you a wonderful place but you need to do something for me...", // 383
            "Please kill your brother. Ben is so rude and do not love you... Come back here next week.", // 384
            "I prefere females so please kill your father Bob... Come back here next week.", // 385
            "Feed and water your mother. She need to be strong... Come back here next week.", //386
            "I like alcohol, please make a bottle of alcohol and bring it for me next week.", //387
            "Thank you so much! Come back here after day:",//388
            "Guitar", //389
            "THIS IS THE POLICE! OPEN UP!", // 390
            "We know that you steal supplies! Give us 1 potato and 1 carrot and we will ignore that.", //391

            "Maybe give them bribe?", //392
            "Uhm... You are very important for us. We will come for you: ",// 393
            "Agree", //394
            "Disagree", //395
            "Maybe shoot them?", //396
            "CCTV", //397
            "Use \"Power Box\" before.", //398

            "Hop", // 399
            "Beer", // 400

            "Pickaxe",// 401
            "Sturdy pickaxe", // 402

            "Coal", // 403
            "Iron Ore", // 404
            "Copper Ore", // 405
            "Uranium Ore", // 406
            "Golden Ore", // 407
            "Doctor", //408
            "Uranium Pickaxe", // 409
            "-Makes drunk", // 410
            "-Makes drunk\n-Adds mining energy", // 411
            "Roasted potato", // 412
            "Roasted fish", // 413

            "Play The Hobo idle Clicker, whole story about the NUKE in Whelylely city and of course Hobo! Real time game!",//414

            "Crowbar", //415
            "Shop robbery", // 416

            "Innocent Bomb", // 417
            "Gives enemy 2000 damage.", // 418

            "they can't go in", // 419

            "Messages", //420
            "GPS", //421
            "Game", //422
            "Snake", //423
            "Movies", //424

            "Phone", //425
            "Calling", //426

            "Hello [...] So you need help? [...] Hmmmm I will call you back after 3 weeks", //427
            "Hi [...] I talk to my friends [...] Yes, the West attacked us [...] I know someone who can help you [...] Call Carl: +48 4392 Bye!", //428
            "Hello Carl there [...] Ah, so you spoke with John [...] The Earth may be ravaged but there are safe places. Call military: 112112", //429
            "Hello [...] Ouch you come from Carl [...] I understand. Prepare us 6 bottles of Alcohol and 2 of Beer. Then we will rescue you day: ", //430

            "Dirty clothes", // 431
            "The family dresses every day into random clothes that were previously bought.", // 432
            "Phone charger", // 433
            "Mushrooms", // 434

            "Alarm clock", // 435"Alarm clock", // 435

            "Hi human. I can show you a wonderland, better word without wars and aggression.", // 436
            "We can't use any alcohol there, so I am a little thirsty.", // 437
            "I will be coming there every each 20 days for 1 beer and 1 vodka bottle.", // 438
            "I will come 4 times. Are you in?\n\n\nYES       NOT YET", // 439
            "Thank you! See you in 20 days. Don't forget!", // 440
            "No alcohol, no rescue... Goodbye forever.", // 441
            "Flesh", //442
            "Baked flesh", //443
            "Drop Bombs!", //444
            "Start the game as a bomber! Hit the targets to gain extra style points!", //445
            "Kitty have killed:", // 446
            "Martha had a bad dream... She is so scared when she need to hide.", //447
            "Rice", //448
            "Glue", // 449

            "Farmer", // 450
            "Start the game with all seeds.", // 451

            "Apple Tree", // 452
            "Apple", // 453

            "You got more energy recovery tomorrow!", // 454
            "Cider", //455

            "Expedition take place next day after planning it.", // 456
            "Open trapdoor and sleep in order to give a light signal if you get the broadcast.", // 457
            "Be sure you are safe when you are giving a signal.", // 458
            "You can set alarm clock to feed the dog in the night.", // 459
            "You can not shop in the city when the doctor is in the shelter.", // 460
            "You can rob the shop with a crowbar when the doctor is at the shelter.", // 461
            "Go further to draw a map the first journey then you unlock more loctions.", // 462
            "Hide Martha when she is alone before you open the trapdoor for the night.", // 463
            "Silver key may be carry by the bird or the Doctor at the shop.", // 464
            "Get The Cook to get a golden key.", // 465
            "To get blue key do an exchange in the hotel.", // 466
            "Check the wiki page to see all endings and more info.", // 467
            "In the cellar you can dig to get coal, bones and metal ores.", // 468
            "Drink Beer or Cider to recover mining energy.", // 469
            "Always check your character stats.", // 470
            "Some actions you can make instantly and some need sleep.", // 471
            "Check the trash can in your garden to move out the rubbish and monster.", // 472
            "Look for supply drops in the garden.", // 473
            "Try to craft a rocket and escape Earth...", // 474
            "Try to craft and prepare a raft on the beach to escape the town.", // 475
            "Helpers who knock at the trapdoor can give you potatoes and a map.", // 476
            "Cat kills the trash monsters and bats..", // 477
            "Be careful on expeditions!", // 478
            "Look for car parts on expeditions to fix the car in the junkyard.", // 479
            "Remember potions! They can save you so be sure to craft them.", //480

            "More slots every:", //481

            "Coffee", // 482
            "Coffee seeds", // 483
            "Recovers energy", // 484

            "Coronavirus", // 485
            "Try to survive with COVID-19! Alcohol helps!", // 486

            "Paste your songs there", // 487
            "Give in settings access to storage", // 488

            "The Hobo robs us. Can you do something with that?... Kill him, then we will talk more.", // 489
            "We need energy! Bring us 5 cups of coffee.", // 490
            "There is something broken. 3 fuses are blown. Can you give us new one?", // 491
            "The rats destroyed some wires. To open the gate we need 6 new wires.", // 492
            "To power up the gate we need 10 uranium pieces.", // 493
            "The gate opens every sunday!", // 494

            "Purple Power", // 495
            "Heal all injuries", // 496

            "Valiant Heart", // 497
            "There is no suicide.",// 498


            "<click>", // 499
            "<swipe>", // 500
            "Supplies are the most important in survival. Remember to keep track on them.", // 501
            "You can change the room or some locations outside with finger swipe", // 502
            "There are many other items, which you can check with touch/click.", //503
            "Go sleep to get next day.", // 504
            "Let's check Bob's condition. Click on him and give him a drink!", //505
            "It is important to keep track on family members. Oh look a plant... move it to trash!", //506
            "Some actions needs sleep, let's plant a potato and then go to next day.", // 507
            "Trapdoor is very important, if someone is knocking it can be enemy or helper, it also has its own condition.", // 508

            "You can risk opening the trapdoor or check who is there using for example a potion.", // 509
            "Create potion: PissVision and drink it.", // 510
            "Look! Helpers! You can safely open the trapdoor.", // 511
            "It is time to give all family members food and drink.", // 512

            "Let's water out potatoes.", // 513
            "It is important to move out the trash. Go to garden.", // 514
            "It s time to send someone to expedition for supplies. We have a map so let's go to the city.", // 515
            "Check the radiation if it is HIGH then expedition will cost you one gas mask.", // 516
            "Take the water and food bundle.", //517
            "OK, you know the basic things, now you can start the game. Read diary and use your brain! Kill everyone.", // 518

            "Trash killer", // 519
            "There is a strong poison for trash monsters at the beginning.", //520

            "Blind", // 521
            "Try to play without the lamp.", // 522

            "I will steal your water!", // 523
            "Bread", // 524
    };

    public final static String credits = "Some correction: \n-Cassandra Blair Lone\n-Erik William";
}