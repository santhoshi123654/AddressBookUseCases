package com.bridgelabzs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {

	String firstName;
	String lastName;
	String address;
	String cityName;
	String stateName;
	String zipCode;
	String phoneNumber;
	String emailId;
	int members = 0;

	public AddressBook(String firstName, String lastName, String address, String cityName, String stateName, String zipCode,
			String phoneNumber, String emailId) {

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
}
