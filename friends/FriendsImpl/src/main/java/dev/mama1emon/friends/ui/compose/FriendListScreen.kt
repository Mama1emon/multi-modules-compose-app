package dev.mama1emon.friends.ui.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import dev.mama1emon.friends.navigation.FriendProfile

@Composable
fun FriendsScreen(navController: NavHostController, name: String = "default") {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "СПИСОК ДРУЗЕЙ", modifier = Modifier.align(Alignment.Center))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            onClick = { navController.navigate(FriendProfile.value()) }
        ) {
            Text(text = "Перейти в профиль друга, $name")
        }
    }
}