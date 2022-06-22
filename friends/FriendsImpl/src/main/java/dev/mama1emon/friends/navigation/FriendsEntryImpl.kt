package dev.mama1emon.friends.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import dev.mama1emon.friends.ui.compose.DetailFriendScreen
import dev.mama1emon.friends.ui.compose.FriendsScreen
import dev.mama1emon.navigation.Destinations
import javax.inject.Inject

class FriendsEntryImpl @Inject constructor() : FriendsEntry() {

    override fun NavGraphBuilder.subgraph(
        navController: NavHostController,
        destinations: Destinations
    ) {
        navigation(
            route = entryPoint.value(),
            startDestination = Friends.value()
        ) {
            composable(
                route = Friends.value(),
                arguments = entryPoint.arguments
            ) { FriendsScreen(navController) }

            composable(FriendProfile.value()) { DetailFriendScreen() }

            composable(route = DeeplinkFriends.value(), deepLinks = DeeplinkFriends.deepLinks) {
                navController.clearBackStack(DeeplinkFriends.value())
                FriendsScreen(navController, it.arguments?.getString(FRIEND_ID_KEY) ?: "null")
            }
        }
    }
}