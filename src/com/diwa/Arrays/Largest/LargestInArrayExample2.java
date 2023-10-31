package com.diwa.Arrays.Largest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestInArrayExample2 {
	public static int getLargest(Integer []a, int total) {
		List<Integer> list=Arrays.asList(a);
		Collections.sort(list);
		int  element=list.get(total-1);
		return element;
	}
	public static void main(String[] args) {
		Integer[] a= {1,2,3,5,6,2};
		Integer[] b= {44,66,99,77,33,22,55};
		System.out.println("LargestElemet:" + getLargest( a,6));
		System.out.println("LargestElement:"+ getLargest(b,7));
	}

}
