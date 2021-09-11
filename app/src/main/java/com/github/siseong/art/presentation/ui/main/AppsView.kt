package com.github.siseong.art.presentation.ui.main

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.github.siseong.art.domain.entity.App

@ExperimentalFoundationApi
@Preview
@Composable
fun AppsPreview(
    viewModel: MainViewModel = viewModel()
) {
    val appList by viewModel.apps.collectAsState(initial = listOf())
    LazyVerticalGrid(
        cells = GridCells.Fixed(2)
    ) {
        items(appList.size) { index ->
            AppPreview(app = appList[index])
        }
    }
}

@Composable
fun AppPreview(
    app: App
) {
    Text(text = app.title)
}