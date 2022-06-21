package dev.mama1emon.feed.navigation

import androidx.navigation.NavType
import androidx.navigation.navArgument
import dev.mama1emon.navigation.EntryPoint
import dev.mama1emon.navigation.FeatureEntry

abstract class FeedEntry : FeatureEntry() {

    final override val entryPoint: EntryPoint = EntryPoint(
        entryPoint = "@feed",
        arguments = listOf(
            navArgument(USERNAME_KEY) {
                type = NavType.StringType
                nullable = true
            }
        )
    )

    fun route(username: String) = entryPoint.Route()
        .addValue(USERNAME_KEY, username)
        .destination()

    protected companion object {
        const val USERNAME_KEY: String = "USERNAME_KEY"
    }
}