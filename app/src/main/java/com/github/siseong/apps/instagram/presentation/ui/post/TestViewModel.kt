package com.github.siseong.apps.instagram.presentation.ui.post

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.airbnb.mvrx.MavericksState
import com.airbnb.mvrx.MavericksViewModel
import com.airbnb.mvrx.MavericksViewModelFactory
import com.airbnb.mvrx.ViewModelContext
import com.github.siseong.apps.instagram.domain.InstagramActivityState
import com.github.siseong.apps.instagram.domain.Tab
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class PostViewModel(
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

    companion object : MavericksViewModelFactory<PostViewModel, CountState> {

        override fun initialState(viewModelContext: ViewModelContext): CountState {
            return CountState(0)
        }

        override fun create(viewModelContext: ViewModelContext, state: CountState): PostViewModel {
            return PostViewModel(state)
        }
    }
}

data class CountState(
    val count: Int
) : MavericksState
