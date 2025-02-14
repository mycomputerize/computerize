package com.computerize.computerize.api.service;

import com.computerize.computerize.api.dto.CustomerDto;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final DSLContext jooq;

    public CustomerService(DSLContext jooq) {
        this.jooq = jooq;
    }

    public CustomerDto fetchCustomerById(Long customerId){
        return null;
    }
}
