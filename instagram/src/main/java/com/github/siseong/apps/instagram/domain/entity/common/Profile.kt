package com.github.siseong.apps.instagram.domain.entity.common

data class Profile(
    val name: String,
    val username: String,
    val photo: List<Image>,
    val url: String,
    val bio: String
)