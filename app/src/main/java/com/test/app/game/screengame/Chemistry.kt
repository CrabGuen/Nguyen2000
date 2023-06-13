package com.test.app.game.screengame

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.test.app.game.datalist.QuestionC
import com.test.app.game.datalist.questionListC

@Composable
fun ChemistryScreen(navController: NavController) {

    BackHandler {
        navController.navigate("field")
    }

    val randomQuestions = remember {
        mutableStateOf(getRandomUniqueQuestions(questionListC))
    }

    val index = remember {
        mutableStateOf(1)
    }

    val currentQuestion = remember {
        mutableStateOf(randomQuestions.value?.get(index.value - 1))
    }

    val score = remember {
        mutableStateOf(0)
    }

    val interactionSource = remember {
        MutableInteractionSource()
    }

    fun checkAnswer(answerIndex: Int) {
        index.value++

        if (answerIndex == currentQuestion.value?.answer) {
            // Update the score
            score.value++
        }
        // Get the next question
        currentQuestion.value = randomQuestions.value?.get(index.value - 1)


    }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Title
        Text(
            text = "Quiz Game",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue
        )
        Spacer(
            modifier = Modifier.height(46.dp)
        )
        // Question
        val question = "Question ${index.value}: ${currentQuestion.value?.question}"
        Text(
            text = question,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        // Choices
        currentQuestion.value?.options?.forEachIndexed { index, option ->
            Box(
                modifier = Modifier
                    .clickable(interactionSource = interactionSource, indication = null) {
                        checkAnswer(index)
                    }
                    .padding(8.dp)
                    .fillMaxWidth()
                    .height(56.dp)
                    .background(color = Color.Blue, shape = RoundedCornerShape(100)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = option,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
        Spacer(
            modifier = Modifier.height(22.dp)
        )
        // Score
        Text(
            text = "Your score is ${score.value}/10",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue
        )
        Spacer(
            modifier = Modifier.height(2.dp)
        )
        if (score.value == 10 && index.value == 11) {
            Text(
                text = "Congratulation",
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp,
                color = Color.Green
            )
            Spacer(modifier = Modifier.height(2.dp))
            Box(
                modifier = Modifier
                    .clickable(interactionSource = interactionSource, indication = null) {
                        navController.navigate("field")
                    }
                    .padding(8.dp)
                    .fillMaxWidth()
                    .height(56.dp)
                    .background(color = Color.Green, shape = RoundedCornerShape(100)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Next Field",
                    fontWeight = FontWeight.Bold,
                    fontSize = 26.sp,
                    color = Color.White
                )
            }
        } else if (index.value == 11 && score.value <= 9) {
            Text(
                text = "Mission Fail",
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp,
                color = Color.Red
            )
            Box(
                modifier = Modifier
                    .clickable(interactionSource = interactionSource, indication = null) {
                        navController.navigate("chemistry")
                    }
                    .padding(8.dp)
                    .fillMaxWidth()
                    .height(56.dp)
                    .background(color = Color.Red, shape = RoundedCornerShape(100)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Play Again",
                    fontWeight = FontWeight.Bold,
                    fontSize = 26.sp,
                    color = Color.White
                )
            }
        } else {
            Text(
                text = "",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                color = Color.White
            )
        }
        Spacer(
            modifier = Modifier.height(2.dp)
        )
        if (index.value == 11 && score.value >= 5) {
            Box(
                modifier = Modifier
                    .padding(8.dp)
                    .background(color = Color.Yellow, shape = RoundedCornerShape(100))
                    .fillMaxWidth()
                    .height(56.dp)
                    .clickable(interactionSource = interactionSource, indication = null) {
                        navController.navigate("showC")
                    },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Show Answers",
                    fontWeight = FontWeight.Bold,
                    fontSize = 26.sp,
                    color = Color.White
                )
            }
        } else {
            Text(
                text = "",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                color = Color.White
            )
        }
    }
}

fun getRandomUniqueQuestions(questionList: List<QuestionC>): List<QuestionC>? {
    if (questionList.isEmpty()) return null

    val randomQuestion = questionList.subList(0, 10).shuffled()
    val lastQuestion = questionList.last()
    return randomQuestion + lastQuestion
}