package com.address.service.impl;

import com.address.model.dto.AddressDto;
import com.address.model.dto.AddressRequest;
import com.address.repository.AddressRepository;
import com.address.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;
    private final ModelMapper modelMapper;

    public AddressServiceImpl(AddressRepository addressRepository, ModelMapper modelMapper){
        this.addressRepository = addressRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public AddressDto saveAddress(AddressRequest addressRequest) {
        return null;
    }

    @Override
    public AddressDto updateAddress(AddressRequest addressRequest) {
        return null;
    }

    @Override
    public AddressDto getSingleAddress(Long id) {
        return null;
    }

    @Override
    public List<AddressDto> getAllAddress() {
        return List.of();
    }

    @Override
    public void deleteAddress(Long id) {

    }
}
