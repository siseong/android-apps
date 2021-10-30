package com.github.siseong.apps.instagram.presentation.ui

import com.airbnb.mvrx.MavericksViewModel
import com.airbnb.mvrx.MavericksViewModelFactory
import com.airbnb.mvrx.ViewModelContext
import com.github.siseong.apps.instagram.presentation.entity.InstagramActivityState
import com.github.siseong.apps.instagram.presentation.entity.Tab

class InstagramViewModel(
    initialState: InstagramActivityState
) : MavericksViewModel<InstagramActivityState>(initialState) {
    val onTabClick: (Tab) -> Unit = { tab ->
        setState { copy(selectedTab = tab) }
    }

    companion object : MavericksViewModelFactory<InstagramViewModel, InstagramActivityState> {

        override fun initialState(viewModelContext: ViewModelContext): InstagramActivityState {
            return InstagramActivityState(Tab.HOME)
        }

        override fun create(viewModelContext: ViewModelContext, state: InstagramActivityState): InstagramViewModel {
            return InstagramViewModel(state)
        }
    }
}