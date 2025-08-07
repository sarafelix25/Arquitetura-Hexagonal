package com.example.hexagonal.adapters.out;
import com.example.hexagonal.adapters.out.repository.CustomerRepository;
import com.example.hexagonal.application.core.domain.Customer;
import com.example.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import java.util.Optional;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }

}
