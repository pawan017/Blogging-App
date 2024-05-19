package com.app.car_rental.service.impl;

import com.app.car_rental.dto.FinalConfirmDto;
import com.app.car_rental.entity.FinalConfirm;
import com.app.car_rental.repository.FinalConfirmRepo;
import com.app.car_rental.service.FinalConfirmService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FinalConfirmServiceImpl implements FinalConfirmService {
    @Autowired
    private FinalConfirmRepo finalConfirmRepo;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public FinalConfirmDto create(FinalConfirmDto finalCOnfirmDto) {

        FinalConfirm finalConfirm = modelMapper.map(finalCOnfirmDto, FinalConfirm.class);
        FinalConfirm savedFinalConfirm = finalConfirmRepo.save(finalConfirm);
        return modelMapper.map(savedFinalConfirm, FinalConfirmDto.class);

    }

    @Override
    public List<FinalConfirmDto> findbyEmail(String email) {
        List<FinalConfirm> finalConfirms = finalConfirmRepo.findByEmail(email);
        List<FinalConfirmDto> collect = finalConfirms.stream().map(s -> modelMapper.map(s, FinalConfirmDto.class)).collect(Collectors.toList());
    return collect ;
    }
}
