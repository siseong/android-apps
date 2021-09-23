package com.github.siseong.apps.instagram.domain.common

data class Comment(
    val profile: Profile,
    val body: String,
    var like: Boolean
)
