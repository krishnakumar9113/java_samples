package com.sample.DS;

import java.util.Arrays;

public class OddEvenSorting {

	   // To do two way sort. First sort even numbers in 
    // ascending order, then odd numbers in descending 
    // order. 
    static void twoWaySort(int arr[], int n) 
    { 
        // Make all odd numbers negative 
        for (int i = 0; i < n; i++) 
         //   if ((arr[i] & 1) != 0) // Check for odd 
        	if((arr[i] %2) !=0)
                arr[i] *= -1; 
        System.out.println("-ve"+Arrays.toString(arr)); 
        // Sort all numbers 
      //  Arrays.sort(arr); 
        BubbleSort bs= new BubbleSort();
		bs.sortArray(arr);
        // Retaining original array 
        for (int i = 0; i < n; i++) 
         //   if ((arr[i] & 1) != 0) 
        	if((arr[i] %2) !=0)
                arr[i] *= -1; 
    } 
  
    // Driver Method 
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 3, 2, 7, 5, 4 }; 
  
        twoWaySort(arr, arr.length); 
  
        System.out.println(Arrays.toString(arr)); 
    } 
} 