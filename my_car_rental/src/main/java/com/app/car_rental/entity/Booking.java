package com.app.car_rental.entity;

import jakarta.persistence.*;
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
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
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


    @ManyToOne
    private Car car;

}
