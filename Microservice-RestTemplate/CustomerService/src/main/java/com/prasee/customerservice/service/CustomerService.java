package com.prasee.customerservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.prasee.customerservice.model.Customer;

@Service
public interface CustomerService {

	public List<Customer> findAll();

	public Optional<Customer> findById(int id);

	public Customer updateCustomer(Customer customer);

	public void deleteById(int id);

	public Customer save(Customer customer);

}