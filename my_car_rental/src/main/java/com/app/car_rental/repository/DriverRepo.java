package com.app.car_rental.repository;

import com.app.car_rental.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepo extends JpaRepository<Driver,String> {
}
