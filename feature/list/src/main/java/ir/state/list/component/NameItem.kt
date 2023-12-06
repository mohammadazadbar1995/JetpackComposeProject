package ir.state.list.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ir.state.designsystem.privew_provider.ThemePreview
import ir.state.list.privew_provider.PersonProvider
import ir.state.person.model.Person

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