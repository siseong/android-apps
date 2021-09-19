package com.github.siseong.apps.list.domain.entity

import androidx.annotation.DrawableRes

data class App(
    val title: String,
    val description: String,
    val imageSource: ImageSource,
    val onClick: () -> Unit = { }
)

sealed class ImageSource {
    data class LocalImage(@DrawableRes val resId: Int) : ImageSource()
    data class RemoteImage(val url: String) : ImageSource()
}
