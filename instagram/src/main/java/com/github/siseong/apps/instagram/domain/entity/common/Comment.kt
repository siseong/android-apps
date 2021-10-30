package com.github.siseong.apps.instagram.domain.entity.common

data class Comment(
    val profile: Profile,
    val body: String,
    var like: Boolean
)
