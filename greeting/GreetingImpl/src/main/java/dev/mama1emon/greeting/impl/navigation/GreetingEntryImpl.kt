package dev.mama1emon.greeting.impl.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import dev.mama1emon.greeting.api.navigation.GreetingEntry
import dev.mama1emon.greeting.impl.compose.GreetingScreen
import dev.mama1emon.navigation.Destinations
import javax.inject.Inject

class GreetingEntryImpl @Inject constructor() : GreetingEntry() {

    override fun NavGraphBuilder.subgraph(
        navController: NavHostController,
        destinations: Destinations
    ) {
        navigation(
            route = entryPoint.value(),
            startDestination = Greeting.value()
        ) {
            composable(route = Greeting.value()) {
                GreetingScreen(navController, destinations)
            }
        }
    }
}