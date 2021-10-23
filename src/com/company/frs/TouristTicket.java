package com.company.frs;

public class TouristTicket extends Ticket {
    private String hotelAddress;
    private String[] touristLocations;

    public TouristTicket(int prn, String from, String to, Flight flight, String departureDateTime, String arrivalDateTime,
                         Passenger passenger, int seatNumber, float price, String hotelAddress, String[] touristLocations) {
        super(prn, from, to, flight, departureDateTime, arrivalDateTime,
                passenger, seatNumber, price);
        this.hotelAddress = hotelAddress;
        this.touristLocations = touristLocations;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void getTouristLocations() {
        for(int i=0; i<touristLocations.length; i++) {
            System.out.println(touristLocations[i]);
        }
    }

    public void addTouristLocations(int num, String location) {
        touristLocations[num] = location;
    }

    public void removeTouristLocations(String location) {
        for (int i = 0; i<touristLocations.length; i++) {
            if (touristLocations[i].equals(location)) {
                touristLocations[i] = null;
            }
        }
    }
}
