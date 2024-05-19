package com.app.car_rental.security;

import com.app.car_rental.entity.User;
import com.app.car_rental.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       User  user =  userRepo.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("User with email " + username + " not found!"));
        return user;
    }
}
