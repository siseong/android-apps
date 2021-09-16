package com.github.siseong.art.presentation.ui.instagram.bottom

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.github.siseong.art.presentation.ui.instagram.Tab

@Composable
fun BottomNavigationView(tab: State<Tab>, onTabClick: (Tab) -> Unit) {
    Row(
        modifier = Modifier
            .background(Color.Black)
            .padding(10.dp)
            .fillMaxWidth()
            .height(50.dp)
            .padding(5.dp)
    ) {
        BottomItem(Tab.HOME, tab.value, onTabClick)
        BottomItem(Tab.REELS, tab.value, onTabClick)
        BottomItem(Tab.SHOP, tab.value, onTabClick)
        BottomItem(Tab.PROFILE, tab.value, onTabClick)
    }
}

@Composable
fun BottomItem(
    tab: Tab,
    selectedTab: Tab,
    onClick: (Tab) -> Unit
) {
    Image(
        painter = painterResource(id = if (tab == selectedTab) tab.checkedDrawableRes else tab.uncheckedDrawableRes),
        contentDescription = tab.name
    )
}