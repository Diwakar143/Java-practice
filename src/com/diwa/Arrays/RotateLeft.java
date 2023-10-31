package com.diwa.Arrays;

public class RotateLeft {
	public static void main(String[] args) {
		//initialize array
		int [] arr=new int [] {1,2,3,4,5};
		//n determine the number of timmes an array should be rotated 
		int n=3;
		//Display originial array
		System.out.println("Original Array: ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+  " ");
		}
		//Rotate the given array by n times toward left 
		for(int i=0; i<n; i++) {
			int j,first;
			//stores the first element of the array 
			first =arr[0];
		for (j=0;j<arr.length-1;j++) {
			//shift element of array by one 
			arr[j]=arr[j+1];
			
		}
		// first element of array will be added to the end 
		arr[j]=first;
		}
		System.out.println();
		//Displays resulting array after rotation 
		System.out.println("Array after left rotation ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
	}

}
