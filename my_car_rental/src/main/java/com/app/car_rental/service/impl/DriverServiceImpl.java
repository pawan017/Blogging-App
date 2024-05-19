package com.app.car_rental.service.impl;

import com.app.car_rental.dto.DriverDto;
import com.app.car_rental.entity.Driver;
import com.app.car_rental.exceptions.ResourceNotFoundExceptio;
import com.app.car_rental.repository.DriverRepo;
import com.app.car_rental.service.DriverService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepo driverRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public DriverDto create(DriverDto driverDto) {
            Driver driver=modelMapper.map(driverDto, Driver.class);
           Driver driver1= driverRepo.save(driver);

        return modelMapper.map(driver1,DriverDto.class);
    }

    @Override
    public DriverDto getDriverById(String driverId) {

       Driver driver= driverRepo.findById(driverId)
               .orElseThrow(()->new ResourceNotFoundExceptio("Driver Not Found With This Id"+driverId));

        return modelMapper.map(driver,DriverDto.class);
    }

    @Override
    public List<DriverDto> getAllDrivers() {

       List<Driver>drivers= driverRepo.findAll();
        List<DriverDto> driverDtos = drivers.stream().map(d -> modelMapper.map(d, DriverDto.class)).collect(Collectors.toList());

        return driverDtos ;
    }
}
