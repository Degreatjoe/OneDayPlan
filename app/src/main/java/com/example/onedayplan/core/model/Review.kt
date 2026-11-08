package com.example.onedayplan.core.model

import java.time.LocalDate

data class Review(
    val id: String,
    val dayPlanId: String,
    val date: LocalDate,
    val content: String,
    val rating: Int = 5
)
