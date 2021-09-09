package com.github.siseong.art.presentation.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.github.siseong.art.R
import com.github.siseong.art.presentation.ui.main.MainView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SingleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainView()
        }
    }
}