package com.festuskerich.simpledeployment.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Table
@Getter
@Setter
@RequiredArgsConstructor
public class CustomerEntity {
    @Id
    private Long id;
    private String name;
    private String lastName;
    private String address;
    
}
