package dev.mama1emon.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.*
import androidx.navigation.compose.composable

/** Навигация фичи */
interface FeatureEntry {

    /** Точка входа в фичу */
    val entryPoint: String

    /** Аргументы для открытия фичи */
    val arguments: List<NamedNavArgument>
        get() = emptyList()

    /** Диплинки */
    val deepLinks: List<NavDeepLink>
        get() = emptyList()

    /**
     * Метод, поставляющий сабграф
     *
     * @param navController менеджер Navigation API
     * @param destinations  точки входа во все фичи
     */
    fun NavGraphBuilder.subgraph(navController: NavHostController, destinations: Destinations)
}

/** Методы навигации фичи с добавлением compose-экрана */
interface ComposableFeatureEntry : FeatureEntry {

    /**
     * Метод добавления точки входа в главный граф
     *
     * @param navController менеджер Navigation API
     * @param destinations  точки входа во все фичи
     */
    fun NavGraphBuilder.composable(navController: NavHostController, destinations: Destinations) {
        composable(
            route = entryPoint,
            arguments = arguments,
            deepLinks = deepLinks
        ) { backStackEntry ->
            Composable(navController, destinations, backStackEntry)
        }
    }

    /**
     * Метод, поставляющий compose-экран
     *
     * @param navController  менеджер Navigation API
     * @param destinations   точки входа во все фичи
     * @param backStackEntry представление в бестеке
     */
    @Composable
    fun NavGraphBuilder.Composable(
        navController: NavHostController,
        destinations: Destinations,
        backStackEntry: NavBackStackEntry
    )
}

///** Метод навигации фичи с добавлением сабграфа */
//interface AggregateFeatureEntry : FeatureEntry {
//
//    /**
//     * Метод, постовляющий сабграф
//     *
//     * @param navController менеджер Navigation API
//     * @param destinations  точки входа во все фичи
//     */
//    fun NavGraphBuilder.subgraph(navController: NavHostController, destinations: Destinations)
//}