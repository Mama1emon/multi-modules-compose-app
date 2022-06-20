package dev.mama1emon.feed.ui.compose

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

@Composable
fun FeedScreen(
    username: String,
    navigateToDetail: (String) -> Unit
) {
    Box(
        Modifier
            .background(Color.Green)
            .fillMaxSize()
    ) {
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = "ЛЕНТА",
            textAlign = TextAlign.Center,
            color = Color.Black
        )
        Button(
            modifier = Modifier
                .padding(bottom = 16.dp)
                .align(Alignment.BottomCenter),
            onClick = { navigateToDetail("1") }
        ) {
            Text(text = "Вернуться на экран приветствия, $username?")
        }
    }
}