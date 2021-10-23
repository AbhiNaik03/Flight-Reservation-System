package com.company.frs;

public class Address {
    private String street;
    private String city;
    private String state;

    public String getContactDetails() {
        return street + ", " + city + ", " + state;
    }
}
