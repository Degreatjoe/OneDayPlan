package com.example.onedayplan.data.local

import com.example.onedayplan.core.database.dao.DayPlanDao
import com.example.onedayplan.core.database.entity.DayPlanEntity
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate
import javax.inject.Inject

class DayPlanLocalDataSource @Inject constructor(
    private val dayPlanDao: DayPlanDao
) {
    fun getDayPlan(date: LocalDate): Flow<DayPlanEntity?> {
        return dayPlanDao.getDayPlanByDate(date.toEpochDay())
    }

    suspend fun saveDayPlan(dayPlan: DayPlanEntity) {
        dayPlanDao.insertOrUpdate(dayPlan)
    }
}
