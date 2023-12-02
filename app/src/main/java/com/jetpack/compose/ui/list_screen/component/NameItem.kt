package com.jetpack.compose.ui.list_screen.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NameItem(
    name: String,
    fontSize: TextUnit = 20.sp,
) {
    Spacer(modifier = Modifier.height(8.dp))

    Column {
        Text(
            text = name,
            fontSize = fontSize,
        )
        Spacer(modifier = Modifier.height(8.dp))

        Divider()
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun DefaultPreview() {
    NameItem(name = "Mohammad")
}