package com.github.siseong.art.presentation.ui.instagram

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.airbnb.mvrx.compose.collectAsState
import com.airbnb.mvrx.compose.mavericksViewModel
import com.github.siseong.art.presentation.ui.instagram.bottom.BottomNavigationView
import com.github.siseong.art.presentation.ui.instagram.container.BodyContainer

@Composable
fun InstagramView() {
    val viewModel: InstagramViewModel = mavericksViewModel()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {
        BodyContainer(viewModel.collectAsState { it.selectedTab })
        BottomNavigationView(viewModel.collectAsState { it.selectedTab })
    }
}