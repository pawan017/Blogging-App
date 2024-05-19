package com.app.car_rental.controller;

import com.app.car_rental.dto.FinalConfirmDto;
import com.app.car_rental.service.FinalConfirmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer/auth")
@Validated
@CrossOrigin
public class FinalConfirmController {

    @Autowired
    private FinalConfirmService finalConfirmService;

    @PostMapping("/finalConfirm")
    public ResponseEntity<FinalConfirmDto>create(@RequestBody FinalConfirmDto finalConfirmDto){
        FinalConfirmDto finalConfirmDto1 = finalConfirmService.create(finalConfirmDto);
        return new ResponseEntity<FinalConfirmDto>(finalConfirmDto1, HttpStatus.CREATED);

    }
    @GetMapping("/ticket-details/{email}")///ticket-details
    public ResponseEntity<List<FinalConfirmDto>>getTicketByEmail(@PathVariable String email){
        List<FinalConfirmDto> finalConfirmDtos = finalConfirmService.findbyEmail(email);
        return new ResponseEntity<List<FinalConfirmDto>>(finalConfirmDtos, HttpStatus.CREATED);

    }
}
