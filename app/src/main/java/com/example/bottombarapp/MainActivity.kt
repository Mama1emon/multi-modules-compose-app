package com.example.bottombarapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bottombarapp.ui.compose.HomeScreen
import com.example.bottombarapp.ui.theme.BottomBarAppTheme
import com.example.hub.ui.hubGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomBarAppTheme(darkTheme = false) {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "home", route = "main_graph") {
                    composable("home") { HomeScreen(navController) }
                    hubGraph()
                }
            }
        }
    }
}