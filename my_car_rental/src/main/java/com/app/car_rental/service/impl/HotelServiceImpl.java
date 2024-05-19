package com.app.car_rental.service.impl;

import com.app.car_rental.dto.HotelDto;
import com.app.car_rental.entity.Hotel;
import com.app.car_rental.repository.HotelRepo;
import com.app.car_rental.service.HotelService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepo hotelRepo;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public HotelDto create(HotelDto hotelDto) {
        Hotel hotel = modelMapper.map(hotelDto, Hotel.class);
        Hotel savedHotel = hotelRepo.save(hotel);
        return modelMapper.map(savedHotel,HotelDto.class) ;
    }
}
