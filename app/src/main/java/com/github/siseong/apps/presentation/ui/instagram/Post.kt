package com.github.siseong.apps.presentation.ui.instagram

import com.github.siseong.apps.domain.entity.instagram.Comment
import com.github.siseong.apps.domain.entity.instagram.Medium

data class Post(
    val authorName: String,
    val authorImagePath: String,
    val medias: List<Medium>,
    val comments: MutableList<Comment>,
    val imagePath: String,
    var like: Boolean,
    var likeTotal: Int,
    var bookmarked: Boolean,
    var postedTime: Long
)