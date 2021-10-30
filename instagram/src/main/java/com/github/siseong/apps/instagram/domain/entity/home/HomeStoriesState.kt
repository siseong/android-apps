package com.github.siseong.apps.instagram.domain.entity.home

import com.airbnb.mvrx.MavericksState
import com.github.siseong.apps.instagram.domain.entity.story.Story

data class HomeStoriesState (
    val myStory: Story,
    val friendStories: List<Story>,
): MavericksState
