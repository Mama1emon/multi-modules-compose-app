package dev.mama1emon.bottombarapp.ui

import androidx.annotation.StringRes
import dev.mama1emon.bottombarapp.R
import dev.mama1emon.feed.navigation.FeedEntry
import dev.mama1emon.navigation.Destinations
import dev.mama1emon.navigation.find
import dev.mama1emon.profile.navigation.ProfileEntry

/** Конфигурация нижней навигационной панели */
internal class BottomBarConfiguration(private val destinations: Destinations) {

    /** ВСЕ ВКЛАДКИ НИЖНЕЙ НАВИГАЦИОННОЙ ПАНЕЛИ */
    val tabs = listOf(
        Feed(),
        Profile()
    )

    /** ПЕРВАЯ ВИДИМАЯ ВКЛАДКА */
    val firstTab = tabs.first()

    inner class Feed : Tab(
        route = destinations.find<FeedEntry>().route,
        title = R.string.feed
    )

    inner class Profile : Tab(
        route = destinations.find<ProfileEntry>().route,
        title = R.string.profile
    )
}

internal abstract class Tab(val route: String, @StringRes val title: Int)
