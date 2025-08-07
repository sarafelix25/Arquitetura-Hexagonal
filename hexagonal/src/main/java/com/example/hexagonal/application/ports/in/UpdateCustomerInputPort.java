package com.example.hexagonal.application.ports.in;

import com.example.hexagonal.application.core.domain.*;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);
}