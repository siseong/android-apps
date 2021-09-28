package com.github.siseong.apps.instagram.domain.entity.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource

abstract class Medium(val source: MediumSource)

class Image(source: MediumSource) : Medium(source)
class Video(source: MediumSource, timeLengthSec: Int) : Medium(source)

sealed class MediumSource {
    @Composable
    abstract fun toPainter(): Painter

    data class Local(val resId: Int) : MediumSource() {
        @Composable
        override fun toPainter(): Painter = painterResource(resId)
    }

    data class Remote(val url: String) : MediumSource() {
        @Composable
        override fun toPainter(): Painter {
            TODO("Not yet implemented")
        }
    }
}