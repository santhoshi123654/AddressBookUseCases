package com.bridgelabzs;


public class Contact {
	
	private String firstName;
	private String lastName;
	private String address;
	private String cityName;
	private String stateName;
	private String zipCode;
	private String phoneNumber;
	private String emailId;
	int members = 0;
	
	public Contact() {
		
	}
	
	public Contact(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.cityName = cityName;
		this.stateName = stateName;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		members++;
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

	public String getCity() {
		return cityName;
	}

	public void setCity(String cityName) {
		this.cityName = cityName;
	}

	public String getState() {
		return stateName;
	}

	public void setState(String stateName) {
		this.stateName = stateName;
	}

	public String getZip() {
		return zipCode;
	}

	public void setZip(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return emailId;
	}

	public void setEmail(String emailId) {
		this.emailId = emailId;
	}
}
