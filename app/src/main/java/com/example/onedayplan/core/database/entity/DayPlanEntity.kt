package com.example.onedayplan.core.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "day_plans")
data class DayPlanEntity(
    @PrimaryKey val id: String,
    val dateEpochDay: Long,
    val title: String,
    val isCompleted: Boolean
)
