package com.computerize.computerize.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


// Jpa Repo takes a generic type and the id of your class <className.name()>

/*
* Jpa Repository usually are used for data persistence
* whereas Services are used for business logic,
* and you can use the DI for accessing the data from DB in the service
* */


public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    Optional<Customer> findByEmail(String email);
}
