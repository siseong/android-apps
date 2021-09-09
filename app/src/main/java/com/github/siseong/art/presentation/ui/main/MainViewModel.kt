package com.github.siseong.art.presentation.ui.main

import androidx.lifecycle.ViewModel
import com.github.siseong.art.domain.repository.AppRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    appRepository: AppRepository
) : ViewModel() {

}