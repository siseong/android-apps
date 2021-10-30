package com.github.siseong.apps.domain.repository

import com.github.siseong.apps.domain.entity.App
import kotlinx.coroutines.flow.Flow

interface AppRepository {
    fun getAppsFlow(): Flow<List<App>>
}