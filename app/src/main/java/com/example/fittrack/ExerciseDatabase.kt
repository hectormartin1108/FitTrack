package com.example.fittrack

object ExerciseRepository {
    val categories = listOf("Strength", "Cardio", "Flexibility", "HIIT")

    val exercises: List<Exercise> = listOf(
        // Strength
        Exercise(
            id = "strength_1",
            name = "",
            category = "",
            difficulty = "",
            previewInstructions = "",
            recommendedDurationMinutes = 1
        ),
        Exercise(
            id = "strength_1",
            name = "",
            category = "",
            difficulty = "",
            previewInstructions = "",
            recommendedDurationMinutes = 1
        ),
        Exercise(
            id = "strength_1",
            name = "",
            category = "",
            difficulty = "",
            previewInstructions = "",
            recommendedDurationMinutes = 1
        ),

        // Cardio
        Exercise(
            id = "cardio_1",
            name = "",
            category = "",
            difficulty = "",
            previewInstructions = "",
            recommendedDurationMinutes = 1
        ),
        Exercise(
            id = "cardio_2",
            name = "",
            category = "",
            difficulty = "",
            previewInstructions = "",
            recommendedDurationMinutes = 1
        ),
        Exercise(
            id = "cardio_3",
            name = "",
            category = "",
            difficulty = "",
            previewInstructions = "",
            recommendedDurationMinutes = 1
        ),

        // Flexibility
        Exercise(
            id = "flex_1",
            name = "",
            category = "",
            difficulty = "",
            previewInstructions = "",
            recommendedDurationMinutes = 1
        ),
        Exercise(
            id = "flex_2",
            name = "",
            category = "",
            difficulty = "",
            previewInstructions = "",
            recommendedDurationMinutes = 1
        ),
        Exercise(
            id = "flex_3",
            name = "",
            category = "",
            difficulty = "",
            previewInstructions = "",
            recommendedDurationMinutes = 1
        ),

        // HIIT
        Exercise(
            id = "hiit_1",
            name = "",
            category = "",
            difficulty = "",
            previewInstructions = "",
            recommendedDurationMinutes = 1
        ),
        Exercise(
            id = "hiit_2",
            name = "",
            category = "",
            difficulty = "",
            previewInstructions = "",
            recommendedDurationMinutes = 1
        ),
        Exercise(
            id = "hiit_3",
            name = "",
            category = "",
            difficulty = "",
            previewInstructions = "",
            recommendedDurationMinutes = 1
        )
    )

    fun getExercisesByCategory(category: String): List<Exercise> {
        return exercises.filter { it.category.equals(category, ignoreCase = true) }
    }

    fun getExerciseById(id: String): Exercise? {
        return exercises.firstOrNull { it.id == id }
    }
}