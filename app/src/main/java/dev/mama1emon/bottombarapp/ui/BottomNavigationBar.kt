package dev.mama1emon.bottombarapp.ui

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import dev.mama1emon.navigation.LocalDestinationsProvider

/**
 * Нижняя навигационная панель
 *
 * @param navController      менеджер Navigation API
 * @param currentDestination текущий отображаемый экран
 * @param onSizeChanged      обработчик изменения размера навигационной панели
 */
@Composable
internal fun BottomNavigationBar(
    navController: NavHostController,
    currentDestination: NavDestination?,
    onSizeChanged: (Int) -> Unit
) {
    val config = BottomBarConfiguration(LocalDestinationsProvider.current)
    val startDestination = (navController.findDestination(config.firstTab.route) as? NavGraph)
        ?.startDestinationRoute

    BottomNavigation(
        Modifier.onSizeChanged { onSizeChanged(it.height) }
    ) {
        config.tabs.forEach { tab ->
            BottomNavigationItem(
                icon = { Icon(Icons.Filled.Favorite, contentDescription = null) },
                label = { Text(stringResource(tab.title)) },
                selected = currentDestination?.hierarchy?.any { it.route == tab.route } == true,
                onClick = {
                    navController.navigate(tab.route) {
                        if (startDestination != null) {
                            popUpTo(startDestination) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}