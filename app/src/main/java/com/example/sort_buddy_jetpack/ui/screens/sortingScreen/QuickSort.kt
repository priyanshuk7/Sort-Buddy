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
fun Quicksort(navController: NavController){
    Column(modifier = Modifier.padding(20.dp)) {
        Text(text = "Quick Sort", fontSize = 24.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top=20.dp))
        Divider(modifier = Modifier.height(5.dp), color = myGray)
        Spacer(modifier = Modifier.height(10.dp))
        val scrollState = rememberScrollState()

        Column(modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)) {
            Text(text = "QuickSort is a sorting algorithm based on the Divide and Conquer that picks an element as a pivot and partitions the given array around the picked pivot by placing the pivot in its correct position in the sorted array.\n",
                fontSize = 14.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text= "In Quick Sort algorithm : " , fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(text = "1. Choose a pivot\n" +
                    "2. Partition the array around pivot. After partition, it is ensured that all elements are smaller than all right and we get index of the end point of smaller elements. The left and right may not be sorted individually.\n" +
                    "3. Recursively call for the two partitioned left and right subarrays.\n" +
                    "4. We stop recursion when there is only one element is left.\n", Modifier.padding(8.dp))
            Text(text= "Example : " , fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(text = "Consider an array [10, 80, 30, 90, 40]")
            Spacer(modifier = Modifier.height(5.dp))
            Image(
                painter = painterResource(id = R.drawable.qs_1),
                contentDescription = "Pass 1",
                modifier = Modifier.fillMaxSize(),
            )
            Spacer(modifier = Modifier.height(5.dp))
            Image(
                painter = painterResource(id = R.drawable.qs_2),
                contentDescription = "Pass 1",
                modifier = Modifier.fillMaxSize(),
            )
            Spacer(modifier = Modifier.height(5.dp))
            Image(
                painter = painterResource(id = R.drawable.qs_3),
                contentDescription = "Pass 1",
                modifier = Modifier.fillMaxSize(),
            )
            Spacer(modifier = Modifier.height(5.dp))
            Image(
                painter = painterResource(id = R.drawable.qs_4),
                contentDescription = "Pass 1",
                modifier = Modifier.fillMaxSize(),
            )
            Spacer(modifier = Modifier.height(5.dp))
            Image(
                painter = painterResource(id = R.drawable.qs_5),
                contentDescription = "Pass 1",
                modifier = Modifier.fillMaxSize(),
            )
            Spacer(modifier = Modifier.height(8.dp))


            Text(text = "\nTotal no. of passes: n-1\n" +
                    "Total no. of comparisons: n*(n-1)/2\n", fontSize = 14.sp)

            Text(text= "Implementation of Bubble Sort : " , fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(text = "Below is the implementation of the quick sort in C++.\n", Modifier.padding(8.dp))

            Box(modifier = Modifier
                .padding(8.dp)
                .background(color = myGray, shape = RoundedCornerShape(10.dp))
                .fillMaxSize()
            ) {
                Text(text = "int partition(vector<int>& arr, int low, int high) {\n" +
                        "  \n" +
                        "    // Choose the pivot\n" +
                        "    int pivot = arr[high];\n" +
                        "  \n" +
                        "    // Index of smaller element and indicates \n" +
                        "    // the right position of pivot found so far\n" +
                        "    int i = low - 1;\n" +
                        "\n" +
                        "    // Traverse arr[;ow..high] and move all smaller\n" +
                        "    // elements on left side. Elements from low to \n" +
                        "    // i are smaller after every iteration\n" +
                        "    for (int j = low; j <= high - 1; j++) {\n" +
                        "        if (arr[j] < pivot) {\n" +
                        "            i++;\n" +
                        "            swap(arr[i], arr[j]);\n" +
                        "        }\n" +
                        "    }\n" +
                        "    \n" +
                        "    // Move pivot after smaller elements and\n" +
                        "    // return its position\n" +
                        "    swap(arr[i + 1], arr[high]);  \n" +
                        "    return i + 1;\n" +
                        "}\n" +
                        "\n" +
                        "// The QuickSort function implementation\n" +
                        "void quickSort(vector<int>& arr, int low, int high) {\n" +
                        "  \n" +
                        "    if (low < high) {\n" +
                        "      \n" +
                        "        // pi is the partition return index of pivot\n" +
                        "        int pi = partition(arr, low, high);\n" +
                        "\n" +
                        "        // Recursion calls for smaller elements\n" +
                        "        // and greater or equals elements\n" +
                        "        quickSort(arr, low, pi - 1);\n" +
                        "        quickSort(arr, pi + 1, high);\n" +
                        "    }\n" +
                        "}", modifier = Modifier
                    .padding(15.dp), color = Color.White)
            }
            Text(text = "\nTime Complexity: O(n*log(n))\n" +
                    "Space Complexity: O (1)", fontSize = 14.sp, fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}