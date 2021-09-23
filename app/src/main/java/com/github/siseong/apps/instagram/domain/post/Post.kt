package com.github.siseong.apps.instagram.domain.post

import com.github.siseong.apps.instagram.domain.common.Comment
import com.github.siseong.apps.instagram.domain.common.Medium

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