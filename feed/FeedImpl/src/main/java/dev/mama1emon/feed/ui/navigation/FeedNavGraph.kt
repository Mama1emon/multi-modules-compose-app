package dev.mama1emon.feed.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.mama1emon.feed.ui.compose.DetailScreen
import com.mama1emon.feed.ui.compose.FeedScreen

fun NavGraphBuilder.feedGraph(navController: NavHostController) {
    navigation(startDestination = "FeedImpl", route = "feed_graph") {
        composable("FeedImpl") { FeedScreen(navController) }
        composable("detail") { DetailScreen() }
    }
}