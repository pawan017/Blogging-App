package com.app.car_rental.controller;


import com.app.car_rental.dto.JwtAuthRequest;
import com.app.car_rental.dto.JwtAuthResponse;
import com.app.car_rental.dto.UserDto;
import com.app.car_rental.entity.User;
import com.app.car_rental.exceptions.ApiException;
import com.app.car_rental.repository.UserRepo;
import com.app.car_rental.security.JwtUtil;
import com.app.car_rental.service.UserService;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/customer/auth")
@Validated
@CrossOrigin
public class AuthController {
    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/login")
    public ResponseEntity<Map<String, Object>> createAuthenticationToken(@Valid @RequestBody JwtAuthRequest authenticationRequest) throws Exception {

        Optional<User> user = Optional.of(new User());

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getEmail(), authenticationRequest.getPassword())
            );
            user =  userRepo.findByEmail(authenticationRequest.getEmail());
        }
        catch (BadCredentialsException e) {
            throw new ApiException("Incorrect username or password");
        }

        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(authenticationRequest.getEmail());

        final String jwt = jwtUtil.generateToken(userDetails);


        Map<String, Object> map = new HashMap<>();
        map.put("token",jwt);
        map.put("user",user);
        JwtAuthResponse response = new JwtAuthResponse();
//        response.setAuth(jwt);
//        response.setUser(modelMapper.map(user, UserDto.class));
        return ResponseEntity.ok(map);
    }

    @PostMapping("/register")
    public ResponseEntity<UserDto> registerUser(@Valid @RequestBody UserDto userDto){
        UserDto newUser = userService.create(userDto);
        return new ResponseEntity<UserDto>(newUser, HttpStatus.CREATED);
    }

}
