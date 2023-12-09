package com.example.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.navigation.Destination
import ir.state.list.ListScreen

fun NavGraphBuilder.listGraph() {
    composable(Destination.ListScreen.route) {
        ListScreen()
    }
}