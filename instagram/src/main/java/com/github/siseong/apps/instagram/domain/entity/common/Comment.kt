package com.github.siseong.apps.instagram.domain.entity.common

data class Comment(
    val profile: Profile,
    val body: Int, // Should be changed to String
    var like: Boolean
)
