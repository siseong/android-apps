package com.github.siseong.apps.data

import com.github.siseong.apps.domain.entity.App
import com.github.siseong.apps.domain.repository.AppRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class AppRepositoryImpl @Inject constructor() : AppRepository {
    override fun getAppsFlow(): Flow<List<App>> {
        // TODO(Below is flow Example)
        return flow {
        }
    }
}