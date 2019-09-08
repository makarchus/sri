package com.amky.array;

public class Student {
	int id;
	String firstName;
	String lastName;
	String address;
	
	public Student(int id, String firstName, String lastName, String address){
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
	}
	
	public Student(){
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Student findStudent(Student[] sarray, int id){
		
		for(int i=0; i< sarray.length; i++){
			if(sarray[i]!=null){
				if(sarray[i].id==id){
					return sarray[i];
				}
			}
		}
		return null;
		
		
	}
	

}
