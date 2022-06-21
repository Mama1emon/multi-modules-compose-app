package dev.mama1emon.greeting.api.navigation

import dev.mama1emon.navigation.SimpleFeatureEntry

abstract class GreetingEntry(
    final override val entryPoint: String = "@greeting"
) : SimpleFeatureEntry()