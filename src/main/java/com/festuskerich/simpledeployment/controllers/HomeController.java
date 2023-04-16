package com.festuskerich.simpledeployment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    @ApiOperation("Home")
    public Mono<ResponseEntity<String>> findAll(){
       return Mono.just(new ResponseEntity<>("Welcome to test service",HttpStatus.OK));
    }
    
}
