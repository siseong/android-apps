package com.github.siseong.apps.instagram.domain.entity.post

import com.github.siseong.apps.instagram.domain.entity.common.Comment
import com.github.siseong.apps.instagram.domain.entity.common.Medium
import com.github.siseong.apps.instagram.domain.entity.profile.Author

data class Post(
    val author: Author,
    val media: List<Medium>,
    val comments: List<Comment>,
    val imagePath: String,
    var like: Boolean,
    var likeTotal: Int,
    var bookmarked: Boolean,
    var postedTime: Long
)