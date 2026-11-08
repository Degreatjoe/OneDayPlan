package com.example.onedayplan.domain.repository

import com.example.onedayplan.core.model.Review
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

interface ReviewRepository {
    fun getReview(date: LocalDate): Flow<Review?>
    suspend fun saveReview(review: Review)
}
