package dev.mama1emon.navigation

import androidx.compose.runtime.compositionLocalOf
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController

/** Алиас для представления всей точек входа фичей в виде мапы */
typealias Destinations = Map<Class<out FeatureEntry>, @JvmSuppressWildcards FeatureEntry>

/** Найти точку входа по названию фичи [FeatureEntry] */
inline fun <reified T : FeatureEntry> Destinations.find(): T =
    findOrNull() ?: error("Unable to find '${T::class.java}' destination.")

/** Найти точку входа по названию фичи [FeatureEntry] или вернуть null, если таковой нет */
inline fun <reified T : FeatureEntry> Destinations.findOrNull(): T? = this[T::class.java] as? T

val LocalDestinationsProvider = compositionLocalOf<Destinations>() {
    error("Ошибка получения Destinations")
}

inline fun <reified T : FeatureEntry> NavGraphBuilder.addToGraph(
    featureEntry: T,
    navController: NavHostController,
    destinations: Destinations
) {
    with(featureEntry) {
        subgraph(navController, destinations)
    }
}