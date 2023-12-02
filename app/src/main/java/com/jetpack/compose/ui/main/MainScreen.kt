package com.jetpack.compose.ui.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(64.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
    ) {
        var message by rememberSaveable { mutableStateOf("Hello World") }

        var isVisible by rememberSaveable {
            mutableStateOf(true)
        }

        if (isVisible)
            Text(text = message)

        Spacer(modifier = Modifier.height(32.dp))

        Button(onClick = {
//            message = "Hello Mohammad!"
            isVisible = !isVisible

        }) {
            if (isVisible)
                Text(text = "Hide it!")
            else
                Text(text = "Show it!")
        }

        Spacer(modifier = Modifier.height(400.dp))
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}