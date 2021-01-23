package com.sample.DS;

//https://www.geeksforgeeks.org/bubble-sort/
public class BubbleSort 
{
	// Swap the largest element with the next element
    public void sortArray(int[] a)
    {       // a.length=5
        int c, d, swap;
        boolean swapped;
        for(c = 0; c < a.length-1; c++) //c=0 
        {
        	  swapped = false; 
            for (d = 0; d < a.length - c-1; d++) 
            {
                if (a[d] > a[d+1])
                {
                    swap = a[d];
                    a[d] = a[d+1];
                    a[d+1] = swap;
                    swapped = true; 
                }
            }
            //optimization : to stop the inner loop , if swapping is not happening [ie swapping stops if the order is perfect]
            if (swapped == false) 
                break; 
        }

        for(int i=0;i<a.length;i++)
        {
            int correctNumber = i+1;
            System.out.println("Value "+correctNumber+" of the sorted array which was sorted via the Bubble Sort is: "+a[i]);
        }
    }
}