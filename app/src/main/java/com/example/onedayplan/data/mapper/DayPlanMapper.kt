package com.example.onedayplan.data.mapper

import com.example.onedayplan.core.database.entity.DayPlanEntity
import com.example.onedayplan.core.model.DayPlan
import java.time.LocalDate

fun DayPlanEntity.toDomainModel(): DayPlan {
    return DayPlan(
        id = id,
        date = LocalDate.ofEpochDay(dateEpochDay),
        title = title,
        items = emptyList(),
        isCompleted = isCompleted
    )
}

fun DayPlan.toEntity(): DayPlanEntity {
    return DayPlanEntity(
        id = id,
        dateEpochDay = date.toEpochDay(),
        title = title,
        isCompleted = isCompleted
    )
}
