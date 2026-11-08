package com.example.onedayplan.domain.usecase

import com.example.onedayplan.core.model.Review
import com.example.onedayplan.domain.repository.ReviewRepository
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate
import javax.inject.Inject

class GetReviewUseCase @Inject constructor(
    private val reviewRepository: ReviewRepository
) {
    operator fun invoke(date: LocalDate = LocalDate.now()): Flow<Review?> {
        return reviewRepository.getReview(date)
    }
}
