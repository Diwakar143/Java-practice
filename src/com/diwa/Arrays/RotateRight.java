package com.diwa.Arrays;

public class RotateRight {
	public static void main(String[] args) {
		int [] arr=new int [] {1,2,3,4,5};
		int n=3;
		System.out.println("Original Array: ");
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
		//Rotate the given arrat by n times towards right
		for(int i=0; i<arr.length; i++) {
			int j, last;
			//Stores the last element of array
			last=arr[arr.length-1];
			for(j=arr.length-1; j>0;j--) {
				arr[j]=arr[j-1];
				
			}
			arr[0]=last;
			
			}
		System.out.println();
		System.out.println("Array after right rotation:");
		for (int i1=0; i1<arr.length;i1++) {
			System.out.println(arr[i1]+ " ");
		}
	}

}
