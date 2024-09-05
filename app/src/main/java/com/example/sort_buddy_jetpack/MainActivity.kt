package com.example.sort_buddy_jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.haiphong.algorithmsvisualizer.AlgorithmVisualizerApp
import com.example.sort_buddy_jetpack.ui.screens.ScreenDemo
import com.example.sort_buddy_jetpack.ui.screens.SortingListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "ScreenDemo", builder = {
                composable("ScreenDemo"){
                    ScreenDemo(navController)
                }
                composable("AlgorithmVisualizerApp"){
                    AlgorithmVisualizerApp()
                }
                composable("SortingListScreen"){
                    SortingListScreen(navController)
                }
            })
        }
    }
}

