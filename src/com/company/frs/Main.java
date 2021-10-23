package com.company.frs;

public class Main {

    public static void main(String[] args) {
        Passenger passenger1 = new Passenger("33 Street", "Pune", "Maharashtra",
                "Abhi", "9876543210", "abhi@email.com");
        Passenger passenger2 = new Passenger("24 Street", "Mumbai", "Maharashtra",
                "Akshay", "8976543210", "aki@email.com");

        Flight flight1 = new Flight("D4321", "Air India", 100);
        Flight flight2 = new Flight("E1234", "Indigo", 200);

        Ticket ticket1 = new RegularTicket(1234, "Pune", "Goa", flight1, "25th Oct, 10:00", "25th Oct 14:00",
        passenger1, 22, 1999, "Meal and beverage");
        Ticket ticket2 = new TouristTicket(4321, "Mumbai", "Goa", flight2, "25th Oct, 10:00", "25th Oct 14:00",
                passenger2, 22, 1999, "Divine, Margoa", new String[]{"Margao", "Panjim", "Kankon", "Dudhsagar", "Vasco Da Gama"});

        System.out.println(passenger1.getAddressDetails());
        System.out.println(passenger2.getContactDetails());

        System.out.println(passenger1.getAddressDetails());
        System.out.println(passenger2.getContactDetails());

        System.out.println(Passenger.getPassengerCount());

        System.out.println(flight1.getFlightDetails());
        System.out.println(flight2.getFlightDetails());

        printTicketDetails(ticket1);
        printTicketDetails(ticket2);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPrn());
    }
}
