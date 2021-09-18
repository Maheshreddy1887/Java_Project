package com.xworkz.java.arrays.task;

public class MaxNumber {

	public static void main(String args[]) {
		
		int[][]arr=new int[3][3];
		int count=10;
		int Max=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				
				arr[i][j]=count;
				count=count+10;
				if(arr[i][j]>Max);
				Max=arr[i][j];
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			}
		System.out.println("largest element present in given array:"+Max);
		}

   
	
	
	
	}


