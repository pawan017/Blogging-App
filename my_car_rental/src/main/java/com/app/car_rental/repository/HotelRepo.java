package com.app.car_rental.repository;

import com.app.car_rental.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepo extends JpaRepository<Hotel,String> {
}
