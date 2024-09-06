package com.example.sort_buddy_jetpack.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun SortingListScreen(navController: NavController){
    Column(modifier = Modifier.padding(20.dp).fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Button(onClick = { navController.navigate("BubbleSortScreen") },
            modifier = Modifier
                .size(width= 300.dp, height = 80.dp)
                .align(alignment = Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2C57FC)),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 6.dp),
            shape = RoundedCornerShape(corner = CornerSize(22.dp)),
            ) {
            Text(text = "Bubble Sort  >>", fontSize = 16.sp)
        }
        Spacer(modifier = Modifier.height(40.dp))

        Button(onClick = {navController.navigate("SelectionSortScreen") },
            modifier = Modifier
                .size(width= 300.dp, height = 80.dp)
                .align(alignment = Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2C57FC)),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 6.dp),
            shape = RoundedCornerShape(corner = CornerSize(22.dp)),
            ) {
            Text(text = "Selection Sort  >>", fontSize = 16.sp)
        }
        Spacer(modifier = Modifier.height(40.dp))

        Button(onClick = { navController.navigate("InsertionSortScreen") },
            modifier = Modifier
                .size(width= 300.dp, height = 80.dp)
                .align(alignment = Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2C57FC)),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 6.dp),
            shape = RoundedCornerShape(corner = CornerSize(22.dp)),
            ) {
            Text(text = "Insertion Sort  >>", fontSize = 16.sp)
        }
        Spacer(modifier = Modifier.height(40.dp))

        Button(onClick = { navController.navigate("QuickSortScreen") },
            modifier = Modifier
                .size(width= 300.dp, height = 80.dp)
                .align(alignment = Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2C57FC)),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 6.dp),
            shape = RoundedCornerShape(corner = CornerSize(22.dp)),
            ) {
            Text(text = "Quick Sort  >>", fontSize = 16.sp)
        }


    }
}