package com.example.test.screen.shared_feature

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SharedFeatureScreen(viewModel: SharedFeatureViewModel) {

    Column {
        Text("Shared feature")
        Text(viewModel.get())
        Text("")
    }
}