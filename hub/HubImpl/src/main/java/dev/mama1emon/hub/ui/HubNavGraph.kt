//package dev.mama1emon.hub.ui
//
//import androidx.navigation.NavGraphBuilder
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.navigation
//
//const val HUB_GRAPH = "hub_graph"
//
//fun NavGraphBuilder.hubGraph() {
//    navigation(startDestination = Screens.Hub.route, route = HUB_GRAPH) {
//        composable(Screens.Hub.route) { HubScreen() }
//    }
//}
//
//sealed class Screens(val route: String) {
//    object Hub : Screens("hub")
//    object Feed: Screens("feed_graph")
//    object Profile : Screens("profile_graph")
//    object FriendsList : Screens("friends_graph")
//}