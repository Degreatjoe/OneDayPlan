package com.example.onedayplan.data.di

import com.example.onedayplan.data.repository.DayRepositoryImpl
import com.example.onedayplan.data.repository.ReviewRepositoryImpl
import com.example.onedayplan.data.repository.SettingsRepositoryImpl
import com.example.onedayplan.domain.repository.DayRepository
import com.example.onedayplan.domain.repository.ReviewRepository
import com.example.onedayplan.domain.repository.SettingsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindDayRepository(
        impl: DayRepositoryImpl
    ): DayRepository

    @Binds
    @Singleton
    abstract fun bindReviewRepository(
        impl: ReviewRepositoryImpl
    ): ReviewRepository

    @Binds
    @Singleton
    abstract fun bindSettingsRepository(
        impl: SettingsRepositoryImpl
    ): SettingsRepository
}
