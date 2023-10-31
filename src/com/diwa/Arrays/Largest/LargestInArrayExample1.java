package com.diwa.Arrays.Largest;

import java.util.Arrays;

public class LargestInArrayExample1 {
	
	//Find Largest Number in Array using Arrays

	public static int getLargest(int[] a, int total) {
		Arrays.sort(a);
		return a[total-1];
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,5,6,2};
		int b[]= {44,66,99,77,33,22,55};
		System.out.println("LargestElement:" + getLargest(a,6));
		System.out.println("LargestElement:"+ getLargest(b,7));
	}

}
