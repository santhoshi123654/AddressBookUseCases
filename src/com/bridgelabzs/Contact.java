package com.bridgelabzs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Contact {

	 private String firstName;
	    private String lastName;
	    private String city;
	    private String state;
	    private String zip;
	    private String phoneNumber;
	    private String email;
	    private List<Contact> contact;

	    public void setfirstName(String firstName) {
	        this.firstName = firstName;
	    }
	    public String getfirstName() {
	        return firstName;
	    }

	    public void setlastName(String lastName) {
	        this.lastName = lastName;
	    }
	    public String getlastName() {
	        return lastName;
	    }

	    public void setcity(String city) {
	        this.city = city;
	    }
	    public String getcity() {
	        return city;
	    }

	    public void setstate(String state) {
	        this.state = state;
	    }
	    public String getstate() {
	        return state;
	    }

	    public void setzip(String zip) {
	        this.zip = zip;
	    }
	    public String getzip() {
	        return zip;
	    }

	    public void setphoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }
	    public String getphoneNumber() {
	        return phoneNumber;
	    }

	    public void setemail(String email) {
	        this.email = email;
	    }
	    public String getemail() {
	        return email;
	    }

	    @Override
	    public String toString() {
	        return '\n'+"Contact is"+'\n'+ "First Name: " + firstName +'\n'+ "Last  Name: " + lastName +'\n'+ "City : " + city +'\n'+ "State : " + state
	                + "zip : " + zip +'\n'+"Phone Number : " + phoneNumber +'\n'+ "Email Id: " + email +'\n';
	    }
		@Override
		public int hashCode() {
			return Objects.hash(city, contact, email, firstName, lastName, phoneNumber, state, zip);
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
			return Objects.equals(city, other.city) && Objects.equals(contact, other.contact)
					&& Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
					&& Objects.equals(lastName, other.lastName) && Objects.equals(phoneNumber, other.phoneNumber)
					&& Objects.equals(state, other.state) && Objects.equals(zip, other.zip);
		}
	    


}
