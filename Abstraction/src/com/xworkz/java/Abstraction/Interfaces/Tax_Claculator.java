package com.xworkz.java.Abstraction.Interfaces;

public class Tax_Claculator implements Central_Tax,State_Tax {
	public void propertyTax() {
		System.out.println("propertyTax of state");
		
	}
	public void roadTax() {
		System.out.println("raadTax of state");
	}
}
