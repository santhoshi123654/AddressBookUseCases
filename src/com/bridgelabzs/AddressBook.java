package com.bridgelabzs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {
	
	private String firstName;
	private String lastName;
	private String address;
	private String cityName;
	private String stateName;
	private String zipCode;
	private String phoneNumber;
	private String emailId;
	
	public AddressBook(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.cityName = city;
		this.stateName = state;
		this.zipCode = zip;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}
	
	public static void main(String[] args){
		
		System.out.println("Welcome to Address Book");
		Scanner sc = new Scanner(System.in);
		System.out.print("First Name:");
		String fName = sc.nextLine();
		System.out.print("Last Name:");
		String lName = sc.nextLine();
		System.out.print("Enter Address:");
		String address = sc.nextLine();
		System.out.print("Enter City:");
		String cityName = sc.nextLine();
		System.out.print("Enter State:");
		String stateName = sc.nextLine();
		System.out.print("Enter ZIP:");
		String zipCode = sc.nextLine();
		System.out.print("Enter PhoneNumber:");
		String phoneNumber = sc.nextLine();
		System.out.print("Enter email id:");
		String emailId = sc.nextLine();
		
		AddressBook member1 = new AddressBook(fName, lName, address,cityName,stateName,zipCode,emailId);
		
		ArrayList<AddressBook>addressbook1 = new ArrayList <AddressBook>();
		
		addressbook1.add(member1);

		Iterator itr = addressbook1.iterator();
		
		while (itr.hasNext()) {
			AddressBook addressbook = (AddressBook)itr.next();
			
			System.out.print(addressbook.firstName+"\n"+addressbook.lastName+"\n"+addressbook.address+"\n"+addressbook.cityName+"\n"
					+addressbook.stateName+"\n"+addressbook.zipCode+"\n"+addressbook.phoneNumber+"\n"+addressbook.emailId);
		}
	}
	
}
