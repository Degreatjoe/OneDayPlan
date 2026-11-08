package com.example.onedayplan.domain.usecase

import com.example.onedayplan.core.model.DayPlan
import com.example.onedayplan.domain.repository.DayRepository
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate
import javax.inject.Inject

class GetTodayPlanUseCase @Inject constructor(
    private val dayRepository: DayRepository
) {
    operator fun invoke(date: LocalDate = LocalDate.now()): Flow<DayPlan?> {
        return dayRepository.getDayPlan(date)
    }
}
