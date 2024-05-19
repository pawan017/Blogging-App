package com.app.car_rental.controller;

import com.app.car_rental.dto.BookingReponseDto;
import com.app.car_rental.dto.BookingRequstDto;
import com.app.car_rental.entity.Booking;
import com.app.car_rental.exceptions.ResourceNotFoundExceptio;
import com.app.car_rental.repository.BookingRepo;
import com.app.car_rental.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/customer/auth")
@CrossOrigin
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private BookingRepo bookingRepo;

    @PostMapping("/book-now")
    public ResponseEntity<BookingReponseDto>createBooking(
            @RequestBody BookingRequstDto bookingRequstDto){

        BookingReponseDto bookingReponseDto = bookingService.create(bookingRequstDto);

        return  new ResponseEntity<BookingReponseDto>(bookingReponseDto, HttpStatus.CREATED);
    }
}
