//package com.app.car_rental.utility;
//
//import com.app.car_rental.dto.BookingReponseDto;
//import com.app.car_rental.entity.Booking;
//import org.springframework.stereotype.Component;
//
//@Component
//public class UtilityMethods {
//
//
//
//    public BookingReponseDto bookingToBookingResponseDto(Booking booking){
//
//        BookingReponseDto b2=new BookingReponseDto();
//        b2.setCarCompany(booking.getCar().getCarCompany());
//        b2.setCarColor(booking.getCar().getCarColor());
//        b2.setCarModel(booking.getCar().getCarModel());
//        b2.setCarType(booking.getCar().getCarType());
//        b2.setCarOwner(booking.getCar().getCarOwner());
//        b2.setCarImg(booking.getCar().getCarImg());
//        b2.setNumPlate(booking.getCar().getNumPlate());
//        b2.setInsuranceValidity(booking.getCar().getInsuranceValidity());
//        b2.setFuelType(booking.getCar().getFuelType());
//        b2.setFeature(booking.getCar().getFeature());
//
//        b2.setId(booking.getId());
//        b2.setPickUpLocation(booking.getPickUpLocation());
//        b2.setDropLocation(booking.getDropLocation());
//        b2.setPickUpTime(booking.getPickUpTime());
//        b2.setPickUpDate(booking.getPickUpDate());
//        b2.setDropDate(booking.getDropDate());
//        b2.setPassangerCapacity(booking.getPassangerCapacity());
//        b2.setMembers(booking.getMembers());
//        b2.setDays(booking.getDays());
//        b2.setNumBags(booking.getNumBags());
//        b2.setTotalPrice(booking.getTotalPrice());
//
//
//        return b2;
//    }
//
//
//}
