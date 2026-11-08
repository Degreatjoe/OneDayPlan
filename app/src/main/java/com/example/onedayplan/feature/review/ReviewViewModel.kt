package com.example.onedayplan.feature.review

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.onedayplan.core.common.AsyncResult
import com.example.onedayplan.core.common.asAsyncResult
import com.example.onedayplan.core.model.Review
import com.example.onedayplan.domain.repository.ReviewRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import java.time.LocalDate
import javax.inject.Inject

@HiltViewModel
class ReviewViewModel @Inject constructor(
    private val reviewRepository: ReviewRepository
) : ViewModel() {

    val uiState: StateFlow<AsyncResult<Review?>> =
        reviewRepository.getReview(LocalDate.now())
            .asAsyncResult()
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(5_000),
                initialValue = AsyncResult.Loading
            )
}
