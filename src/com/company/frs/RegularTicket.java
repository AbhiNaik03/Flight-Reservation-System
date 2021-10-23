package com.company.frs;

public class RegularTicket extends Ticket {
    private String order;

    public RegularTicket(int prn, String from, String to, Flight flight, String departureDateTime, String arrivalDateTime,
                         Passenger passenger, int seatNumber, float price, String order) {
        super(prn, from, to, flight, departureDateTime, arrivalDateTime,
                passenger, seatNumber, price);
        this.order = order;
    }

    public String getOrderDetails() {
        return order;
    }
}
