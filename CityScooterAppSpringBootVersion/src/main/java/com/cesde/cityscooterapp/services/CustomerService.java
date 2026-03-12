package com.cesde.cityscooterapp.services;

import com.cesde.cityscooterapp.dtos.CustomerDTO;
import com.cesde.cityscooterapp.domain.Customer;

import java.util.List;

public interface CustomerService {
    
    CustomerDTO createCustomer(CustomerDTO customerDTO);
    
    CustomerDTO getCustomerById(int id);
    
    CustomerDTO getCustomerByEmail(String email);
    
    List<CustomerDTO> getAllCustomers();
    
    CustomerDTO updateCustomer(int id, CustomerDTO customerDTO);
    
    void deleteCustomer(int id);
    
    boolean existsByEmail(String email);
}
