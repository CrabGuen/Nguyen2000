package com.test.app.game.screengame

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.test.app.game.datalist.Category

@Composable
fun ChooseFieldScreen(navController: NavController) {

    val interactionSource = remember { MutableInteractionSource() }

    BackHandler {
        navController.navigate("menu")
    }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .background(color = Color.Green, shape = RoundedCornerShape(100))
                .padding(8.dp)
                .fillMaxWidth()
                .height(56.dp)
                .clickable(interactionSource = interactionSource, indication = null) {
                    navController.navigate("game/${Category.MATH}")
                },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "MathIQ",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                color = Color.Blue
            )
        }
        Spacer(modifier = Modifier.height(6.dp))
        Box(
            modifier = Modifier
                .background(color = Color.Green, shape = RoundedCornerShape(100))
                .padding(8.dp)
                .fillMaxWidth()
                .height(56.dp)
                .clickable(interactionSource = interactionSource, indication = null) {
                    navController.navigate("game/${Category.HISTORY}")
                },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "History",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                color = Color.Blue
            )
        }
        Spacer(modifier = Modifier.height(6.dp))
        Box(
            modifier = Modifier
                .background(color = Color.Green, shape = RoundedCornerShape(100))
                .padding(8.dp)
                .fillMaxWidth()
                .height(56.dp)
                .clickable(interactionSource = interactionSource, indication = null) {
                    navController.navigate("game/${Category.GEOGRAPHY}")
                },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Geography",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                color = Color.Blue
            )
        }
        Spacer(modifier = Modifier.height(6.dp))
        Box(
            modifier = Modifier
                .background(color = Color.Green, shape = RoundedCornerShape(100))
                .padding(8.dp)
                .fillMaxWidth()
                .height(56.dp)
                .clickable(interactionSource = interactionSource, indication = null) {
                    navController.navigate("game/${Category.LITERATURE}")
                },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Literature",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                color = Color.Blue
            )
        }
        Spacer(modifier = Modifier.height(6.dp))
        Box(
            modifier = Modifier
                .background(color = Color.Green, shape = RoundedCornerShape(100))
                .padding(8.dp)
                .fillMaxWidth()
                .height(56.dp)
                .clickable(interactionSource = interactionSource, indication = null) {
                    navController.navigate("game/${Category.PHYSICS}")
                },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Physics",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                color = Color.Blue
            )
        }
        Spacer(modifier = Modifier.height(6.dp))
        Box(
            modifier = Modifier
                .background(color = Color.Green, shape = RoundedCornerShape(100))
                .padding(8.dp)
                .fillMaxWidth()
                .height(56.dp)
                .clickable(interactionSource = interactionSource, indication = null) {
                    navController.navigate("game/${Category.CHEMISTRY}")
                },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Chemistry",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                color = Color.Blue
            )
        }
    }
}