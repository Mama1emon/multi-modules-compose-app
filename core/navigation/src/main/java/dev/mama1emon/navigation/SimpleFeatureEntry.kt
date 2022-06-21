package dev.mama1emon.navigation

import androidx.navigation.NamedNavArgument

abstract class SimpleFeatureEntry(
    override val arguments: List<NamedNavArgument> = listOf()
) : FeatureEntry() {

    fun route() = entryPoint
}