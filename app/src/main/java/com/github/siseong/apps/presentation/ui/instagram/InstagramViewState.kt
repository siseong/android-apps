package com.github.siseong.apps.presentation.ui.instagram

import com.airbnb.mvrx.MavericksState
import com.github.siseong.apps.R

data class InstagramActivityState(
    val selectedTab: Tab
): MavericksState

enum class Tab(
    val checkedDrawableRes: Int,
    val uncheckedDrawableRes: Int,
) {
    HOME(
        R.drawable.ic_home_checked,
        R.drawable.ic_home_unchecked
    ),
    SEARCH(
        R.drawable.ic_home_checked,
        R.drawable.ic_home_unchecked
    ),
    REELS(
        R.drawable.ic_home_checked,
        R.drawable.ic_home_unchecked
    ),
    SHOP(
        R.drawable.ic_home_checked,
        R.drawable.ic_home_unchecked
    ),
    PROFILE(
        R.drawable.ic_home_checked,
        R.drawable.ic_home_unchecked
    )
}
