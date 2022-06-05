package dev.mama1emon.friends.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import dev.mama1emon.friends.ui.compose.DetailFriendScreen
import dev.mama1emon.friends.ui.compose.FriedListScreen

fun NavGraphBuilder.friendsGraph(navController: NavHostController) {
    navigation(startDestination = "friend_list", route = "friends_graph") {
        composable("friend_list") { FriedListScreen(navController) }
        composable("detail_friend") { DetailFriendScreen() }
    }
}