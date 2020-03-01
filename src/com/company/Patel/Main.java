//Sagar Patel, CSCI 1660, 2/29/2020, Exercise 7


package com.company.Patel;


public class Main {

    public static void main(String[] args) {

        ContactInfo normalContact = new ContactInfo("Sagar", "083401@swcsd.us");
        normalContact.displayInfo();

        BusinessContacts busContact = new BusinessContacts("Gaige", "119770@swcsd.us", 1110002222);
        busContact.displayInfo();


    }
}
