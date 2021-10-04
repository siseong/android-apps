package com.github.siseong.apps.instagram.presentation.ui.home

import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
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
    val scrollableState = rememberScrollState()
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TopAppBar()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .scrollable(
                    state = scrollableState,
                    orientation = Orientation.Vertical
                )
        ) {
            HomeStories()
            News()
        }
    }
}
