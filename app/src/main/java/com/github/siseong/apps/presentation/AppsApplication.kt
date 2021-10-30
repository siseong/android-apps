package com.github.siseong.apps.presentation

import android.app.Application
import com.airbnb.mvrx.Mavericks
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class AppsApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Mavericks.initialize(this)
    }
}