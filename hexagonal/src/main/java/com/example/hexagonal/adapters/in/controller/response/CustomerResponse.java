package com.example.hexagonal.application.ports.in;

import com.example.hexagonal.adapters.in.controller.response.AddressResponse;
import lombok.Data;

@Data
public class CustomerResponse {

    private String name;
    private AddressResponse address;
    private String cpf;
    private Boolean isValidCpf;

}