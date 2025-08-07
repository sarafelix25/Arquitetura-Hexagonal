package com.example.hexagonal.adapters.in.controller.response;

import com.example.hexagonal.application.core.domain.Address;
import lombok.Data;

@Data
public class AddressResponse {

    private String street;
    private String city;
    private String state;
}
