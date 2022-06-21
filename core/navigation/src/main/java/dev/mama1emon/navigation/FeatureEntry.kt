package dev.mama1emon.navigation

import androidx.navigation.NavDeepLink
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController

/** Навигация фичи */
abstract class FeatureEntry {

    abstract val entryPoint: EntryPoint

    /** Диплинки */
    protected val deepLinks: List<NavDeepLink> = listOf()

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

////*** Упрощенная схема навигации фичи *//*
//abstract class SimpleFeatureEntry(startDestination: String) : FeatureEntry() {
//
//    private val _entryPoint by lazy { entryPoint }
//    private val _startDestination: String = "${_entryPoint}_$startDestination"
//
//    @Composable
//    abstract fun StartDestinationContent()
//
//    abstract fun NavGraphBuilder.localDestinationList(
//        navController: NavHostController,
//        destinations: Destinations
//    )
//
//    override fun NavGraphBuilder.subgraph(
//        navController: NavHostController,
//        destinations: Destinations
//    ) {
//        navigation(
//            startDestination = _startDestination,
//            route = _entryPoint,
//            arguments = arguments,
//            deepLinks = deepLinks
//        ) {
//            composable(route = _startDestination) { StartDestinationContent() }
//            localDestinationList(navController, destinations)
//        }
//    }
//}*/