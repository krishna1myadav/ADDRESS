package com.address.model.entity;


import com.address.model.enums.AddressType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Address {

    private Long id;
    private Long empId;
    private String street;
    private Long pinCode;
    private String city;
    private String country;

    @Enumerated(EnumType.STRING)
    private AddressType addressType;


}
