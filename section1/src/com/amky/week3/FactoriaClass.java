package com.amky.week3;

import java.util.Scanner;

public class FactoriaClass {

	public static void main(String[] args) {
		
		int fact;
		
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter a number to calculate factorial:");
		int factNumber = myScanner.nextInt();
		fact = factNumber;
		for(int i=factNumber;i>1;i--){
			System.out.println(i);
			fact = fact * (i-1);
		}
		System.out.println("Factorial of "+factNumber+" is "+fact);
	}

}
