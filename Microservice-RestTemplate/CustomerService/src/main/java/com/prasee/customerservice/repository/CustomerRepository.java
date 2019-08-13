package com.prasee.customerservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prasee.customerservice.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
