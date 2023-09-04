package com.driver.services;

import com.driver.model.Hotel;
import com.driver.repositories.HotelManagementRepository;
import org.springframework.stereotype.Service;

@Service
public class HotelManagementService {

    HotelManagementRepository hotelManagementRepository = new HotelManagementRepository();
    public String addHotel(Hotel hotel){
        if(hotel==null){
            return "FAILURE";
        }
        if(hotel.getHotelName()==null){
            return "FAILURE";
        }
        if(checkHotelExists(hotel)){
            return "FAILURE";
        }
        return hotelManagementRepository.addHotel(hotel);
    }

    public boolean checkHotelExists(Hotel hotel){
        return hotelManagementRepository.checkHotelExists(hotel);
    }
}
