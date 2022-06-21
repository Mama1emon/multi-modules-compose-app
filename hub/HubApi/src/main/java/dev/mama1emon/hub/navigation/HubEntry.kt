package dev.mama1emon.hub.navigation

import dev.mama1emon.navigation.EntryPoint
import dev.mama1emon.navigation.FeatureEntry

abstract class HubEntry(
    override val entryPoint: EntryPoint = EntryPoint("hub")
) : FeatureEntry()