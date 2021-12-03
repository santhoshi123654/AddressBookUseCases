package com.bridgelabzs;

import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddressBook ab = new AddressBook();
		int choice;
		char c;
		System.out.println("Welcome to AddressBook");

		do {
			System.out.println("Enter \n1.Add details \n2.Update details \n3.Delete details "
					+ "\n4.Show members \n5.No of persons \n6.Print details");
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
					break;
				case 6:
					System.out.println("Print Contact Details");
					 ab.printContact();
					 break;
			}
			
			System.out.println("Do you Want to continue(Y/N):");
			c = sc.next().charAt(0);
			
		}
		while(c == 'Y' || c == 'y' );
		sc.close();
		
	}
}
