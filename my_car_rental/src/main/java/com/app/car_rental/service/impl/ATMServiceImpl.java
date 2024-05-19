package com.app.car_rental.service.impl;

import com.app.car_rental.dto.ATMDto;
import com.app.car_rental.entity.ATM;
import com.app.car_rental.repository.ATMRepo;
import com.app.car_rental.service.ATMService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

@Service
public class ATMServiceImpl implements ATMService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ATMRepo atmRepo;

    @Override
    public ATMDto create(ATMDto atmDto) {
        String expDate = atmDto.getExpDate();
        ATM atm = modelMapper.map(atmDto, ATM.class);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/yy");
        LocalDate localDate = YearMonth.parse(expDate, dateTimeFormatter).atEndOfMonth();
 //       String exp = "20"+expDate.split("/")[1]+"-"+expDate.split("/")[0]+"-01";
        atm.setExpDate(localDate);
        ATM savedAtm = atmRepo.save(atm);
        ATMDto atmDto1 = modelMapper.map(savedAtm, ATMDto.class);
        return atmDto1;
    }
}
