package dev.mama1emon.feed.navigation

import dev.mama1emon.navigation.EntryPoint
import dev.mama1emon.navigation.FeatureEntry

abstract class FeedEntry(
    final override val entryPoint: EntryPoint = EntryPoint("@feed")
) : FeatureEntry()