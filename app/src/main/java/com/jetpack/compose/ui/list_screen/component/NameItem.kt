package com.jetpack.compose.ui.list_screen.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpack.compose.privew_provider.PersonProvider
import com.jetpack.compose.privew_provider.ThemePreview
import com.jetpack.compose.ui.list_screen.Person

@Composable
fun NameItem(
    person: Person,
    fontSize: TextUnit = 20.sp,
    onPersonCheckedChange: (personName: String) -> Unit,
) {

    Spacer(modifier = Modifier.height(8.dp))


    Column(
        modifier = Modifier
            .fillMaxWidth(),

    ) {
        Spacer(modifier = Modifier.height(4.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Checkbox(
                checked = person.isSelected,
                onCheckedChange = {
                    onPersonCheckedChange(person.name)
                }
            )
            Text(
                text = person.name,
                fontSize = fontSize,
            )
            Spacer(modifier = Modifier.height(8.dp))

        }
        Spacer(modifier = Modifier.height(8.dp))

        Divider()

    }

}

@ThemePreview
@Composable
private fun DefaultPreview(
    @PreviewParameter(PersonProvider::class) person: Person,
) {
    NameItem(person = person, onPersonCheckedChange = {})

}