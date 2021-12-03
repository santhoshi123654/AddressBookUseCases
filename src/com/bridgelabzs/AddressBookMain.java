package com.bridgelabzs;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contactList = new ArrayList<Contact>();

        boolean flag = true;
        while (flag) {
            Contact contact = new Contact();
            System.out.println("Enter 1 to add contact \nEnter 2 to edit\nEnter 3 to delete");
            System.out.println("Enter the option : ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Add");
                    System.out.println("Enter the First Name : ");
                    String firstName = sc.next();
                    contact.setFirstName(firstName);

                    System.out.println("Enter the Last Name : ");
                    String lastName = sc.next();
                    contact.setLastName(lastName);

                    System.out.println("Enter the Address : ");
                    String address = sc.next();
                    contact.setAddress(address);

                    System.out.println("Enter the City : ");
                    String city = sc.next();
                    contact.setCity(city);

                    System.out.println("Enter the State : ");
                    String state = sc.next();
                    contact.setState(state);

                    System.out.println("Enter the ZIP Code : ");
                    String zipCode = sc.next();
                    contact.setZip(zipCode);

                    System.out.println("Enter the Phone Number : ");
                    String phoneNumber = sc.next();
                   contact.setPhoneNumber(phoneNumber);

                    System.out.println("Enter the E-mail: ");
                    String email = sc.next();
                    contact.setEmail(email);

                    contactList.add(contact);

                    for (Contact c : contactList) {
                        System.out.println(c.getFirstName() + " " + c.getLastName() + " " + c.getAddress() + " " + c.getCity() + " " + c.getState() + " " + c.getPhoneNumber() + " " + c.getZip() + " " + c.getEmail());
                    }
                    break;

                case 2:
                    System.out.println("Edit");
                    System.out.println("Enter the first Name : ");
                    String name = sc.next();
                    for (int i = 0; i < contactList.size(); i++) {
                        if (contactList.get(i).getFirstName().equals(name)) {
                            System.out.println("Enter the Last Name : ");
                            String newLastName = sc.next();
                            contact.setLastName(newLastName);

                            System.out.println("Enter the Address : ");
                            String newAddress = sc.next();
                           contact.setAddress(newAddress);

                            System.out.println("Enter the City : ");
                            String newCity = sc.next();
                            contact.setCity(newCity);

                            System.out.println("Enter the State : ");
                            String newState = sc.next();
                            contact.setState(newState);

                            System.out.println("Enter the ZIP Code : ");
                            String newZipCode = sc.next();
                            contact.setZip(newZipCode);

                            System.out.println("Enter the Phone Number : ");
                            String newPhoneNumber = sc.next();
                            contact.setPhoneNumber(newPhoneNumber);

                            System.out.println("Enter the E-mail: ");
                            String newEmail = sc.next();
                            contact.setEmail(newEmail);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Delete");
                    System.out.println("Enter the first name : ");
                    String deleteName = sc.next();
                    for (int i = 0; i < contactList.size(); i++) {
                        if (contactList.get(i).getFirstName().equals(deleteName)) {
                           contactList.remove(i);
                        }
                    }
                default:
                    System.out.println("Invalid Option");
                    flag = false;
            }
        }
    }
}