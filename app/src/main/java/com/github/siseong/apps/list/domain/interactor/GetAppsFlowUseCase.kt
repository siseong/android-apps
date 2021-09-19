package com.github.siseong.apps.list.domain.interactor

import com.github.siseong.apps.list.domain.entity.App
import com.github.siseong.apps.common.interactor.UseCase
import com.github.siseong.apps.list.domain.repository.AppRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow

class GetAppsFlowUseCase(
    coroutineDispatcher: CoroutineDispatcher,
    private val appRepository: AppRepository,
) : UseCase<Unit, Flow<List<App>>>(coroutineDispatcher) {
    override suspend fun execute(parameters: Unit): Flow<List<App>> {
        return appRepository.getAppsFlow()
    }
}