package dev.mama1emon.friends.navigation

import androidx.navigation.navArgument
import androidx.navigation.navDeepLink
import dev.mama1emon.navigation.EntryPoint

object Friends : EntryPoint(
    name = "friends"
)

object FriendProfile : EntryPoint(
    name = "friend_profile"
)

object DeeplinkFriends : EntryPoint(
    name = "#friends",
    arguments = listOf(navArgument("FRIEND_ID_KEY") {}),
    deepLinks = listOf(
        navDeepLink {
            val uri = "https://www.mama1emon.dev"
            uriPattern = "$uri/{$FRIEND_ID_KEY}"
        }
    )
)

const val FRIEND_ID_KEY = "FRIEND_ID_KEY"