package com.amky.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleArrayList2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> friends = new ArrayList<>();
		Scanner myScanner;
		String userstop="Y";
		int j=0;
		myScanner = new Scanner(System.in);
		while(userstop.equalsIgnoreCase("Y")){
			System.out.println("Enter a name:");
			String name = myScanner.nextLine();
			friends.add(j, name);
			j++;
			System.out.println("Do you want to continue?(Y/N):");
			userstop = myScanner.nextLine();
		}
		
		
		for(int i=0; i<friends.size();i++){
			System.out.println("Friend Name:"+friends.get(i));
		}
	}

}
