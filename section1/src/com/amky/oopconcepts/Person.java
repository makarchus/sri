package com.amky.oopconcepts;

public class Person {
	
	private String firstName;
	private String lastName;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String zip;
	private String state;
	private String phone;
	private int driverLicense;
	private String birthDate;
	private boolean active=true;
	
	
	//Constructor for a Person Class
	public Person(String firstName, String lastName, String addressLine1, String addressLine2, 
			      String city, String zip, String state, String phone, int driversLicense, 
			      String birthDate, boolean active){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.addressLine1 = addressLine1;
		this.addressLine2  = addressLine2;
		this.city = city;
		this.state=state;
		this.zip=zip;
		this.phone = phone;
		this.driverLicense=driversLicense;
		this.birthDate = birthDate;
		this.active=active;
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


	public String getAddressLine1() {
		return addressLine1;
	}


	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}


	public String getAddressLine2() {
		return addressLine2;
	}


	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public int getDriverLicense() {
		return driverLicense;
	}


	public void setDriverLicense(int driverLicense) {
		this.driverLicense = driverLicense;
	}


	public String getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}
	
	

}