package com.example.onedayplan.core.common

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart

/**
 * Sealed interface representing an asynchronous result state.
 */
sealed interface AsyncResult<out T> {
    data object Loading : AsyncResult<Nothing>
    data class Success<T>(val data: T) : AsyncResult<T>
    data class Error(val error: AppError) : AsyncResult<Nothing>
}

/**
 * Converts a [Flow] of [T] into a [Flow] of [AsyncResult<T>].
 */
fun <T> Flow<T>.asAsyncResult(): Flow<AsyncResult<T>> {
    return this
        .map<T, AsyncResult<T>> { AsyncResult.Success(it) }
        .onStart { emit(AsyncResult.Loading) }
        .catch { throwable ->
            emit(AsyncResult.Error(AppError.UnknownError(cause = throwable)))
        }
}
