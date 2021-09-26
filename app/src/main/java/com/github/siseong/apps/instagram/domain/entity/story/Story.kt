package com.github.siseong.apps.instagram.domain.entity.story

import com.github.siseong.apps.instagram.domain.entity.common.Image
import com.github.siseong.apps.instagram.domain.entity.common.Video
import com.github.siseong.apps.instagram.domain.entity.profile.Author

data class Story (
    val title: String,
    val author: Author,
    val thumbnailImage: Image,
    val video: Video,
)