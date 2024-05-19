package com.app.car_rental.repository;

import com.app.car_rental.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User,String> {

   @Override
   Optional<User> findById(String s);

   Optional<User> findByEmail(String  email);


}
