package com.app.car_rental.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
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
public class ATM {

     @Id
     private String cardNo;

     private  String cardholder;
     private LocalDate expDate;

     @Transient
     private  Integer cvv;


}
