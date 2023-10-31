package com.diwa.Arrays.SecondLargest;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestInArrayExample2 {

	public static int getSecondLargest(Integer[] a , int total) {
		List<Integer> list=Arrays.asList(a);  
		Collections.sort(list);
		int element=list.get(total-2);
		return element;
	}
	public static void main(String[] args) {
		Integer[] a= {1,2,3,6,5,2};
		Integer[] b= {44,66,99,77,33,22,55};
		System.out.println("SecondLargestElement:" + getSecondLargest(a,6));
		System.out.println("SecondLargestElement:"+ getSecondLargest(b,7));
	}
}
