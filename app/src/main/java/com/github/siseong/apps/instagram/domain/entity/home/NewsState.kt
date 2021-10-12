package com.github.siseong.apps.instagram.domain.entity.home

import com.airbnb.mvrx.MavericksState
import com.github.siseong.apps.instagram.domain.entity.post.Post

data class NewsState(
    val posts: List<Post>,
) : MavericksState
