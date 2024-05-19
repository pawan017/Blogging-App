package com.app.car_rental.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private  String carCompany;
    private  String carColor;
    private String carModel;
    private String carType;
    private String carImg;
    private String car360;
    private String carOwner;
    private String numPlate;
    private LocalDate regDate;
    private String insurance;
    private LocalDate insuranceValidity;
    private Integer passangerCapacity;
    private String fuelType;
    private String feature;
    private Integer totalRunning;
    private String version;
    private Double charge;

    @OneToMany(mappedBy = "car",cascade = CascadeType.ALL)
    private List<Booking> booking;


}
