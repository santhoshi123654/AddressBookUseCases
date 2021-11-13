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
		person.setCity(cityName);
		System.out.print("Enter State:");
		stateName = sc.nextLine();
		person.setState(stateName);
		System.out.print("Enter ZIP:");
		zipCode = sc.nextLine();
		person.setZip(zipCode);
		System.out.print("Enter PhoneNumber:");
		phoneNumber = sc.nextLine();
		person.setPhoneNumber(phoneNumber);
		System.out.print("Enter email id:");
		emailId = sc.nextLine();
		person.setEmail(emailId);

		addressBook.add(new Contact(firstName, lastName, address, cityName, stateName, zipCode, phoneNumber, emailId));
	}

	void display() {
		
		for (Contact ab : addressBook)  {
			
			System.out.println(ab.getFirstName()+"\n" + "" + ab.getLastName() + "\n" + ab.getAddress() + "\n" + ab.getCity() + "\n" + ab.getState()
					+ "\n" + ab.getZip() + "\n" + ab.getPhoneNumber() + "\n" + ab.getEmail() + "\n");
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddressBook ab = new AddressBook();
		int choice;
		char c;
		System.out.println("Welcome to AddressBook");

		do {
			System.out.println("Enter \n1.Add details \n2.Update details \n3.Delete details \n4.Show members \n5.No of persons");
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					ab.addPerson();
					break;
				case 2:
					System.out.println("Enter your first name to edit person details:");
					String fName = sc.next();
					int i = ab.getIndex(fName);
					ab.editContact(i);
					break;
				case 3:
					System.out.println("Enter your first name to delete person details:");
					String fNameDelete = sc.next();
					int delete = ab.getIndex(fNameDelete);
					ab.deleteContact(delete);
					break;
				case 4:
					ab.display();
					break;
				case 5:
					System.out.println("No of person details in your AddressBook:" + new Contact().members);
					System.exit(0);			
			}
			
			System.out.println("Do you Want to continue(Y/N):");
			c = sc.next().charAt(0);
			
		}
		while(c == 'Y' || c == 'y' );
		sc.close();
		
	}	
}

