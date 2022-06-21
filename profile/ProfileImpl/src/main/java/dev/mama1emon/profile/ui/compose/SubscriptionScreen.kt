package dev.mama1emon.profile.ui.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController

@Composable
fun SubscriptionScreen(navController: NavHostController) {
//    Scaffold(
//        bottomBar = { BottomNavigationBar(navController) }
//    ) {
    Box(
        Modifier
//                .padding(it)
            .background(Color.Magenta)
            .fillMaxSize()
    ) {
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = "ПОДПИСКИ",
            textAlign = TextAlign.Center,
            color = Color.Black
        )
    }
//    }
}