package ir.state.profile

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen(
    onNavigationToSecondScreen: (String) -> Unit = {}
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "Profile Screen",
            fontSize = 20.sp,
            modifier = Modifier
                .clickable {
                    onNavigationToSecondScreen("second click shod!")
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ProfilePrev() {
    ProfileScreen()
}