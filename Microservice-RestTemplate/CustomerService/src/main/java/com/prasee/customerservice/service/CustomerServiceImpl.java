package com.prasee.customerservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prasee.customerservice.model.Customer;
import com.prasee.customerservice.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> findAll() {
		List<Customer> list = customerRepository.findAll();
		return list;
	}

	@Override
	public Optional<Customer> findById(int id) {
		Optional<Customer> customer = customerRepository.findById(id);
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		Customer updateCustomer = customerRepository.save(customer);
		return updateCustomer;
	}

	@Override
	public void deleteById(int id) {
		customerRepository.deleteById(id);

	}

	@Override
	public Customer save(Customer customer) {
		Customer saveCustomer = customerRepository.save(customer);
		return saveCustomer;
	}

}
