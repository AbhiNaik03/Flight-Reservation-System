package com.company.frs;

public class Main {

    public static void main(String[] args) {
        Passenger passenger1 = new Passenger("33 Street", "Pune", "Maharashtra",
                "Abhi", "9876543210", "abhi@email.com");

        Flight flight1 = new Flight("D4321", "Air India", 100);

        Ticket ticket1 = new Ticket(1234, "Pune", "Goa", flight1, "25th Oct, 10:00", "25th Oct 14:00",
        passenger1, 22, 1999);

        System.out.println(passenger1.getAddressDetails());
        System.out.println(passenger1.getContactDetails());
        System.out.println(Passenger.getPassengerCount());

        System.out.println(flight1.getFlightDetails());

        System.out.println(ticket1.checkStatus());
    }
}
