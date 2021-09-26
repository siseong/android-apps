package com.github.siseong.apps.instagram.presentation.ui.home.highlight

import com.airbnb.mvrx.MavericksState
import com.github.siseong.apps.instagram.domain.entity.story.Story

data class MyHighlightsState (
    val stories: List<Story>,
): MavericksState
