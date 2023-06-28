package com.test.app.game.datalist

fun getRandomUniqueQuestions(category: String): List<Question>? {

    val questionList = when (category) {
        Category.MATH -> questionListM
        Category.HISTORY -> questionListH
        Category.GEOGRAPHY -> questionListG
        Category.CHEMISTRY -> questionListC
        Category.PHYSICS -> questionListP
        Category.LITERATURE -> questionListL
        else -> questionListM
    }

    val randomQuestion = questionList.subList(0, 10).shuffled()
    val lastQuestion = questionList.last()
    return randomQuestion + lastQuestion
}