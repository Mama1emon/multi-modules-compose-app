package dev.mama1emon.hub.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import dev.mama1emon.navigation.Destinations
import javax.inject.Inject

class HubEntryImpl @Inject constructor() : HubEntry() {

    override fun NavGraphBuilder.subgraph(
        navController: NavHostController,
        destinations: Destinations
    ) {
        navigation(startDestination = this@HubEntryImpl.entryPoint, route = "@${this@HubEntryImpl.entryPoint}") {
            composable(this@HubEntryImpl.entryPoint) {

            }
        }
    }
}