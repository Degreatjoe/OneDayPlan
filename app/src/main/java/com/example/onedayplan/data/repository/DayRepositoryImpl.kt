package com.example.onedayplan.data.repository

import com.example.onedayplan.core.model.DayPlan
import com.example.onedayplan.data.local.DayPlanLocalDataSource
import com.example.onedayplan.data.mapper.toDomainModel
import com.example.onedayplan.data.mapper.toEntity
import com.example.onedayplan.domain.repository.DayRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import java.time.LocalDate
import javax.inject.Inject

class DayRepositoryImpl @Inject constructor(
    private val localDataSource: DayPlanLocalDataSource
) : DayRepository {

    override fun getDayPlan(date: LocalDate): Flow<DayPlan?> {
        return localDataSource.getDayPlan(date).map { entity ->
            entity?.toDomainModel()
        }
    }

    override suspend fun saveDayPlan(dayPlan: DayPlan) {
        localDataSource.saveDayPlan(dayPlan.toEntity())
    }
}
