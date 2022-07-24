package com.pokulan.aliveinshelter;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

/**
 * Created by Wojtek on 2017-03-26.
 */
public class Chinese {
    public static final BitmapFont czcionka = new BitmapFont(Gdx.files.internal("chinese.png.fnt"));
    public static final String TEXT[] ={
            "新的遊戲", //1
            "繼續遊戲", //2
            "統計", //3
            "遊戲開始時收集物品失敗次數", //4
            "失敗的遊戲", //5
            "成功活下來的次數", //6
            "已開始的遊戲次數", //7
            "兒子死亡次數", //8
            "未完成的遊戲", //9
            "最長的生存天數", //10

            "Bob! 趕快, \n 盡可能收集有用的物資 \n     我在地下室等你\n              Katrin", //11

            "Bob死了，真令人沮喪。", //12
            "Ben死了，為什麼要是他呢?", //13
            "Katrin 死了，再也沒有熟悉的嘮叨。", //14
            "Bob 病了，吃藥不能停。", //15
            "Ben 發高燒，他病得挺嚴重的。", //16
            "Katrin 說她身體不舒服，應該是病了。", //17
            "Bob 離開了也有一段時間了……", //18
            "Ben 不會有回來的力氣。", //19
            "Katrin 下落不明。", //20

            "我們都病了，真倒楣。", //21
            "雨下得很大，我們這裡開始漏水了。", //22
            "某個該死的傢伙倒撒了0.25l的水。", //23
            "0.2kg的食物腐壞了。", //24
            "沒電了，這裡伸手不見五指，去打開門或者用手電筒。", //25
            "Ben 無法承受所發生的一切。", //26

            "無線電終於修好了。", //27
            "防毒面具被修好了。", //28
            "無線電居然又壞了，這什麼質量啊！", //29

            "我們必須清理掉那些噁心的垃圾，否則黴菌會把我們染病。", //30
            "我們給了燈光信號給軍隊，希望我們盡快獲救。", //31
            "我們失去了手電筒。", //32
            "我們偷了一個手電筒。", //33
            "我們偷了一個防毒面具。", //34
            "我們失去了一把斧頭。", //35
            "下次我們可能需要和他們交易。", //36
            "交易成功！", //37
            "心肺復甦成功，他成功得活下來了。", //38
            " 不能這樣死掉，開始心肺復甦 \n 快速點擊屏幕。", //39

            "生存需要手速快\n   你太慢了", //40
            "我的遊戲", //41
            "請各位在外面給一個燈光信號我們，謝謝。", //42

            "Bob", //43
            "Ben", //44
            "Katrin", //45
            "飢餓值", //46
            "口渴值", //47
            "疲勞", //48
            "醉", //49

            "床墊，開始新的一天", //50
            "噁心的垃圾", //51
            "噁！這什麼垃圾怪物？", //52
            "我們能吃這個怪東西嗎？", //53
            "打牌是為了消遣", //54
            "聯繫軍隊用的無線電", //55
            "空氣質素: ", //56
            "極差", //57
            "好", //58
            "巨大的地圖", //58
            "鋒利的斧頭", //59
            "防毒面具，耐久:", //60
            "工具:", //61
            "醫藥箱:", //62
            "普通手電筒", //63
            "罐裝食物", //64
            "純淨水", //65
            "汽油", //66

            "你想交換物品嗎？", //67
            "嘿嘿，我有好東西你要不要？ ", //68
            "敲門聲？來者是？", //69
            "外面有雜聲？什麼東西？", //70
            "看來軍隊的空降資源到了", //71
            "外面是死一般的寂靜...", //72

            "沒有任何收獲，Ben \nwill 不會回來...", //73
            "沒有任何收獲 ，Bob \nwill 不會回來...", //74
            "沒有任何收獲， Katrin \nwill 不會回來", //75

            " 嗨，朋友\n" +
                    "你應該很清楚現在這裡的狀況\n" +
                    "我們被人炸了整個城市，政府\n" +
                    "却絲毫沒有要救人的意思。\n" +
                    "不要相信他們，你可和我們一起\n" +
                    "下一個雙數天，來這裡拿物資。\n" +
                    "然後接下來的雙數天你可以去樹林\n" +
                    "     找我們，我們會助你生存。", //76
            "那些人真有趣[?]...", //77
            "滾出去，你不是\n" +
                    "  和我們一起的!", //78

            "箱子里空空如也。", //79
            "找到了一些工具。", //80
            "我們找到了質素儀。", //81
            "我們找到了卡牌。", //82
            "我們找到了一把斧頭", //83
            "我們找到了防毒面具", //84
            "我們找到了手電筒", //85
            "我們找到了一台無線電!", //86
            "我們找到了醫藥箱", //87
            "我們找到了汽油", //88

            "碗", //89
            "馬鈴薯", //90
            "酒精", //91
            "火爐，讓這個地下室添加一份暖意", //92
            "老舊蒸餾器", //93
            "桶", //94
            "冰河世紀?...", //95
            "時間飛逝，這裡真悶阿...", //96

            "老遊民", //97
            "Blobby有時候很兇", //98
            "火爐", // 100
            " 變異植物",//101

            "你活下來了...", // 102
            "所有人都死了...", // 103
            "被人攻擊至死...", // 104
            "回到菜單", // 105
            "我們被偷襲了", // 106
            "有人幫助了我們 ，他們給了我們馬鈴薯和地圖。", // 107
            "我們撿到了空降資源", // 108
            "天", // 109
            "天", //110
            "往左揮",//111
            "東北機場",//112
            "他們會救我們的，馬鈴薯 +1.",//113
            "也許下次他會跟著我們",//114
            "我們失去了地圖...", // 115
            "地下室\n     模式", // 116
            "槍", // 117
            "彈藥", // 118
            "廚子", // 119
            "髒水", // 120
            "過濾器", // 121
            "配電箱", // 122

            "木材", // 123
            "廢鐵", // 124
            "工作桌", // 125
            "肥料", // 126
            "黏液", // 127
            "高清1080p大電視", // 128

            "火箭", // 129
            "火箭燃料", // 130
            "地洞", // 131
            "祭壇", // 132
            "身體狀態", // 133
            "閥", // 134
            "雜物:", // 135
            "銅", // 136
            "電絲", // 137
            "電線", // 138
            "礦工", // 139
            "蝙蝠", // 140
            "南方墓地鑰匙", // 141

            "鏟子", // 142
            "墳墓", // 142
            "心臟", // 144
            "殭屍", // 145

            "簡單", // 146
            "困難", // 147
            "壕溝陷阱", // 148
            "垃圾鴿", // 149
            "木屋銀鑰匙", // 150

            "狗狗", // 141
            "狗窩", // 152
            "狗狗死了", // 153
            "黃金", // 154
            "24k黃金", // 155
            "腳踏車，耐久: " ,// 156
            "Ben無法面對\n" +
                    "所發生的一切。", //157
            "Katrin 無法接受\n" +
                    "所發生的一切。", //`58
            "木橋", // 159
            "木筏", // 160
            "釣魚", // 161
            "魚", // 162
            "野生樹莓", // 163
            "野樹莓汁", // 164
            "減少疲勞", // 165
            "魚莓汁", // 166
            "把疲勞和水分減少至 25%", // 167
            "草藻汁", // 168
            "長時間的探索縮短至一天", // 169
            "釀造坊", //170
            "中等水平", //171
            "透視藥水", // 172
            "讓你在12天只內知道外面敲門者是誰", //173
            "救命", //174
            "攻擊者", //175
            "攻擊", //176
            "防禦", //177
            "馬鈴薯蓉", // 178
            "補滿所有的防禦值", // 179

            "骨頭", // 180
            "無線電", // 181
            "桌布", // 182
            "不死靈魂", // 183
            "無辜靈魂", // 184
            "腐魚汁（武器）", //185
            "造成10000點傷害", //186
            "冤枉液", // 187
            "增加4000點防禦值（戰鬥中使用）", // 188

            "不癒藥水", // 189
            "即使你在戰鬥中逃跑怪物也不會下一次被治癒", // 190
            "暴擊藥水", // 191
            "造成兩倍傷害", // 192
            "拳擊袋", // 193
            "擴音器", // 194
            "人質, 繩子耐久:", // 195
            "人質, 給軍隊的訊息。", // 196
            "我們有十個人質，救救我們! \nGdansk, Legendy 53", // 197
            "發送訊息", // 198
            "我們會救你們的\nDay: ", // 199
            "忍術藥水", //200
            "五天內可以避開外面的怪物", //201
            "毛毯", //201
            "小丑？", //203
            "破車", //204
            "汽車零件", //205
            "彈弓", //206
            "雞", //207

            "牆上的怪植物迅速生長", //208
            "沒水了啊啊啊", //209
            "吃的就要沒了，我不想餓死啊", //210
            "也許我們應該給軍隊燈光訊號，這樣他們就能找到我", //211
            "我們不能坐着等死，我們必須展開生存行動", //212

            "新手教學\n呼，終於在千鈞一髮之際跳進了地下室，這裡雖然有點陳舊，不過好在還能住 ，在這樣的關頭這裡也算是溫馨的了。眼前的老舊的火爐，生銹的蒸餾機，和 塵封的雜物很熟悉。（左/右掃屏幕以切換房間）點擊物品來了解它的用途，點 擊人物來了解他們的狀態和安排外出探索，點擊綠色的床墊來睡覺，開始新的一天。", //213
            "新手教學\n大多數的事情會在你睡覺後發生並完成，比如酒會在睡覺後蒸好，火爐會在睡 " +
                    "覺後點燃，物品被維修好等，前提是你有在睡覺前安排好這些事。閱讀此日記 " +
                    "以了解完成的事。 " +
                    "你的板門非常重要，你可以選擇出去花園倒垃圾，挖壕溝等，你還可以在外面 " +
                    "有動靜時開門，不過是福是禍沒人知道。", //214
            "新手教學\n點擊無線電來獲得軍隊的資訊，有時候會沒訊號不過也有可能軍隊會叫你發送 " +
                    "一個燈光信號，若想發訊號，在當天開門，前提是你有光源（手電筒或燃料 " +
                    "）。發幾次信號後軍隊會確認你的位置和告訴你什麼時候去機場逃脫。這不是 " +
                    "唯一的結局，你若成功軍隊結局就可試試以下結局。 " +
                    "•邪教結局 •GPS結局 •機場燈塔結局 •外星人結局 •遊民結局 •挾持人質結局 " +
                    "•BOSS結局 •船結局 •汽車結局 •最難的火箭結局", //215
            "新手教學\n記得分配食物和水給他們否則他們會死，若需要更多的水和食物，就出去探索 " +
                    "拿物資，你可以在人物面版上派他們出去探索（鞋子圖案），記得在空氣差的 " +
                    "時候帶上防毒面具和外出前把他喂飽，否則他可能死在半路上。你可以在質素 " +
                    "表上知道空氣狀況，還有不要忘記拿地圖。南方的探索需要兩天時間完成。", //216
            "新手教學\n如果你失去了地圖，你可以在敲門示好的人身上借到地圖或者用質素表交換， " +
                    "記得在碗里種馬鈴薯，馬鈴薯是遊戲里的貨幣。", //217
            "新手教學\n這遊戲可一點都不容易，嘗試一些沒選過的選擇，加入邪教，馴養狗狗等的事 " +
                    "情都會影響到故事發展，賺金幣來解鎖一些特別的物品（強烈建議買工作桌先 " +
                    "），教學到此結束，自己探索剩下來的事情，祝你好運-Pokulan", //217

            "金幣倍率",//218
            "斧頭", // 220
            "棒", // 221
            "手裡劍", // 222
            "惡夢", // 223
            "蘿蔔", // 224
            "AlcoMist", // 225
            "使敵人減弱30％。", // 226

            "泰迪熊", // 227
            "階梯", // 228
            "你喜歡\n Alive In Shelter?\n    給我評分!", // 229
            "機場", // 230
            "森林", // 231
            "核災便利店", // 232
            "往南邊密林", // 233
            "記得: ", // 234
            "救援巴士: ", // 235
            "聖誕老人\n", // 236
            "我需要幫助。 你沒有聖誕裝飾品，所以不用謝謝。", // 236
            "小心！ 火！", // 237
            "滅火器", // 239
            "雪人殺了我們", // 240
            "雪人殺手", // 241

            "1939年土豆", // 242
            "用1939年土豆開始遊戲.", // 243
            "只有8s挑戰", // 244
            "你只有8秒收集部分.", // 245
            "只有食物和水", // 246
            "只用3升水和2公斤食物開始遊戲.", // 247
            "只有女人！", // 248
            "只和她玩.", // 249
            "冬天來了", // 250
            "總是冷風.", // 251
            "隨機", // 252
            "用隨機物品開始遊戲.", // 253
            "BenHulk", // 254
            "用變異的Ben開始遊戲.", // 255
            "植物後衛", // 256
            "植物可以幫助你保護你的庇護所.", // 257
            "Danse macabre", // 258
            "人物死後6天恢復生機.", // 259
            "沒有僧侶", // 260
            "沒有僧侶！", // 261
            "外面的安全", // 262
            "總是低輻射.", // 263
            "額外蝙蝠s", // 264
            "蝙蝠發生了變異。 他們帶來了Blooby.", // 265
            "沒有出口", // 266
            "沒有陷門.", // 267
            "經典模式", // 268
            "在古典模式中玩 - 舊時代。 只有一個房間等.", // 269
            "沙盒模式", // 270
            "在沙盒模式下玩，做你想做的!", // 271
            "沒有更多這些傢伙", // 272
            "沒有蝙蝠，雪人和Pennywhistle播放。", // 273
            "RPG", // 274
            "賺取經驗值和字符級別。", // 275

            "水平", // 276
            "下一級", // 277
            "點", // 278

            "每日獎金", // 279
            "每週獎金", // 280
            "I am an indie game developer I spend my free time improving this game. If you want you can help me donating me = buying a premium. You will unlock all DLC items, all shelter items for 0 coins, renaming characters, remembered position and remove all ads. Thanks :)", // 281
            "分享", // 282
            "加了我", // 283
            "朋友鄰居", // 284

            "玩死亡競賽 - 贏得更長的時間！", // 285
            "等待接受", // 286
            "邀請匹配", // 287
            " 永遠死去...", // 288
            "死亡競賽獲勝:", // 289
            "CleanBerry", // 290
            "清洗乾淨家人。", // 290
            "\"Gommi\" 村", // 292
            "\"我們會給你一個收容所。\"", // 293
            "Weed", // 294
            "Dildo", // 295
            "Drugs", // 296

            "頭", // 297
            "手臂", // 298
            "肚子", // 299
            "腿", // 300

            "山", // 301
            "庭院", // 302
            "商 #2", // 303
            "墓", // 304
            "避難所", // 305
            "墓地", // 306
            "海灘", // 307
            "健康", // 306
            "能源", // 307
            "喝", // 310
            "吃", // 311
            "痊癒", // 312
            "出去", // 313
            "Mined mine", // 314
            "我的進入在開始時打開，沒有製造.", // 315
            "額外的地圖片", // 316
            "火的地方", // 317
            "預定一間旅館", // 318
            "股票", //319
            "獎品", //320
            "鈾", // 321
            "門關閉了（我需要一個藍色鑰匙）", // 322
            "藍色鑰匙", // 323
            "更多地點", // 324
            "用2張隨機附加地圖開始遊戲!", // 325
            "門禁", // 326
            "用所有鍵開始遊戲！", // 327
            "探險大師", // 328
            "用所有額外的地圖部分開始遊戲", // 329
            "壞雪人回來了:(", // 330
            "污染計被打破。", // 331
            "我們必須洗澡！讓我們用髒水。", // 332
            "門",// 333
            "毒藥",// 334

            "966 Gommi Blueberries", //335
            "用966 Gommi藍莓開始遊戲。", //336
            "Blobby the slime", //337
            "用Blobby開始遊戲。", //338
            "Dodge the dog", //339
            "用狗開始遊戲！（你必須有一間狗屋）", //340
            "朋友", // 341
            "自定義", // 342
            "額外", //343
            "煤氣洩漏和火災...", // 344
            "入門包", //345
            "以額外的開始遊戲：水，食物，木頭，鐵和土豆！", //346
            "明天將是好天氣...", //347
            "明天將是寒冷多風的...", //348
            "明天下雨會襲擊我們...", //349

            "你，會全部死去......", //350
            "我們需要幫助！請！", //351
            "暗門壞了，我們必須修理它。", //352
            "水草", //353
            "淋浴", //354
            "弱", // 355
            "毛刺模式", // 356
            "你會活下來嗎？無處不在的問題......重新開始遊戲恢復正常！", // 357

            "地震！", // 358
            "抓住你想要保存的東西", // 359
            "Ben!? ？怎麼可能？", //360
            "攻擊者無處不在！", //361
            "房間", //362
            "花園", //363
            "地下室”", //364
            "雜誌", //365
            "颶風來了!!!", // 366
            "Tic Tac shut up", // 367
            "減慢時鐘速度！", //368
            "空氣過濾器", // 369
            "我們必須修理空氣過濾器！", //370
            "Cula", // 371
            "湯", //372
            "骷髏", // 373
            "Doge revive", // 374
            "復活一隻死狗！", // 375
            "我們必須建造一個太空火箭才能離開，或者從外面尋求其他一些生物的幫助。兒子的手機也許也很有用。請在公共汽車到達時檢查一下。", // 376
            "軍方應該通過收音機告訴我們何時打開活板門，並在夜間給他們發光信號。",// 377
            "Martha", // 378

            "不！Martha 死了...",// 379
            "Martha 病了。我們需要治愈她！",// 380
            "隱藏",// 381
            "他們綁架了 Martha ！",// 382

            "你好Martha。我的名字是弗雷比，我不想傷害你。我想幫助你。我會告訴你一個很棒的地方，但你需要為我做點什麼......",// 383
            "請殺死你的兄弟。本是如此粗魯，不愛你......下週回到這裡。",// 384
            "我喜歡女性，所以請殺死你的父親鮑勃......下週回到這裡。",// 385
            "給母親餵水和餵水。她需要堅強......下週回到這裡。",// 386
            "我喜歡喝酒，請下週喝一瓶酒，然後帶給我。",// 387
            "非常感謝你！白天回到這裡：",// 388
            "吉他", //389
            "警察！打開！",// 390
            "我們知道你偷了用品！給我們一個土豆和一個胡蘿蔔，所以我們會忽略它。",// 391
            "也許給他們賄賂？",// 392
            "嗯......你對我們非常重要。我們會為你而來：",// 393
            "同意",// 394
            "不同意",// 395
            "也許拍攝他們？",// 396
            "CCTV", //397
            "之前使用\"配電箱\"。",// 398

            "Hop",// 399
            "啤酒",// 400

            "鶴嘴鋤",// 401
            "一個硬鎬", // 402
            "煤炭",// 403
            "鐵礦石",// 404
            "銅礦",// 405
            "鈾礦石",// 406
            "金礦",// 407
            "醫生", //408
            "鈾鎬",// 409
            " - 喝醉了",// 410
            " - 喝醉了\n-增加採礦能量",// 411
            "烤土豆",// 412
            "烤魚",// 413

            "播放Hobo閒置的Clicker，關於NUKE在“Whelylely”城市的整個故事，當然還有Hobo！ 實時遊戲！",//414

            "撬棍",// 415
            "搶劫商店",// 416

            "Innocent Bomb", // 417
            "造成 2000 點傷害", // 418

            "他們不能進去",// 419

            "消息", // 420
            "GPS", // 421
            "遊戲", // 422
            "Snake", //423
            "電影", // 424

            "電話”",// 425
            "呼喚",// 426

            "你好[...]所以你需要幫助？[...]嗯，我會在3週後給你回電話",// 427
            "嗨[...]我和朋友們交談[...]是的西方襲擊了我們[...]我知道有人可以幫助你[...]致電卡爾：+48 4392再見！",// 428
            "你好卡爾那裡[...]啊，你跟約翰說話[...]地球被毀了但是有安全的地方。打電話給軍隊：112112",// 429
            "你好[...]噢，你來自卡爾[...]我理解。準備6瓶酒精和2瓶啤酒。然後我們將拯救你的一天： ",// 430

            "髒衣服",// 431
            "這個家庭每天都穿著以前買過的隨意衣服。",// 432
            "手機充電器",// 433
            "蘑菇",// 434
            "鬧鐘",// 435

            "嗨人類。 我可以向你展示一個仙境，沒有戰爭和侵略的更好的詞彙。", // 436
            "我們不能在那裡使用任何酒精，所以我有點口渴。", // 437
            "我將每隔20天到那裡喝1杯啤酒和1瓶伏特加酒。", // 438
            "我會來4次。 你在嗎？\n \n \n是的          不是", // 439
            "謝謝！ 再見20天。", // 440
            "沒有酒精，沒有救援......永遠再見。", // 441
            "肉",// 442
            "焗肉",// 443
            "投下炸彈！",// 444
            "將游戲作為轟炸機開始！擊中目標以獲得額外的風格點！",// 445
            "貓被殺死：",// 446
            "Martha做了一個噩夢……當她需要隱藏時，她是如此的害怕。",// 447
            "白飯", //448
            "膠", // 449

            "農民",// 450
            "以所有種子開始遊戲。",// 451


            "蘋果樹",// 452
            "蘋果",// 453

            "明天您將獲得更多的能量回收！", // 454
            "蘋果酒", //455

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

            "每更多:", //481
            "咖啡",// 482
            "咖啡種子",// 483
            "恢復能量",// 484

            "Coronavirus", // 485
            "嘗試與COVID-19一起生存！ 酒精有幫助！", // 486

            "將歌曲粘貼到那裡", // 487
            "授予設置訪問存儲的權限", // 488

            "流浪漢搶了我們。 你能做點什麼？...殺了他，然後我們再談。", // 489
            "我們需要能量！ 給我們帶來5杯咖啡。", // 490
            "有東西壞了。 3保險絲燒斷。 你能給我們新的嗎？", // 491
            "老鼠破壞了一些電線。 要打開門，我們需要6條新導線。", // 492
            "要給門通電，我們需要10枚鈾。", // 493
            "大門每個星期天開放！", // 494

            "Purple Power", // 495
            "醫好一切傷", // 496

            "Valiant Heart", // 497
            "沒有自殺。",// 498


            "<click>",// 499
            "<swipe>",// 500
            "供應是生存中最重要的。記住要追踪它們。",// 501
            "您可以用手指滑動來更改房間或外面的某些位置",// 502
            "還有許多其他項目，您可以通過觸摸/單擊進行檢查。",// 503
            "睡覺去第二天。",// 504
            "讓我們檢查鮑勃的狀況。點擊他，給他喝一杯！",// 505
            "跟踪家人非常重要。哦，看看植物……將其移到垃圾桶！",// 506
            "有些動作需要睡覺，讓我們種一個土豆然後再去第二天。",// 507
            "活板門非常重要，如果有人敲門，它可能是敵人還是幫手，它也有自己的條件。",// 508
            "您可以冒著打開活板門或使用藥水來檢查誰的風險。",// 509
            "創建藥水：PissVision並飲用。",// 510
            "看！助手！您可以安全地打開活板門。",// 511
            "是時候給所有家庭成員食物和飲料了。",// 512
            "讓我們把土豆澆水。",// 513
            "重要的是移出垃圾桶。去花園。",// 514
            "是時候該派人去尋找補給了。我們有一張地圖，所以我們去城市吧。",// 515
            "檢查輻射是否很高，否則探險將花費您一個防毒面具。",// 516
            "拿水和食物包。",// 517
            "好，你知道基本的知識，現在你可以開始遊戲了。讀日記，用腦子！殺死所有人。",// 518

            "Trash killer", // 519
            "剛開始時，垃圾怪物有很強的毒藥。", //520

            "盲", // 521
            "嘗試不帶燈玩。", // 522

            "我會偷你的水！”",// 523

            "麵包",// 524

            "我的名字叫Srak。請幫我解決這個麻煩。給我一張桌布。我會給你一些土豆，收音機和汽油。",// 525
            "Ammunition keeper", // 526
            "用彈藥開始遊戲！", // 527
            "長按購買", // 528

            "今天天氣酷熱，我們今天必須喝更多！", // 529
            "你好！ 我叫天光。 可以給我的手電筒充電嗎？ 我總是在星期天在這裡。 我將幫助您交換光信號。 ", // 530

            "土匪", // 531
            "給我們 2L 水，這樣我們就會離開。 如果沒有，那就戰鬥吧！ ", // 532

            "小屋", // 533

            "Food Pack", // 534
            "覆蓋當前保存？", //535

            "盔甲", // 536
            "太陽能板", // 537
            "太阳能电池板坏了。", // 538

            "土豆邮票", // 539
            "我们不再试图帮助你，因为你没有开门。你还活着吗？", //540

    };

    public static final String credits = "翻译:\n-Marco YCH\n-Zin Lu Lin";

}
