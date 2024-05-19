package com.app.car_rental.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class BookingReponseDto {

    private String id;
    private String carCompany;
    private String carColor;
    private String carModel;
    private String carType;
    private String carImg;
    private String carOwner;
    private String numPlate;
    private LocalDate insuranceValidity;
    private String fuelType;
    private String feature;
    private Double charge;
    private String pickUpLocation;
    private String dropLocation;
    private String pickUpTime;
    private LocalDate pickUpDate;
    private LocalDate dropDate;
    private  Integer passangerCapacity;
    private  Integer members;
    private  Integer days;
    private  Integer numBags;
    private Integer totalPrice;

}
