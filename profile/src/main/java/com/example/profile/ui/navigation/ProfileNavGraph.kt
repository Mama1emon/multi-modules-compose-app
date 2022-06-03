package com.example.profile.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.profile.ui.compose.ProfileScreen
import com.example.profile.ui.compose.SubscriptionScreen

fun NavGraphBuilder.profileGraph(navController: NavHostController) {
    navigation(startDestination = "profile", route = "profile_graph") {
        composable("profile") { ProfileScreen(navController) }
        composable("subscription") { SubscriptionScreen() }
    }
}