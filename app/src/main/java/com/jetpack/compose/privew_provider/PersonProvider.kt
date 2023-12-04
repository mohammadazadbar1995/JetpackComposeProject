package com.jetpack.compose.privew_provider

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.jetpack.compose.domain.Person

class PersonProvider : PreviewParameterProvider<Person> {
    override val values = sequenceOf(
        Person("Mohammad", false)
    )
}