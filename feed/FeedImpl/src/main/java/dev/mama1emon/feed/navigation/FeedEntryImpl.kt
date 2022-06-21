package dev.mama1emon.feed.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import dev.mama1emon.feed.ui.compose.DetailScreen
import dev.mama1emon.feed.ui.compose.FeedScreen
import dev.mama1emon.navigation.Destinations
import javax.inject.Inject

class FeedEntryImpl @Inject constructor() : FeedEntry() {

    override fun NavGraphBuilder.subgraph(
        navController: NavHostController,
        destinations: Destinations
    ) {
        navigation(
            startDestination = Feed.value(),
            route = entryPoint.value(),
        ) {
            composable(Feed.value()) { FeedScreen(navController) }

            composable(route = Detail.value(), arguments = Detail.arguments) {
                DetailScreen(
                    navController = navController,
                    newsId = requireNotNull(it.arguments?.getString(NEWS_ID_KEY))
                )
            }
        }
    }
}