package com.example.hexagonal.adapters.out;

import com.example.hexagonal.application.core.domain.Customer;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.Autowired;

import com.example.hexagonal.adapters.out.repository.CustomerRepository;
import com.example.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.example.hexagonal.application.ports.out.InsertCustomerOutputPort;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomer(customer);
        customerRepository.save(customerEntity);
    }

}
