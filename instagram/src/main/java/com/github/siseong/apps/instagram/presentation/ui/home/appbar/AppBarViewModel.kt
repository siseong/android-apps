package com.github.siseong.apps.instagram.presentation.ui.home.appbar

import com.airbnb.mvrx.MavericksViewModel
import com.airbnb.mvrx.MavericksViewModelFactory
import com.airbnb.mvrx.ViewModelContext
import com.github.siseong.apps.instagram.domain.entity.home.AppBarState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class AppBarViewModel(
    initialState: AppBarState
) : MavericksViewModel<AppBarState>(initialState) {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            setState { copy(newActivity = true) }
            delay(1000)
            setState { copy(newMessage = 3) }
            delay(1000)
            setState { copy(newMessage = 0) }
            delay(1000)
            setState { copy(newActivity = false) }
        }
    }

    companion object : MavericksViewModelFactory<AppBarViewModel, AppBarState> {

        override fun initialState(viewModelContext: ViewModelContext): AppBarState {
            return AppBarState(false, 0)
        }

        override fun create(viewModelContext: ViewModelContext, state: AppBarState): AppBarViewModel {
            return AppBarViewModel(state)
        }
    }
}