package com.diwa.Arrays.SortArray;

public class SortArrayExample3 {
	public static void main(String[] args) {
		int i;
		//initializing array
		int [] array= {12, 45, 1, -1, 0, 4, 56, 23, 89, -21, 56, 27};
		System.out.println("Array elements before sorting:\n" );
		for(i=0; i<array.length; i++) 
			System.out.println(array[i]);
			//invoking user defined method
			sortArray(array, array.length);
			System.out.println("Array element after sorting: \n");
			//accessing elements of the sorted array
			for(i=0;i<array.length;i++) {
				System.out.println(array[i]);
			
		}
		}
		//user defined method to sort an array in ascending order 
		private static void sortArray(int array[], int n) {
			for(int i=1; i<n; i++) {
				int j=i;
				int a=array[i];
				while((j>0)&&(array[j-1]>a)) {// return true when both conditions are true 
					array[j]=array[j-1];
					j--;
					
				}
				array[j]=a;
			}
		
	}

}
