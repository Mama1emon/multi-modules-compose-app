package dev.mama1emon.feed.navigation

import androidx.navigation.*
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import dev.mama1emon.feed.ui.compose.DetailScreen
import dev.mama1emon.feed.ui.compose.FeedScreen
import dev.mama1emon.navigation.Destinations
import dev.mama1emon.navigation.Screen
import javax.inject.Inject

class FeedEntryImpl @Inject constructor() : FeedEntry() {

    override fun NavGraphBuilder.subgraph(
        navController: NavHostController,
        destinations: Destinations
    ) {
        navigation(
            startDestination = FeedScreens.FEED.route,
            route = entryPointWithArgs,
        ) {
            composable(FeedScreens.FEED.route, arguments) { backStackEntry ->
                FeedScreen(
                    username = requireNotNull(backStackEntry.arguments?.getString(USERNAME_KEY)),
                    navigateToDetail = {
                        navController.navigate("detail?$NEWS_ID=$it")
                    }
                )
            }
            composable(
                route = FeedScreens.DETAIL.route,
                arguments = FeedScreens.DETAIL.arguments
            ) {
                DetailScreen(requireNotNull(it.arguments?.getString(NEWS_ID)))
            }
        }
    }

    internal enum class FeedScreens(
        override val route: String,
        override val arguments: List<NamedNavArgument> = listOf(),
        override val deepLinks: List<NavDeepLink> = listOf()
    ) : Screen {
        FEED(route = "feed"),
        DETAIL(
            route = "detail?$NEWS_ID={$NEWS_ID}",
            arguments = listOf(
                navArgument(NEWS_ID) {
                    type = NavType.StringType
                    nullable = true
                }
            )
        )
    }

    private companion object {
        const val NEWS_ID = "NEWS_ID"
    }
}