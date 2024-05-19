package com.app.car_rental.service.impl;

import com.app.car_rental.dto.BookingReponseDto;
import com.app.car_rental.dto.BookingRequstDto;
import com.app.car_rental.entity.Booking;
import com.app.car_rental.entity.Car;
import com.app.car_rental.exceptions.ResourceNotFoundExceptio;
import com.app.car_rental.repository.BookingRepo;
import com.app.car_rental.repository.CarRepo;
import com.app.car_rental.service.BookingService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingServiceImpl  implements BookingService {
    @Autowired
    private BookingRepo bookingRepo;
    @Autowired
    private CarRepo carRepo;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public BookingReponseDto create(BookingRequstDto bookingRequstDto) {
        Car car = carRepo.findById(bookingRequstDto.getCarId())
                .orElseThrow(() -> new ResourceNotFoundExceptio("Car Not Found With This Id " + bookingRequstDto.getCarId()));
        Booking booking= new Booking();

        booking.setCar(car);
        booking.setTotalPrice((int) (bookingRequstDto.getDays()*car.getCharge()));
        BeanUtils.copyProperties(bookingRequstDto,booking);
        Booking savedBooking = bookingRepo.save(booking);

        BookingReponseDto br=new BookingReponseDto();
        BeanUtils.copyProperties(car,br);
        BeanUtils.copyProperties(savedBooking,br);
        return br;
    }

    @Override
    public List<BookingReponseDto> getAllBookings() {
        return null;
    }

    @Override
    public BookingReponseDto getByBookingId(String bookingId) {
        Booking booking = bookingRepo.findById(bookingId).orElseThrow(() -> new ResourceNotFoundExceptio("BookingId Is Not Found With This Id " + bookingId));
        return null;
    }


}
