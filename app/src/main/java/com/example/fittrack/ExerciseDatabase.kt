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
            name = "Box Step Ups",
            category = "Cardio",
            difficulty = "Beginner",
            previewInstructions = "Step firmly onto an elevated box or bench with one foot, drive up to stand tall, and alternate lead legs with each repetition.",
            recommendedDurationMinutes = 12
        ),
        Exercise(
            id = "cardio_2",
            name = "Cross Body Mountain Climbers",
            category = "Cardio",
            difficulty = "Intermediate",
            previewInstructions = "Hold a straight-arm plank and rapidly drive each knee toward the opposite elbow to elevate your heart rate and work your core.",
            recommendedDurationMinutes = 10
        ),
        Exercise(
            id = "cardio_3",
            name = "Staircase Sprints",
            category = "Cardio",
            difficulty = "Advanced",
            previewInstructions = "Power up a flight of stairs two steps at a time at top speed, pumping your arms vigorously to drive cardiovascular output.",
            recommendedDurationMinutes = 12
        ),

        // Flexibility
        Exercise(
            id = "flex_1",
            name = "Standing Forward Fold",
            category = "Flexibility",
            difficulty = "Beginner",
            previewInstructions = "Stand with feet together and hinge forward at your waist, relaxing your neck as your hands reach toward your ankles or floor.",
            recommendedDurationMinutes = 5
        ),
        Exercise(
            id = "flex_2",
            name = "High Legged Forward Fold",
            category = "Flexibility",
            difficulty = "Intermediate",
            previewInstructions = "Stand with feet placed wide apart, hinge forward from your hips with a flat spine, and walk your hands between your feet to stretch the hamstrings and adductors.",
            recommendedDurationMinutes = 8
        ),
        Exercise(
            id = "flex_3",
            name = "Full Front Splits",
            category = "Flexibility",
            difficulty = "Advanced",
            previewInstructions = "Slide one leg straight forward and the opposite leg straight behind you, easing your hips toward the floor while bracing your torso with your hands.",
            recommendedDurationMinutes = 6
        ),

        // HIIT
        Exercise(
            id = "hiit_1",
            name = "High Knee March",
            category = "HIIT",
            difficulty = "Beginner",
            previewInstructions = "March briskly in place, driving each knee to hip level while rhythmically pumping your arms.",
            recommendedDurationMinutes = 10
        ),
        Exercise(
            id = "hiit_2",
            name = "Bicycle Crunches",
            category = "HIIT",
            difficulty = "Intermediate",
            previewInstructions = "Lie on your back and alternate rotating opposite elbows to bent knees in a continuous, fast-paced pedaling motion.",
            recommendedDurationMinutes = 10
        ),
        Exercise(
            id = "hiit_3",
            name = "Burpee Broad Jumps",
            category = "HIIT",
            difficulty = "Advanced",
            previewInstructions = "Perform a full chest-to-deck burpee, snap your feet under you, and immediately leap forward as far as possible off both feet.",
            recommendedDurationMinutes = 10
        )
    )

    fun getExercisesByCategory(category: String): List<Exercise> {
        return exercises.filter { it.category.equals(category, ignoreCase = true) }
    }

    fun getExerciseById(id: String): Exercise? {
        return exercises.firstOrNull { it.id == id }
    }
}