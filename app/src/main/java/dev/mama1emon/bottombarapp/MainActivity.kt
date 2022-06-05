package dev.mama1emon.bottombarapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.mama1emon.bottombarapp.ui.compose.HomeScreen
import dev.mama1emon.bottombarapp.ui.navigation.Screens
import dev.mama1emon.bottombarapp.ui.theme.BottomBarAppTheme

const val MAIN_GRAPH = "main_graph"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomBarAppTheme(darkTheme = false) {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Screens.Home.route,
                    route = MAIN_GRAPH
                ) {
                    composable(Screens.Home.route) { HomeScreen(navController) }
//                    hubGraph()
                }
            }
        }
    }
}