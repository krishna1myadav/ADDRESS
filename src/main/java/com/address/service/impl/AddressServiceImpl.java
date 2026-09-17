package com.address.service.impl;

import com.address.repository.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl {

    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }
}
