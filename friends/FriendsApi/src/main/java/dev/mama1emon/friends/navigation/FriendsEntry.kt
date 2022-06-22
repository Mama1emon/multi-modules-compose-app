package dev.mama1emon.friends.navigation

import androidx.navigation.navArgument
import dev.mama1emon.navigation.EntryPoint
import dev.mama1emon.navigation.FeatureEntry

abstract class FriendsEntry(
    final override val entryPoint: EntryPoint = EntryPoint(
        name = "@friends",
        arguments = listOf(
            navArgument(FRIEND_ID_KEY) {},
            navArgument(FRIEND_NAME_KEY) {}
        )
    )
) : FeatureEntry() {
    protected companion object {
        const val FRIEND_ID_KEY = "FRIEND_ID_KEY"
        const val FRIEND_NAME_KEY = "FRIEND_NAME_KEY"
    }
}