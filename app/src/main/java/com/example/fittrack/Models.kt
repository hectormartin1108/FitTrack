package com.example.fittrack

import java.util.UUID

data class Exercise(
    val id: String,
    val name: String,
    val category: String,
    val difficulty: String,
    val previewInstructions: String,
    val recommendedDurationMinutes: Int
)

