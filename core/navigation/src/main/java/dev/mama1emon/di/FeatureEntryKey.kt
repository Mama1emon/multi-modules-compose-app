package dev.mama1emon.di

import dagger.MapKey
import dev.mama1emon.navigation.FeatureEntry
import kotlin.reflect.KClass

/**
 * Ключ для идентификации определенной точки входа в фичу [FeatureEntry] в даггеровском графе
 *
 * @param value класс определенной точки входа фичи [FeatureEntry]
 */
@MapKey
annotation class FeatureEntryKey(val value: KClass<out FeatureEntry>)