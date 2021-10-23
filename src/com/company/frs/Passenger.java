package com.company.frs;

public class Passenger {
    int id;
    String street;
    String city;
    String state;
    String contactName;
    String contactPhone;
    String contactEmail;

    public String getAddressDetails() {
        return street + ", " + city + ", " + state;
    }

    public String getContactDetails() {
        return contactName + ", " + contactPhone + ", " + contactEmail;
    }
}
