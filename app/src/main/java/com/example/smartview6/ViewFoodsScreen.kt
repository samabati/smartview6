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

class ViewFoodsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Smartview6Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ViewFoodsScreen()
                }
            }
        }
    }
}

@Composable
fun ViewFoodsScreen() {
    val foodList = listOf(
        Food("Apple", "100", "0", "25"),
        Food("Banana", "150", "0", "30"),
        Food("Orange", "80", "0", "20")
    )
    val totalCalories = foodList.sumOf { it.calories.toInt() }
    val totalFats = foodList.sumOf { it.fats.toInt() }
    val totalCarbs = foodList.sumOf { it.carbs.toInt() }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "View your foods",
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        foodList.forEach { food ->
            Text(
                text = "Food 1:",
                style = MaterialTheme.typography.subtitle1,
                modifier = Modifier.padding(vertical = 4.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Calories: ${food.calories}")
                Text(text = "Fats: ${food.fats}")
                Text(text = "Carbs: ${food.carbs}")
            }
            Divider(modifier = Modifier.padding(vertical = 4.dp))
        }
        Text(
            text = "Total Calories: $totalCalories",
            style = MaterialTheme.typography.subtitle1,
            modifier = Modifier.padding(vertical = 4.dp)
        )
        Text(
            text = "Total Fats: $totalFats",
            style = MaterialTheme.typography.subtitle1,
            modifier = Modifier.padding(vertical = 4.dp)
        )
        Text(
            text = "Total Carbs: $totalCarbs",
            style = MaterialTheme.typography.subtitle1,
            modifier = Modifier.padding(vertical = 4.dp)
        )
    }
}

data class Food(
    val name: String,
    val calories: String,
    val fats: String,
    val carbs: String
)

@Preview(showBackground = true)
@Composable
fun ViewFoodsScreenPreview() {
    Smartview6Theme {
        ViewFoodsScreen()
    }
}
