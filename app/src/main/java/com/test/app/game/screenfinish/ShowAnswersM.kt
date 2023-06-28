package com.test.app.game.screenfinish

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ShowAnswersMScreen(navController: NavController, score: Int) {
    val interactionSource = remember { MutableInteractionSource() }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .background(color = Color.LightGray)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Your score is $score/10",
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            color = Color.Blue
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Show Answers",
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            color = Color.Blue
        )
        Spacer(modifier = Modifier.height(26.dp))
        Text(
            text = "Next number: 0, 1, 2, 4, 6, 9, 12, 16, ??" +
                    "\n-> 0 + (1) = 1; 1 + (1) = 2; 2 + (2) = 4; 4 + (2) = 6",
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = "Sum of: 1..99 = ????" +
                    "\n-> (1 + ..n) = (n/2 * n + n/2) -> 1 + ..100 = 5050",
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = "Next number: 0, 1, 3, 6, 10, ??" +
                    "\n-> 0 + (1) = 1; 1 + (2) = 3; 3 + (3) = 6",
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = "Next number: 19, 28, 37, 46, ??" +
                    "\n-> (2 * 9 + 1) = 19; (3 * 9 + 1) = 28",
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = "Different type: ?" +
                    "\n-> Triangle, Rectangle, Pentagon: Shape 2D",
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = "Next two number: 10, 30, 32, 96, 98, 294, 296, ???, ???" +
                    "\n-> 10 * (3) = 30; 30 + (2) = 32; 32 * (3) = 96; 96 + (2) = 98",
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = "Next number: 0, 4, 2, 6, 3, 7, 3.5, ?" +
                    "\n-> 0 + (4) = 4; 4 / (2) = 2; 2 + (4) = 6; 6 / (2) = 3",
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = "Choose an integer n so that the expression X has the smallest value?" +
                    "\n-> X = 2023 - (2022 - n) = 2023 - (2022 - 1) = 2",
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = "Next number: 191, 382, 573, 764, 955, ??" +
                    "\n-> 19 * (1) = 19; 19 * (2) = 38; 19 * (3) = 57",
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = "Next two number: 0, 3, 1, 4, 2, 5, 3, ?, ?" +
                    "\n-> 0 + (3) = 3; 3 - (2) = 1; 1 + (3) = 4; 4 - (2) = 2",
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(12.dp))
        Box(
            modifier = Modifier
                .background(color = Color.Green, shape = RoundedCornerShape(100))
                .fillMaxWidth()
                .padding(8.dp)
                .height(56.dp)
                .clickable(interactionSource = interactionSource, indication = null) {
                    navController.navigate("field")
                },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Next Field",
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp,
                color = Color.White
            )
        }
    }
}