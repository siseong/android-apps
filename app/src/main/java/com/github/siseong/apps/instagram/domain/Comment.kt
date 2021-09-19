package com.github.siseong.apps.instagram.domain

data class Comment(
    val profile: Profile,
    val body: String,
    var like: Boolean
)
