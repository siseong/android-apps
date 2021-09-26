package com.github.siseong.apps.instagram.presentation.ui.home

import com.airbnb.mvrx.MavericksState
import com.airbnb.mvrx.MavericksViewModel
import com.airbnb.mvrx.MavericksViewModelFactory
import com.airbnb.mvrx.ViewModelContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class HomeViewModel(
    initialState: CountState
) : MavericksViewModel<CountState>(initialState) {

    init {
        GlobalScope.launch(Dispatchers.IO) {
            setState { copy(count = 1) }
            delay(1000)
            setState { copy(count = 2) }
            delay(1000)
            setState { copy(count = 3) }
            delay(1000)
            setState { copy(count = 4) }
        }
    }

    companion object : MavericksViewModelFactory<HomeViewModel, CountState> {

        override fun initialState(viewModelContext: ViewModelContext): CountState {
            return CountState(0)
        }

        override fun create(viewModelContext: ViewModelContext, state: CountState): HomeViewModel {
            return HomeViewModel(state)
        }
    }
}

data class CountState(
    val count: Int
) : MavericksState
