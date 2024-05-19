package com.app.car_rental.controller;

import com.app.car_rental.dto.HotelDto;
import com.app.car_rental.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer/auth")
@CrossOrigin
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping ("/driver-hotel")
    public ResponseEntity<HotelDto>create(@RequestBody HotelDto hotelDto){
        HotelDto hotelDto1 = hotelService.create(hotelDto);
        return  new ResponseEntity<HotelDto>(hotelDto1, HttpStatus.CREATED);
    }
}
