package dev.mama1emon.feed.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.navArgument
import dev.mama1emon.feed.ui.compose.DetailScreen
import dev.mama1emon.feed.ui.compose.FeedScreen
import dev.mama1emon.navigation.Destinations
import dev.mama1emon.navigation.EntryPoint
import javax.inject.Inject

class FeedEntryImpl @Inject constructor() : FeedEntry() {

    override fun NavGraphBuilder.subgraph(
        navController: NavHostController,
        destinations: Destinations
    ) {
        navigation(
            startDestination = Feed.value(),
            route = entryPoint.value(),
            arguments = entryPoint.arguments
        ) {
            composable(Feed.value()) { backStackEntry ->
                FeedScreen(
                    username = requireNotNull(backStackEntry.arguments?.getString(USERNAME_KEY)),
                    navigateToDetail = {
                        /**
                         * ПРИМЕР НАВИГАЦИИ МЕЖДУ ЭКРАНАМИ ОДНОГО МОДУЛЯ
                         * С ПЕРЕДАЧЕЙ АРГУМЕНТОВ
                         */
                        navController.navigate(
                            Detail.Route()
                                .addValue(NEWS_ID, it)
                                .destination()
                        )
                    }
                )
            }
            composable(
                route = Detail.value(),
                arguments = Detail.arguments
            ) {
                DetailScreen(requireNotNull(it.arguments?.getString(NEWS_ID)))
            }
        }
    }

    companion object {
        const val NEWS_ID = "NEWS_ID"
    }
}

object Feed : EntryPoint("feed")

object Detail : EntryPoint(
    entryPoint = "detail",
    arguments = listOf(
        navArgument(FeedEntryImpl.NEWS_ID) {
            type = NavType.StringType
            nullable = true
        }
    )
)