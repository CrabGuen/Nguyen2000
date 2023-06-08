package com.test.app.game.screenstart

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun OptionsScreen(navController: NavController) {

    BackHandler {
        navController.navigate("menu")
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.LightGray
    ) {
        Column {
            Text(
                text = "Options",
                color = Color.Blue,
                style = MaterialTheme.typography.h4,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(16.dp),
                fontWeight = FontWeight.Bold,
            )
            CheckboxSetting(
                label = "Enable notifications",
                isChecked = true,
                onCheckedChange = { /*TODO*/ },
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
            CheckboxSetting(
                label = "Dark mode",
                isChecked = false,
                onCheckedChange = { /*TODO*/ },
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }
    }
}

@Composable
fun CheckboxSetting(
    label: String,
    isChecked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = isChecked,
            onCheckedChange = onCheckedChange,
        )
        Text(
            text = label,
            fontSize = 20.sp,
            style = MaterialTheme.typography.body1,
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}