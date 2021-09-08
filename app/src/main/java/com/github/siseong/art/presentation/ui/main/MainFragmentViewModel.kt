package com.github.siseong.art.presentation.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.github.siseong.art.domain.entity.App
import com.github.siseong.art.domain.repository.AppRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainFragmentViewModel @Inject constructor(
    appRepository: AppRepository
) : ViewModel() {

    val apps: LiveData<List<App>> = appRepository.getAppsFlow().asLiveData()
}