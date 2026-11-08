package com.example.onedayplan.core.database.di

import android.content.Context
import androidx.room.Room
import com.example.onedayplan.core.database.OneDayPlanDatabase
import com.example.onedayplan.core.database.dao.DayPlanDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): OneDayPlanDatabase {
        return Room.databaseBuilder(
            context,
            OneDayPlanDatabase::class.java,
            "onedayplan.db"
        ).fallbackToDestructiveMigration(dropAllTables = true).build()
    }

    @Provides
    fun provideDayPlanDao(database: OneDayPlanDatabase): DayPlanDao {
        return database.dayPlanDao()
    }
}
