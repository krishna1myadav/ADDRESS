package com.address.model.entity;


import jakarta.persistence.Entity;

@Entity
public class Address {

    private Long id;
    private Long empId;
    private String street;
    private Long pinCode;

}
