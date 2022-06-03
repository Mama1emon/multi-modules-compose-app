package com.example.hub.ui

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation

fun NavGraphBuilder.hubGraph() {
    navigation(startDestination = "hub", route = "hub_graph") {
        composable("hub") { HubScreen() }
    }
}