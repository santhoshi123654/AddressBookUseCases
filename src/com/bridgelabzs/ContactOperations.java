package com.bridgelabzs;

import java.util.List;
import java.util.Scanner;

public class ContactOperations {
	
	public static Scanner s=new Scanner(System.in);

	    public static void Add_Contact(List<Contact> contact) {
	        Contact c=new Contact();
	        System.out.print("Add Contact  \n");
	        System.out.print("Enter First Name: ");
	        c.setfirstName(s.next());
	        System.out.print("Enter Last Name : ");
	        c.setlastName(s.next());
	        System.out.print("Enter City : ");
	        c.setcity(s.next());
	        System.out.print("Enter State : ");
	        c.setstate(s.next());
	        System.out.print("Enter zip : ");
	        c.setzip(s.next());
	        System.out.print("Enter PhoneNumber: ");
	        c.setphoneNumber(s.next());
	        System.out.print("Enter Email ID : ");
	        c.setemail(s.next());
	        contact.add(c);
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
	        String firstName = s.next();

	        for (int i = 0; i < contact.size(); i++) {
	            if (contact.get(i).getfirstName().equalsIgnoreCase(firstName)) {
	                Contact c = contact.get(i);
	                System.out.print("Enter new First Name: ");
	                c.setfirstName(s.next());
	                System.out.print("Enter  new Last Name : ");
	                c.setlastName(s.next());
	                System.out.print("Enter new City : ");
	                c.setcity(s.next());
	                System.out.print("Enter new State : ");
	                c.setstate(s.next());
	                System.out.print("Enter new zip : ");
	                c.setzip(s.next());
	                System.out.print("Enter new PhoneNumber: ");
	                c.setphoneNumber(s.next());
	                System.out.print("Enter new Email ID : ");
	                c.setemail(s.next());
	                contact.set(i,c);
	                System.out.println("Edited Successfully!");
	            }
	            else if(firstName!=(contact.get(i).getfirstName())){
	                System.out.println("Not Found!");
	            }
	        }
	    }

	    public static void deleteContact(List<Contact> contact){
	        System.out.println("Enter first name that you want to Delete:");
	        String firstName = s.next();
	        for (int i = 0; i < contact.size(); i++) {
	            if (contact.get(i).getfirstName().equalsIgnoreCase(firstName)) {
	                contact.remove(i);
	                System.out.println("Deleted Successfully !");
	                break;
	            }
	            else if(firstName!=(contact.get(i).getfirstName())){
	                System.out.println("Not Found!");
	            }
	        }
	    }
}
