package com.github.siseong.art.presentation.ui.instagram

import com.airbnb.mvrx.MavericksViewModel

class InstagramViewModel (
    initialState: InstagramActivityState
): MavericksViewModel<InstagramActivityState>(initialState) {
    val onTabClick: (Tab) -> Unit = { tab ->
        setState { copy(selectedTab = tab) }
    }
}