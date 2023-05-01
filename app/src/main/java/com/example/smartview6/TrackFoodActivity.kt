package com.example.smartview6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.smartview6.ui.theme.Smartview6Theme

class TrackFoodActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Smartview6Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TrackFoodScreen()
                }
            }
        }
    }
}

@Composable
fun TrackFoodScreen() {
    var calories by remember { mutableStateOf("") }
    var protein by remember { mutableStateOf("") }
    var fat by remember { mutableStateOf("") }
    var carbs by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Track your food",
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        OutlinedTextField(
            value = calories,
            onValueChange = { calories = it },
            label = { Text("Calories") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = protein,
            onValueChange = { protein = it },
            label = { Text("Protein") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = fat,
            onValueChange = { fat = it },
            label = { Text("Fat") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = carbs,
            onValueChange = { carbs = it },
            label = { Text("Carbs") },
            modifier = Modifier.fillMaxWidth()
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text(text = "Track your food")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TrackFoodScreenPreview() {
    Smartview6Theme {
        TrackFoodScreen()
    }
}
