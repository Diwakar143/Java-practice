package com.diwa.Arrays;

public class OddEvenInArrayExample {

	public static void main(String[] args) {
		int[] a= {1,2,5,6,3,2};
		System.out.println("OddNumbers:");
		for(int i=0; i<a.length; i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("EvenNumbers:");
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
				
			}
		}
	}
}
