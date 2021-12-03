package com.bridgelabzs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

	public List<Contact> addressBook = new ArrayList<>();
	
	public AddressBook() {
		addressBook = new ArrayList<Contact>();
	}
	Scanner sc = new Scanner(System.in);
	Iterator itr = addressBook.iterator();

	public void add(Contact contact) {
		addressBook.add(contact);
	}

	void addPerson() {
		Contact person = new Contact();
		System.out.print("First Name:");
		firstName = sc.nextLine();
		person.setFirstName(firstName);
		System.out.print("Last Name:");
		lastName = sc.nextLine();
		person.setLastName(lastName);
		System.out.print("Enter Address:");
		address = sc.nextLine();
		person.setAddress(address);
		System.out.print("Enter City:");
		cityName = sc.nextLine();
		person.setCityName(cityName);
		System.out.print("Enter State:");
		stateName = sc.nextLine();
		person.setStateName(stateName);
		System.out.print("Enter ZIP:");
		zipCode = sc.nextLine();
		person.setZipCode(zipCode);
		System.out.print("Enter PhoneNumber:");
		phoneNumber = sc.nextLine();
		person.setPhoneNumber(phoneNumber);
		System.out.print("Enter email id:");
		emailId = sc.nextLine();
		person.setEmailId(emailId);

		addressBook.add(new Contact(firstName, lastName, address, cityName, stateName, zipCode, phoneNumber, emailId));
	}

	void display() {
		
		for (Contact ab : addressBook)  {
			
			System.out.println(ab.getFirstName()+"\n" + "" + ab.getLastName() + "\n" + ab.getAddress() + "\n" + ab.getCityName() + "\n" + ab.getStateName()
					+ "\n" + ab.getZipCode() + "\n" + ab.getPhoneNumber() + "\n" + ab.getEmailId() + "\n");
		}
	}

	public int getIndex(String firstName) {
		int index = -1;
		for (int i = 0; i < addressBook.size();i++) {
			if (firstName.equals(addressBook.get(i).getFirstName()))
				return i;
		}
		return index;
	}

	public void editContact(int i) {

		System.out.print("First Name:");
		firstName = sc.nextLine();
		System.out.print("Last Name:");
		lastName = sc.nextLine();
		System.out.print("Enter Address:");
		address = sc.nextLine();
		System.out.print("Enter City:");
		cityName = sc.nextLine();
		System.out.print("Enter State:");
		stateName = sc.nextLine();
		System.out.print("Enter ZIP:");
		zipCode = sc.nextLine();
		System.out.print("Enter PhoneNumber:");
		phoneNumber = sc.nextLine();
		System.out.print("Enter email id:");
		emailId = sc.nextLine();

		addressBook.set(i, new Contact(firstName, lastName, address, cityName, stateName, zipCode, phoneNumber, emailId));

	}

	public void deleteContact(int i) {
		addressBook.remove(i);
	}
	 public void printContact() {
	        for (int i = 0; i < addressBook.size(); i++) {
		            System.out.println("Contact Details");
		            System.out.println("Name         : " + addressBook.get(i).getFirstName()+ "\n " 
		            				 + addressBook.get(i).getLastName() + "\n"
		                             + "Address      : " + addressBook.get(i).getAddress()   + "\n"
		                             + "City         : " + addressBook.get(i).getCityName()      + "\n"
		                             + "State        : " + addressBook.get(i).getStateName()     + "\n"
		                             + "ZipCode      : " + addressBook.get(i).getZipCode()   + "\n"
		                             + "PhoneNumber  : " + addressBook.get(i).getPhoneNumber()  + "\n"
		                             + "EmailId      : " + addressBook.get(i).getEmailId());
		        }
	 }
	
}

