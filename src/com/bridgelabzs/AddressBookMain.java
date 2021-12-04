package com.bridgelabzs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain<T> implements AddressBookI {

	public final static int EXIT = 5;

	public static <T> void main(String[] args) {

		MultipleAddressBooks multipleAddressBooks = new MultipleAddressBooks();
		System.out.println("Welcome to AddressBook");
		Scanner scanner = new Scanner(System.in);
		int exit2 = 0;
		while (exit2 != 3) {
			
			Contact<Object> contactPerson = new Contact<>();
			AddressBook addressBook = new AddressBook(null, null, null, null, null, null, null, null);
			System.out.println("Enter AddressBook Name of a Person");
			String person = scanner.next();
			System.out.println(" Enter 1 :To Add Multiple Address Books \n Enter 2 : To Print MultipleBooks \n enter 3 : To Exit \n ");
			int num = scanner.nextInt();
			switch (num) {
			case 1:
				int exit = 0;
				while (exit != EXIT) {

					System.out.println(
							"enter 1 :To adding \n enter 2 :To modify the contact details \n enter 3: To delete contact  "
									+ "\n enter 4 : for multiple address books \n enter " + EXIT + " : for exit");
					int num1 = scanner.nextInt();
					exit = num1;

					switch (num1) {

					case 1:
						System.out.println("Enter a name to check the contact is there or not ");
						String name1 = scanner.next();
						int count = contactPerson.dublicateAddress(name1, addressBook);
						if (count == 0) {
							addressBook = Contact.contact();
							contactPerson.addContact(addressBook);
							break;
						}
						break;
					case 2:
						System.out.println("Enter FirstName to Edit");
						String name = scanner.next();
						contactPerson.updateContact(name, addressBook);
						break;
					case 3:
						System.out.println("Enter FirstName to Delete ");
						String name2 = scanner.next();
						contactPerson.deleteContact(name2, addressBook);
						break;
					case EXIT:
						System.out.println("Exit From the AddressBook");
						break;
					}
				}
	
				multipleAddressBooks.mapBook.put(person, Contact.addresses);
				System.out.println(multipleAddressBooks.mapBook);
				break;
			case 2:
				contactPerson.printBooks(multipleAddressBooks);
			case 3:
				exit2=3;
				break;
			}
		}
		scanner.close();
	}

	@Override
	public void addContact(AddressBook addressBook) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateContact(String name, AddressBook addressBook) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteContact(String name, AddressBook addressBook) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int dublicateAddress(String name, AddressBook addressBook) {
		// TODO Auto-generated method stub
		return 0;

	}
}
