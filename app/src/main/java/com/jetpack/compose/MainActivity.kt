package com.jetpack.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.jetpack.compose.navigation.AppNavHost
import com.jetpack.compose.navigation.BottomNavigationBar
import com.jetpack.compose.navigation.bottomNavItems
import ir.state.list.ListScreen
import com.jetpack.compose.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContent {
                MyApplicationTheme {
                    Surface(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        ir.state.list.ListScreen()

                        val navController = rememberNavController()
                        val backStackEntry = navController.currentBackStackEntryAsState()
                        val currentScreenRoute = backStackEntry.value?.destination?.route

                        Scaffold(
                            bottomBar = {
                                BottomNavigationBar(
                                    items = bottomNavItems,
                                    currentScreenRoute = currentScreenRoute,
                                    onItemClick = {
                                        navController.navigate(it.route)
                                    }
                                )
                            }
                        ) { paddingValues ->
                            AppNavHost(
                                navController = navController,
                                modifier = Modifier.padding(bottom = paddingValues.calculateBottomPadding()),
                            )
                        }
                    }
                }
            }
        }
    }
}