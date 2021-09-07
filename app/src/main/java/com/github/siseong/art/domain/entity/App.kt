package com.github.siseong.art.domain.entity

import android.media.Image
import androidx.annotation.DrawableRes

data class App(
        val title: String,
        val description: String,
        val imageSource: ImageSource,
)

sealed class ImageSource {
        data class LocalImage(@DrawableRes val resId: Int): ImageSource()
        data class RemoteImage(val url: String): ImageSource()
}
