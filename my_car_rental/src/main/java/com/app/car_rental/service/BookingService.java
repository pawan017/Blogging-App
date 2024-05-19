package com.app.car_rental.service;

import com.app.car_rental.dto.BookingReponseDto;
import com.app.car_rental.dto.BookingRequstDto;
import com.app.car_rental.entity.Booking;

import java.util.List;

public interface BookingService {

    BookingReponseDto create(BookingRequstDto bookingRequstDto);

    List<BookingReponseDto> getAllBookings();

    BookingReponseDto getByBookingId(String id);



}
