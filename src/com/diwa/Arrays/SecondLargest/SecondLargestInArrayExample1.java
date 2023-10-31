package com.diwa.Arrays.SecondLargest;

import java.util.Arrays;

public class SecondLargestInArrayExample1 {
	
	//Find 2nd Largest Number in Array using Arrays

	public static int getSecondLargest(int[] a , int total) {
		Arrays.sort(a);
		return a[total-2];
	}
	public static void main(String[] args) {
		int a []= {1,2,3,5,6,2};
		int b []= {44,66,99,77,33,22,55};
		System.out.println("SecondLargest:"+getSecondLargest(a,6));
		System.out.println("SecondLargest:"+getSecondLargest(b,7));
	}

}
