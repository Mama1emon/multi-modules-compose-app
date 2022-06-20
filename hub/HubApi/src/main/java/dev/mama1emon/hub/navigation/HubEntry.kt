package dev.mama1emon.hub.navigation

import dev.mama1emon.navigation.FeatureEntry

abstract class HubEntry : FeatureEntry {

    override val entryPoint = START_DESTINATION

    fun destination() = entryPoint

    private companion object {
        const val START_DESTINATION = "greeting"
    }
}