package dev.mama1emon.ds.ui

import androidx.annotation.StringRes
import dev.mama1emon.ds.R
import dev.mama1emon.feed.navigation.FeedEntry
import dev.mama1emon.navigation.Destinations
import dev.mama1emon.navigation.find
import dev.mama1emon.profile.navigation.ProfileEntry

internal class BottomBarTabs(private val destinations: Destinations) {

    val tabs = listOf(
        Feed(),
        Profile()
    )

    inner class Feed() : Tab(
        route = destinations.find<FeedEntry>().entryPoint.value(),
        title = R.string.feed
    )

    inner class Profile : Tab(
        route = destinations.find<ProfileEntry>().entryPoint.value(),
        title = R.string.profile
    )
}

internal abstract class Tab(val route: String, @StringRes val title: Int)
