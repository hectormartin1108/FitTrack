package com.example.fittrack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.fittrack.screens.DashboardScreen
import com.example.fittrack.screens.ExerciseDetailScreen
import com.example.fittrack.screens.ExerciseListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                FitTrackApp()
            }
        }
    }
}

@Composable
fun FitTrackApp() {
    val navController = rememberNavController()
    val workoutViewModel: WorkoutViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = "dashboard"
    ) {
        composable("dashboard") {
            DashboardScreen(
                uiState = workoutViewModel.uiState,
                categories = ExerciseRepository.categories,
                onCategoryClick = { category ->
                    navController.navigate("exercises/$category")
                },
                onClearLogsClick = {
                    workoutViewModel.clearLogs()
                }
            )
        }
        composable(
            route = "exercises/{categoryName}",
            arguments = listOf(navArgument("categoryName") { type = NavType.StringType })
        ) { backStackEntry ->
            val category = backStackEntry.arguments?.getString("categoryName") ?: ""
            ExerciseListScreen(
                categoryName = category,
                exercises = ExerciseRepository.getExercisesByCategory(category),
                onExerciseClick = { exerciseId ->
                    navController.navigate("exercise/$exerciseId")
                },
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
        composable(
            route = "exercise/{exerciseId}",
            arguments = listOf(navArgument("exerciseId") { type = NavType.StringType })
        ) { backStackEntry ->
            val exerciseId = backStackEntry.arguments?.getString("exerciseId") ?: ""
            val exercise = ExerciseRepository.getExerciseById(exerciseId)

            ExerciseDetailScreen(
                exercise = exercise,
                onLogWorkout = { duration ->
                    exercise?.let { workoutViewModel.logWorkout(it, duration) }
                },
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}