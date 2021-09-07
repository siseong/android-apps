package com.github.siseong.art.domain.repository

import com.github.siseong.art.domain.entity.App
import kotlinx.coroutines.flow.Flow

interface AppRepository {
    fun getAppsFlow(): Flow<List<App>>
}