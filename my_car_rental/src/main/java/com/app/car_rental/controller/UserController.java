package com.app.car_rental.controller;

import com.app.car_rental.dto.UserDto;
import com.app.car_rental.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer/auth/v1")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ResponseEntity<List<UserDto>>getAll(){
       List<UserDto> userDto1= userService.getAllUsers();
        return new ResponseEntity<List<UserDto>>(userDto1,HttpStatus.OK);
    }
    @GetMapping("/search/userId/{userId}")
    public ResponseEntity <UserDto> getUserById(@PathVariable String userId){
        UserDto userDto1= userService.getUserById(userId);
        return new ResponseEntity<UserDto>(userDto1,HttpStatus.OK);
    }

    @GetMapping("/search/email/{email}")
    public ResponseEntity <UserDto> getUserByEmail(@PathVariable String email){
       UserDto userDto1= userService.getUserByEmail(email);
        return new ResponseEntity<UserDto>(userDto1,HttpStatus.OK);
    }



}
