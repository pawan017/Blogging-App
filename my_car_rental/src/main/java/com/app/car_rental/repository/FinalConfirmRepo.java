package com.app.car_rental.repository;

import com.app.car_rental.entity.FinalConfirm;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FinalConfirmRepo extends JpaRepository<FinalConfirm,String> {


    List<FinalConfirm>findByEmail(String email);
}
