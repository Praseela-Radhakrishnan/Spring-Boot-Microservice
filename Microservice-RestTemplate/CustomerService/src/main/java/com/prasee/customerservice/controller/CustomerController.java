package com.prasee.customerservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.prasee.customerservice.model.Customer;
import com.prasee.customerservice.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	CustomerService customerService;

	@GetMapping("/Customer")
	public List<Customer> getAllData() {
		List<Customer> list = customerService.findAll();
		return list;

	}

	@PostMapping("/Customer")
	public Customer saveData(@RequestBody Customer customer) {
		Customer data = customerService.save(customer);
		return data;
	}

	@PutMapping("/Customer")
	public Customer updateById(@RequestBody Customer customer) {
		Customer data = customerService.updateCustomer(customer);
		return data;

	}

	@GetMapping("/Customers/{id}")
	public Optional<Customer> getById(@PathVariable("id") int id) {
		System.out.println("cc" + id);
		Optional<Customer> data = customerService.findById(id);
		System.out.println("controller" + data);
		return data;

	}

	@DeleteMapping("/Customer/{id}")
	public void deleteById(@PathVariable("id") int id) {
		customerService.deleteById(id);
	}

	@GetMapping("/Customer/getAllProduct")
	public String getProduct() {
		String url = "http://localhost:8200/Product";
		// RestTemplate restTemplate = new RestTemplate();
		System.out.println("DATA: " + url);
		// return restTemplate.getForObject(url, String.class);
		return restTemplate.exchange(url, HttpMethod.GET, null, String.class).getBody();
	}

	@GetMapping("/Customer/getAllProduct/{id}")
	public String getProduct(@PathVariable("id") int id) {
		String url = "http://localhost:8200/Products/" + id;
		// RestTemplate restTemplate = new RestTemplate();
		System.out.println("DATA: " + url);
		// return restTemplate.getForObject(url, String.class);
		return restTemplate.exchange(url, HttpMethod.GET, null, String.class).getBody();
	}
}
