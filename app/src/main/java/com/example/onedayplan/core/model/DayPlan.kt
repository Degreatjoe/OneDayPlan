package com.example.onedayplan.core.model

import java.time.LocalDate

data class DayPlan(
    val id: String,
    val date: LocalDate,
    val title: String,
    val items: List<PlanItem> = emptyList(),
    val isCompleted: Boolean = false
)
