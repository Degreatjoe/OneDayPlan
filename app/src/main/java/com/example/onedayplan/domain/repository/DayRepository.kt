package com.example.onedayplan.domain.repository

import com.example.onedayplan.core.model.DayPlan
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

interface DayRepository {
    fun getDayPlan(date: LocalDate): Flow<DayPlan?>
    suspend fun saveDayPlan(dayPlan: DayPlan)
}
