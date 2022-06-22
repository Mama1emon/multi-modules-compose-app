package dev.mama1emon.profile.navigation

import dev.mama1emon.navigation.EntryPoint
import dev.mama1emon.navigation.FeatureEntry

abstract class ProfileEntry(
    final override val entryPoint: EntryPoint = EntryPoint("@profile"),
    val route: String = entryPoint.value()
) : FeatureEntry()