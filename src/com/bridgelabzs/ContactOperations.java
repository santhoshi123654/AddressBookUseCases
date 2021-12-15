package com.bridgelabzs;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ContactOperations {
    static Scanner s=new Scanner(System.in);

    public static void Add_Contact(String fString,List<ContactAddress> contact) {
        ContactAddress c=new ContactAddress();

        c.setfirstName(fString);
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

    public static boolean checkDuplicate(String f_name,List<ContactAddress> contact) {
        for (ContactAddress c : contact) {
            if (c.getfirstName().equals(f_name)) {
                return true;
            }
        }
        return false;
    }


    public static void Display_All(List<ContactAddress> contact){
        boolean is_Empty=contact.isEmpty();
        if(is_Empty==true)
            System.out.println("Array List is Empty");
        else
            System.out.println(contact);
    }

    public static void editContact(List<ContactAddress> contact ) {
        System.out.println("Enter first name that you want to Edit:");
        String firstName = s.next();

        for (int i = 0; i < contact.size(); i++) {
            if (contact.get(i).getfirstName().equalsIgnoreCase(firstName)) {
                ContactAddress c = contact.get(i);
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

    public static void deleteContact(List<ContactAddress> contact){
        System.out.println("Enter first name that you want to Delete:");
        String firstName = s.next();
        for (int i = 0; i < contact.size(); i++) {
            if (contact.get(i).getfirstName().equalsIgnoreCase(firstName)) {
                contact.remove(i);
                System.out.println("Deleted Successfully !");
                break;
            }
        }
    }

    public static void searchByCityOrState(List<ContactAddress> contact) {
        System.out.println("Enter CityName: ");
        String city = s.next();
        contact.stream().filter(c -> c.getcity().equals(city)).forEach(System.out::println);
    }

    public static void viewPersonByCityOrState(List<ContactAddress> contact) {
        System.out.println("Enter CityName: ");
        String city = s.next();
        contact.stream()
        	   .filter(c -> c.getcity().equals(city))
        	   .forEach(cn -> System.out.println("First Name : "+cn.getfirstName()+"  Last Name : "+cn.getlastName()));
    }

    public static void countByCity(List<ContactAddress> contact) {

        System.out.println("Enter the name of the city:");
        String city=s.next();
        Long countNamesByCity= contact.stream()
        						      .filter(e -> city.equals(e.getcity()))
        						      .count();
        System.out.println(city+" : "+countNamesByCity);

    }

    public static void countByState(List<ContactAddress> contact) {

        System.out.println("Enter the name of the State:");
        String state=s.next();
        Long countNamesByState=contact.stream()
        							  .filter(e -> state.equals(e.getstate()))
        							  .count();
        System.out.println(state+" : "+countNamesByState);
    }

    public static void sortedContactByFirstName(List<ContactAddress> contact) {

        List<ContactAddress> sortedContact=contact.stream()
        			                              .sorted(new compareFirstName())
        			                              .collect(Collectors.toList());
        System.out.println(sortedContact);
    }


    public static void sortedContactByCity(List<ContactAddress> contact) {
				        contact.stream()
				        	   .sorted(new compareCity())
				        	   .forEach(System.out::println);

    }

    public static void sortedContactByState(List<ContactAddress> contact) {
    					contact.stream()
    					.sorted(new compareState())
    					.forEach(System.out::println);

    }

    public static void sortedContactByZip(List<ContactAddress> contact) {
    					contact.stream()
    					.sorted(new compareZip())
    					.forEach(System.out::println);

    }
}

class compareFirstName implements Comparator<ContactAddress> {

    @Override
    public int compare(ContactAddress o1, ContactAddress o2) {

    		return o1.getfirstName().compareTo(o2.getfirstName());
    }

}

class compareCity implements Comparator<ContactAddress> {

    @Override
    public int compare(ContactAddress o1, ContactAddress o2) {
    	return o1.getcity().compareTo(o2.getcity());
    }

}

class compareState implements Comparator<ContactAddress> {

    @Override
    public int compare(ContactAddress o1, ContactAddress o2) {
        return o1.getstate().compareTo(o2.getstate());
    }

}

class compareZip implements Comparator<ContactAddress> {

    @Override
    public int compare(ContactAddress o1, ContactAddress o2) {
        return o1.getzip().compareTo(o2.getzip());
    }

}