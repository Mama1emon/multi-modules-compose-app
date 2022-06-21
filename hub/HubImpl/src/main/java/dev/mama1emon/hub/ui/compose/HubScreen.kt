//package dev.mama1emon.hub.ui.compose
//
//import androidx.compose.material.*
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Favorite
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.ui.res.stringResource
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.currentBackStackEntryAsState
//import dev.mama1emon.navigation.LocalDestinationsProvider
//import dev.mama1emon.ui.BottomBarTabs
//
//@Composable
//fun HubScreen(navController: NavHostController) {
//    val destinations = LocalDestinationsProvider.current
//    val items = BottomBarTabs(destinations).getTabs()
//    Scaffold(
//        bottomBar = {
//            BottomNavigation {
//                val navBackStackEntry by navController.currentBackStackEntryAsState()
//                val currentRoute = navBackStackEntry?.destination?.route
//                items.forEach { screen ->
//                    BottomNavigationItem(
//                        icon = {
//                            Icon(
//                                imageVector = Icons.Filled.Favorite,
//                                contentDescription = null
//                            )
//                        },
//                        label = { Text(stringResource(screen.resourceId)) },
//                        selected = currentRoute == screen.route,
//                        onClick = {
//                            navController.navigate(screen.route) {
//                                popUpTo(items.first().route) {
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
//    ) {}
//}