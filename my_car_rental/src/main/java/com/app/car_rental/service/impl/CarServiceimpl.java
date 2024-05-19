package com.app.car_rental.service.impl;

import com.app.car_rental.dto.CarDto;
import com.app.car_rental.entity.Car;
import com.app.car_rental.exceptions.ResourceNotFoundExceptio;
import com.app.car_rental.repository.CarRepo;
import com.app.car_rental.service.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceimpl implements CarService {
    @Autowired
    private CarRepo carRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CarDto create(CarDto carDto) {

        Car car= modelMapper.map(carDto, Car.class);
        Car savedCar= carRepo.save(car);

        return modelMapper.map(savedCar, CarDto.class);
    }

    @Override
    public List<CarDto> getAllCars() {

        List<Car> cars=carRepo.findAll();
        List<CarDto>carDtos = cars.stream().map(c->modelMapper.map(c,CarDto.class)).collect(Collectors.toList());

        return carDtos;
    }

    @Override
    public CarDto getCarById(String carId) {


        Car car= carRepo.findById(carId)
                .orElseThrow(()->new ResourceNotFoundExceptio("Car Is Not Found With This Id"+carId));

        return modelMapper.map(car,CarDto.class);
    }
}
