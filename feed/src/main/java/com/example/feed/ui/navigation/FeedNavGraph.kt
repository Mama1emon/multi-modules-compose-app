package com.example.feed.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.feed.ui.compose.DetailScreen
import com.example.feed.ui.compose.FeedScreen

fun NavGraphBuilder.feedGraph(navController: NavHostController) {
    navigation(startDestination = "feed", route = "feed_graph") {
        composable("feed") { FeedScreen(navController) }
        composable("detail") { DetailScreen() }
    }
}