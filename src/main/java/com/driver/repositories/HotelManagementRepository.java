package com.driver.repositories;

import com.driver.model.Hotel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class HotelManagementRepository {
    private ArrayList<Hotel> hotelList = new ArrayList<>();
    public String addHotel(Hotel hotel){
        hotelList.add(hotel);
        return "SUCCESS";
    }

    public boolean checkHotelExists(Hotel hotel) {
        for(Hotel registeredHotel : hotelList){
            if(hotel.getHotelName().equals(registeredHotel.getHotelName())){
                return true;
            }
        }
        return false;
    }
}
