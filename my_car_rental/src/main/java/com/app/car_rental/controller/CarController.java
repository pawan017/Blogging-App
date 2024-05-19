package com.app.car_rental.controller;

import com.app.car_rental.dto.CarDto;
import com.app.car_rental.entity.Car;
import com.app.car_rental.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car/auth")
@CrossOrigin
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/add-car")
    public ResponseEntity<CarDto>create(@RequestBody CarDto carDto){
        CarDto carDto1=carService.create(carDto);
        return new  ResponseEntity<CarDto>(carDto1, HttpStatus.CREATED);
    }

    @GetMapping("/cars")
    public ResponseEntity<List<CarDto>> getAllCars(){
             List<CarDto> carDtos= carService.getAllCars();
        return new ResponseEntity<List<CarDto>>(carDtos,HttpStatus.OK);
    }
    @GetMapping("/{carId}")
    public ResponseEntity<CarDto> getCarById(@PathVariable String carId){
        CarDto carDto= carService.getCarById(carId);
        return new ResponseEntity<CarDto>(carDto,HttpStatus.OK);
    }


}
