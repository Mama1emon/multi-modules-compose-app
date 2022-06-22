package dev.mama1emon.feed.navigation

import androidx.navigation.NavType
import androidx.navigation.navArgument
import dev.mama1emon.navigation.EntryPoint

object Feed : EntryPoint("feed")

object Detail : EntryPoint(
    name = "detail",
    arguments = listOf(
        navArgument(NEWS_ID_KEY) {
            type = NavType.StringType
            nullable = true
        }
    )
)

const val NEWS_ID_KEY = "NEWS_ID"