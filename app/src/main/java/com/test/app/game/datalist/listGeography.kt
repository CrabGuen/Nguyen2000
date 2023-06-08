package com.test.app.game.datalist

data class QuestionG(
    val question: String,
    val options: List<String>,
    val answer: Int
)

val questionListG = listOf(
    QuestionG(
        "What is the longest river in Vietnam?",
        listOf("Me Kong River", "Hong River", "Dong Nai River", "Da River"), 2
    ),
    QuestionG(
        "How many provinces and cities are there in Vietnam?",
        listOf("61", "63", "65", "58"), 1
    ),
    QuestionG(
        "Where is Vung Tau located?",
        listOf("Nam Trung Bo", "Tay Nam Bo", "Dong Nam Bo", "Duyen Hai"), 2
    ),
    QuestionG(
        "Where is the 17th parallel?",
        listOf("Quang Tri", "Hue", "Da Nang", "Quang Ngai"), 0
    ),
    QuestionG(
        "Which province does the Truong Sa archipelago belong to?",
        listOf("Da Nang", "Khanh Hoa", "Nha Trang", "Ninh Thuan"), 1
    ),
    QuestionG(
        "What is the highest mountain in Vietnam?",
        listOf("Fansipan Mountain", "Ba Den Mountain", "Pusilung Mountain", "Putaleng Mountain"),
        0
    ),
    QuestionG(
        "Vietnam's largest city?",
        listOf("TPHCM", "Ha Noi", "Da Nang", "Hai Phong"), 0
    ),
    QuestionG(
        "How many natural heritages does Vietnam have recognized by UNESCO?",
        listOf("1", "2", "3", "4"), 1
    ),
    QuestionG(
        "Vietnam's largest cave?",
        listOf("Phong Nha", "Thien Duong", "Trang An", "Son Doong"), 3
    ),
    QuestionG(
        "Today's Cuu Long River has several gates leading to the sea?",
        listOf("9", "8", "7", "6"), 2
    ),
    QuestionG(
        "",
        listOf("", "", "", ""), 0
    )
)