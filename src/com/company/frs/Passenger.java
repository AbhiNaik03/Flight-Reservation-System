package com.company.frs;

public class Passenger {
    private static int idCounter;
    private int id;

    static {
        idCounter = 0;
    }

    private static class Address {
        String street;
        String city;
        String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    private Address address;

    private static class Contact {
        String contactName;
        String contactPhone;
        String contactEmail;

        public Contact(String contactName, String contactPhone, String contactEmail) {
            this.contactName = contactName;
            this.contactPhone = contactPhone;
            this.contactEmail = contactEmail;
        }
    }

    private Contact contact;

    public Passenger(String street, String city, String state,
                     String contactName, String contactPhone, String contactEmail) {
        this.id = ++idCounter;
        this.address = new Address(street, city, state);
        this.contact = new Contact(contactName, contactPhone, contactEmail);
    }

    public String getAddressDetails() {
        return address.street + ", " + address.city + ", " + address.state;
    }

    public String getContactDetails() {
        return contact.contactName + ", " + contact.contactPhone + ", " + contact.contactEmail;
    }

    public static int getPassengerCount() {
        return idCounter;
    }
}
