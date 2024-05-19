package com.app.car_rental.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FinalConfirm {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String  fname;
    private String  lname;
    private String  email;
    private String driverImg;
    private String driverID;
    private String  driverName;
    private String driverMobNo;
    private Integer charges;
    private String  hotel;
    private String  room;
    private Integer stay;
    private String  manageParking;
    private Integer finalCost;
    private Double  charge;
    private  String  carCompany;
    private  String carColor;
    private  String  carModel;
    private  String  carType;
    private  String carImg;
    private  String  fuelType;
    private  String  pickUpLocation;
    private  String  dropLocation;
    private String pickUpTime;
    private LocalDate  pickUpDate;
    private LocalDate  dropDate;
    private  Integer passangerCapacity;
    private  Integer  members;
    private  Integer  days;
    private  String cardNo;
}
