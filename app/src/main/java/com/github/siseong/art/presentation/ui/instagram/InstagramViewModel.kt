package com.github.siseong.art.presentation.ui.instagram

import com.airbnb.mvrx.MavericksViewModel

class InstagramViewModel (
    initialState: InstagramActivityState
): MavericksViewModel<InstagramActivityState>(initialState) {
    fun changeTab(tab: Tab) {
        setState { copy(selectedTab = tab) }
    }
}