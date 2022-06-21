package dev.mama1emon.profile.ui.compose

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
import dev.mama1emon.profile.navigation.Subscription

@Composable
fun ProfileScreen(navController: NavHostController) {
//    Scaffold(
//        bottomBar = { BottomNavigationBar(navController) }
//    ) {
    Box(
        Modifier
//            .padding(it)
            .background(Color.Cyan)
            .fillMaxSize()
    ) {
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = "ПРОФИЛЬ",
            textAlign = TextAlign.Center,
            color = Color.Black
        )
        Button(
            modifier = Modifier
                .padding(bottom = 16.dp)
                .align(Alignment.BottomCenter),
            onClick = { navController.navigate(Subscription.value()) }
        ) {
            Text(text = "ОТКРЫТЬ ЭКРАН ПОДПИСКИ")
        }
    }
//    }
}