package com.jetpack.compose.ui.main.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.navigation.BottomNavItem
import com.example.navigation.Destination

@Composable
fun BottomNavigationBar(
    items: List<BottomNavItem>,
    currentScreenRoute: String?,
    onItemClick: (BottomNavItem) -> Unit,
) {
    NavigationBar {
        items.forEach { item ->
            val selected = item.route == currentScreenRoute
            NavigationBarItem(
                selected = selected,
                onClick = { onItemClick(item) },
                icon = {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(imageVector = item.icon, contentDescription = item.route)
                        AnimatedVisibility(visible = selected) {
                            Text(
                                text = item.route,
                                textAlign = TextAlign.Center,
                                fontSize = 10.sp
                            )
                        }
                    }
                })
        }
    }
}