package com.github.siseong.art.presentation.ui.main

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun MainView(
    viewModel: MainViewModel = viewModel()
) {
    Text(text = "App1")
}