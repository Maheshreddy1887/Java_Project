package com.xworkz.java.CustomCheckedExceptions;

import java.util.Arrays;

public class Dmart {
	String DmartStore []= {"oil","dall","choco","dryfruits","biseuit"};
			void searchItem(String itemname) {
				Arrays.sort(DmartStore);
			//	if(Arrays.binarySearch(DmartStore,itemname)!=-1)
				if(Arrays.binarySearch(DmartStore, itemname)!=-1)
				{
				System.out.println("item is available please buy");
				}
			else{

				 System.out.println("item not available");
			}
	}

}
