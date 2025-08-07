package com.example.hexagonal.adapters.in.controller.mapper;

import com.example.hexagonal.application.core.domain.Customer;

import com.example.hexagonal.application.ports.in.CustomerResponse;
import response.CustomerResponse;

import org.mapstruct.*;

import com.example.hexagonal.adapters.in.controller.request.CustomerRequest;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);

}
