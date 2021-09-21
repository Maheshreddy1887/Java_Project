package com.xworkz.java.collection.Arraylist;

import java.util.ArrayList;


public class Mahesh {

	public static void main(String[] args) {
		
		
		ArrayList reddy = new ArrayList();
		ArrayList maheshreddy = new ArrayList();
		reddy.add("mahesh");
		reddy.add("suresh");
	//	System.out.println(reddy);
		
		maheshreddy.add("maheshreddy");
		maheshreddy.add("reddy");
		maheshreddy.add("mahesh");
//		System.out.println(maheshreddy);
		
		reddy.addAll(maheshreddy);
//		System.out.println(reddy);

		maheshreddy.addAll(reddy);
		System.out.println(maheshreddy);
	}

}
