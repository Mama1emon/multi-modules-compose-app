package dev.mama1emon.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavDeepLink
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation

/** Навигация фичи */
abstract class FeatureEntry {

    /** Аргументы для открытия фичи */
    open val arguments: List<NamedNavArgument>
        get() = emptyList()

    /** Диплинки */
    open val deepLinks: List<NavDeepLink>
        get() = emptyList()

    /** Точка входа в фичу - название графа */
    protected abstract val entryPoint: String

    /**
     * Метод, поставляющий сабграф
     *
     * @param navController менеджер Navigation API
     * @param destinations  точки входа во все фичи
     */
    abstract fun NavGraphBuilder.subgraph(
        navController: NavHostController,
        destinations: Destinations
    )
}

/** Упрощенная схема навигации фичи */
abstract class SimpleFeatureEntry(startDestination: String) : FeatureEntry() {

    private val _entryPoint by lazy { entryPoint }
    private val _startDestination: String = "${_entryPoint}_$startDestination"

    @Composable
    abstract fun StartDestinationContent()

    abstract fun NavGraphBuilder.localDestinationList(
        navController: NavHostController,
        destinations: Destinations
    )

    override fun NavGraphBuilder.subgraph(
        navController: NavHostController,
        destinations: Destinations
    ) {
        navigation(
            startDestination = _startDestination,
            route = _entryPoint,
            arguments = arguments,
            deepLinks = deepLinks
        ) {
            composable(route = _startDestination) { StartDestinationContent() }
            localDestinationList(navController, destinations)
        }
    }
}