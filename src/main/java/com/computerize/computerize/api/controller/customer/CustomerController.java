package com.computerize.computerize.api.controller.customer;

import com.computerize.computerize.api.dto.CustomerDto;
import com.computerize.computerize.api.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crm/customer")
public class CustomerController {

    /*
    * - Create basic controllers for customers
    * - Jooq is not set up completely yet
    * - Create Service for the controller and DTO
    * */


    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public CustomerDto getCustomerById(@PathVariable Long customerId){
        return customerService.fetchCustomerById(customerId);
    }
}
