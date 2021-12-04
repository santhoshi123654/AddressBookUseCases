package com.bridgelabzs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Contact {
	
public List<AddressBook> addresses;
	
	public Contact() {
		addresses = new ArrayList();
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
		
		AddressBook addressBook = new AddressBook(fName, lName, address,cityName,stateName,zipCode,phoneNumber,emailId);
		return addressBook;
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
	public AddressBook deleteContact(String name,AddressBook addressBook) {
		for(int i=0;i<addresses.size();i++) {
			if(addressBook.getFirstName().equals(name)) {
				addresses.remove(i);
			}
		}
		return addressBook;
	}
	

	public static void main(String[] args) {

		AddressBook addressBook = contact();
		System.out.println(addressBook);
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Name to be Edited :");
		String name = scanner.next();
		Contact contact=new Contact();
		addressBook =contact.editDetails(name,addressBook);
		System.out.println(addressBook);
		System.out.println("Enter a name to be deleted ");
		String deletingname = scanner.next();
		addressBook=contact.deleteContact(deletingname,addressBook);
	}
}
