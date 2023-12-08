package com.jetpack.compose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.core.os.bundleOf
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ir.state.list.ListScreen
import ir.state.profile.ProfileScreen
import ir.state.profile.SecondScreen

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
            ProfileScreen(
                onNavigationToSecondScreen = { title ->
                    navController.navigate(
                        route = Destination.SecondScreen().route,
                        args = bundleOf(Destination.SecondScreen().title to title)
                    )
                },

                )
        }

        composable(
            route = Destination.SecondScreen().route
        ) { entry ->
            val title = entry.parcelableData<String>(Destination.SecondScreen().title)
            SecondScreen(title = title!!)
        }
    }
}