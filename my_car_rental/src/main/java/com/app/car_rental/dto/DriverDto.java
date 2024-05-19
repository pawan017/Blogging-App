package com.app.car_rental.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DriverDto {

    private  String id;
    private String driverImg;
    private String driverName;
    private String drivingExperiance;
    private String driverMobNo;
    private String availability;
    private String food;
    private String smoke;
    private String drink;
    private Integer charges;
}
