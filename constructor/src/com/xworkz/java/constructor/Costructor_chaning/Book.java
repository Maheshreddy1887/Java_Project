package com.xworkz.java.constructor.Costructor_chaning;

public class Book {
	
	String name;
	String color;

	public Book() {
		this ("Classmate","Red");
	}
	
	Book(String name,String color){
		this. name=name;
		this.color=color;
	}
	Book(String name){
		this(name,"Red");
	}

}
