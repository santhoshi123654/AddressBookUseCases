package com.bridgelabzs;

public class AddressBook {
	
	private String firstName;
	private String lastName;
	private String address;
	private String cityName;
	private String stateName;
	private String zipCode;
	private String phoneNumber;
	private String emailId;
	
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
	
	@Override
	public String toString() {
		return "AddressBook [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", cityName="
				+ cityName + ", stateName=" + stateName + ", zipCode=" + zipCode + ", phoneNumber=" + phoneNumber
				+ ", emailId=" + emailId + "]";
	}

	public static void main(String[] args) {
		
		AddressBook contact = new AddressBook();
		
		contact.setFirstName("santhoshi");
		contact.setLastName("Badam");
		contact.setAddress("1-8,MG road");
		contact.setCityName("Hyderabad");
		contact.setStateName("Telangana");
		contact.setZipCode("509608");
		contact.setEmailId("santhoshi.badam@gmail.com");
		contact.setPhoneNumber("9784568792");
	
		System.out.println(contact);
	}
}
