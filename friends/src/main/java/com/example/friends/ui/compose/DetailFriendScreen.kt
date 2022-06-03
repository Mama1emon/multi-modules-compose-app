package com.example.friends.ui.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun DetailFriendScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "Detail", modifier = Modifier.align(Alignment.Center))
    }
}