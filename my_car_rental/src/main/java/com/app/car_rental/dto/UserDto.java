package com.app.car_rental.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private  String id;

    private String fname;

    private String lname;

  //  @JsonFormat(pattern = "dd-MM-yyyy")
  // @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate dob;

    @Column(unique = true)
    private String email;

    private String password;




}
