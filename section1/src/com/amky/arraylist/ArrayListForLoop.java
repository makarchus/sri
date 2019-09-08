package com.amky.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    for (String i : cars) {
		      System.out.println(i);
		    }
		    System.out.println("******");
		    Collections.sort(cars);
		    for (String i : cars) {
			      System.out.println(i);
			    }
	}

}
