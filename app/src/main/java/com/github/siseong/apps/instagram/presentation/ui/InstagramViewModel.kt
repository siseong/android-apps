package com.github.siseong.apps.instagram.presentation.ui

import com.airbnb.mvrx.MavericksViewModel

class InstagramViewModel (
    initialState: InstagramActivityState
): MavericksViewModel<InstagramActivityState>(initialState) {
    val onTabClick: (Tab) -> Unit = { tab ->
        setState { copy(selectedTab = tab) }
    }
}