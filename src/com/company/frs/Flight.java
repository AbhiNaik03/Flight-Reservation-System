package com.company.frs;

public class Flight {
    String flightNumber;
    String airline;
    int numOfSeatsBooked;
    int capacity;

    public String getFlightDetails() {
        return flightNumber + ", " + airline;
    }

    public int availableSeats() {
        return capacity - numOfSeatsBooked;
    }

    public void increaseBookingCount() {
        numOfSeatsBooked += 1;
    }
}
