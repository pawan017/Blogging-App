package com.app.car_rental.service;

import com.app.car_rental.dto.CarDto;

import java.util.List;

public interface CarService {

    CarDto create(CarDto carDto);

     List<CarDto>getAllCars();

    CarDto getCarById(String carId);

}
