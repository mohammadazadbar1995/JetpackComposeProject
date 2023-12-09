package com.example.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.navigation.Destination
import ir.state.profile.SecondScreen

fun NavGraphBuilder.secondGraph(){

    composable(
        route = Destination.SecondScreen.route
    ) {
//        val title = it.parcelableData<String>(Destination.SecondScreen().title)
        SecondScreen()
    }

}