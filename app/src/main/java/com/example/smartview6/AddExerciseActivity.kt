package com.example.smartview6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.smartview6.ui.theme.Smartview6Theme

class AddExerciseActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Smartview6Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AddExerciseScreen()
                }
            }
        }
    }
}

@Composable
fun AddExerciseScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
    ) {
        Text(
            text = "Add an exercise",
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        ExerciseSelectionRow()
        TextFieldRow()
        Button(
            onClick = { /* TODO: Implement tracking exercise */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Track exercise")
        }
    }
}

@Composable
fun ExerciseSelectionRow() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        content = {
            ExerciseSelectionButton("running")
            ExerciseSelectionButton("weight lifting")
            ExerciseSelectionButton("swimming")
            ExerciseSelectionButton("cycling")
        }
    )
}

@Composable
fun ExerciseSelectionButton(text: String) {
    Button(
        onClick = { /* TODO: Implement selection */ },
        modifier = Modifier
            .width(120.dp)
            .padding(end = 8.dp)
    ) {
        Text(text = text)
    }
}

@Composable
fun TextFieldRow() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        content = {
            Text(text = "Enter time:")
            TextField()
        }
    )
}

@Composable
fun TextField() {
    // TODO: Implement TextField
}

@Preview(showBackground = true)
@Composable
fun AddExerciseScreenPreview() {
    Smartview6Theme {
        AddExerciseScreen()
    }
}
