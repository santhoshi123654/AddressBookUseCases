package com.bridgelabzs;

import java.util.List;
import java.util.Scanner;

public class ContactList {
	
	static Scanner sc =new Scanner(System.in);

    public static void Add_Contact(List<Contact> contact) {
        Contact c=new Contact();
        System.out.print("Add Contact  \n");
        System.out.print("Enter First Name: ");
        c.setFirstName(sc.next());
        System.out.print("Enter Last Name : ");
        c.setLastName(sc.next());
        System.out.print("Enter City : ");
        c.setCity(sc.next());
        System.out.print("Enter State : ");
        c.setState(sc.next());
        System.out.print("Enter zip : ");
        c.setZip(sc.next());
        System.out.print("Enter PhoneNumber: ");
        c.setPhoneNumber(sc.next());
        System.out.print("Enter Email ID : ");
        c.setEmail(sc.next());
        contact.add(c);
    }


    public static boolean checkDuplicate(String f_name,List<Contact> contact) {
        for (Contact c : contact) {
            if (c.getFirstName().equals(f_name)) {
                return true;
            }
        }
        return false;
    }


    public static void Display_All(List<Contact> contact){
        boolean is_Empty=contact.isEmpty();
        if(is_Empty==true)
            System.out.println("Array List is Empty");
        else
            System.out.println(contact);
    }

    public static void editContact(List<Contact> contact ) {
        System.out.println("Enter first name that you want to Edit:");
        String firstName = sc.next();

        for (int i = 0; i < contact.size(); i++) {
            if (contact.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                Contact c = contact.get(i);
                System.out.print("Enter new First Name: ");
                c.setFirstName(sc.next());
                System.out.print("Enter  new Last Name : ");
                c.setLastName(sc.next());
                System.out.print("Enter new City : ");
                c.setCity(sc.next());
                System.out.print("Enter new State : ");
                c.setState(sc.next());
                System.out.print("Enter new zip : ");
                c.setZip(sc.next());
                System.out.print("Enter new PhoneNumber: ");
                c.setPhoneNumber(sc.next());
                System.out.print("Enter new Email ID : ");
                c.setEmail(sc.next());
                contact.set(i,c);
                System.out.println("Edited Successfully!");
            }
            else if(firstName!=(contact.get(i).getFirstName())){
                System.out.println("Not Found!");
            }
        }
    }

    public static void deleteContact(List<Contact> contact){
        System.out.println("Enter first name that you want to Delete:");
        String firstName = sc.next();
        for (int i = 0; i < contact.size(); i++) {
            if (contact.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                contact.remove(i);
                System.out.println("Deleted Successfully !");
                break;
            }
        }
    }
}
