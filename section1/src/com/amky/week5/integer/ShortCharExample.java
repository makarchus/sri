package com.amky.week5.integer;

public class ShortCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short myshortChar = 64;
		
		for(int i=1; i<27; i++){
			char b = (char) myshortChar;
			System.out.println("Short int: "+myshortChar+" Char "+b);
			myshortChar++;
		}

	}

}
