package dev.mama1emon.di

import dagger.MapKey
import dev.mama1emon.navigation.FeatureEntry
import kotlin.reflect.KClass


@MapKey
annotation class FeatureEntryKey(val value: KClass<out FeatureEntry>)