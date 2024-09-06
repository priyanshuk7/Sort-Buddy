package com.example.sort_buddy_jetpack.ui.screens.sortingScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.sort_buddy_jetpack.R
import com.example.sort_buddy_jetpack.ui.theme.myGray

@Composable
fun InsertionSort(navController: NavController){

    Column(modifier = Modifier.padding(20.dp)) {
        Text(text = "Insertion Sort", fontSize = 24.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top=20.dp))
        Divider(modifier = Modifier.height(5.dp), color = myGray)
        Spacer(modifier = Modifier.height(10.dp))
        val scrollState = rememberScrollState()

        Column(modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)) {
            Text(text = "Insertion sort is a simple sorting algorithm that works by iteratively inserting each element of an unsorted list into its correct position in a sorted portion of the list. It is a stable sorting algorithm, meaning that elements with equal values maintain their relative order in the sorted output.\n",
                fontSize = 14.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text= "In Insertion Sort algorithm : " , fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(text = "1. We start with second element of the array as first element in the array is assumed to be sorted.\n" +
                    "2. Compare second element with the first element and check if the second element is smaller then swap them.\n" +
                    "3. Move to the third element and compare it with the second element, then the first element and swap as necessary to put it in the correct position among the first three elements.\n" +
                    "4. Continue this process, comparing each element with the ones before it and swapping as needed to place it in the correct position among the sorted elements.\n" +
                    "5. Repeat until the entire array is sorted.\n", Modifier.padding(8.dp))
            Text(text= "Example : " , fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(text = "Consider an array [23, 1, 10, 5, 2]")
            Spacer(modifier = Modifier.height(5.dp))
            Image(
                painter = painterResource(id = R.drawable.is_1),
                contentDescription = "Pass 1",
                modifier = Modifier.fillMaxSize(),
            )

            Spacer(modifier = Modifier.height(8.dp))


//            Text(text = "\nTotal no. of passes: n-1\n" +
//                    "Total no. of comparisons: n*(n-1)/2\n", fontSize = 14.sp)

            Text(text= "Implementation of Insertion Sort : " , fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(text = "Below is the implementation of the insertion sort in \nC++.\n", Modifier.padding(8.dp))

            Box(modifier = Modifier
                .padding(8.dp)
                .background(color = myGray, shape = RoundedCornerShape(10.dp))
                .fillMaxSize()
            ) {
                Text(text = "void insertionSort(int array[], int size) {\n" +
                        "  for (int step = 1; step < size; step++) {\n" +
                        "    int key = array[step];\n" +
                        "    int j = step - 1;\n" +
                        "\n" +
                        "    // Compare key with each element on the left of it until an element smaller than\n" +
                        "    // it is found.\n" +
                        "    // For descending order, change key<array[j] to key>array[j].\n" +
                        "    while (j >=0 && key < array[j]) {\n" +
                        "      array[j + 1] = array[j];\n" +
                        "      --j;\n" +
                        "    }\n" +
                        "    array[j + 1] = key;\n" +
                        "  }\n" +
                        "}", modifier = Modifier
                    .padding(15.dp), color = Color.White)
            }
            Text(text = "\nTime Complexity: O(n^2)\n" +
                    "Space Complexity: O (1)", fontSize = 14.sp, fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}