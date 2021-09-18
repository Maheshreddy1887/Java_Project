package com.xworkz.java.has_a_realationship.Aggregation;

public class Aggregation_Mahesh_Bike_Demo {

	public static void main(String[] args) {
		
		Mahesh mahesh = new Mahesh();
		mahesh.college = "GKVK";
		mahesh.Id =67;
		
		Bike bike = new Bike();
		bike.color = "Red";
		bike.modle = 200;
		bike.contactno = 9448787859l;
		
		System.out.println("Mahesh Details of mahesh"+mahesh.college);
		System.out.println("Bike details"+bike.modle);
		
		

	}

}
