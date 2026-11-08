package com.example.onedayplan.core.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.onedayplan.core.database.entity.DayPlanEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface DayPlanDao {
    @Query("SELECT * FROM day_plans WHERE dateEpochDay = :epochDay LIMIT 1")
    fun getDayPlanByDate(epochDay: Long): Flow<DayPlanEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdate(dayPlan: DayPlanEntity)
}
