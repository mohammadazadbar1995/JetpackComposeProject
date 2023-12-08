package com.jetpack.compose.navigation

import androidx.navigation.NavBackStackEntry

fun <T> NavBackStackEntry.parcelableData(key: String): T? {
    return arguments?.parcelable(key) as? T
}