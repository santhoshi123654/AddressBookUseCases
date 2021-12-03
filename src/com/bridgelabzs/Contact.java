package com.bridgelabzs;

import java.util.List;
import java.util.Objects;

public class Contact {
	
	 private String firstName;
	    private String lastName;
	    private String address;
	    private String city;
	    private String state;
	    private String zip;
	    private String phoneNumber;
	    private String email;
	    private List<Contact> contact;
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
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getZip() {
			return zip;
		}
		public void setZip(String zip) {
			this.zip = zip;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public List<Contact> getContact() {
			return contact;
		}
		public void setContact(List<Contact> contact) {
			this.contact = contact;
		}
		
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
					+ city + ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email
					+ ", contact=" + contact + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(address, city, contact, email, firstName, lastName, phoneNumber, state, zip);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Contact other = (Contact) obj;
			return Objects.equals(address, other.address) && Objects.equals(city, other.city)
					&& Objects.equals(contact, other.contact) && Objects.equals(email, other.email)
					&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
					&& Objects.equals(phoneNumber, other.phoneNumber) && Objects.equals(state, other.state)
					&& Objects.equals(zip, other.zip);
		}
		

	 
}