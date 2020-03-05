/*Add a class to the previous exercise that represents a collection of contacts, both of the base
 class and the derived class. The collection class should include a single method to add a contact,
  regardless of class, to the collection - this demonstrates upcasting. The collection class should also
   include a method to iterate through the contacts and call their display methods - this demonstrates late
    binding.
  */
//Polymorphism-The ability to treat an object as being of different types
//Upcasting –converting an instance of a subclass to a
//superclass without the need for the cast operator
//have arraylist
//3/5/20, CSCI 1660, Yunis Khamis
package com.company.Khamis;
public class Main {
public static void main(String[] args) {
        // write your code here
        Contact c1 = new Contact("Yunis","112609@swcsd.us");
        Contact c2 = new Contact("Bob","11209@swcsd.us");
        BusinessContact bc1 = new BusinessContact("Yunos", "ysoserious@gmail.com", "123-456-7890");
        BusinessContact bc2 = new BusinessContact("Bunos", "bsoserioud@gmail.com", "098-765-4321");
        Collection collection = new Collection();
        collection.addContact(c1);
        collection.addContact(c2);
        collection.addContact(bc1);
        collection.addContact(bc2);
        collection.listAll();
        }
}
