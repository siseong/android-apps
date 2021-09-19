package com.github.siseong.apps.presentation.ui.apps

import androidx.lifecycle.ViewModel
import com.github.siseong.apps.domain.repository.AppRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AppsViewModel @Inject constructor(
    appRepository: AppRepository
) : ViewModel() {
    val apps = appRepository.getAppsFlow()
}