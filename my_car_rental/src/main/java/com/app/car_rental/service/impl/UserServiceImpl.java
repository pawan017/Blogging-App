package com.app.car_rental.service.impl;

import com.app.car_rental.dto.UserDto;
import com.app.car_rental.entity.User;
import com.app.car_rental.exceptions.ResourceNotFoundExceptio;
import com.app.car_rental.repository.UserRepo;
import com.app.car_rental.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDto create(UserDto userDto) {
//        String dob=userDto.getDob();
//        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        LocalDate localDate=LocalDate.parse(dob,dateTimeFormatter);

         User user=this.modelMapper.map(userDto, User.class);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        User savedUser= userRepo.save(user);
        return modelMapper.map(savedUser,UserDto.class);
    }

    @Override
    public UserDto getUserById(String userId) {
       User user= userRepo.findById(userId)
         .orElseThrow(()->new ResourceNotFoundExceptio("User Not Found With this Id"+userId));
        return this.modelMapper.map(user,UserDto.class);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User>users = userRepo.findAll();
        List<UserDto> userDtos= users.stream().map((a)->this.modelMapper.map(a,UserDto.class)).collect(Collectors.toList());
        return userDtos;
    }

    @Override
    public UserDto getUserByEmail(String email) {

        User user =  userRepo.findByEmail(email).orElseThrow(()->new ResourceNotFoundExceptio("Email Not found With email "+email));
        return modelMapper.map(user,UserDto.class);

    }
}
