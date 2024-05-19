package com.app.car_rental.repository;

import com.app.car_rental.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<Booking,String> {
}
