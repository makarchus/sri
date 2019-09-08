package com.amky.array;

public class ArrayWithAlternateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myValue=1;
		int[] myArray = new int[25];
		for(int i=0;i<25;i++){
			myArray[i]=myValue;
			myValue=myValue+2;
		}
		
		for(int i=0; i<25; i++){
			System.out.print(myArray[i]+",");
		}

	}
	
}
