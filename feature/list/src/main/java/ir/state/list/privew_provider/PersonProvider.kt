package ir.state.list.privew_provider

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import ir.state.person.model.Person

class PersonProvider : PreviewParameterProvider<Person> {
    override val values = sequenceOf(
        Person("Mohammad", false)
    )
}