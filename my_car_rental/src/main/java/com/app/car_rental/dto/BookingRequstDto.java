package com.app.car_rental.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class BookingRequstDto {

    private String carId;

    private String pickUpLocation;
    private String dropLocation;
    private String pickUpTime;
    private LocalDate pickUpDate;
    private LocalDate dropDate;
    private  Integer passangerCapacity;
    private  Integer members;
    private  Integer days;
    private  Integer numBags;
}
