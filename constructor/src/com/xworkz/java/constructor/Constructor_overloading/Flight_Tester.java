package com.xworkz.java.constructor.Constructor_overloading;


public  class Flight_Tester {

	public static void main(String[] args) {
		
     Flight indigo = new Flight("indigo","R500",400,"Delhi","singapore");
		
		System.out.println(indigo.name);
		System.out.println(indigo.number);
		System.out.println(indigo.capacity);
		System.out.println(indigo.source);
		System.out.println(indigo.destination);



	}

}
