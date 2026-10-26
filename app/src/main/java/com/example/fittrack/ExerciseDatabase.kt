package com.example.fittrack

object ExerciseRepository {
    val categories = listOf("Strength", "Cardio", "Flexibility", "HIIT")

    val exercises: List<Exercise> = listOf(
        // Strength
        Exercise(
            id = "strength_1",
            name = "Forearm Plank",
            category = "Strength",
            difficulty = "Beginner",
            previewInstructions = "Hold a rigid horizontal posture resting on your forearms while bracing your core and keeping your spine straight.",
            recommendedDurationMinutes = 5
        ),
        Exercise(
            id = "strength_2",
            name = "Barbell Curls",
            category = "Strength",
            difficulty = "Intermediate",
            previewInstructions = "Grip a barbell with an underhand grip and curl the weight toward your chest while keeping your elbows stationary at your sides.",
            recommendedDurationMinutes = 10
        ),
        Exercise(
            id = "strength_3",
            name = "Archer Pull Ups",
            category = "Strength",
            difficulty = "Advanced",
            previewInstructions = "Pull your chest up toward the bar while extending one arm completely straight out to the side to heavily overload the pulling arm.",
            recommendedDurationMinutes = 8
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