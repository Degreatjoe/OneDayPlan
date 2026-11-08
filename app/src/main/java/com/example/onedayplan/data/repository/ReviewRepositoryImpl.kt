package com.example.onedayplan.data.repository

import com.example.onedayplan.core.model.Review
import com.example.onedayplan.domain.repository.ReviewRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import java.time.LocalDate
import javax.inject.Inject

class ReviewRepositoryImpl @Inject constructor() : ReviewRepository {

    override fun getReview(date: LocalDate): Flow<Review?> {
        return flowOf(
            Review(
                id = "review_1",
                dayPlanId = "plan_1",
                date = date,
                content = "Placeholder review for $date",
                rating = 5
            )
        )
    }

    override suspend fun saveReview(review: Review) {
        // Placeholder save review implementation
    }
}
