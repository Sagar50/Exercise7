//Sagar Patel, CSCI 1660, 2/29/2020, Exercise 7

package com.company.Patel;

public class BusinessContacts extends ContactInfo {
    int contactPhoneNumber;

    public BusinessContacts(String name, String email, int contactPhoneNumber) {
        super(name, email);
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public BusinessContacts() {
    }

    public int getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(int contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("The contact phone number of " + getName() + " is: " + contactPhoneNumber);

    }
}
