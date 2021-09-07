package com.github.siseong.art.domain.interactor.company

import com.github.siseong.art.domain.entity.App
import com.github.siseong.art.domain.interactor.UseCase
import com.github.siseong.art.domain.repository.AppRepository
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