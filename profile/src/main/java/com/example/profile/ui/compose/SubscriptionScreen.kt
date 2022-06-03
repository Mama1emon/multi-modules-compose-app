package com.example.profile.ui.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun SubscriptionScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "Subscription", modifier = Modifier.align(Alignment.Center))
    }
}