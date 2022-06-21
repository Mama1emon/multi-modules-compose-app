package dev.mama1emon.hub.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation
import dev.mama1emon.navigation.Destinations
import javax.inject.Inject

class HubEntryImpl @Inject constructor() : HubEntry() {

    override fun NavGraphBuilder.subgraph(
        navController: NavHostController,
        destinations: Destinations
    ) {
        navigation(
            startDestination = HubScreen.value(),
            route = entryPoint.value()
        ) {
//            composable(HubScreen.value()) { HubScreen(navController) }
        }
    }
}