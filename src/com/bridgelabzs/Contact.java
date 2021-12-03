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
	
	public Contact(String firstName, String lastName, String address, String city, String state, String zip,
								String phoneNumber, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.cityName = city;
		this.stateName = state;
		this.zipCode = zip;
		this.phoneNumber = phoneNumber;
		this.emailId = email;
		members++;
	}

	public Contact() {
		// TODO Auto-generated constructor stub
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

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public int getMembers() {
		return members;
	}

	public void setMembers(int members) {
		this.members = members;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", cityName="
				+ cityName + ", stateName=" + stateName + ", zipCode=" + zipCode + ", phoneNumber=" + phoneNumber
				+ ", emailId=" + emailId + ", members=" + members + "]";
	}
	
}
