package com.coretto;

class Contact {

    private int phoneNr;
    private String contactName;

    public Contact(int phoneNr, String contactName) {
        this.phoneNr = phoneNr;
        this.contactName = contactName;
    }

    public int getPhoneNr() {
        return phoneNr;
    }

    public String getContactName() {
        return contactName;
    }

    public static Contact createContact(String contactName, int phoneNr) {
        return new Contact(phoneNr, contactName);
    }
}
