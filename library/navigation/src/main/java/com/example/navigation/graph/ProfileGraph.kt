package com.example.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigation.Destination
import com.example.navigation.extention_function.addGraphPostfix
import ir.state.profile.ProfileScreen

fun NavGraphBuilder.profileGraph(
    navController: NavHostController,
){

    navigation(
        startDestination = Destination.ProfileScreen.route,
        route = Destination.ProfileScreen.route.addGraphPostfix(),
    ){
        composable(Destination.ProfileScreen.route) {
            ProfileScreen(
                onNavigationToSecondScreen = { title ->
                    navController.navigate(
                        route = Destination.SecondScreen.route,
                    )
                },
            )
        }
    }
    secondGraph()


}