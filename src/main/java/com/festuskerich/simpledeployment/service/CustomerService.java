package com.festuskerich.simpledeployment.service;

import com.festuskerich.simpledeployment.entities.CustomerEntity;
import com.festuskerich.simpledeployment.models.Customer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService {
    Mono<CustomerEntity> createCustomer(Customer customer);

    Flux<CustomerEntity> findAll();
    
}
