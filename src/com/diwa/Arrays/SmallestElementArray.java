package com.diwa.Arrays;

public class SmallestElementArray {
	public static void main(String[] args) {
		//initialize array
		int [] arr =new int[] {25,11,7,75,56};
		
		int min=arr[0];
		//Loop through the array
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Smallest element in the given array:" +min);
	}


}
