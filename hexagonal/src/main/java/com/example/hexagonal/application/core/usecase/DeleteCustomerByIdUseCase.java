package com.example.hexagonal.application.core.usecase;
import com.example.hexagonal.application.ports.in.DeleteCustomerByIdInputPort;
import com.example.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.example.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort;
    
    public DeleteCustomerByIdUseCase(
        FindCustomerByIdInputPort findCustomerByIdInputPort,
        DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort
        ) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.deleteCustomerByIdOutputPort = deleteCustomerByIdOutputPort;
    }

    @Override
    public void delete(String id) {
        findCustomerByIdInputPort.findById(id);
        deleteCustomerByIdOutputPort.delete(id);
    }
}
