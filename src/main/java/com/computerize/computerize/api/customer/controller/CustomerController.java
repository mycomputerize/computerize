package com.computerize.computerize.api.customer.controller;

import com.computerize.computerize.api.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crm/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    /*
    * - Create basic controllers for customers
    * - Jooq is not set up completely yet
    * - Create Service for the controller and DTO
    * */


    private final CustomerService customerService;

    @GetMapping("/{customerId}")
    public int getCustomerById(@PathVariable Long customerId){
        return customerService.fetchCustomerById(customerId);
    }
}
