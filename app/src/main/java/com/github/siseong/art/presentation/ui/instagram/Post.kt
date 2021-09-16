package com.github.siseong.art.presentation.ui.instagram

import com.github.siseong.art.domain.entity.instagram.Comment
import com.github.siseong.art.domain.entity.instagram.Medium

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