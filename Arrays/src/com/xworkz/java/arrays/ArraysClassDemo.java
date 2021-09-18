package com.xworkz.java.arrays;

import java.util.Arrays;

public class ArraysClassDemo {

	public static void main(String[] args) {
     int[] intArray = new int[10];
		String fruitArrays[]= {"mango","pineapple","orange","apple","kiwi"};
		System.out.println("before sort");
		System.out.println(Arrays.toString(fruitArrays));
		
		Arrays.sort(fruitArrays);//after sort
		
		 System.out.println("after sort");
		 System.out.println(Arrays.toString(fruitArrays));
		 
		 String[]copiedArrays=Arrays.copyOf(fruitArrays,3);
		 System.out.println("aftercopy");
		 System.out.println(Arrays.toString(copiedArrays));
		 
		 String[]copiedArraysRange=Arrays.copyOfRange(fruitArrays,1,4);
		 System.out.println("aftercopyof Range");
		 System.out.println(Arrays.toString(copiedArraysRange));
		 
		 int index=Arrays.binarySearch(fruitArrays, "orange");
		 System.out.println(Arrays.toString(copiedArraysRange));
		 
		 
	}

}
