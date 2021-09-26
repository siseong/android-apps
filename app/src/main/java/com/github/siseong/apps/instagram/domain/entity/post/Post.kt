package com.github.siseong.apps.instagram.domain.entity.post

import com.github.siseong.apps.instagram.domain.entity.common.Comment
import com.github.siseong.apps.instagram.domain.entity.common.Medium

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