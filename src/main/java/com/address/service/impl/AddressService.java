package com.address.service.impl;

import com.address.model.dto.AddressDto;
import com.address.model.dto.AddressRequest;

import java.util.List;

public interface AddressService {

    AddressDto saveAddress(AddressRequest addressRequest);
    AddressDto updateAddress(AddressRequest addressRequest);
    AddressDto getSingleAddress(Long id);
    List<AddressDto> getAllAddress();
    void deleteAddress(Long id);
}
