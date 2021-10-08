package com.github.siseong.apps.instagram.presentation.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.airbnb.mvrx.compose.mavericksViewModel
import com.github.siseong.apps.instagram.presentation.ui.home.appbar.AppBarViewModel
import com.github.siseong.apps.instagram.presentation.ui.home.appbar.TopAppBar
import com.github.siseong.apps.instagram.presentation.ui.home.highlight.HomeStories
import com.github.siseong.apps.instagram.presentation.ui.home.news.News

@Composable
fun Home() {
    val viewModel: AppBarViewModel = mavericksViewModel()
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TopAppBar()
        TopAppBarDivider(scrollState.value > 0)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            HomeStories()
            HomeStoryDivider()
            News()
        }
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

