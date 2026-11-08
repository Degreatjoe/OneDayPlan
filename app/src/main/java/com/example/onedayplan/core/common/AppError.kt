package com.example.onedayplan.core.common

/**
 * Sealed interface representing application-level errors.
 */
sealed interface AppError {
    val message: String
    val cause: Throwable?

    data class DatabaseError(
        override val message: String = "A database error occurred.",
        override val cause: Throwable? = null
    ) : AppError

    data class NotFoundError(
        override val message: String = "The requested resource was not found.",
        override val cause: Throwable? = null
    ) : AppError

    data class ValidationError(
        override val message: String = "Validation failed.",
        override val cause: Throwable? = null
    ) : AppError

    data class UnknownError(
        override val message: String = "An unexpected error occurred.",
        override val cause: Throwable? = null
    ) : AppError
}
