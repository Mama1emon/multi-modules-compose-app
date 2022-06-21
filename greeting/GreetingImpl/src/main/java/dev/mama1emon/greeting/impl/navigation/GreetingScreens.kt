package dev.mama1emon.greeting.impl.navigation

import dev.mama1emon.navigation.EntryPoint

internal sealed interface GreetingScreens {
    object Greeting : EntryPoint("greeting"), GreetingScreens
}