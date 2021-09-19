package com.github.siseong.apps.list.presentation.di

import com.github.siseong.apps.list.data.AppRepositoryImpl
import com.github.siseong.apps.list.domain.repository.AppRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class SingletonModule {
    @Binds
    abstract fun bindAppRepository(
        appRepositoryImpl: AppRepositoryImpl
    ): AppRepository
}