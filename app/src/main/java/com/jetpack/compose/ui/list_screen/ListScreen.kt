package com.jetpack.compose.ui.list_screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val names = listOf("Mohammad", "Ali", "Reza", "Hassan", "Hossein")


@Composable
fun ListScreen(
    nameList: List<String> = names,
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
            .padding(36.dp),
    ) {
        items(items = nameList) { name ->
            Text(text = name)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    ListScreen()
}