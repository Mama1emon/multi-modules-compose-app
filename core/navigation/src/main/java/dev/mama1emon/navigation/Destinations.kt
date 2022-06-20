package dev.mama1emon.navigation

/** Алиас для представления всех точек входа в виде мапы */
typealias Destinations = Map<Class<out FeatureEntry>, @JvmSuppressWildcards FeatureEntry>

/** Найти точку входа по названию фичи [FeatureEntry] */
inline fun <reified T : FeatureEntry> Destinations.find(): T =
    findOrNull() ?: error("Unable to find '${T::class.java}' destination.")

/** Найти точку входа по названию фичи [FeatureEntry] или вернуть null, если таковой нет */
inline fun <reified T : FeatureEntry> Destinations.findOrNull(): T? = this[T::class.java] as? T