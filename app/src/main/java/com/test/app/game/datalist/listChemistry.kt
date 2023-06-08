package com.test.app.game.datalist

data class QuestionC(
    val question: String,
    val options: List<String>,
    val answer: Int
)

val questionListC = listOf(
    QuestionC(
        "Symbol for iron?",
        listOf("Cu", "Fe", "Al", "Cr"), 1
    ),
    QuestionC(
        "What element does quicklime contain?",
        listOf("Ca", "Fe", "Cu", "Cr"),0
    ),
    QuestionC(
        "What is aluminum?",
        listOf("Cu", "Fe", "Al", "Cr"), 2
    ),
    QuestionC(
        "What is the hardest metal?",
        listOf("Cu", "Fe", "Al", "Cr"), 3
    ),
    QuestionC(
        "Which metal has the lowest melting point?",
        listOf("Cu", "Fe", "Al", "Cr"), 2
    ),
    QuestionC(
        "Symbol for sulfur?",
        listOf("Cu", "S", "He", "Cl"), 1
    ),
    QuestionC(
        "Which metal is not oxidized in the air?",
        listOf("Ag", "Cu", "Pb", "Al"), 0
    ),
    QuestionC(
        "What is the softest metal?",
        listOf("Cu", "Fe", "Al", "Cr"), 2
    ),
    QuestionC(
        "The main element that makes up the titanium alloy?",
        listOf("Cu", "Fe", "Al", "Cr"), 2
    ),
    QuestionC(
        "What elements does S925 consist of?",
        listOf("92% Ag, 5% Al", "92,5% Ag, 5% Zn", "95% Ag, 2% Cu", "92,5% Ag"), 3
    ),
    QuestionC(
        "",
        listOf("", "", "", ""), 0
    )
)