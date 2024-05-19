package com.app.car_rental.controller;

import com.app.car_rental.dto.DriverDto;
import com.app.car_rental.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer/auth")
@CrossOrigin
public class DriverController {

    @Autowired
    private DriverService driverService;

    @PostMapping("/add-driver")
    public ResponseEntity<DriverDto>create(@RequestBody DriverDto driverDto){
        DriverDto driverDto1 = driverService.create(driverDto);
        return new ResponseEntity<DriverDto>(driverDto1, HttpStatus.CREATED);
    }

    @GetMapping("/{driverId}")
    public ResponseEntity<DriverDto>getDriverById(@PathVariable String driverId){
        DriverDto driverDto1 = driverService.getDriverById(driverId);
        return new ResponseEntity<DriverDto>(driverDto1, HttpStatus.CREATED);
    }

    @GetMapping("/drivers")
    public ResponseEntity<List<DriverDto>> getAllDrivers(){
        List<DriverDto> allDrivers = driverService.getAllDrivers();
        return new ResponseEntity<List<DriverDto>>(allDrivers, HttpStatus.CREATED);
    }

}
