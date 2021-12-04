package com.bridgelabzs;

import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {

		System.out.println("Welcome To Address Book");
		AddressBook addressBook = new AddressBook(null, null, null, null, null, null, null,null);
		Contact contact = new Contact();
		Scanner scanner = new Scanner(System.in);
		int exit = 0;
		
		while (exit != 4) {
			
			System.out.println("\n Enter 1:To Add \n Enter 2 :TO Edit \n Enter 3 :To Delete \n Enter 4: Exit ");
			int num = scanner.nextInt();
			exit = num;
			
			switch (num) {
			
				case 1:
					addressBook = Contact.contact();
					contact.addContact(addressBook);
					break;
				case 2:
					System.out.println("Enter the first name to Edit");
					String name = scanner.next();
					contact.editDetails(name, addressBook);
					break;
				case 3:
					System.out.println("Enter FirstName to Delete ");
					String deletingname = scanner.next();
					contact.deleteContact(deletingname, addressBook);
					break;
				case 4 :
					System.out.println("Exit from the AddresBook");
					System.out.println(contact.addresses);
					break;
			}
		}
	}
}
