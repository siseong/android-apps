package com.github.siseong.apps.instagram.presentation.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.airbnb.mvrx.compose.collectAsState
import com.airbnb.mvrx.compose.mavericksViewModel

@Composable
fun InstagramView() {
    val viewModel: InstagramViewModel = mavericksViewModel()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Box(
                modifier = Modifier.weight(1f)
        ) {
            BodyContainer(viewModel.collectAsState { it.selectedTab })
        }
        BottomNavigationView(viewModel.collectAsState { it.selectedTab }, viewModel.onTabClick)
    }
}