package com.coretto;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> contacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getContactName()) >= 0) {
            System.out.println("Contact is already on File");
            return false;
        }
        contacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getContactName() + ", was not found.");
            return false;
        }
        this.contacts.set(foundPosition, newContact);
        System.out.println(oldContact.getContactName() + " was replaced with " + newContact.getContactName());
        return true;
    }

    private int findContact(Contact contact) {
        return this.contacts.indexOf(contact);
    }

    public boolean removeContact(Contact contact) {
        int foundContact = findContact(contact);
        if (foundContact < 0) {
            System.out.println(contact.getContactName() + ", was not found");
            return false;
        }
        this.contacts.remove(foundContact);
        System.out.println(contact.getContactName() + "was deletede!");
        return true;
    }

    private int findContact(String contactName) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = this.contacts.get(i);
            if (contact.getContactName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getContactName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.contacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for (int i = 0; i < this.contacts.size(); i++) {
            System.out.println((i + 1) + "." +
                    this.contacts.get(i).getContactName() + "->" +
                    this.contacts.get(i).getPhoneNr());
        }
    }
}


