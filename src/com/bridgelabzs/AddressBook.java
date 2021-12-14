package com.bridgelabzs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {

	static Scanner s=new Scanner(System.in);

    public static void main(String[] args) {

        int option;
        
        Map<String, List<Contact>> addressBooks = new HashMap<String, List<Contact>>();
        do {
            System.out.println("Enter 1 to Add AddressBook\nEnter 2 to Edit AddressBook\nEnter 3 to see All Address Books\n"
            		+ "Enter 4 to Check Duplicate"
            		+ "\nEnter 0 to Exit");
            option=s.nextInt();
            switch(option) {
                case 1:
                    AddressBookOperations.addAddressBook(addressBooks);
                    break;
                case 2:
                    AddressBookOperations.editAddressBook(addressBooks);
                    break;
                case 3:
                    AddressBookOperations.displayAllAddressBook(addressBooks);
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }while(option != 0);
    }

	
}
