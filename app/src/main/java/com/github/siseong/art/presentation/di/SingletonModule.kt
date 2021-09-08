package com.github.siseong.art.presentation.di

import com.github.siseong.art.data.AppRepositoryImpl
import com.github.siseong.art.domain.repository.AppRepository
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