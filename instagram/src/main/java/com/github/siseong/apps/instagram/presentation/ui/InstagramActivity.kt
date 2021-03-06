package com.github.siseong.apps.instagram.presentation.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.github.siseong.apps.instagram.presentation.ui.theme.InstagramTheme

class InstagramActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Log.d("TAG", "onCreate")
            InstagramTheme {
                InstagramView()
            }
        }
    }
}