package com.amky.week2;

import java.util.Scanner;

public class HelloFriend {

	public static void main(String[] args) {
		
		String friendName="";
		int age=0;
		Double salary=0.0;
		
		/*What is instantiate means
		 * To instantiate is to create an instance of an object in an 
		 * object-oriented programming (OOP) language. An instantiated object 
		 * is given a name and created in memory or on disk using the structure 
		 * described within a class declaration.
		 * 
		 */
		@SuppressWarnings("resource")
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter your name :");
		friendName = myScanner.nextLine();
		System.out.println("Enter your age :");
		age=myScanner.nextInt();
		System.out.println("Enter your Salary :");
		salary = myScanner.nextDouble();
		System.out.println("My name is "+friendName+". I am "+age+" year old");
		System.out.println("My salary is:"+salary);

	}

}
