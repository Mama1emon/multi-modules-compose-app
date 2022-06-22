package dev.mama1emon.bottombarapp.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import dev.mama1emon.greeting.api.navigation.GreetingEntry
import dev.mama1emon.navigation.LocalDestinationsProvider
import dev.mama1emon.navigation.LocalNavControllerProvider
import dev.mama1emon.navigation.addToGraph
import dev.mama1emon.navigation.find

/** Блок навигации */
@Composable
internal fun Navigation() {
    val navController = LocalNavControllerProvider.current
    val destinations = LocalDestinationsProvider.current

    var bottomBarSize by rememberSaveable { mutableStateOf(0) }

    Box(
        Modifier
            .padding(bottom = with(LocalDensity.current) { bottomBarSize.toDp() })
            .fillMaxSize()
    ) {
        /** НАВИГАЦИОННЫЙ ГРАФ ПРИЛОЖЕНИЯ */
        NavHost(
            navController = navController,
            /** ПРИМЕР НАВИГАЦИИ МЕЖДУ ЭКРАНАМИ РАЗНЫХ МОДУЛЕЙ */
            startDestination = destinations.find<GreetingEntry>().route
        ) {

            /**
             * ВСЕ ТОЧКИ ВХОДА, ДОБАВЛЕННЫЕ В DI ГРАФ, БУДУТ АВТОМАТИЧЕСКИ ДОБАВЛЕНЫ
             * В НАВИГАЦИОННЫЙ ГРАФ
             */
            destinations.forEach { destination ->
                addToGraph(destination.value, navController, destinations)
            }
        }
    }

    /** ИСКЛЮЧЕННЫЕ ТОЧКИ ВХОДА, ДЛЯ КОТОРЫХ НЕ ОТОБРАЖАЕТСЯ НАВИГАЦИОННАЯ ПАНЕЛЬ */
    val excludedDestinations = listOf(
        destinations.find<GreetingEntry>().route
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    val parentCurrentDestination = currentDestination?.parent?.route

    if (parentCurrentDestination !in excludedDestinations) {
        Box(
            modifier = Modifier.fillMaxHeight(),
            contentAlignment = Alignment.BottomCenter
        ) {
            BottomNavigationBar(
                navController = navController,
                currentDestination = currentDestination,
                onSizeChanged = { bottomBarSize = it }
            )
        }
    } else {
        bottomBarSize = 0
    }
}