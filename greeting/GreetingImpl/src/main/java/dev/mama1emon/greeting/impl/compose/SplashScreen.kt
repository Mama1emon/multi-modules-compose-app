package dev.mama1emon.greeting.impl.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import dev.mama1emon.greeting.impl.navigation.GreetingScreens

@Composable
fun SplashScreen(navController: NavHostController) {
    Box(
        Modifier
            .background(Color.LightGray)
            .fillMaxSize()
    ) {
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = "Splash\nИнициализация ресурсов",
            textAlign = TextAlign.Center,
            color = Color.Black
        )
        Button(
            modifier = Modifier
                .padding(bottom = 16.dp)
                .align(Alignment.BottomCenter),
            onClick = {
                navController.navigate(GreetingScreens.GREETING.route) {
                    popUpTo(GreetingScreens.SPLASH.route) { inclusive = true }
                }
            }
        ) {
            Text(text = "Загрузка окончена")
        }
    }
}