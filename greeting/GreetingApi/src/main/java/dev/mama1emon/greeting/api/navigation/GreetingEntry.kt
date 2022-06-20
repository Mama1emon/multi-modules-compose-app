package dev.mama1emon.greeting.api.navigation

import dev.mama1emon.navigation.FeatureEntry

abstract class GreetingEntry : FeatureEntry() {

    override val entryPoint = "@greeting"

    fun route() = entryPoint
}