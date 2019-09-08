package com.amky.array;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myArray = new int[15];
		
		for(int i=0; i<15;i++){
			myArray[i] = (i+1)*100;
		}
		
		System.out.println("4th  postion"+myArray[3]);
		
	}

}
