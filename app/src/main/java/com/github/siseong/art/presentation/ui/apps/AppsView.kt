package com.github.siseong.art.presentation.ui.apps

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.github.siseong.art.domain.entity.App

@ExperimentalFoundationApi
@Preview
@Composable
fun AppsPreview(
    viewModel: AppsViewModel = viewModel()
) {
    val appList by viewModel.apps.collectAsState(initial = listOf())
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(MaterialTheme.colors.background)
            .padding(horizontal = 20.dp, vertical = 10.dp)
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
    Text(
        text = app.title,
        color = MaterialTheme.colors.onPrimary,
    )
}