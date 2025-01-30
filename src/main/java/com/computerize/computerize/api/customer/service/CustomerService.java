package com.computerize.computerize.api.customer.service;

import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final DSLContext jooq;

    public int fetchCustomerById(Long customerId){
        return 0;
    }
}
