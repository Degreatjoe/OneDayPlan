package com.example.onedayplan.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.onedayplan.core.database.converter.DateConverter
import com.example.onedayplan.core.database.dao.DayPlanDao
import com.example.onedayplan.core.database.entity.DayPlanEntity

@Database(
    entities = [DayPlanEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(DateConverter::class)
abstract class OneDayPlanDatabase : RoomDatabase() {
    abstract fun dayPlanDao(): DayPlanDao
}
