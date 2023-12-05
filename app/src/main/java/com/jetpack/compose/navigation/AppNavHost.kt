package com.jetpack.compose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jetpack.compose.ui.list_screen.ListScreen
import com.jetpack.compose.ui.profile.ProfileScreen

@Composable
fun AppNavHost(navController: NavHostController, modifier: Modifier) {
    NavHost(
        navController = navController,
        startDestination = Destination.ListScreen.route,
        modifier = modifier,
    ) {
        composable(Destination.ListScreen.route) {
            ListScreen()
        }
        composable(Destination.ProfileScreen.route) {
            ProfileScreen()
        }
    }
}