package com.example.test.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable

@Composable
fun MainView(navigateToModule1 : () -> Unit, navigateToModule2: () -> Unit) {

    Column {
        TextButton({
            navigateToModule1()
        }) {
            Text("Navigate Module 1")
        }
        TextButton({
            navigateToModule2()
        }) {
            Text("Navigate Module 2")
        }

    }
}