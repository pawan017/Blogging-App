package com.app.car_rental.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HotelDto {

    private String hotelId;

    private String hotel;

    private  String room;

    private Integer stay;

    private String manageParking;

    private Integer finalCost;
}
