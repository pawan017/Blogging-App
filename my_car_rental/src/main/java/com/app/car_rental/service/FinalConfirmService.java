package com.app.car_rental.service;

import com.app.car_rental.dto.FinalConfirmDto;

import java.util.List;

public interface FinalConfirmService {

    FinalConfirmDto create(FinalConfirmDto finalCOnfirmDto);

    List<FinalConfirmDto>findbyEmail(String email);
}
