package com.github.siseong.apps.instagram.presentation.ui.home.news

import com.airbnb.mvrx.MavericksViewModel
import com.airbnb.mvrx.MavericksViewModelFactory
import com.airbnb.mvrx.ViewModelContext
import com.github.siseong.apps.instagram.domain.entity.home.NewsState

class NewsViewModel(
    initialState: NewsState
) : MavericksViewModel<NewsState>(initialState) {

    /*
    init {
        viewModelScope.launch(Dispatchers.IO) {
            setState { copy(posts = listOf()) }
        }
    }
     */

    companion object : MavericksViewModelFactory<NewsViewModel, NewsState> {
        override fun initialState(viewModelContext: ViewModelContext): NewsState {
            return NewsState(
                listOf()
            )
        }

        override fun create(viewModelContext: ViewModelContext, state: NewsState): NewsViewModel {
            return NewsViewModel(state)
        }
    }
}