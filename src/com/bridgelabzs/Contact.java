package com.bridgelabzs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.Scanner;

public class Contact <T> implements AddressBookI {

	static int value;
	public static List<AddressBook> addresses;


	public Contact() {
		addresses = new ArrayList<>();
	}
	
	public List<AddressBook> getAddreses() {
		return addresses;
	}

	public void setAddreses(List<AddressBook> addreses) {
		this.addresses = addreses;
	}

	public void addContact(AddressBook addressBook) {

		addresses.add(addressBook);
		System.out.println(addresses);
	}
	
	public static AddressBook contact() {
		
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
		
		AddressBook addressBook = new AddressBook(fName,lName, address,cityName,stateName,zipCode,phoneNumber,emailId);
		return addressBook;
}
	public void updateContact(String name, AddressBook addressBook) {
		// updated the phone number of existing contact
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter phone number : ");
		String number = scanner.next();
		for (int i = 0; i < addresses.size(); i++) {
			if (addressBook.getFirstName().equals(name)) {
				addressBook.setPhoneNumber(number);
				count++;
			}
		}
		if (count == 0) {
			System.out.println(name + " contact not existed ");
		}
		System.out.println(addresses);
		scanner.close();
	}
	public AddressBook editDetails(String name, AddressBook addressBook) {
		
		if (addressBook.getFirstName().equals(name)) {
			addressBook = contact();
		}
		else {
			System.out.println("Enter correct Name to edit");
		}
		return addressBook;
		
	}
	public void deleteContact(String name,AddressBook addressBook) {
		for(int i=0;i<addresses.size();i++) {
			if(addressBook.getFirstName().equals(name)) {
				addresses.remove(i);
			}
		}
		return ; 
	}
	
	public int dublicateAddress(String name, AddressBook addressBook) {
		int count = 0;
		for (int i = 0; i < addresses.size(); i++) {
			if(addressBook.getFirstName() == null) {
				return 0;
			}
			else if (addressBook.getFirstName().equals(name)) {
				count++;
			}
		}
		return count;
	}

	public void multiAddressBooks(MultipleAddressBooks book) {
		
		book.mapBook.put("person1", addresses);
		
	}
	public void printBooks(MultipleAddressBooks multipleAddressBooks) {

		System.out.println(multipleAddressBooks.mapBook);

	}
}
