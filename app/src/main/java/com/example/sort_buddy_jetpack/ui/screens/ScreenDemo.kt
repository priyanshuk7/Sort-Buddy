package com.haiphong.algorithmsvisualizer.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ScreenDemo(navController: NavController){

    Column(Modifier.padding(20.dp)) {
        Text(text = "Welcome to Sort Buddy! \nThis application helps user visualize various sorting algorithms.",
            Modifier.padding(start= 0.dp, end=0.dp, top=20.dp, bottom = 20.dp),
            fontSize = 20.sp)
        Button(onClick = {
            navController.navigate("AlgorithmVisualizerApp")
        }) {
            Text(text = "Visualize   >>")
        }

        Button(onClick = { /*TODO*/ }) {
            Text(text="Know the basics   >>")
        }
    }
}
