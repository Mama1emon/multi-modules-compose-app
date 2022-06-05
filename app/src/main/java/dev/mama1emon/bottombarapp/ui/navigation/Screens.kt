package dev.mama1emon.bottombarapp.ui.navigation

sealed class Screens(val route: String) {
    object Home : Screens("home")
}