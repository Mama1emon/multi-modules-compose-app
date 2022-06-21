package dev.mama1emon.profile.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import dev.mama1emon.navigation.Destinations
import dev.mama1emon.profile.ui.compose.ProfileScreen
import dev.mama1emon.profile.ui.compose.SubscriptionScreen
import javax.inject.Inject

class ProfileEntryImpl @Inject constructor() : ProfileEntry() {

    override fun NavGraphBuilder.subgraph(
        navController: NavHostController,
        destinations: Destinations
    ) {
        navigation(
            route = entryPoint.value(),
            startDestination = Profile.value()
        ) {
            composable(Profile.value()) { ProfileScreen(navController) }

            composable(Subscription.value()) { SubscriptionScreen(navController) }
        }
    }
}