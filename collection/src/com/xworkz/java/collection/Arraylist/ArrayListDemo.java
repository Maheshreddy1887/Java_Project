package com.xworkz.java.collection.Arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
    
		ArrayList list = new ArrayList();
		ArrayList list10=new ArrayList();
		
		list.add("mahesh");
		list.add("suresh");
		list.add("naveen");
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		list10.add("100");
		list10.add("200");
		list10.add("300");
		list10.add("400");
		list10.add("xyz");
		list10.add("xyz");
		list10.add("xyz");
		list10.add("xyz");
	//	System.out.println(list10);
		
		list.addAll(list10);
		//System.out.println(list);
	//	list10.addAll(list);
	//	System.out.println(list10);
		list10.get(3);
		System.out.println();
		
		
	}

}
