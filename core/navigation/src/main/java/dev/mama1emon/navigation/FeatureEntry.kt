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