package com.example.hexagonal.adapters.out;

import com.example.hexagonal.application.core.domain.Customer;
import com.example.hexagonal.application.ports.out.UpdateCustomerOutputPort;
import com.example.hexagonal.adapters.in.controller.mapper.CustomerMapper;
import com.example.hexagonal.adapters.out.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository; 


    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerMapper.toCustomer(customer);
        customerRepository.save(customerEntity);
    }
}
