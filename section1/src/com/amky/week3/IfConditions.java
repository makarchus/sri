package com.amky.week3;

import java.util.Scanner;

public class IfConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myScanner = new Scanner(System.in);
		int myNumber = myScanner.nextInt();
		myScanner.close();
		if(myNumber == 200 || myNumber==400){
			System.out.println("I am either 200 or 400");
			System.out.println("Thank you");
		}else{
			System.out.println("I am NOT 200 or 400");
		}
		
		myScanner.close();
	}

}