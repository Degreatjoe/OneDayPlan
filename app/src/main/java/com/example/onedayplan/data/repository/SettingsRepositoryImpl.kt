package com.example.onedayplan.data.repository

import com.example.onedayplan.domain.repository.SettingsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SettingsRepositoryImpl @Inject constructor() : SettingsRepository {

    private val isDarkMode = MutableStateFlow(false)

    override fun isDarkModeEnabled(): Flow<Boolean> = isDarkMode

    override suspend fun setDarkMode(enabled: Boolean) {
        isDarkMode.value = enabled
    }
}
