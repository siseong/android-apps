package com.github.siseong.art.presentation.ui.instagram

import com.airbnb.mvrx.MavericksState

data class InstagramActivityState(
    val selectedTab: Tab
): MavericksState

enum class Tab {
    HOME, SEARCH, REELS, SHOP, PROFILE
}
