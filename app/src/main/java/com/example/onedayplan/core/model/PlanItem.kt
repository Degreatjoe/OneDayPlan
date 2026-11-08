package com.example.onedayplan.core.model

data class PlanItem(
    val id: String,
    val dayPlanId: String,
    val title: String,
    val isDone: Boolean = false,
    val order: Int = 0
)
