package dev.mama1emon.bottombarapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.CompositionLocalProvider
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import dev.mama1emon.bottombarapp.ui.Navigation
import dev.mama1emon.bottombarapp.ui.theme.BottomBarAppTheme
import dev.mama1emon.navigation.Destinations
import dev.mama1emon.navigation.LocalDestinationsProvider
import dev.mama1emon.navigation.LocalNavControllerProvider
import javax.inject.Inject

/** Главная активити приложения */
@AndroidEntryPoint
internal class MainActivity : ComponentActivity() {

    /** Точки входа всех фичей приложения */
    @Inject
    lateinit var destinations: Destinations

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomBarAppTheme(darkTheme = false) {
                val navController = rememberNavController()
                CompositionLocalProvider(
                    LocalNavControllerProvider provides navController,
                    LocalDestinationsProvider provides destinations
                ) {
                    Navigation()
                }
            }
        }
    }
}