package com.github.siseong.apps.list.domain.repository

import com.github.siseong.apps.list.domain.entity.App
import kotlinx.coroutines.flow.Flow

interface AppRepository {
    fun getAppsFlow(): Flow<List<App>>
}