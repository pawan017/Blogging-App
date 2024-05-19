package com.app.car_rental.controller;

import com.app.car_rental.dto.ATMDto;
import com.app.car_rental.service.ATMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer/auth/atm")
@CrossOrigin
public class ATMController {

    @Autowired
    private ATMService atmService;

    @PostMapping("/add-card")
    public ResponseEntity<ATMDto>create(@RequestBody ATMDto atmDto){
        ATMDto atmDto1 = atmService.create(atmDto);
        return new ResponseEntity<ATMDto>(atmDto1, HttpStatus.OK);
    }
}
