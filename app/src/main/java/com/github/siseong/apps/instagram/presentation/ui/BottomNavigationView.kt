package com.github.siseong.apps.instagram.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.github.siseong.apps.instagram.domain.Tab

@Composable
fun BottomNavigationView(tab: State<Tab>, onTabClick: (Tab) -> Unit) {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .background(Color.Black)
            .fillMaxWidth()
            .height(45.dp),
    ) {
        BottomItem(Tab.HOME, tab.value, onTabClick)
        BottomItem(Tab.SEARCH, tab.value, onTabClick)
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
        contentDescription = tab.name,
        modifier = Modifier.fillMaxHeight()
            .clickable { onClick(tab) }
            .width(65.dp)
            .padding(8.dp),
    )
}