package com.diwa.Arrays.SecondSmallest;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondSmallestInArrayExample2 {
	public static int getSecondSmallest(Integer[] a, int total ) {
		List<Integer> list=Arrays.asList(a);
		Collections.sort(list);
		int element=list.get(1);
		return element;
	}
	public static void main(String[] args) {
		Integer[] a= {1,2,3,5,6,2};
		Integer[] b= {44,66,99,77,33,22,55};
		System.out.println("SecondSmallestElement:"+ getSecondSmallest(a,6));
		System.out.println("SecondSmallestElement:"+ getSecondSmallest(b,7));
	}

}
