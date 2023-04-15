package com.spring.data.jpa.sdjpaorderservice.repository;

import java.util.Optional;

import com.spring.data.jpa.sdjpaorderservice.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findCustomerByCustomerNameIgnoreCase(String customerName);
}
