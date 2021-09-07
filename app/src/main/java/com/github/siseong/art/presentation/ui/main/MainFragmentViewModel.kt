package com.github.siseong.art.presentation.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.github.siseong.art.domain.entity.App
import com.github.siseong.art.domain.repository.AppRepository

class MainFragmentViewModel(
    appRepository: AppRepository
) : ViewModel() {

    val apps: LiveData<List<App>> = appRepository.getAppsFlow().asLiveData()
}