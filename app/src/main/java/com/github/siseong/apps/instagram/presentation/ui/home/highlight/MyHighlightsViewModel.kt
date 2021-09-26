package com.github.siseong.apps.instagram.presentation.ui.home.highlight

import com.airbnb.mvrx.MavericksViewModel
import com.airbnb.mvrx.MavericksViewModelFactory
import com.airbnb.mvrx.ViewModelContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MyHighlightsViewModel(
    initialState: MyHighlightsState
) : MavericksViewModel<MyHighlightsState>(initialState) {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            setState { copy(stories = listOf()) }
            delay(1000)
        }
    }

    companion object : MavericksViewModelFactory<MyHighlightsViewModel, MyHighlightsState> {

        override fun initialState(viewModelContext: ViewModelContext): MyHighlightsState {
            return MyHighlightsState(listOf())
        }

        override fun create(viewModelContext: ViewModelContext, state: MyHighlightsState): MyHighlightsViewModel {
            return MyHighlightsViewModel(state)
        }
    }
}