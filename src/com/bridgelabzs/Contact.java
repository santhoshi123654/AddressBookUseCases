package com.bridgelabzs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Contact<T> implements AddressBookI {

		static int value;
		public static ArrayList<AddressBook> addresses;

		public Contact() {
			addresses = new ArrayList<>();
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
	}

	public void deleteContact(String name, AddressBook addressBook) {

		// delete the matched contact
		for (int i = 0; i < addresses.size(); i++) {
			if (addressBook.getFirstName().equals(name)) {
				addresses.remove(i);
			}
		}
		System.out.println(addresses);
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

	public void searchCityState(MultipleAddressBooks multipleAddressBooks) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println(
					"enter 1 : for search a person by city name \n enter 2 : for search a person by state name  \n enter 3 : for exit ");
			int num = scanner.nextInt();
			int count = 0;
			switch (num) {


			case 1:
				System.out.println("enter city name to search person ");
				String city = scanner.next();
				for (List<AddressBook> entry : multipleAddressBooks.mapBook.values()) {
					for (AddressBook addressBook1 : entry) {
						if (addressBook1.getCityName().equals(city)) {
							System.out.println("city matched name : " + city + " and person name : "
									+ addressBook1.getFirstName());
							count++;
						}
					}
				}
				System.out.println("number of persons find by city name are : " + count);
				break;
			case 2:
				System.out.println("enter state name to search person ");
				String state = scanner.next();
				for (List<AddressBook> entry : multipleAddressBooks.mapBook.values()) {
					for (AddressBook addressBook1 : entry) {
						if (addressBook1.getStateName().equals(state)) {
							System.out.println("state matched : " + state + " and person name is : "
									+ addressBook1.getFirstName());
							count++;
						}
					}
				}
				System.out.println("number of persons find by state name are : " + count);
				break;
			}
			if(num ==3) {
				break;
			}
		}

	}
}