package com.amky.array;

import java.util.Scanner;

public class ArrayDynamicPopulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maximum=100;
		int minimum=1;
		int count=1;
		int arrayLimit=0;
		boolean verified=false;
		while(count <4 && verified == false){
			System.out.println("Please enter a numer of elements array (1-100):");
			Scanner myScanner = new Scanner(System.in);
			arrayLimit = myScanner.nextInt();
			
			if(arrayLimit <1 || arrayLimit >100){
				System.out.println("Please enter number between 1-100...aborting...");
				count++;
				if(count ==4)
					return;
			}else{
				verified=true;
			}

		}
		
		int [] myArray = new int[arrayLimit];
		
		for(int i=0;i<arrayLimit;i++){
			myArray[i]= ((int) (Math.random()*(maximum - minimum))) +minimum;
		}
		
		for(int i=0;i<arrayLimit; i++){
			System.out.println("ArrayPosition:"+i+" Value is:"+myArray[i]);
		}
		
	}

}
