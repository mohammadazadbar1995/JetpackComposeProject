package com.jetpack.compose.ui.list_screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpack.compose.ui.list_screen.component.NameItem


data class Person(
    val name: String,
    val isSelected: Boolean,
)



@Composable
fun ListScreen(
) {

    var persons by rememberSaveable {
        mutableStateOf(
            listOf(
                Person("Mohammad", false),
                Person("Ali", false),
                Person("Reza", false),
                Person("Hassan", false),
                Person("Hossein", false),
            )
        )
    }


    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
    ) {
        item {
            Text(
                text = "Title",
                fontSize = 20.sp,
                modifier = Modifier.fillMaxSize(),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
            )
        }

        items(items = persons) { person ->
            NameItem(person = person, onPersonCheckedChange = {
                persons = persons.map { person ->
                    if (person.name == it) {
                        person.copy(isSelected = !person.isSelected)
                    } else {
                        person
                    }
                }
            })
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    ListScreen()
}

@Composable
fun DefaultPreviewDark() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background,
    ) {
        ListScreen()

    }
}