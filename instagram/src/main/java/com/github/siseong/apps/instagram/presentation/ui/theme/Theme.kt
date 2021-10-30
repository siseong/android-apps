/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.siseong.apps.instagram.presentation.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@SuppressLint("ConflictingOnColor")
private val LightColors = lightColors(
    primary = Color.White,
    onPrimary = Color.Black,
    primaryVariant = Gray300,
    secondary = Gray700,
    secondaryVariant = Blue700,
    surface = Blue300,
    onSurface = Color.White,
    background = Color.White,
    onBackground = Color.Black
)

@SuppressLint("ConflictingOnColor")
private val DarkColors = darkColors(
    primary = Color.Black,
    onPrimary = Color.White,
    primaryVariant = Gray900,
    secondary = Gray300,
    secondaryVariant = Blue100,
    surface = Blue300,
    background = Color.Black,
    onBackground = Color.White
)

@Composable
fun InstagramTheme(
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colors = if (isSystemInDarkTheme()) DarkColors else LightColors,
        shapes = postShapes,
        content = content
    )
}
