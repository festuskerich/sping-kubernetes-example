package com.festuskerich.simpledeployment.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.festuskerich.simpledeployment.entities.CustomerEntity;
import com.festuskerich.simpledeployment.models.Customer;
import com.festuskerich.simpledeployment.repository.CustomerRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Mono<CustomerEntity> createCustomer(Customer customer) {
     CustomerEntity customerEntity =new CustomerEntity();
     BeanUtils.copyProperties(customer, customerEntity);
        return repository.save(customerEntity);                
    }

    @Override
    public Flux<CustomerEntity> findAll() {
       return repository.findAll();
    }
    
}
