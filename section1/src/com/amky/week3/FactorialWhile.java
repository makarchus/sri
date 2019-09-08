package com.amky.week3;

public class FactorialWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factNumber=5;
		
		int fact = factNumber;
		while(factNumber >1){
			fact=fact*(factNumber-1);
			factNumber--;
		}
		System.out.println("Factorial:"+fact);

	}

}
