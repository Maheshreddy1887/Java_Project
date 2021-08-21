package com.xworkz.java.constructor.Constructor_overloading;

public class Flight {
	
	String name;
	String number;
	int capacity;
	String source;
	String destination;

	public Flight() { 
		name = "Air India";
		number = "n760";
		capacity =370;
		source = "BLR";
		destination = "parise";}
	
	public Flight(String name,String number,int capacity,String source,String destination) { 
		
	this.name = "Air Asia";
	this.number = "n540";
	this.capacity =400;
	this.source = "BLR";
	this.destination = "japan";}
	
}
    
        



	

	

	


