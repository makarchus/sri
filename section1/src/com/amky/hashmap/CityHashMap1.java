package com.amky.hashmap;

import java.util.HashMap;

public class CityHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
	    
	  System.out.println(capitalCities.getOrDefault("India", "Not found in the database"));
	  
	}

}
