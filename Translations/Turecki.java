package com.pokulan.aliveinshelter;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

/**
 * Created by Wojtek on 2017-03-18.
 */
public class Turecki {
    public static final BitmapFont czcionka = new BitmapFont(Gdx.files.internal("czcionka.fnt"));
    public static final String TEXT[] ={
            "Yeni Oyun", //1
            "Devam Et", //2
            "İstatistikler", //3
            "Başarısız Keşif Sayısı", //4
            "Başarısız Barınak Sayısı", //5
            "Hayatta Kalınan Oyun", //6
            "Başlatılan Oyun Sayısı", //7
            "Ben'in Ölüm Sayısı", //8
            "Bitirilmemiş Oyunlar", //9
            "En Uzun Oyun: ", //10

            "Bob! Acele et, \n  alabildiğin kadar\n eşya al.\n              Katrin", //11

            "Bob öldü, bu üzücü.", //12
            "Ben öldüm, neden o? Niye ya?", //13
            "Katrin öldü, son kadın öldü.", //14
            "Bob hastalandı, hap nerede?", //15
            "Ben ateşim çok yüksek.", //16
            "Katrin iyi hissetmiyor.", //17
            "Bob uzun süredir geri döndü.", //18
            "Ben gitti, asla geri dönmeyecek.", //19
            "Katrin sonsuza dek yok olur.", //20

            "biz hastayız.", //21
            "Yağmur, yağmur, daha çok yağmur, duvarlarımız sızdırıyor.", //22
            "Birisi sudan dökmüş -0.25l", //23
            "Yemek çürüdü -0.2kg", //24
            "Elektrik yok, flaşör varsa kapıyı açın ya da açın.", //25
            "Ben ölüm görmeye ve hayatta kalmaya çalışmaya dayanamadı.", //26

            "Radyo tamir edildi.", //27
            "Maske tamir edildi.", //28
            "Radyo bozuldu.", //29

            "Çöpü atmamız lazım Güvenli mi?", //30
            "ışık sinyali verdik.", //31
            "Bir el feneri kaybettik.", //32
            "Bir el feneri çaldık.", //33
            "Bir maske çaldık.", //34
            "Baltayı kaybettik...", //35
            "Gelecek sefere takası yapacağız.", //36
            "Takas tamamlandı.", //37
            "Diriltme tamamlandı!", //38
            " hayata dönmeli!\nHızlı bas!", //39

            "Çok yavaştı\n   çıkış", //40
            "Oyunlarım", //41
            "Lütfen bir ışık sinyali ver", //42

            "Bob", //43
            "Ben", //44
            "Katrin", //45
            "açlık", //46
            "susuzluk", //47
            "yorgunluk", //48
            "sarhoş", //49

            "Yatak = sonraki büyük gün", //50
            "iğrenç çöp", //51
            "Iyy! canavar!", //52
            "Bunu yiyebilir miyiz?", //53
            "Kartlar sadece eğlence için", //54
            "Radyo = iletişim", //55
            "Radyasyon seviyesi: ", //56
            "YÜKSEK", //57
            "ALÇAK", //58
            "Büyük harita", //59
            "Balta - KESKıN!", //60
            "Maske, adeti:", //61
            "Aletler:", //62
            "İlk yardım malzemesi:", //63
            "Normal el feneri", //64
            "Yiyecek", //65
            "Su", //66
            "Petrol", //67

            "ışe yarar şeylerim var", //68
            "Pss... Bende birşey var", //69
            "Birisi kapıyı mı çalıyor??", //70
            "Burda ses var,yardım edin?", //71
            "Birşey yere vurdu", //72
            "Dışarısı sessiz...", //73

            "eşyalar olmadan, Ben geri gelmeyecek...", //74
            "eşyalar olmadan, Bob geri gelmeyecek...", //75
            "eşyalar olmadan, Katrin geri gelmeyecek...", //76

            " Selam, buradaki işler\n" +
                    "çok karışık. Devlete ve\n" +
                    "orduya güvenme.\n" +
                    "Bize katılabilirsin. Çift\n" +
                    "sayılı günlerde buraya\n" +
                    "bir paket bırakacağız.",// 77
            "ılginç insanlar[?]...", //77
            "Dışarı çık! Sen\n" +
                    "  bizimle deđilsin!", //78

            "Kutunun içinde hiçbir şey yoktu.", //79
            "Bir alet bulundu.", //80
            "Bir gösterge bulduk.", //81
            "Oyun kartları bulduk.", //82
            "Bir balta bulduk.", //83
            "Bir maske bulduk.", //84
            "Bir el feneri bulduk.", //85
            "Bir radyo bulduk!", //86
            "ılk yardım seti bulduk.", //87
            "Petrol bulduk.", //88

            "Küçük tarla", //89
            "Patatesler", //90
            "Alkol", //91
            "Soba, üşümemize izin vermez", //92
            "Eski damıtıcı", //93
            "Kova", //94
            "Buzul çağı!?...", //95
            "Zaman geçiyor...", //96

            "Serseri", //97
            "Blooby bazen çok sinirli!", //98
            "Soba", // 100
            " Bitki",//101

            "Hayatta kaldın...", // 102
            "Herkes öldü...", // 103
            "Saldırıya uğranıldı ve öldürüldünüz...", // 104
            "Menü için tıkla", // 105
            "Saldırıya uğradık.", // 106
            "Biraz yardım aldık, patates!", // 107
            "Dışarıdan yardım aldık.", // 108
            "Gün", // 109
            "Gün", //110
            "Sola kaydır!",//111
            "Havaalanı",//112
            "Bizi yakında kurtaracaklardır, Patates +1.",//113
            "Gelecek sefer biz olacağız.",//114
            "Bir harita kaybettik...", // 115
            "Sadece barınak", // 116
            "Tabanca", //117
            "Cephane",// 118
            "Aşçı", // 119
            "Kirli su", // 120
            "Filtre", // 121
            "Güç kutusu", // 121

            "Odun", // 123
            "Demir", // 124
            "Tezgah", // 125
            "gübre", // 126
            "Sümük", // 127
            "TV", // 128
            "Roket", // 129
            "Roket yakıtı", // 130
            "Delik", // 131
            "Altar", // 132
            "  Durum", // 133
            "Kapakçık", // 134
            "Diğer maddeler:", // 135
            "bakır", // 136
            "sigorta", // 137
            "tel", // 138
            "madenci", // 139
            "Yarasa", // 140
            "Altın anahtar", // 141

            "Kürek", // 142
            "Mezar", // 143
            "Kalp", // 144
            "Zombie", // 14

            "Kolay", // 146
            "Zor", // 147
            "hendek", // 148
            "Kuş", // 149
            "Gümüş anahtarı", // 150
            "Köpek", // 141
            "köpek kulübesi", // 152
            "Köpek öldü", //153
            "Altın", // 154
            "Altın çubuk", // 155
            "Bisiklet, zincir: ", // 156
            "Bob ölüm görmeye ve hayatta\n" +
                    "kalmaya çalışmaya dayanamadı.", //157
            "Katrin ölüm görmeye ve hayatta\n" +
                    "kalmaya çalışmaya dayanamadı.", //158
            "köprü", // 159
            "Sal", // 160
            "Balık tutma", // 161
            "Balık", // 162
            "Gommi yabanmersini", // 162
            "GommiBerry su", // 164
            "Yorgunluğu azaltır", // 165
            "FishBerry", // 166
            "Yorgunluğu ve susuzluğunu% 25'e kadar azaltır.", // 167
            "GreenDirt", // 168
            "Uzun seferi sadece 1 gün sürer", // 169
            "Simya", //170
            "ORTA", //171
            "PissVision", // 172
            "Trap kapağını 16 gün boyunca taramanıza izin verir.", //173
            "yardımcı", //174
            "saldırganlar", //175
            "Saldırı", //176
            "Savunma", //177
            "MashedPotatoes", // 178
            "Savunma noktalarını yeniler", // 179

            "Kemikler", // 180
            "Radyo", // 181
            "Masa örtüsü", // 182
            "WastedSoul", // 183
            "InnocentSoul", // 184
            "WastedFish", //185
            "10000 hasar verir.", //186
            "InnocentPotato", // 187
            "4000 savunma puanı yeniledi", // 188

            "BrakeOut", // 189
            "Kaçış canavarı iyileştirmez", // 190
            "DoubleKick", // 191
            "2x Daha fazla hasar", // 192
            "Kum torbası", // 193
            "konuşmacı", // 194
            "Rehineler, ip", // 195

            "Rehineler, askeri mesaj", // 196
            "10 rehinemiz var, bizi kurtar! \nSosnowiec, Dluga 69", // 197
            "etmek", // 198
            "Seni kurtaracağız\nGün: ", // 199
            "Ninja", //200
            "5 gün boyunca dışarıdaki canavarlardan kaçınacaksın", //201
            "Battaniye", //201
            "Pennywhistle", //203
            "Kırık araba", //204
            "Araba parçaları", //205
            "sapan", //206
            "tavuk", //207

            "Bitki duvarda büyüyor.", //208
            "Su bitiyor!", //209
            "Yavaş yavaş tükeniyor!", //210
            "Askeri ışık sinyali vermeliyiz ya da hayatta kalmak için başka bir yol bulmalıyız.", //211
            "Hayatta kalmanın bir yolunu bulalım, sadece orada oturup hareket edemiyoruz.", //212

            "[TUTORIAL]\nHi! This is your shelter, you can move around it (swipe left/right). Touch/tap on item to know what it is. Touch/tap on characters to check theirs' stats. Tap on bed and go sleep.", //213
            "[TUTORIAL]\nMostly everything what you 'tick' or do will take effect after sleeping. Here you can read some important informations. Trapdoor is very important, you can go to the garden or open it to let somebody in or give light signal.", //214
            "[TUTORIAL]\nTap on the radio to check if military wants light signal if yes give it. Do it few times to win the game (there is a lot of more endings but find them out by yourself) :D", //215
            "[TUTORIAL]\nRemember to feed you characters! To get items/resources go on the expeditions (boots in the character's menu), remember to 'water' and feed one before going out!", //216
            "[TUTORIAL]\nIf you lose your map helpers (if you are lucky) will give you second one. Plant potatoes in the bowl you can use them to trade in the shop.", //217
            "[TUTORIAL]\nThis game isn't easy! Solve puzzles, try different ways and options, earn coins to unlock new special items. Tip: First buy Worktable ;) Have fun! - pokulan", //217
            "Stil noktaları",//218
            "balta", // 220
            "sopa", // 221
            "Shuriken", // 222
            "şeytan", // 223
            "Havuçlar", // 224
            "AlcoMist", // 225
            "Düşmanı% 30 daha zayıflatır.", // 226

            "Oyuncak", // 227
            "Merdiven", // 228
            "Sever misin\n Alive In Shelter?\nbu uygulamayı oyla!", // 229
            "Havalimanı", // 230
            "Orman", // 231
            "Dükkan", // 232
            "Ileri git", // 233
            "Hatırlamak: ", // 234
            "kurtarma otobüsü: ", // 235
            "Noel Baba\n", // 236
            "Yardıma ihtiyacım var. Noel süslemeleri yok, bu yüzden hayır teşekkürler.", // 236
            "Bak! BİR ATEŞ!", // 237
            "Yangın söndürücü", // 239
            "Snowman bizi öldürüyor.", // 240
            "Kardan adam katili", // 241

            "1939 patates", // 242
            "Oyuna 1939 patates ile başlayın.", // 243
            "Sadece 8s meydan okuma", // 244
            "Parçaları toplamada 8 saniye kaldı.", // 245
            "Sadece yiyecek ve su", // 246
            "Oyuna sadece 3l su ve 2kg gıda ile başlayın.", // 247
            "Yalnızca kadınlar!", // 248
            "Yalnızca Katrin ile oynayın.", // 249
            "Kış geliyor",// 250
            "Her zaman soğuk rüzgar", // 251
            "Rasgele", // 252
            "Oyuna rasgele öğelerle başlayın.", // 253
            "BenHulk", // 254
            "Maçı mutasyona uğratılmış Ben ile başlatın.", // 255
            "Bitki koruma", // 256
            "Bitki, barınağı korumanıza yardımcı oluyor.", // 257
            "Danse macabre", // 258
            "Karakterler ölümünden 6 gün sonra canlanır", // 259
            "Rahibe yok", // 260
            "Orada rahip yok!", // 261
            "Dış güvenlik", // 262
            "Daima düşük radyasyon.", // 263
            "Ekstra yarasalar", // 264
            "Yarasalar mutasyona uğramış, Blooby'yi getirdiler.", // 265
            "Çıkış yok", // 266
            "Hiç bir kapıcı yoktur", // 267
            "Klasik mod", // 268
            "Klasik modda oyna - eski zamanlar, yalnızca bir oda vb.", // 269
            "Sandbox mode", // 270
            "Sandbox modunda oyna, ne istersen yap!", // 271
            "Artık bu çocuklar yok", // 272
            "Yarasız oynamak, kardan adam ve Pennywhistle.", // 273
            "RPG", // 274
            "Tecrübe puan kazanma ve karakterleri seviyeleme.", // 275

            "seviye", // 276
            "Sonraki seviye", // 277
            "makas", // 278

            "Günlük bonus", // 279
            "Haftalık bonus", // 280
            "I am an indie game developer I spend my free time improving this game. If you want you can help me donating me = buying a premium. You will unlock all DLC items, all shelter items for 0 coins, renaming characters, remembered position and remove all ads. Thanks :)", // 281
            "Pay ID", // 282
            "Beni ekledi", // 283
            "Komşular arkadaşlar", // 284

            "Ölüm eşleşmesi oyna - daha uzun süre kazanır!", // 285
    "Kabul bekliyor", // 286
             "Eşleştirmeye davet et", // 287
             "sonsuza dek öldü ...", // 288
            "Deathmatch kazanıyor:", // 289
            "CleanBerry", // 290
            "Aile üyelerini temizler.", // 290
            "\"Gommi\" village", // 292
            "\"Size bir sığınma hakkı vereceğiz.\"", // 293
            "Weed", // 294
            "Dildo", // 295
            "Drugs", // 296

            "baş", // 297
            "kollar", // 298
            "göbek", // 299
            "bacaklar", // 300

            "Dağ", // 301
            "Bahç", // 302
            "Dükkan  #2", // 303
            "Mezar", // 304
            "Shelters", // 305
            "Mezarlık", // 306
            "Plaj", // 307
            "Sağlık", // 306
            "Enerji", // 307
            "içmek", // 310
            "yemek", // 311
            "iyileşmek", // 312
            "keşfetmek", // 313
            "Mined mine", // 314
            "Mine girişi, işçilik olmadan, başlangıçta açıldı.", // 315
            "Ekstra harita parçaları", // 316
            "Şömine", // 317
            "Otel rezervasyonu yap", // 318
            "Stok", //319
            "Ödül", //320
            "Uranyum", // 321
            "Kapılar kapalı (mavi tuşa ihtiyacım var) ", // 322
            "Mavi tuş", // 323
            "Daha fazla konum", // 324
            "Oyunu 2 adet rastgele ekstra harita ile başlatın!", // 325
            "Kapı kesici", // 326
            "Oyunu tüm tuşlarla başlatın!", // 327
            "Gezinme ustası", // 328
            "Oyunu tüm ekstra harita parçaları ile başlat", // 329
            "Kötü Kardan Adam Geri Geldi :(", // 330
            "Kirlilik ölçer bozuldu", // 331
            "Duş almalıyız! Kirli suyu kullanalım.", // 332
            "Kapı", // 333
            "Zehir", // 334

            "966 Gommi Blueberries", //335
            "Oyunu 966 Gommi Blueberries ile başlatın.", // 336
            "Blobby the slime", //337
            "Oyunu Blobby ile başlat.", //338
            "Dodge the dog", //339
            "Oyunu köpeğiyle başlat! (Bir köpek evine sahip olmalısın).", //340
            "Arkadaşlar", // 341
            "Özelleştir", // 342
            "Ekstra", //343
            "Gaz kaçağı ve ateş ...", // 344
            "Başlangıç paketi", // 345
            "Oyunu ekstradan başla: su, yemek, odun, demir ve patates!", // 346
            "Yarın havalar güzel olacak ...", // 347
            "Yarın soğuk ve rüzgarlı olacak ...", // 348
            "Yarın yağmur bize saldıracak ...", // 349


            "Sen, öleceksin, ölecek ...", // 350
            "Yardıma ihtiyacımız var!", // 351
            "Trapdoor bozuk, tamir etmeliyiz.", // 352
            "Su bitkileri", // 353
            "Duş", // 354
            "Zayıf", // 355
            "Glitch modu", // 356
            "Hayatta kalacak mısın? Her yerde aksaklık ... Oyunu tekrar normale dön!", // 357

            "Deprem!", // 358
            "Ne kaydetmek istiyorsun", // 359

            "Ben !? Nasıl mümkün olabilir?", // 360
            "Saldırganlar her yerdeler!", // 361
            "Oda", // 362
            "Bahçe", // 363
            "Bodrum", // 364
            "Dergi", // 365

            "Kasırga geliyor!", // 366
            "Tic Tac shut up", // 367
            "Saatleri yavaşlatır!", // 368
            "Hava filtresi", // 369
            "Hava filtresini tamir etmeliyiz!", // 370
            "Cula", // 371
            "çorba", //372
            "İskelet", // 373
            "Doge canlandı", // 374
            "Ölü bir köpeği canlandır!", // 375
            "Dışarı çıkmak için bir uzay roketi yapmalıyız ya da dışarıdaki diğer canlılara yardım etmeliyiz. Oğlunun telefonuna da yardımcı olabiliriz. Lütfen otobüsün ne zaman geleceğini kontrol edin.", // 376
            "Asker bize radyoyu ne zaman kapının açılacağını ve gece ışık sinyali vereceğini söylemeli.", // 377
            "Martha", // 378

            "Hayır! Martha öldü ...", // 379
            "Martha hasta. Biz onu iyileştirmeliyiz!", // 380
            "Gizle", // 381
            "Martha'yı kaçırdılar!", // 382

            "Merhaba Martha. Benim adım Frebbie, seni incitmek istemiyorum. Sana yardım etmek istiyorum. Sana harika bir yer göstereceğim ama benim için bir şeyler yapmalısın ...", // 383
            "Lütfen kardeşini öldür. Ben çok kabasın ve seni sevmiyorum ... Gelecek hafta buraya gel.", // 384
            "Kadınları tercih ederim, lütfen babanı öldürün Bob ... Gelecek hafta buraya gel.", // 385
            "Anneni besle ve sula. Güçlü olması gerekiyor ... Gelecek hafta buraya gel.", // 386
            "Alkolü severim, lütfen bir şişe alkol hazırlayın ve gelecek hafta benim için getirin.", // 387
            "Çok teşekkür ederim! Günden sonra buraya gelin:", // 388
            "Gitar", //389
            "POLİS! OPEN!", // 390
            "Biz malzemeleri çaldığınızı biliyoruz! Bize 1 patates ve 1 havuç verin, böylece bunu görmezden geleceğiz.", // 391

            "Belki onlara rüşvet ver", // 392
            "Uhm ... Bizim için çok önemlisin. Senin için geleceğiz:", // 393
            "Kabul", // 394
            "Katılmıyorum", // 395
            "Belki onları vurun", // 396
            "CCTV", //397
            "Güç Kutusu'nu daha önce kullan", // 398
            "Hops", // 399
            "Bira", // 400

            "Kazma",// 401
            "Daha iyi bir kazma", // 402

            "Kömür", // 403
            "Demir Cevheri", // 404
            "Bakır Cevheri", // 405
            "Uranyum Cevheri", // 406
            "Altın Cevheri", // 407
            "doktor", // 408
            "Uranyum kazma", // 409

            "Sarhoş olur", // 410
            "-Sarhoş olur \n-Madencilik enerjisi ekler", // 411
            "Kızarmış patates", // 412
            "Kızarmış balık", // 413

            "Play The Hobo idle Clicker, whole story about the NUKE in Whelylely city and of course Hobo! Real time game!",//414

            "Crowbar", // 415
            "Dükkan soygunu", // 416

            "Innocent Bomb", // 417
            "2000 hasar verir.", // 418

            "giremezler", // 419

            "Mesajlar", // 420
            "GPS", // 421
            "Oyun", // 422
            "Snake", //423
            "Filmler", // 424

            "Telefon", // 425
            "Aramak", // 426

            "Merhaba [...] Yani yardıma ihtiyacın var? [...] Hmmmm Seni 3 hafta sonra arayacağım", // 427
            "Merhaba [...] Arkadaşlarımla konuşurum [...] Evet Batı bize saldırdı [...] Sana yardım edebilecek birini biliyorum [...] Carl'ı ara: +48 4392", // 428
            "Merhaba Carl orda [...] Ahh, John ile konuşuyorsun [...] Dünya tahrip olmuş ama güvenli yerler var. Askerlik çağırın: 112112", // 429
            "Merhaba [...] Carl'dan geliyorsunuz. [...] Anladım. 6 şişe Alkol ve 2 Bira hazırlayın. Sonra sizi kurtarırız: ", // 430

            "Kirli giysiler", // 431
            "Aile her gün daha önce satın alınmış rastgele kıyafetler giydiriyor.", // 432
            "Telefon şarj cihazı", // 433

            "Mantarlar", // 434
            "Çalar saat", // 435

            "Merhaba insan. Size bir harikalar diyarı, savaşlar ve saldırganlık olmadan daha iyi bir kelime gösterebilirim.", // 436
            "Orada alkol kullanamayız, bu yüzden biraz susadım.", // 437
            "Her 20 günde bir bira ve 1 votka şişesi için geleceğim.", // 438
            "4 kez geleceğim. Var mısın?\n\n\nEvet       yok hayır", // 439
            "Teşekkür ederim! Önümüzdeki 20 gün boyunca hoşçakal.", // 440
            "Alkol yok, kurtarma yok ... Sonsuza dek elveda.", // 441
            "Et", // 442
            "Fırınlanmış et", // 443
            "Bombaları Bırak!", // 444
            "Oyuna bombardıman olarak başla! Ekstra stil puanları kazanmak için hedeflere vur!", // 445
            "Kedi öldürdü:", // 446
            "Martha'nın kötü bir rüyası vardı ... Saklanması gerektiğinde çok korkuyor.", // 447
            "Pirinç", //448
            "Tutkal", // 449

            "Çiftçi", // 450
            "Oyuna tüm tohumlarla başla.", // 451

            "Elma ağacı", // 452
            "Elma", // 453

            "Yarın daha fazla enerji geri kazanımın var!", // 454
            "elma suyu", //455

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

            "Daha fazlası:",//481
            "Kahve", // 482
            "Kahve çekirdeği", // 483
            "Enerjiyi geri kazanır", // 484

            "Coronavirus", // 485
            "COVID-19 ile hayatta kalmaya çalışın! Alkol yardımcı olur!", // 486

            "Şarkılarınızı buraya yapıştırın", // 487
            "Depolama alanına erişim izni verin", // 488

            "Hobo bizi. Bununla birţeyler yapabilir misin? ... Öldürün, sonra daha fazla konuţuruz.", // 489
            "Enerjiye ihtiyacımız var! Bize 5 bardak kahve getir.", // 490
            "Kırık bir şey var. 3 sigorta atmış. Bize yeni bir tane verebilir misiniz?", // 491
            "Sıçanlar bazı telleri yok etti. Kapıyı açmak için 6 yeni kabloya ihtiyacımız var.", // 492
            "Kapıyı güçlendirmek için 10 uranyum parçasına ihtiyacımız var.", // 493
            "Kapı her pazar açılıyor!", // 494

            "Purple Power", // 495
            "Tüm yaralanmaları iyileştir", // 496

            "Valiant Heart", // 497
            "İntihar yok.",// 498

            "<tıkla>", // 499
            "<kaydırın>", // 500
            "Malzemeler hayatta kalmak için en önemli şeydir. Onları takip etmeyi unutmayın.", // 501
            "Parmağınızı kaydırarak odayı veya dışarıdaki bazı yerleri değiştirebilirsiniz", // 502
            "Dokunarak / tıklayarak kontrol edebileceğiniz birçok başka öğe var.", // 503
            "Ertesi gün uyumak için uyu.", // 504
            "Ahmet'in durumunu kontrol edelim. Ona tıkla ve ona bir içki ver!", // 505
            "Aile üyelerini takip etmek önemlidir. Oh bir bitkiye bakın ... onu çöpe götürün!", // 506
            "Bazı eylemlerin uykuya ihtiyacı var, hadi bir patates ekip ertesi güne gidelim.", // 507
            "Trapdoor çok önemli, eğer birisi vuruyorsa düşman ya da yardımcı olabilir, kendi durumu da var.", // 508
            "Kapak kapısını açmayı riske atabilir veya orada kimlerin örneğin iksirle olduğunu kontrol edebilirsiniz.", // 509
            "İksir yarat: PissVision ve iç.", // 510
            "Bakın! Yardımcıları! Kapıyı güvenle açabilirsiniz.", // 511
            "Tüm aile üyelerine yiyecek ve içecek verme zamanı.", // 512
            "Patatesleri sulayalım.", // 513
            "Çöpü dışarı çıkarmak önemlidir. Bahçeye gidin.", // 514
            "Birini erzak için keşif seferine gönderme zamanı. Bir haritamız var, hadi şehre gidelim.", // 515
            "Radyasyonun YÜKSEK olup olmadığını kontrol edin, keşif size bir gaz maskesine mal olur.", // 516
            "Su ve yemek paketini alın.", // 517
            "Tamam, temel şeyleri biliyorsun, şimdi oyuna başlayabilirsin. Günlüğü oku ve beynini kullan! Herkesi öldür.", // 518

            "Trash killer", // 519
            "Başlangıçta çöp canavarları için güçlü bir zehir var.", //520

            "Kör", // 521
            "Lamba olmadan oynamaya çalışın.", // 522

            "Suyunu çalacağım!", // 523
            "Ekmek", // 524
    };

    public static final String credits = "Çeviri: -Bersis\n-Yaşar Cahangirli\n-Kemal Atakan Kırca";
}
