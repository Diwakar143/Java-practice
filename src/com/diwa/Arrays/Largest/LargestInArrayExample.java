package com.diwa.Arrays.Largest;

public class LargestInArrayExample {
	public static int getLargest(int [] a, int total) {
		int temp;
		for(int i=0;i<total; i++) {
			for(int j=i+1; j<total; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-1];
	}
public static void main(String[] args) {
	int[] a= {1,2,3,5,6,2};
	int[] b= {44,66,99,77,33,22,55};
	System.out.println("LargestElement:" + getLargest(a,6));
	System.out.println("LargestElement:"+ getLargest(b,7));
}
}
