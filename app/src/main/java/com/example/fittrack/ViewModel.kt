package com.example.fittrack

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class WorkoutViewModel : ViewModel() {

    var uiState by mutableStateOf(WorkoutUIState())

    fun logWorkout(exercise: Exercise, durationMinutes: Int) {
        val timestamp = SimpleDateFormat("MMM dd, yyyy - hh:mm a", Locale.getDefault()).format(Date())
        val newEntry = WorkoutLogEntry(
            exerciseName = exercise.name,
            category = exercise.category,
            durationMinutes = durationMinutes,
            timestamp = timestamp
        )

        uiState = uiState.copy(
            totalWorkouts = uiState.totalWorkouts + 1,
            totalDurationMinutes = uiState.totalDurationMinutes + durationMinutes,
            historyLog = listOf(newEntry) + uiState.historyLog
        )
    }

    fun clearLogs() {
        uiState = WorkoutUIState(
            totalWorkouts = 0,
            totalDurationMinutes = 0,
            historyLog = emptyList()
        )
    }
}