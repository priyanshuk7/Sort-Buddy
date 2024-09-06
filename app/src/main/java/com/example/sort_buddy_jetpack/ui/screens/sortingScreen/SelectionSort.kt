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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.sort_buddy_jetpack.R
import com.example.sort_buddy_jetpack.ui.theme.myGray

@Composable
fun SelectionSort(navController: NavController) {

    Column(modifier = Modifier.padding(20.dp)) {
        Text(text = "Selection Sort", fontSize = 24.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top=20.dp))
        Divider(modifier = Modifier.height(5.dp), color = myGray)
        Spacer(modifier = Modifier.height(10.dp))
        val scrollState = rememberScrollState()

        Column(modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)) {
            Text(text = "Selection sort is a simple and efficient sorting algorithm that works by repeatedly selecting the smallest (or largest) element from the unsorted portion of the list and moving it to the sorted portion of the list.\n",
                fontSize = 14.sp)
            Spacer(modifier = Modifier.height(8.dp))

            Text(text= "Example : " , fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(text = "Consider an array [64, 25, 12, 22, 11]")
            Spacer(modifier = Modifier.height(5.dp))
            Image(
                painter = painterResource(id = R.drawable.ss_1),
                contentDescription = "Pass 1",
                modifier = Modifier.fillMaxSize(),


            )
            Spacer(modifier = Modifier.height(5.dp))
            Image(
                painter = painterResource(id = R.drawable.ss_2),
                contentDescription = "Pass 1",
                modifier = Modifier.fillMaxSize(),
            )
            Spacer(modifier = Modifier.height(5.dp))
            Image(
                painter = painterResource(id = R.drawable.ss_3),
                contentDescription = "Pass 1",
                modifier = Modifier.fillMaxSize(),
            )
            Spacer(modifier = Modifier.height(5.dp))
            Image(
                painter = painterResource(id = R.drawable.ss_4),
                contentDescription = "Pass 1",
                modifier = Modifier.fillMaxSize(),
            )
            Spacer(modifier = Modifier.height(5.dp))
            Image(
                painter = painterResource(id = R.drawable.ss_5),
                contentDescription = "Pass 1",
                modifier = Modifier.fillMaxSize(),
            )
            Spacer(modifier = Modifier.height(8.dp))


//            Text(text = "\nTotal no. of passes: n-1\n" +
//                    "Total no. of comparisons: n*(n-1)/2\n", fontSize = 14.sp)

            Text(text= "Implementation of selection Sort : " , fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(text = "Below is the implementation of the selection sort in \nC++", Modifier.padding(8.dp))

            Box(modifier = Modifier
                .padding(8.dp)
                .background(color = myGray, shape = RoundedCornerShape(10.dp))
                .fillMaxSize()
            ) {
                Text(text = "void selectionSort(int array[], int size) {\n" +
                        "  for (int step = 0; step < size - 1; step++) {\n" +
                        "    int min_idx = step;\n" +
                        "    for (int i = step + 1; i < size; i++) {\n" +
                        "\n" +
                        "      // To sort in descending order, change > to < in this line.\n" +
                        "      // Select the minimum element in each loop.\n" +
                        "      if (array[i] < array[min_idx])\n" +
                        "        min_idx = i;\n" +
                        "    }\n" +
                        "\n" +
                        "    // put min at the correct position\n" +
                        "    swap(&array[min_idx], &array[step]);\n" +
                        "  }\n" +
                        "}", modifier = Modifier
                    .padding(15.dp), color = Color.White)
            }
            Text(text = "\nTime Complexity: O(n^2)\n" +
                    "Space Complexity: O(1)", fontSize = 14.sp, fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}