package com.github.siseong.apps.instagram.domain.entity.home

import com.airbnb.mvrx.MavericksState

data class AppBarState (
    val newActivity: Boolean,
    val newMessage: Int
): MavericksState
