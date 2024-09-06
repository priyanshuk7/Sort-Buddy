package com.example.sort_buddy_jetpack.ui.screens.sortingScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun BubbleSortScreen(navController: NavController){
    Column(modifier = Modifier.padding(20.dp)) {
        Text(text = "Bubble Sort", fontSize = 24.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top=20.dp))
        Divider(modifier = Modifier.height(5.dp))
        Spacer(modifier = Modifier.height(10.dp))
        val scrollState = rememberScrollState()

        Column(modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)) {
            Text(text = "Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order. This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.\n",
                fontSize = 14.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text= "In Bubble Sort algorithm : " , fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(text = "1. traverse from left and compare adjacent elements and the higher one is placed at right side. \n" +
                    "2. In this way, the largest element is moved to the rightmost end at first. \n" +
                    "3. This process is then continued to find the second largest and place it and so on until the data is sorted.", Modifier.padding(8.dp))
            
            Text(text = "\nTotal no. of passes: n-1\n" +
                    "Total no. of comparisons: n*(n-1)/2\n", fontSize = 14.sp)

            Text(text= "Implementation of Bubble Sort : " , fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(text = "Below is the implementation of the bubble sort in C++.\n",Modifier.padding(8.dp))

            Box(modifier = Modifier
                .padding(8.dp)
                .background(color = Color.Gray, shape = RoundedCornerShape(10.dp))
                .fillMaxSize()
                ) {
                    Text(text = "void bubbleSort(vector<int>& v) {\n" +
                            "    int n = v.size();\n" +
                            "\n" +
                            "    // Outer loop that corresponds to the number of\n" +
                            "    // elements to be sorted\n" +
                            "    for (int i = 0; i < n - 1; i++) {\n" +
                            "\n" +
                            "        // Last i elements are already\n" +
                            "        // in place\n" +
                            "        for (int j = 0; j < n - i - 1; j++) {\n" +
                            "          \n" +
                            "              // Comparing adjacent elements\n" +
                            "            if (v[j] > v[j + 1])\n" +
                            "              \n" +
                            "                  // Swapping if in the wrong order\n" +
                            "                swap(v[j], v[j + 1]);\n" +
                            "        }\n" +
                            "    }\n" +
                            "}", modifier = Modifier
                                .padding(15.dp), color = Color.White)
            }
            Text(text = "\nTime Complexity: O(n2)\n" +
                    "Space Complexity: O (1)", fontSize = 14.sp, fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}