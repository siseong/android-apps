package com.github.siseong.apps.instagram.presentation.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.airbnb.mvrx.compose.collectAsState
import com.airbnb.mvrx.compose.mavericksViewModel
import com.github.siseong.apps.instagram.presentation.entity.Tab
import com.github.siseong.apps.instagram.presentation.ui.home.Home
import com.github.siseong.apps.instagram.presentation.ui.profile.Profile
import com.github.siseong.apps.instagram.presentation.ui.reels.Reels
import com.github.siseong.apps.instagram.presentation.ui.search.Search
import com.github.siseong.apps.instagram.presentation.ui.shop.Shop

@Composable
fun InstagramView() {
    val viewModel: InstagramViewModel = mavericksViewModel()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {
        Box(
            modifier = Modifier.weight(1f)
        ) {
            val selectedTab = viewModel.collectAsState { it.selectedTab }
            when (selectedTab.value) {
                Tab.HOME -> Home()
                Tab.SEARCH -> Search()
                Tab.REELS -> Reels()
                Tab.SHOP -> Shop()
                Tab.PROFILE -> Profile()
            }
        }
        BottomNavigationView(viewModel.collectAsState { it.selectedTab }, viewModel.onTabClick)
    }
}