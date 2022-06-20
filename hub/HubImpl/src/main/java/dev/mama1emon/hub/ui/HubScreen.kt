//package dev.mama1emon.hub.ui
//
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material.*
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Favorite
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.res.stringResource
//import androidx.navigation.NavDestination.Companion.hierarchy
//import androidx.navigation.NavGraph.Companion.findStartDestination
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.currentBackStackEntryAsState
//import androidx.navigation.compose.rememberNavController
//import com.mama1emon.feed.ui.navigation.feedGraph
//import com.mama1emon.friends.ui.navigation.friendsGraph
//import com.mama1emon.profile.ui.navigation.profileGraph
//
//@Composable
//fun HubScreen() {
//    val items = listOf(
//        BottomBarTabs.Feed,
//        BottomBarTabs.FriendsList,
//        BottomBarTabs.Profile
//    )
//
//    val navController = rememberNavController()
//    Scaffold(
//        bottomBar = {
//            BottomNavigation {
//                val navBackStackEntry by navController.currentBackStackEntryAsState()
//                val currentDestination = navBackStackEntry?.destination
//                items.forEach { screen ->
//                    BottomNavigationItem(
//                        icon = {
//                            Icon(
//                                imageVector = Icons.Filled.Favorite,
//                                contentDescription = null
//                            )
//                        },
//                        label = { Text(stringResource(screen.resourceId)) },
//                        selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
//                        onClick = {
//                            navController.navigate(screen.route) {
//                                popUpTo(navController.graph.findStartDestination().id) {
//                                    saveState = true
//                                }
//                                launchSingleTop = true
//                                restoreState = true
//                            }
//                        }
//                    )
//                }
//            }
//        }
//    ) { innerPadding ->
//        NavHost(
//            navController = navController,
//            startDestination = BottomBarTabs.Feed.route,
//            modifier = Modifier.padding(innerPadding)
//        ) {
//            feedGraph(navController)
//            profileGraph(navController)
//            friendsGraph(navController)
//        }
//    }
//}