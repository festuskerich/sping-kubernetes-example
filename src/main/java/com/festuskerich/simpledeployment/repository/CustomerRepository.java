package com.festuskerich.simpledeployment.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import com.festuskerich.simpledeployment.entities.CustomerEntity;

@Repository
public interface CustomerRepository extends R2dbcRepository<CustomerEntity, Long> {
    
}
