package dev.mama1emon.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavDeepLink

interface Screen {

    val route: String

    val arguments: List<NamedNavArgument> get() = emptyList()

    val deepLinks: List<NavDeepLink> get() = emptyList()
}
