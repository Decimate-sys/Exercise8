package com.company.Khamis;

/**
 * Created by 112609 on 3/2/2020.
 */
public class Contact {
    private String name;
    private String email;
    Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }
    String getName() {
        return name;
    }
    String getEmail() {
        return email;
    }
    public void display() {
        System.out.println("Your name is " + name + " and your email is " + email);
    }
}


