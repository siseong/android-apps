package com.github.siseong.apps.instagram.presentation.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.airbnb.mvrx.compose.mavericksViewModel
import com.github.siseong.apps.instagram.presentation.ui.home.appbar.AppBarViewModel
import com.github.siseong.apps.instagram.presentation.ui.home.appbar.TopAppBar

@Composable
fun Home() {
    val viewModel: AppBarViewModel = mavericksViewModel()

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TopAppBar()
        HomeStories()
    }
}
