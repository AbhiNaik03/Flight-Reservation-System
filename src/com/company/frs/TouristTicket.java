package com.company.frs;

public class TouristTicket {
    String hotelAddress;
    String[] touristLocations;

    public String getHotelAddress() {
        return hotelAddress;
    }

    public String[] getTouristLocations() {
        return touristLocations;
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
