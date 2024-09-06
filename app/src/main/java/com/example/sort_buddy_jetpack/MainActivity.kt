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
import com.example.sort_buddy_jetpack.ui.screens.sortingScreen.BubbleSortScreen
import com.example.sort_buddy_jetpack.ui.screens.sortingScreen.InsertionSort
import com.example.sort_buddy_jetpack.ui.screens.sortingScreen.Quicksort
import com.example.sort_buddy_jetpack.ui.screens.sortingScreen.SelectionSort

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "BubbleSortScreen", builder = {
                composable("ScreenDemo"){
                    ScreenDemo(navController)
                }
                composable("AlgorithmVisualizerApp"){
                    AlgorithmVisualizerApp()
                }
                composable("SortingListScreen"){
                    SortingListScreen(navController)
                }
                composable("BubbleSortScreen"){
                    BubbleSortScreen(navController)
                }
                composable("InsertionSortScreen"){
                    InsertionSort(navController)
                }
                composable("SelectionSortScreen"){
                    SelectionSort(navController)
                }
                composable("QuickSortScreen"){
                    Quicksort(navController)
                }
            })
        }
    }
}

