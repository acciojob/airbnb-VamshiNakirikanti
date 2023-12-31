package com.driver.services;

import com.driver.model.Booking;
import com.driver.model.Facility;
import com.driver.model.Hotel;
import com.driver.model.User;
import com.driver.repositories.HotelManagementRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public Integer addUser(User user) {
        return hotelManagementRepository.addUser(user);
    }

    public String getHotelWithMostFacilities() {
        return hotelManagementRepository.getHotelWithMostFacilities();
    }

    public int bookARoom(Booking booking) {
        return hotelManagementRepository.bookARoom(booking);
    }

    public int getBookings(Integer aadharCard) {
        return hotelManagementRepository.getBookings(aadharCard);
    }

    public Hotel updateFacilities(List<Facility> newFacilities, String hotelName) {
        return hotelManagementRepository.updateFacilities(newFacilities,hotelName);
    }
}
