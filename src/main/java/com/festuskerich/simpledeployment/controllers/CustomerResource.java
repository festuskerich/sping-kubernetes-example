package com.festuskerich.simpledeployment.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.festuskerich.simpledeployment.entities.CustomerEntity;
import com.festuskerich.simpledeployment.models.Customer;
import com.festuskerich.simpledeployment.service.CustomerService;

import io.swagger.annotations.ApiOperation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/customers")
public class CustomerResource {
    
    private final CustomerService service;
    public CustomerResource(CustomerService service) {
        this.service = service;
    }
    @PostMapping
    @ApiOperation("Create items")
    public Mono<ResponseEntity<Void>> createCustomer(@RequestBody Customer entity) {
         return service.createCustomer(entity)
         .map(item -> new ResponseEntity<>(HttpStatus.CREATED));
    }
    @GetMapping
    @ApiOperation("Get the list of items")
    public Mono<ResponseEntity<Flux<CustomerEntity>>> findAll(){
       return Mono.just(new ResponseEntity<>(service.findAll(),HttpStatus.OK));
    }
    
}
