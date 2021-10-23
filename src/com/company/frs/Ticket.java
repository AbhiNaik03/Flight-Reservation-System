package com.company.frs;

public class Ticket {
    int prn;
    String from;
    String to;
    Flight flight;
    String departureDateTime;
    String arrivalDateTime;
    Passenger passenger;
    int seatNumber;
    float price;
    boolean isTicketCancelled = false;

    public String checkStatus() {
        if (isTicketCancelled) {
            return "Ticket Cancelled";
        }
        else {
            return "Ticket Booked";
        }
    }

    public int durationOfJourney() {
        return 123;
    }

    public void cancelTicket() {
        isTicketCancelled = true;
    }
}
