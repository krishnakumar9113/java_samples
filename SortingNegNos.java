package com.sample.DS;

public class SortingNegNos {
	public static void main(String[] args) {
		int num[] = { 5, -3, 0, -18, 1, 2, 0 };
		//int num[] = { 5, 3, 4, 18, 1, 2 };
		/*for (int j = num.length - 1; j >= 0; j--) {
			for (int i = 0; i < j; i++) {
				if (Integer.signum(num[i]) > Integer.signum(num[i + 1])) { // comparing signs
					int temp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = temp;
				}
			}
		}
		*/
		BubbleSort bs= new BubbleSort();
		bs.sortArray(num);
	//	sortNumbers(num);
		/*for(int i=0;i<=num.length-1;i++)
		System.out.println(num[i]);*/
	}
	
	 public static void sortNumbers(int[] A) {
	        int a = 0;
	        int b = A.length - 1;
	        for (int i = 0; i < A.length && i <= b; i++) {
	            int cur = A[i];
	            if (cur < 0) {
	                swap(A, i, a);
	                a++;
	            } else if (cur > 0) {
	               swap(A, i, b);
	                b--;
	                i--;
	            }
	        }
	    }

	    private static void swap(int[] A, int i, int j) {
	        int tmp = A[i];
	        A[i] = A[j];
	        A[j] = tmp;
	    }
}
