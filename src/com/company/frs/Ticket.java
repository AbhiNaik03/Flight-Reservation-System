package com.company.frs;

public abstract class Ticket {
    private int prn;
    private String from;
    private String to;
    private Flight flight;
    private String departureDateTime;
    private String arrivalDateTime;
    private Passenger passenger;
    private int seatNumber;
    private float price;
    private boolean isTicketCancelled = false;

    public Ticket(int prn, String from, String to, Flight flight, String departureDateTime, String arrivalDateTime,
                  Passenger passenger, int seatNumber, float price) {
        this.prn = prn;
        this.from = from;
        this.to = to;
        this.flight = flight;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.passenger = passenger;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public int getPrn() {
        return prn;
    }

    public void setPrn(int prn) {
        this.prn = prn;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String checkStatus() {
        if (isTicketCancelled) {
            return "Ticket Cancelled";
        }
        else {
            return "Ticket Booked";
        }
    }

    public int durationOfJourney(int departureTime, int arrivalTime) {
        return arrivalTime - departureTime;
    }

    public void cancelTicket() {
        this.isTicketCancelled = true;
    }
}
