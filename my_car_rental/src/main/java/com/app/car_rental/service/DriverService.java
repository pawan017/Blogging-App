package com.app.car_rental.service;

import com.app.car_rental.dto.DriverDto;

import java.util.List;

public interface DriverService {

    DriverDto create(DriverDto driverDto);
    DriverDto getDriverById(String driverId);

   List<DriverDto> getAllDrivers();

}
