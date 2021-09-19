package com.github.siseong.apps.presentation.ui.instagram

import com.airbnb.mvrx.MavericksViewModel

class InstagramViewModel (
    initialState: InstagramActivityState
): MavericksViewModel<InstagramActivityState>(initialState) {
    val onTabClick: (Tab) -> Unit = { tab ->
        setState { copy(selectedTab = tab) }
    }
}