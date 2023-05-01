package com.example.smartview6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.smartview6.ui.theme.Smartview6Theme

class TrackedExercisesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Smartview6Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TrackedExercisesScreen(
                        cyclingMinutes = 0,
                        runningMinutes = 0,
                        weightLiftingMinutes = 0,
                        swimmingMinutes = 0
                    )
                }
            }
        }
    }
}

@Composable
fun TrackedExercisesScreen(
    cyclingMinutes: Int,
    runningMinutes: Int,
    weightLiftingMinutes: Int,
    swimmingMinutes: Int
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
    ) {
        Text(
            text = "Tracked exercises:",
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        ExerciseTimeRow("Cycling", cyclingMinutes)
        ExerciseTimeRow("Running", runningMinutes)
        ExerciseTimeRow("Weight lifting", weightLiftingMinutes)
        ExerciseTimeRow("Swimming", swimmingMinutes)
    }
}

@Composable
fun ExerciseTimeRow(exerciseName: String, minutes: Int) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        content = {
            Text(text = "$exerciseName : $minutes minutes")
        }
    )
}

@Preview(showBackground = true)
@Composable
fun TrackedExercisesScreenPreview() {
    Smartview6Theme {
        TrackedExercisesScreen(
            cyclingMinutes = 10,
            runningMinutes = 20,
            weightLiftingMinutes = 30,
            swimmingMinutes = 40
        )
    }
}
