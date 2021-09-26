package com.github.siseong.apps.instagram.presentation.entity.common

import androidx.annotation.DrawableRes
import com.github.siseong.apps.instagram.domain.entity.common.MediumSource

sealed class AndroidMediumSource: MediumSource {
    data class Local(@DrawableRes val resId: Int)
    data class Remote(val url: String)
}
