package com.test.app.game.datalist

data class QuestionH(
    val question: String,
    val options: List<String>,
    val answer: Int
)

val questionListH = listOf(
    QuestionH(
        "Who is the founder and first leader of the Democratic Republic of Vietnam?",
        listOf("Vo Nguyen Giap", "Ly Thuong Kiet", "Ho Chi Minh", "Nguyen Tat Thanh"), 2
    ),
    QuestionH(
        "How long did the Vietnam War last?",
        listOf("1955 to 1974", "1955 to 1975", "1956 to 1974", "1956 to 1875"), 1
    ),
    QuestionH(
        "Since when is Ha Noi the capital of Viet Nam?",
        listOf("Since 1976", "Since 1975", "Since 1945", "Since 1955"), 0
    ),
    QuestionH(
        "6/12/1953, what event happened?",
        listOf(
            "Battle of Tay Bac",
            "Battle of Viet Bac",
            "Battle of Dien Bien Phu",
            "Battle of Hoa Binh"
        ), 2
    ),
    QuestionH(
        "Who is the commander of the Dien Bien Phu campaign?",
        listOf("Vo Nguyen Giap", "Ly Thuong Kiet", "Ho Chi Minh", "Nguyen Tat Thanh"), 0
    ),
    QuestionH(
        "Who planted the flag on the roof of the Dinh Doc Lap?",
        listOf("Vo Nguyen Giap", "Bui Quang Than", "Nguyen Van Tap", "Duong Van Minh"), 1
    ),
    QuestionH(
        "Who wrote Vietnam's first declaration of independence?",
        listOf("Vo Nguyen Giap", "Ly Thuong Kiet", "Bui Quang Than", "Nguyen Tat Thanh"), 1
    ),
    QuestionH(
        "Who wrote Binh Ngo Dai Cao?",
        listOf("Ly Tu Trong", "Ly Thuong Kiet", "Vo Nguyen Giap", "Nguyen Trai"), 3
    ),
    QuestionH(
        "How many declarations of independence does Vietnam have?",
        listOf("1", "2", "3", "4"), 2
    ),
    QuestionH(
        "When was President Ho Chi Minh born?",
        listOf("19/5/1890", "19/5/1945", "19/5/1925", "19/5/1885"), 0
    ),
    QuestionH(
        "", listOf("", "", "", ""), 0
    )
)