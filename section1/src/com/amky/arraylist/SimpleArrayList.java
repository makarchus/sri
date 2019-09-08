package com.amky.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleArrayList {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> friends = new ArrayList<>();
		Scanner myScanner;
		
		myScanner = new Scanner(System.in);
		for(int i=0;i <5; i++){
			System.out.println("Enter a name:");
			String name = myScanner.nextLine();
			friends.add(i, name);
		
		}
		
		for(int i=0; i<friends.size();i++){
			System.out.println("Friend Name:"+friends.get(i));
		}
	}

}
