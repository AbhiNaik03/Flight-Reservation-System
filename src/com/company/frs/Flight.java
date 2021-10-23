package com.company.frs;

public class Flight {
    private String flightNumber;
    private String airline;
    private static int numOfSeatsBooked;
    private int capacity;

    static {
        numOfSeatsBooked = 0;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Flight(String flightNumber, String airline, int capacity) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
    }

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
