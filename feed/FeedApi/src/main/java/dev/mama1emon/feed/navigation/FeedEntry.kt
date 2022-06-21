package dev.mama1emon.feed.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument
import dev.mama1emon.navigation.AggregateFeatureEntry

abstract class FeedEntry : AggregateFeatureEntry() {

    final override val entryPoint: String = "@feed"

    //    final override val entryPointWithArgs = "$entryPoint/{$USERNAME_KEY}"
    final override val entryPointWithArgs = "@feed?$USERNAME_KEY={$USERNAME_KEY}"

    final override val arguments: List<NamedNavArgument> = listOf(
        navArgument(USERNAME_KEY) {
            type = NavType.StringType
            nullable = true
        }
    )

    //    fun route(username: String) = "$entryPoint/$username"
    fun route(username: String) = "$entryPoint?$USERNAME_KEY=$username"

    protected companion object {
        const val USERNAME_KEY: String = "USERNAME_KEY"
    }
}