package com.example.hub.ui

import androidx.annotation.StringRes
import com.example.hub.R

sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object Feed: Screen("feed_graph", R.string.feed)
    object Profile : Screen("profile_graph", R.string.profile)
    object FriendsList : Screen("friends_graph", R.string.friends_list)
}