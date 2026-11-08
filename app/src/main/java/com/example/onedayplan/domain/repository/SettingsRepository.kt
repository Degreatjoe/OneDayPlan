package com.example.onedayplan.domain.repository

import kotlinx.coroutines.flow.Flow

interface SettingsRepository {
    fun isDarkModeEnabled(): Flow<Boolean>
    suspend fun setDarkMode(enabled: Boolean)
}
