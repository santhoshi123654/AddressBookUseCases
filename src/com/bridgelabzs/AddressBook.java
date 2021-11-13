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
	private static int members = 0;
	
	public AddressBook(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber, String emailId) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.cityName = city;
		this.stateName = state;
		this.zipCode = zip;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		members++;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSecondName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return cityName;
	}

	public String getState() {
		return stateName;
	}

	public String getZip() {
		return zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return emailId;
	}

	
	public static void main(String[] args){
		
		System.out.println("Welcome to Address Book");
		Scanner sc = new Scanner(System.in);
		System.out.print("First Name:");
		String fName = sc.nextLine();
		System.out.print("Last Name:");
		String lName = sc.nextLine();
		System.out.print("Enter Address:");
		String add = sc.nextLine();
		System.out.print("Enter City:");
		String c = sc.nextLine();
		System.out.print("Enter State:");
		String s = sc.nextLine();
		System.out.print("Enter ZIP:");
		String p = sc.nextLine();
		System.out.print("Enter PhoneNumber:");
		String pN = sc.nextLine();
		System.out.print("Enter email id:");
		String eid = sc.nextLine();
		
		AddressBook member1 = new AddressBook(fName, lName, add, c, s, p,pN,eid);
		
		// creating array list	
		ArrayList<AddressBook>al = new ArrayList <AddressBook>();
		al.add(member1);

		Iterator itr = al.iterator();
		 
		// traversing elements of Array List Object
		
		while (itr.hasNext()) {
			AddressBook ab = (AddressBook)itr.next();
			System.out.println(ab.firstName+""+ab.lastName+"\n"+ab.address+"\n"+ab.cityName+"\n"
					+ab.stateName+"\n"+ab.zipCode+"\n"+ab.phoneNumber+"\n"+ab.emailId);
		}
	}
	
}
