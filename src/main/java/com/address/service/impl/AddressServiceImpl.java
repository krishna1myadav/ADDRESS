package com.address.service.impl;

import com.address.repository.AddressRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl {

    private final AddressRepository addressRepository;
    private final ModelMapper modelMapper;

    public AddressServiceImpl(AddressRepository addressRepository, ModelMapper modelMapper){
        this.addressRepository = addressRepository;
        this.modelMapper = modelMapper;
    }
}
