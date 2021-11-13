package com.bridgelabzs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Contact {
	
	public static void main(String[] args) {

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

		AddressBook member1 = new AddressBook(fName, lName, add, c, s, p, pN, eid);

		// creating array list

		ArrayList<AddressBook> al = new ArrayList<AddressBook>();
		al.add(member1);

		// Getting Iterator

		Iterator itr = al.iterator();

		// traversing elements of Array List Object

		while (itr.hasNext()) {
			AddressBook ab = (AddressBook) itr.next();
			System.out.println(ab.firstName + "" + ab.lastName + "\n" + ab.address + "\n" + ab.cityName + "\n" + ab.stateName
					+ "\n" + ab.zipCode + "\n" + ab.phoneNumber + "\n" + ab.emailId + "\n");
		}

		System.out.println("Enter the contact Name to edit:");
		String name = sc.nextLine();
		for (AddressBook contact : al) {
			if (contact.firstName.equals(name)){
				
				System.out.println("Edit the contact details");
				Scanner sc1 = new Scanner(System.in);
				System.out.print("First Name:");
				String fName1 = sc.nextLine();
				System.out.print("Last Name:");
				String lName1 = sc.nextLine();
				System.out.print("Enter Address:");
				String add1 = sc.nextLine();
				System.out.print("Enter City:");
				String c1 = sc.nextLine();
				System.out.print("Enter State:");
				String s1 = sc.nextLine();
				System.out.print("Enter ZIP:");
				String p1 = sc.nextLine();
				System.out.print("Enter PhoneNumber:");
				String pN1 = sc.nextLine();
				System.out.print("Enter email id:");
				String eid1 = sc.nextLine();
				AddressBook member2 = new AddressBook(fName1, lName1, add1, c1, s1, p1, pN1, eid1);
				
				al.set(0, member2);
			}
			
			System.out.println("\nEdited contact details\n");
			
			while (itr.hasNext()) {
				AddressBook ab = (AddressBook) itr.next();
				System.out.println("\n............................................\n");
				System.out.println(ab.firstName + "" + ab.lastName + "\n" + ab.address + "\n" + ab.cityName + "\n" + ab.stateName
						+ "\n" + ab.zipCode + "\n" + ab.phoneNumber + "\n" + ab.emailId + "\n");
			}
		}

	}
}
