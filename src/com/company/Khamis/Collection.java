package com.company.Khamis;

import java.util.ArrayList;

/**
 * Created by 112609 on 3/2/2020.
 */

class Collection {
    private ArrayList<Contact> collection = new ArrayList<>();

    void addContact(Contact contact){
        collection.add(contact);
    }
    void listAll(){
        for (Contact contact : collection) {
            contact.display();
        }
    }
}
