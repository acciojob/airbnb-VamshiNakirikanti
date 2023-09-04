package com.driver.repositories;

import com.driver.model.Hotel;
import com.driver.model.User;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Repository
public class HotelManagementRepository {
    private ArrayList<Hotel> hotelList = new ArrayList<>();
    private ArrayList<User> userList = new ArrayList<>();
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

    public Integer addUser(User user) {
        userList.add(user);
        return user.getaadharCardNo();
    }


    public String getHotelWithMostFacilities() {
        int max = 0;
        String ans = "";
        for(Hotel hotel:hotelList){
            if(hotel.getFacilities().size()>max){
                ans = hotel.getHotelName();
            }
            else if(hotel.getFacilities().size()>0 && hotel.getFacilities().size()==max){
                if(ans.compareTo(hotel.getHotelName())>0){
                    ans = hotel.getHotelName();
                }
            }
        }
        return ans;
    }
}
