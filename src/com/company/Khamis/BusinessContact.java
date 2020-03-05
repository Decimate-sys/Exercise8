package com.company.Khamis;

/**
 * Created by 112609 on 3/2/2020.
 */
public class BusinessContact extends Contact {
    private String phoneNumber;
    BusinessContact(String name, String email, String phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }
    private String getPhoneNumber() {
        return phoneNumber;
    }
    @Override
    public void display() {
        System.out.println("Contact: " + "Name: " + getName() + " Email: " + getEmail() + " Phone Number: " + getPhoneNumber());
    }
}
