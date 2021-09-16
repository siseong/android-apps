package com.github.siseong.art.domain.entity.instagram

data class Comment(
    val profile: Profile,
    val body: String,
    var like: Boolean
)
