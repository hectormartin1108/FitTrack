package com.example.fittrack

import java.util.UUID

data class Exercise(
    val id: String,
    val name: String,
    val category: String,
    val difficulty: String,
    val previewInstructions: String,
    val recommendedDurationMinutes: Int,
    val stepByStepInstructions: List<String>,
)
data class WorkoutLogEntry(
    val id: String = UUID.randomUUID().toString(),
    val exerciseName: String,
    val category: String,
    val durationMinutes: Int,
    val timestamp: String
)

data class WorkoutUIState(
    val totalWorkouts: Int = 0,
    val totalDurationMinutes: Int = 0,
    val historyLog: List<WorkoutLogEntry> = emptyList()
)