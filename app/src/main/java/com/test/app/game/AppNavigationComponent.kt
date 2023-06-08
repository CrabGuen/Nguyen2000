package com.test.app.game

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.test.app.game.screenfinish.*
import com.test.app.game.screengame.*
import com.test.app.game.screenstart.*

@Composable
fun AppNavigationComponent() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "splash"
    ) {
        composable("splash") {
            SplashScreen(navController)
        }
        composable("menu") {
            MenuScreen(navController)
        }
        composable("math") {
            MathIQScreen(navController)
        }
        composable("options") {
            OptionsScreen(navController)
        }
        composable("about") {
            AboutScreen(navController)
        }
        composable("history") {
            HistoryScreen(navController)
        }
        composable("field") {
            ChooseFieldScreen(navController)
        }
        composable("geography") {
            GeographyScreen(navController)
        }
        composable("chemistry") {
            ChemistryScreen(navController)
        }
        composable("physics") {
            PhysicsScreen(navController)
        }
        composable("showH") {
            ShowAnswersHScreen(navController)
        }
        composable("showG") {
            ShowAnswersGScreen(navController)
        }
        composable("showM") {
            ShowAnswersMScreen(navController)
        }
        composable("showC") {
            ShowAnswersCScreen(navController)
        }
        composable("showP") {
            ShowAnswersPScreen(navController)
        }
    }
}