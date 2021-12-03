package com.bridgelabzs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddressSystem {
	
	static String f_name;
    static Scanner sc =new Scanner(System.in);

    public static void addAddressBook(Map<String, List<Contact>> addressBooks) {
        System.out.println("Add new AddressBook");
        String bookName = sc.next();
        addressBooks.put(bookName, new ArrayList<Contact>());
    }

    public static void displayAllAddressBook(Map<String, List<Contact>> addressBooks) {
        boolean is_Empty=addressBooks.isEmpty();
        if(is_Empty==true)
            System.out.println("No Address Books are Present");
        else
            System.out.println(addressBooks);
    }

    public static void editAddressBook(Map<String, List<Contact>> addressBooks) {
        System.out.println("Enter the name of the AddressBook you want to Edit");
        String bookName1 = sc.next();

        if(addressBooks.containsKey(bookName1)) {
            List<Contact> contact = addressBooks.get(bookName1);
            int choice;
            do{
                System.out.println("Enter your option : ");
                System.out.println("1.Add contact  ");
                System.out.println("2.Display all contact ");
                System.out.println("3.Edit Contact ");
                System.out.println("4.Delete Contact ");

                choice=sc.nextInt();
                switch (choice)
                {
                    case 1:
                    	ContactList.Add_Contact(contact);
                        break;
                    case 2:
                    	ContactList.Display_All(contact);
                        break;
                    case 3:
                    	ContactList.editContact(contact);
                        break;
                    case 4:
                    	ContactList.deleteContact(contact);
                        break;
                    default:
                        System.out.println("Enter valid option");
                        break;
                }
                System.out.println("Do you want to continue (1.Continue or 0.Exit)");
                choice=sc.nextInt();
            }
            while(choice != 0);
        }
        else
            System.out.println("Invalid AddressBook");
    }
}
