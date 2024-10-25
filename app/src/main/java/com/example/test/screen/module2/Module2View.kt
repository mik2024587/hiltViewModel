package com.example.test.screen.module2

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun Module2View(viewModel: Module2ViewModel = hiltViewModel(), navigateToSharedFeature : () -> Unit) {
    Column {
        Text("Module 2")
        TextButton({
            navigateToSharedFeature()
        }) {
            Text("Navigate to shared feature")
        }
    }
}