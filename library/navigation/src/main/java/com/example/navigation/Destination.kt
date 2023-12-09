package com.example.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Destination(val route: String) {
    object ProfileScreen : Destination("profile")
    object ListScreen : Destination("List")
    object SecondScreen : Destination(route = "second")
}

