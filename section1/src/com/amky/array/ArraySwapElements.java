package com.amky.array;

import java.util.Scanner;

public class ArraySwapElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] myArray = new int[2];

		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter a first Number:");
		int a = myScanner.nextInt();
		System.out.println("Please enter a Second Number:");
		int b = myScanner.nextInt();
		
		myArray[0] = a;
		myArray[1] = b;
		
		
		if(myArray[0] > myArray[1]){
			int temp;
			temp=myArray[0];
			myArray[0]=myArray[1];
			myArray[1]=temp;
		}
		
		for(int i=0;i<myArray.length;i++){
			System.out.println(myArray[i]);
		}
		//Swap two elements
		//GIVEN AS A HOMEWORK
	}

}
