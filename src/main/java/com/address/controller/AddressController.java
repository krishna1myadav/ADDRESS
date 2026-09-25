package com.address.controller;

import com.address.model.dto.AddressDto;
import com.address.model.dto.AddressRequest;
import com.address.service.AddressService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService){
        this.addressService = addressService;
    }

    @PostMapping("/save")
    public ResponseEntity<List<AddressDto>> saveAddress(@RequestBody AddressRequest addressDto){
        List<AddressDto> response = addressService.saveAddress(addressDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<List<AddressDto>> updateAddress(@RequestBody AddressRequest addressDto){
        List<AddressDto> reponse = addressService.updateAddress(addressDto);
        return new ResponseEntity<>(reponse, HttpStatus.OK);
    }

    @GetMapping("/all-address")
    public ResponseEntity<List<AddressDto>> getAllAddress(){
        List<AddressDto> response = addressService.getAllAddress();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
