package com.app.car_rental.service;

import com.app.car_rental.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto create (UserDto userDto);

    UserDto getUserById(String userId);

   List<UserDto>  getAllUsers();

    UserDto getUserByEmail(String email);


}
