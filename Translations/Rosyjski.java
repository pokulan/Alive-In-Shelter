package com.pokulan.aliveinshelter;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

/****************************************
 * Created by Wojtek on 2017-03-11.     *
 * Timur Bagautdinov was here!          *
 * Last correct 2020-13-11 / 30.11.2020 *
 ****************************************/
public class Rosyjski {
    public static final BitmapFont czcionka = new BitmapFont(Gdx.files.internal("czcionka.fnt"));
    public static final String TEXT[] ={
            "Новая игра", //1
            "Продолжить", //2
            "СТАТИСТИКА", //3
            "Провалено подготовок", //4
            "Провалено выживаний", //5
            "Выжито раз", //6
            "Сыграно игр", //7
            "Смертей сына", //8
            "Не завершённых игр", //9
            "Самая длинная игра(в днях)", //10

            "Bob! Быстрее, \n возьми как можно больше\nвещей, всё, что унесешь!\n              Katrin", //11

            "Bob погиб, это печально...", //12
            "Ben погиб, почему он? Почему?..", //1a3
            "Katrin погибла, последняя женщина умерла.", //14
            "Bob заболел, где лекарство?", //15
            "Ben где-то подхватил заразу.", //16
            "Katrin чувствует себя нехорошо.", //17
            "Bobа не слышно уже долгое время.", //18
            "Ben ушел, он больше никогда не вернется.", //19
            "Katrin исчезла навсегда...", //20

            "Чёрт, мы заболели!", //21
            "Дождь льёт как из ведра, наше убежище протекает.", //22
            "Кто-то пролил воду -0.25л.", //23
            "Еда испортилась -0.2кг.", //24
            "Неполадки со светом, придётся включить фонарик или ненадолго приоткрыть люк.", //25
            "Ben не cмог вынести смерть родственников и голод.", //26

            "Наконец-то починили радио!", //27
            "Починили противогаз, почти как новенький!", //28
            "Радио опять сломалось...", //29

            "Тварь из мусорного пакета выглядит опасно, кажется пора его выбросить...", //30
            "Мы дали световой сигнал, может быть это нам поможет...", //31
            "Мы потеряли фонарик.", //32
            "Мы украли фонарик.", //33
            "Мы украли противогаз.", //34
            "Мы потеряли топор.", //35
            "В следующий раз устроим обмен.", //36
            "Мы успешно обменялись.", //37
            "Мы успешно провели реанимацию! ", //38
            " нуждается в реанимации!\nНажимай на сердце быстро!", //39

            "Был слишком\n медленным \nчтобы жить", //40
            "Мои игры", //41
            "Пожалуйста, дайте световой сигнал", //42

            "Bob", //43
            "Ben", //44
            "Katrin", //45
            "Еда", //46
            "Вода", //47
            "усталость", //48
            "опъянение", //49

            "Матрасы = следующий эпичный день", //50
            "Отвратительный мусор", //51
            "Мусорная тварь", //52
            "Это съедобно?", //53
            "Карты для развлечений", //54
            "Радио = связь", //55
            "Уровень радиации: ", //56
            "ВЫСОКИЙ", //57
            "НИЗКИЙ", //58
            "Огромная карта", //58
            "Топор", //59
            "Противогаз, износ", //60
            "Инструменты", //61
            "Аптечка", //62
            "Фонарик", //63
            "Консервы", //64
            "Вода", //65
            "Бензин", //66

            "Снаружи доносится голос: \"Есть кто живой? Я продаю всякий хл... очень полезные вещи.\"", //67
            "Пссс... Не хотите обменяться?", //68
            "Кто-то стучится?", //69
            "Снаружи какой-то шум. Это помощь?", //70
            "Что-то упало на землю", //71
            "Снаружи тихо...", //72

            "Ben не захотел возвращаться домой, потому что дома нету припасов...", //73
            "Bob не захотел возвращаться домой, потому что дома нету припасов...", //74
            "Katrin не захотела возвращаться домой, потому что дома нету припасов...", //75

            "  Привет, как дела, всё\n" +
                    " сейчас довольно сложно.\n" +
                    " Просто не доверяй прави-\n" +
                    " тельству или военным. \n" +
                    " Можешь присоединиться к\n" +
                    " нам, и пойти с нами...\n" +
                    " Раз в 2 дня мы будем\n" +
                    " оставлять припасы\n" +
                    "    здесь для тебя...", //76
            "В лесу мы встретили странных людей...", //77
            " Вы кто такие?!\n" +
                    "  Проваливайте!\n", //78

            "В коробке было пусто.", //79
            "Мы нашли инструменты.", //80
            "Мы нашли счётчик Гейгера.", //81
            "Мы нашли колоду карт.", //82
            "Мы нашли топор.", //83
            "Мы нашли противогаз.", //84
            "Мы нашли фонарик.", //85
            "Мы нашли радио.", //86
            "Мы нашли аптечку.", //87
            "Мы нашли канистру бензина.", //88

            "Грядка", //89
            "Картофель", //90
            "Спирт", //91
            "Печь, не даст нам замерзнуть ночью.", //92
            "Старый перегонный аппарат", //93
            "Ведро", //94
            "На улице похолодало. Зима грядёт?..", //95
            "А время всё идёт и идёт... Сидеть тут достаточно скучно...", //96

            "Бомж", //97
            "Blobby иногда странно булькает!", //98
            "Печь", // 100
            " Растение",//101

            "Мы выжили...", // 102
            "Всё погибли...", // 103
            "Нас ограбили и убили...", // 104
            "Нажмите на экран для выхода в меню", // 105
            "На нас напали.", // 106
            "Нам принесли картошку и новую карту!", // 107
            "Мы подобрали ящик с припасами", // 108
            "День", // 109
            "Дней", //110
            "Двигай влево!",//111
            "Аэропорт",//112
            "Они нам вскоре помогут, Картофель +1.",//113
            "В другой раз мы его поймаем.",//114
            "Мы потеряли карту...", // 115
            "Быстрая игра", // 116
            "Ружьё", // 117
            "Боеприпасы", // 118
            "Повар",// 119
            "Грязная вода", // 120
            "Фильтр", // 121
            "Блок питания", // 121

            "Дерево", // 123
            "Железо", // 124
            "Верстак", // 125
            "Навоз", // 126
            "Слизь", // 127
            "Телевизор", // 128

            "Ракета", // 129
            "Ракетное топливо", // 130
            "Дыра", // 131
            "Алтарь", // 132
            "Состояние", // 133
            "Клапан", // 134
            "Прочее:", // 135
            "Медь", // 136
            "Предохранитель", // 137
            "Провод", // 138
            "Шахтёр", // 139
            "Летучие мыши", // 140
            "Золотой ключ", // 141

            "Лопата", // 142
            "Могила", // 143
            "Сердце", // 144
            "Зомби", // 145

            "Нормально", // 146
            "Сложно", // 147
            "Траншея", // 148
            "Птица", // 149
            "Серебряный ключ", // 150

            "Собака", // 141
            "Собачья будка", // 152
            "Собака погибла", //153
            "Золото", // 154
            "Слиток золота", // 155
            "Велосипед, состояние цепи: ", // 156
            "Bob не cмог вынести смерть\n" +
                    " родственников и голода", //157
            "Katrin не cмогла вынести смерть\n" +
                    " родственников и голода", //158
            "Пирс", // 159
            "Плот", // 160
            "Рыбалка", // 161
            "Рыба", // 162
            "Гомминика", // 162
            "Сок из гомминики", // 164
            "Уменьшает усталость", // 165
            "Ягодная Рыба", // 166
            "Снижает усталость и жажду до 25%", // 167
            "Зелёная Грязь", // 168
            "Длинная экспедиция занимает всего 1 день", // 169
            "Алхимия", //170
            "СРЕДНИЙ", //171
            "МочаЗрение", // 172
            "Позволяет сканировать люк в течение 16 дней", //173
            "помощь", //174
            "разбойники", //175
            "Атака", //176
            "Защита", //177
            "Картофельное Пюре", // 178
            "Восстанавливает очки защиты до 100%", // 179

            "Кости", // 180
            "Радио", // 181
            "Скатерть", // 182
            "Потерянная душа", // 183
            "Невинная душа", // 184
            "Потерянная Рыба", //185
            "Наносит 10000 урона врагу.", //186
            "Невинная Картошка", // 187
            "Восстанавливает 4000 очков защиты", // 188

            "Прорыв", // 189
            "Побег не вылечит монстра", // 190
            "Двойной удар", // 191
            "В 2 раза больше урона", // 192
            "Тренировочная груша", // 193
            "Колонка", // 194
            "Заложники, веревка", // 195

            "Заложники, сообщение для военных", // 196
            "У нас 10 заложников, немедленно вывезите нас! \nГданьск, аллея Легионов 53", // 197
            "Отправить", // 198
            "Условия приняты, мы спасём\nвас в День: ", // 199
            "Коктейль Ниндзя", //200
            "Стелс режим! Монстры не будет нападать на вас 5 дней!", //201
            "Одеяло", //201
            "Пеннисвистл", //203
            "Сломанная машина", //204
            "Автомобильные запчасти", //205
            "Рогатка", //206
            "Курица", //207

            "Растение растет на стене.", //208
            "Вода заканчивается!", //209
            "Еда медленно заканчивается!", //210
            "Мы должны дать военный световой сигнал или найти другой способ выжить.", //211
            "Давайте найдём другой способ выжить, мы не может просто здесь сидеть.", //212

            "[ОБУЧЕНИЕ]\nПривет! Это ваше убежище, по нему можно передвигаться (листни влево/вправо). Нажмите на предметы, чтобы взаимодействовать или узнать, что это такое. Нажав на матрасы снизу (в первой комнате), можно лечь спать и начать новый день.", //213
            "[ОБУЧЕНИЕ]\nВ основном всё, что вы выбираете, отмечаете или делаете, происходит на следующий день. Люк очень важен, через него можно выйти в сад или открыть его, чтобы впустить кого-нибудь или подать световой сигнал. Сверху написаны очки защиты и прочность люка.", //214
            "[ОБУЧЕНИЕ]\nНажмите на радио, чтобы проверить, нужно ли подавать световой сигнал, и если да, то откройте люк. Сделав это несколько раз и тогда, вас спасут военные и вы выиграете игру, и получите одну из концовок. В игре есть много концовок, но их нужно находить самому :D", //215
            "[ОБУЧЕНИЕ]\nНе забывайте кормить персонажей! Чтобы получить новые предметы/ресурсы/припасы, отправляйтесь на вылазку (чтобы персонаж пошёл на вылазку, нажмите на \"сапоги\" в меню персонажа). Не забудьте проверить его статус перед отправкой! Если у нас кончились припасы - персонаж может не вернуться назад.", //216
            "[ОБУЧЕНИЕ]\nЕсли вы после вылазки потеряете карту (значит вы везунчик, в плохом смысле этого слова), к вам может прийти помощь в виде карты и картошки. Вы можете выращивать картошку и прочие растения на грядке, к примеру, на выращенную картошку можно обмениваться и покупать новые ресурсы в магазине (магазин находится на карте).", //217
            "[ОБУЧЕНИЕ]\nЭто непростая игра! Решайте головоломки, пробуйте разные способы и варианты, зарабатывайте монеты, чтобы разблокировать новые предметы или украшать своё убежище. Подсказка: Первым делом откройте верстак! Веселитесь! :) - pokulan", //217
            "Множитель монет",//218
            "Топор", // 220
            "Бита", // 221
            "Сюрикены", // 222
            "Полный ад!", // 223
            "Морковь", // 224
            "Пьянящий Дымок", // 225
            "Делает врага на 30% слабее.", // 226

            "Плюшевый мишка", // 227
            "Лестница", // 228
            "Вам понравилось\n Alive In Shelter?\n   Оцените!", // 229
            "Аэропорт", // 230
            "Лес", // 231
            "Магазин", // 232
            "Идти дальше", // 233
            "Запомнить место: ", // 234
            "Спасательный автобус: ", // 235
            "Дед Мороз", // 236
            "Мне нужна помощь. У вас нет рождественских украшений, поэтому нет, спасибо.", // 236
            "ОГОНЬ! Убежище загорелось!", // 237
            "Огнетушитель", // 239
            "Снеговик постепенно убивает нас.", // 240
            "Снеговик-убийца", // 241
            "1939 картошки", // 242
            "Начните игру с 1939 картошками.", // 243
            "8-ми секундный забег", // 244
            "У вас есть только 8 секунд для сбора припасов.", // 245
            "Только еда и вода", // 246
            "Начните игру только с 3 л. воды и 2 кг. еды.", // 247
            "Только женщины!", // 248
            "Играйте только с Кэтрин.", // 249
            "Зима близко", // 250
            "Всегда морозный ветер.", // 251
            "Случайность", // 252
            "Начните игру со случайными предметами.", // 253
            "Ben-Халк", // 254
            "Начните игру с мутировавшим сыном.", // 255
            "Растение-защитник", // 256
            "Растение на стене помогает защитить ваше убежише.", // 257
            "Пляска смерти", // 258
            "Персонажи возвращаются к жизни через 6 дней после смерти.", // 259
            "Нет монахам", // 260
            "Больше никаких монахов!", // 261
            "Чистота над землёй", // 262
            "Всегда низкое излучение снаружи.", // 263
            "Сверхлетучие мыши!", // 264
            "Летучие мыши мутируют. Они приносят Blobby.", // 265
            "Выхода нет", // 266
            "Люк отсутствует, наружу не выйти.", // 267
            "Классический режим", // 268
            "Играйте в классическом режиме игры, как в старые добрые времена. Только одна комната и т. д.", // 269
            "Режим песочницы", // 270
            "Играйте в режиме песочницы, делайте то, что хотите!", // 271
            "Никакой крипоты!", // 272
            "Играйте без летучих мышей, снеговика и Пеннисвистла.", // 273
            "Режим RPG", // 274
            "Зарабатывайте очки опыта и повышайте уровень персонажей.", // 275

            "Уровень", // 276
            "Следующий уровень", // 277
            "Опыт", // 278

            "Ежедневный бонус", // 279
            "Недельный бонус", // 280
            "Я инди разработчик, и я трачу своё свободное время улучшая и обновляя эту игру. Если вы хотите помочь мне деньгами - купите премиум DLC. Вы откроете все предметы, сможете перименовывать персонажей, запоминать места на карте и убрать всю рекламу! Спасибо :)", // 281
            "Поделиться", // 282
            "в ожидании", // 283
            "Друзья-соседи", // 284

            "Режим Дуэли - самый долгий выживатель побеждает!", // 285
            "Ожидание принятия", // 286
            "Пригласить на состязание", // 287
            " умер навсегда...", // 288
            "Побед в Дуэлях:", // 289
            "Чистящие Ягоды", // 290
            "Очищает членов семьи.", // 290
            "Деревня \"Гомми\"", // 292
            "\"Мы дадим вам кров и приют.\"", // 293
            "Травка", // 294
            "Дилдо", // 295
            "Наркотики", // 296

            "Голова ", // 297
            "Руки ", // 298
            "Живот ", // 299
            "Ноги ", // 300

            "Гора", // 301
            "Парк", // 302
            "Магазин  №2", // 303
            "Гробница", // 304
            "Убежища", // 305
            "Кладбище", // 306
            "Пляж", // 307
            "Здоровье", // 306
            "Энергия", // 307
            "Пить", // 310
            "Есть", // 311
            "Лечить", // 312
            "Выходить", // 313
            "Открытая шахта", // 314
            "Вход в шахту открыт сразу в начале игры", // 315
            "Новые места на карте", // 316
            "Костёр", // 317
            "Забронировать номер в отеле", // 318
            "В наличии", //319
            "Цена", //320
            "Уран", // 321
            "Дверь закрыта (нужен синий ключ)", // 322
            "Синий ключ", // 323
            "Больше мест", // 324
            "Начните игру с 2-умя случайными частями карты!", // 325
            "Взломщик замков", // 326
            "Начните игру со всеми тремя ключами!", // 327
            "Мастер экспедиций", // 328
            "Начните игру со всеми дополнительными частями карты!", // 329
            "Плохой снеговик вернулся :(", // 330
            "Счётчик Гейгера сломался.", // 331
            "Мы должны принять душ! Давайте используем грязную воду.", // 332
            "Люк", // 333
            "Яд", // 334

            "966 Гомминики", //335
            "Начните игру с 966 Гомминикой.", //336
            "Blobby-слизень", //337
            "Начните игру с Blobby.", //338
            "Лучший друг человека", //339
            "Начните игру с собакой!(Но вы должны иметь будку для собаки)", //340
            "Друзья", // 341
            "Декорации", // 342
            "Разное", //343
            "Утечка газа + пожар = КАБУМ!", // 344
            "Стартовый набор", //345
            "Начните игру с большим количеством воды, еды, дерева, железа и картофеля!", //346
            "Завтра будет хорошая погода...", //347
            "Завтра будет мороз и ветер...", //348
            "Завтра весь день будет дождь...", //349

            "Выы всее умрётеее...", //350
            "Нам нужна помощь! Пожалуйстаааа!", //351
            "Люк сломан, мы должны его починить.", //352
            "Полить растения", //353
            "Душ", //354
            "Легко", // 355
            "Режим глюков", // 356
            "Глюки, глюки повсюду... Выживете ли вы? Перезапустите игру, чтобы вернуть нормальный режим игры!", // 357
            "Землетрясение!", // 358
            "Какие вещи мы сможем спасти?", // 359
            "Ben!? Как это возможно?", //360
            "Разбойники повсюду!", //361
            "Комната", //362
            "Сад", //363
            "Шахта", //364
            "Кладовка", //365
            "Ураган идет!!!", // 366
            "Тик так, заткнись!", // 367
            "Замедляет часы! И наступление следующего дня.", // 368
            "Воздушный фильтр", // 369
            "Мы должны отремонтировать воздушный фильтр!", //370
            "Кула", // 371
            "Суп", //372
            "Скелет", // 373
            "Собачья Настойка", // 374
            "Возродите мертвую собаку!", // 375
            "Мы можем построить космическую ракету, чтобы отправится на луну. Или попросить помощи у существ снаружи. Телефон сына может быть полезен. Также стоит проверить, когда прибудет спасательный автобус.", // 376
            "Военные должны сказать нам по радио, когда нужно открыть люк и ночью дать им световой сигнал.", // 377
            "Martha", // 378

            "Нет, Martha умерла...", // 379
            "Martha больна, нам нужно ее вылечить!", // 380
            "Спрятать", // 381
            "Martha пропала! Её похитили!", // 382

            "Привет, Martha, меня зовут Фребби, я не хочу причинять тебе боль. Я хочу помочь тебе. Я покажу тебе замечательное место, но тебе нужно кое что сделать для меня...", // 383
            "Пожалуйста, убей своего брата, Ben такой грубый и не любит тебя... Прейди сюда на следующей неделе.",// 384
            "Я предпочитаю женщин, поэтому, пожалуйста, убей своего отца... Прийди сюда на следующей неделе.",// 385
            "Покорми и напои свою мать. Она должна быть сильной... Прейди опять через неделю.", // 386
            "Мне нравится алкоголь, пожалуйста, сделай мне бутылочку спирта, и принеси мне её на следующей неделе.", // 387
            "Большое тебе спасибо! Вернись сюда в этот день:", // 388
            "Гитара", //389
            "Снаружи доносится голос: \"ПОЛИЦИЯ! ОТКРЫВАЙТЕ!\"", // 390
            "Мы знаем, что вы воруете припасы! 1 картофель и 1 морковь, и считайте, что мы забыли про это.", // 391
            "Может быть, подкупить их?", // 392
            "Хмм... Вы можете быть полезными, мы заберём вас в день: ", // 393
            "Дать им", // 394
            "Не давать им", // 395
            "Может, нам выстрелить в них?", // 396
            "Камера видеонаблюдения", //397
            "Сначала нужно включить перегонный аппарат\n в блоке питания.", // 398

            "Хмель", // 399
            "Пиво", // 400

            "Кирка",// 401
            "Крепкая кирка", // 402

            "Уголь", // 403
            "Железная руда", // 404
            "Медная руда", // 405
            "Урановая руда", // 406
            "Золотая руда", // 407
            "Врач", // 408
            "Урановая кирка", // 409
            "-Делает \n пьяным \n-Утоляет жажду", // 410
            "-Делает \n пьяным \n-Утоляет жажду \n-Пополняет \n энергию для\n добычи руды", // 411
            "Жареный картофель", // 412
            "Жареная рыба", // 413

            "Поиграй в The Hobo idle Clicker, там вся история про апокалипсис в Вилилили и история Бомжа! Игра в реальном времени!",//414

            "Лом", // 415
            "Ограбление магазина", // 416

            "Невинная Бомба", // 417
            "Наносит 2000 урона врагу.", // 418

            "они не пройдут", // 419

            "Сообщения", // 420
            "GPS", // 421
            "Игра", // 422
            "Змейка", //423
            "Видео", // 424

            "Телефон", // 425
            "вызов",  // 426

            "Здравствуйте, [...] Так что вам нужна помощь? [...] Хмммм, я перезвоню вам через 3 недели",  // 427
            "Привет [...] Я разговариваю с моими друзьями [...] Да, Запад напал на нас [...] Я знаю кого-то, кто может помочь вам [...] Позвоните Карлу: +48 4392, пока!",  // 428
            "Привет, Карл! [...] Ааа, ты разговариваешь с Джоном [...] Земля разрушена, но есть безопасные места. Звоните военным: 112112",  // 429
            "Здравствуйте [...] О, вы пришли от Карла [...], понятно. Приготовьте 6 бутылок спирта и 2 пива. Тогда мы спасем вас днем:",  // 430

            "Грязное бельё", // 431
            "Семья каждый день одевается в случайную одежду, которая была ранее куплена.", // 432
            "Зарядка телефона", // 433
            "Грибы", // 434

            "Будильник", // 435

            "Привет, человек. Я могу показать тебе страну чудес, лучший из миров без войн и агрессии.", // 436
            "Мы не можем использовать там алкоголь, а я хочу пить.", // 437
            "Я буду приходить сюда каждые 20 дней за 1 бутылкой пива и 1 бутылкой водки.", // 438
            "Я приду 4 раза. Ты согласен?\n\n\nДА            ЕЩЁ НЕТ", // 439
            "Спасибо! Встретимся через 20 дней.", // 440
            "Нет алкоголя - нет спасения ... До свидания навсегда.", // 441
            "Мясо", // 442
            "Запеченное мясо", // 443

            "Бросай бомбы!", // 444
            "Начни игру как бомбардировщик! Попади в цель, чтобы увеличить множитель монет!", // 445

            "Кот принёс в зубах что-то похожее на", // 446
            "Martha увидела кошмар ночью... Ей теперь так страшно, когда нужно спрятаться", // 447
            "Рис", //448
            "Клей", // 449

            "Фермер", // 450
            "Начать игру со всеми семенами.", // 451

            "Яблоня", // 452
            "яблоко", // 453

            "Завтра у тебя больше энергии!", // 454
            "Сидр", //455

            "Экспедиция состоится только следующий день после её планирования.",//456
            "Если по радио просят передать световой сигнал, откройте люк и ложитесь спать.",//457
            "Убедитесь, что с наружи нету врагов, когда подаёте световой сигнал.",//458
            "Вы можете установить будильник, чтобы кормить собаку ночью.",//459
            "Вы не можете покупать в магазин в городе, если врач находится в вашем убежище.",//460
            "Вы можете ограбить магазин с помощью лома, когда врач находится в вашем убежище.",//461
            "Чтобы пользоваться дополнительными локациями вам сначала нужно зарисовать карту, нажав на значок с бумагой и карандашом.",//462
            "Прячьте Марту, когда она одна, прежде чем оставить на ночь люк открытым.",//463
            "Серебряный ключ можно получить, пристрелив птицу с ключом или купив у доктора в магазине.",//464
            "Чтобы получить золотой ключ надо пригласить в убежище повара, которого можно найти в лесу.",//465
            "Синий ключ можно купить в отеле.",//466
            "Вы можете перейти на страницу Wiki, чтобы узнать подробную информацию.",//467
            "В подвале вы можете добывать уголь, кости и разные другие руды.",//468
            "Пиво и сидр востонавлиявают энергию для копания",//469
            "Всегда проверяйте нужды персонажей.",//470
            "Некоторые действия вы можете совершить сразу, а некоторые будут сделаны после того, как вы ляжете спать.",//471
            "Нажмите на мусорное ведро в саду чтобы выкинуть мусор и мусорного монстра.",//472
            "Регулярно проверяй свой сад, там может быть аир-дроп.", //473
            "Попробуй сделать ракету и улететь с Земли...",//474
            "Попробуй сделать плот на пляже и уплыть отсюда.",//475
            "Не все кто стучатся в люк плохие, они могут дать карту и картошку.",//476
            "Кот убивает мусорного монстра и летучих мышей",//477
            "Будьте осторожны во время экспедиции!", // 478
            "Ищите запчасти для машины, её можно собрать на свалке", // 479
            "Не забываете про зелья! Их можно крафтить и пить", //480

            "Больше каждый:", //481

            "Кофе", // 482
            "Семена кофе", // 483
            "Восстанавливает энергию", // 484

            "Коронавирус", // 485
            "Попробуй выжить с COVID19! Алкаголь может помочь!", // 486

            "Вставьте туда свои песни", // 487
            "Дать доступ к хранилищу", // 488

            "Hobo грабит нас. Вы можете что-то с этим сделать...? Убейте его, тогда мы поговорим подробнее.", // 489
            "Нам нужна энергия! Принеси нам 5 чашек кофе.", // 490
            "У нас что-то сломалось, перегорело 3 предохранителя. Можете ли вы дать нам новых?", // 491
            "Крысы сгрызли много проводов. Для открытия ворот нам понадобится 6 новых проводов.", // 492
            "Для питания ворот нам понадобится 10 штук урана.", // 493
            "Ворота открываются каждое воскресенье!", // 494

            "Purple Power", // 495
            "Исцелить все травмы", // 496

            "Храбрые сердца", // 497
            "Персонажи не будут самоубиватся.",// 498

            "<клик>", // 499
            "<сдвиг>", // 500
            "Припасы - самый не обходимый ресурс для выживания. Не забывайте следить за ними", // 501
            "Проводя пальцем по экрану можно изменить комнату или некоторые места снаружи", // 502
            "Есть много других элементов, которые можно проверить касанием / щелчком.", // 503
            "А теперь ложись спать, чтобы наступил следующий день", // 504
            "Давайте проверим состояние Боба. Нажмите на него и дайте ему попить!", // 505
            "Не забывай за показателями голода и жады персонажей. Ой, что это за сорняк...? убери его!", // 506
            "Некоторым действиям нужно время, например, давайте посадим картошку и посмотрим, что будет завтра", // 507
            "Люк - выжнейший элемент в вашем убежище, в него могут постучать, это может быть как вашим врагом, так и вашим другом, так же у люка есть прочность", // 508

            "Вы можете рискнуть открыть люк, или же узнать, кто там находится, например, с помощью зелья", // 509
            "Создайте зелье: МочаЗрения и выпейте его", // 510
            "Смотри, это помощь! Можешь смело открывать люк", // 511
            "Пора накормить и напоить всех членов семьи", // 512

            "Надо бы полить картошку", // 513
            "Пакет с мусором полон, пора его вынести, иди в сад и выкини его", // 514
            "Припасы не бесконечны, пора послать кого-нибудь за ними в экспедицию. У нас кокрас есть карта, пойдём в город.", // 515
            "Проверьте уровень радиации с наружи, если она ВЫСОКАЯ, тогда экспедиция обойдется вам в 1 еденицу прочности противогаза", // 516
            "О, кто-то оставил тут набор воды и еды, бурём его", // 517
            "Отлично, теперь вы знаете основные механики игры, теперь вы можете начать игру. Читайте дневник и шевелите мозгами, дальше только интересней!", // 518

            "Trash killer", // 519
            "В начале есть сильный яд против мусорного монстра.", //520
            "Слепота", // 521
            "Попробуйте поиграть без лампы, в полной темноте.", // 522
            "Я украду вашу воду!", // 523
            "Хлеб", // 524

            "Меня зовут Срак. Пожалуйста, помогите мне с этой проблемой. Дайте мне скатерть. Я дам вам картошки, радио и бензина", // 525
            "Ammunition keeper", // 526
            "Начни игру с множеством боеприпасов!", // 527

            "Нажмите и удерживайте, чтобы купить", // 528

            "Сегодня изнуряющая жара, надо сегодня пить еще!", // 529
            "Привет! Меня зовут Скайлайт. Можешь зарядить меня фонариком? Я здесь всегда по воскресеньям. Взамен я помогу вам световыми сигналами.", // 530

            "Бандиты", // 531
            "Дайте нам 2 л воды, и мы уйдем. Если нет, то сражайся!", // 532

            "Хижина", // 533
            "Food Pack", // 534
            "Перезаписать текущее сохранение?", //535

            "Броня", // 536
            "Солнечная панель", // 537
            "Сломалась солнечная панель.", // 538

            "Картофельный штамп", // 539
            "Мы прекратили попытки помочь вам, потому что вы не открыли дверь. Ты жив?", //540
    };

    public static final String credits = "Перевод:-Тимур Багаутдинов, -Кирилл Гаврилов\n-sennou, Вычитка: -Неприм";
}