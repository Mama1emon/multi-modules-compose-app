package dev.mama1emon.greeting.api.navigation

import dev.mama1emon.navigation.EntryPoint
import dev.mama1emon.navigation.FeatureEntry

abstract class GreetingEntry(
    final override val entryPoint: EntryPoint = EntryPoint("@greeting")
) : FeatureEntry()