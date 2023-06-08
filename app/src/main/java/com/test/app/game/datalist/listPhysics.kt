package com.test.app.game.datalist

data class QuestionP(
    val question: String,
    val options: List<String>,
    val answer: Int
)

val questionListP = listOf(
    QuestionP(
        "How many types of Newton's laws are there?",
        listOf("1", "2", "3", "4"), 2
    ),
    QuestionP(
        "Current or voltage directly affect people?",
        listOf("Current", "Voltage", "Current and Voltage", "No answer is correct"), 0
    ),
    QuestionP(
        "What is gravity also called?",
        listOf("Attraction force", "Tension force", "Thrust force", "Frictional force"), 0
    ),
    QuestionP(
        "Symbol for frequency?",
        listOf("P", "U", "f", "t"), 2
    ),
    QuestionP(
        "When your hand grips the balloon string, what force is acting on the ball?",
        listOf("Attraction force", "Tension force", "Thrust force", "Frictional force"), 1
    ),
    QuestionP(
        "Which quantity is responsible for obstructing the flow of electricity?",
        listOf("Current", "Voltage", "Resistor", "Frequency"), 2
    ),
    QuestionP(
        "Light is emitted from LEDs and lasers. What is the light?",
        listOf("Color light", "Red light", "Black light", "White light"), 0
    ),
    QuestionP(
        "What is the natural light that we see every day?",
        listOf("Color light", "Red light", "Black light", "White light"), 3
    ),
    QuestionP(
        "Symbols for acceleration, velocity, time?",
        listOf("v, a, t", "a, v, t", "a, v, T", "s, v, t"), 1
    ),
    QuestionP(
        "\"Give me a fulcrum and I will lift the earth\" is the saying of whom?",
        listOf("Newton", "Einstein", "Archimedes", "Hawking"), 2
    ),
    QuestionP(
        "",
        listOf("", "", "", ""), 0
    )
)