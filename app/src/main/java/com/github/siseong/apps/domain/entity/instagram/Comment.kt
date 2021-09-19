package com.github.siseong.apps.domain.entity.instagram

data class Comment(
    val profile: Profile,
    val body: String,
    var like: Boolean
)
