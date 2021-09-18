package com.xworkz.java.CustomCheckedExceptions;

public class Mahesh {

	public static void main(String[] args) {
		Dmart dmart=new Dmart();
		try {
			dmart.searchItem("pen");
		}catch(Exception e) {
		
			e.printStackTrace();
		}

	}

}
