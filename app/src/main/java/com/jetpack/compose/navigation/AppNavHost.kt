package com.jetpack.compose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.navigation.Destination
import com.example.navigation.graph.listGraph
import com.example.navigation.graph.profileGraph

@Composable
fun AppNavHost(navController: NavHostController, modifier: Modifier) {
    NavHost(
        navController = navController,
        startDestination = Destination.ListScreen.route,
        modifier = modifier,
    ) {

        listGraph()

        profileGraph(navController)

    }
}