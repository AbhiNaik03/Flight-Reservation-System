package com.company.frs;

public class Main {

    public static void main(String[] args) {
        Passenger passenger1 = new Passenger();
        passenger1.contactName = "Abhi";
        passenger1.contactPhone = "9876543210";
        passenger1.contactEmail = "abhi@email.com";
        System.out.println(passenger1.getContactDetails());
    }
}
