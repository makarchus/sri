package com.amky.oopconcepts;

public class PersonOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("Makarand", "Kulkarni", "425 Pierce Dr", "", 
			      "Chester Springs", "19425", "PA", "4849491192", 1111122212, 
			      "01/01/1970", true);
		
		System.out.println("First Name:"+person.getFirstName());
		
		person.setFirstName("Mak");
		System.out.println("First Name:"+person.getFirstName());
		
		System.out.println("Birth Date:"+person.getBirthDate());
	}

}
