package com.example.onedayplan.feature.day

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.onedayplan.core.common.AsyncResult
import com.example.onedayplan.core.common.asAsyncResult
import com.example.onedayplan.core.model.DayPlan
import com.example.onedayplan.domain.repository.DayRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import java.time.LocalDate
import javax.inject.Inject

@HiltViewModel
class TodayViewModel @Inject constructor(
    private val dayRepository: DayRepository
) : ViewModel() {

    val uiState: StateFlow<AsyncResult<DayPlan?>> =
        dayRepository.getDayPlan(LocalDate.now())
            .asAsyncResult()
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(5_000),
                initialValue = AsyncResult.Loading
            )
}
