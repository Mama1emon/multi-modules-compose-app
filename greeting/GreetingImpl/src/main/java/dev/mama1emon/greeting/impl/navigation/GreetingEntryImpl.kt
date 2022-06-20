package dev.mama1emon.greeting.impl.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavDeepLink
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import dev.mama1emon.greeting.api.navigation.GreetingEntry
import dev.mama1emon.greeting.impl.compose.GreetingScreen
import dev.mama1emon.greeting.impl.compose.SplashScreen
import dev.mama1emon.navigation.Destinations
import dev.mama1emon.navigation.Screen
import javax.inject.Inject

class GreetingEntryImpl @Inject constructor() : GreetingEntry() {

    override fun NavGraphBuilder.subgraph(
        navController: NavHostController,
        destinations: Destinations
    ) {
        navigation(
            startDestination = GreetingScreens.SPLASH.route,
            route = entryPoint,
            arguments = arguments,
            deepLinks = deepLinks
        ) {
            composable(route = GreetingScreens.SPLASH.route) { SplashScreen(navController) }
            composable(route = GreetingScreens.GREETING.route) { GreetingScreen(navController) }
        }
    }
}

internal enum class GreetingScreens(
    override val route: String,
    override val arguments: List<NamedNavArgument> = listOf(),
    override val deepLinks: List<NavDeepLink> = listOf()
) : Screen {

    SPLASH("splash"),

    GREETING("greeting")
}