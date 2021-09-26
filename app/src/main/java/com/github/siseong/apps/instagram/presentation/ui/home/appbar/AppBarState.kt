package com.github.siseong.apps.instagram.presentation.ui.home.appbar

import com.airbnb.mvrx.MavericksState

data class AppBarState (
    val newActivity: Boolean,
    val newMessage: Int
): MavericksState
