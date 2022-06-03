package com.example.friends.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.friends.ui.compose.DetailFriendScreen
import com.example.friends.ui.compose.FriedListScreen

fun NavGraphBuilder.friendsGraph(navController: NavHostController) {
    navigation(startDestination = "friend_list", route = "friends_graph") {
        composable("friend_list") { FriedListScreen(navController) }
        composable("detail_friend") { DetailFriendScreen() }
    }
}