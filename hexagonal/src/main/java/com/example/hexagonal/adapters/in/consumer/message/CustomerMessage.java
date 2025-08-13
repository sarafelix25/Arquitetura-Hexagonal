package com.example.hexagonal.adapters.in.consumer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerMessage {

    private String id;

    private String name;
    
    private String zipCode;
    
    private String city;
    
    private Boolean isValidCpf;

}
