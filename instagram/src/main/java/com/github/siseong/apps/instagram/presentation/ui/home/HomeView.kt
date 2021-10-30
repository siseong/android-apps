package com.github.siseong.apps.instagram.presentation.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.github.siseong.apps.instagram.presentation.ui.home.appbar.TopAppBar
import com.github.siseong.apps.instagram.presentation.ui.home.news.HomeNews

@Composable
fun Home() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TopAppBar()
        TopAppBarDivider(scrollState.value > 0)
        HomeNews()
    }
}

@Composable
fun TopAppBarDivider(
    enabled: Boolean
) {
    Divider(
        color = if (enabled) MaterialTheme.colors.onBackground else Color.Transparent,
        thickness = 0.2.dp
    )
}

@Composable
fun HomeStoryDivider(
) {
    Divider(
        color = MaterialTheme.colors.primaryVariant,
        thickness = 0.2.dp
    )
}

