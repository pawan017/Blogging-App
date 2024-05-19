package com.app.car_rental.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ATMDto {

    private String cardNo;
    private  String cardholder;
    private String expDate;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer cvv;


}
