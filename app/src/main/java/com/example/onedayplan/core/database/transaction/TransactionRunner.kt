package com.example.onedayplan.core.database.transaction

interface TransactionRunner {
    suspend operator fun <T> invoke(block: suspend () -> T): T
}
