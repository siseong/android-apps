package com.github.siseong.apps.instagram.domain

import com.airbnb.mvrx.MavericksState
import com.github.siseong.apps.R

data class InstagramActivityState(
    val selectedTab: Tab
) : MavericksState

enum class Tab(
    val checkedDrawableRes: Int,
    val uncheckedDrawableRes: Int,
) {
    HOME(
        R.drawable.ic_home_checked,
        R.drawable.ic_home_unchecked
    ),
    SEARCH(
        R.drawable.ic_search_checked,
        R.drawable.ic_search_unchecked
    ),
    REELS(
        R.drawable.ic_reels_checked,
        R.drawable.ic_reels_unchecked
    ),
    SHOP(
        R.drawable.ic_shop_checked,
        R.drawable.ic_shop_unchecked
    ),
    PROFILE(
        R.drawable.ic_profile_checked,
        R.drawable.ic_profile_unchecked
    )
}
