package com.github.siseong.art.presentation.ui.apps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.Surface
import com.github.siseong.art.presentation.ui.apps.AppsPreview
import com.github.siseong.art.presentation.ui.apps.theme.AppsTheme
import dagger.hilt.android.AndroidEntryPoint

@ExperimentalFoundationApi
@AndroidEntryPoint
class AppsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppsTheme {
                AppsPreview()
            }
        }
    }
}