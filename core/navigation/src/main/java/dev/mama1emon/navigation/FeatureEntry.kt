package dev.mama1emon.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController

/** Навигация фичи */
abstract class FeatureEntry {

    /** Точка входа в фичу */
    protected abstract val entryPoint: EntryPoint

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