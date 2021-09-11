package com.github.siseong.art.presentation.ui.main

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun AppsView(
    viewModel: MainViewModel = viewModel()
) {
    val appList by viewModel.apps.collectAsState(initial = listOf())
    Text(text = appList.firstOrNull()?.title ?: "No App")
}