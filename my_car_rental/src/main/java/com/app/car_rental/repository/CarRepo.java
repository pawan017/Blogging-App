package com.app.car_rental.repository;

import com.app.car_rental.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car,String> {


}
