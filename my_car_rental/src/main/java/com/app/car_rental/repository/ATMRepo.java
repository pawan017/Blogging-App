package com.app.car_rental.repository;

import com.app.car_rental.entity.ATM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ATMRepo extends JpaRepository<ATM,String> {
}
