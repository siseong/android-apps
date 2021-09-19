package com.github.siseong.apps.domain.entity.instagram

sealed class Medium {
    data class Image(val path: String): Medium()
    data class Movie(val path: String, val timeLength: Int)
}
