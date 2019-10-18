package com.prasee.customerservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prasee.customerservice.feignClient.Product;
import com.prasee.customerservice.feignClient.ProductServiceClient;
import com.prasee.customerservice.model.Customer;
import com.prasee.customerservice.service.CustomerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "CustomerController", description = "REST Apis related to Customer Entity!!!!")
@RestController
public class CustomerController {

	/*
	 * @Autowired RestTemplate restTemplate;
	 */

	@Autowired
	ProductServiceClient productServiceClient;

	@Autowired
	CustomerService customerService;

	@ApiOperation(value = "Get list of Customers in the System ", response = List.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), @ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })

	@GetMapping("/Customer")
	public List<Customer> getAllData() {
		List<Customer> list = customerService.findAll();
		return list;

	}

	@ApiOperation(value = "Get specific Customer in the System ")
	@PostMapping("/Customer")
	public Customer saveData(@RequestBody Customer customer) {
		Customer data = customerService.save(customer);
		return data;
	}

	@ApiOperation(value = "Get specific Customer in the System ")

	@PutMapping("/Customer")
	public Customer updateById(@RequestBody Customer customer) {
		Customer data = customerService.updateCustomer(customer);
		return data;

	}

	@ApiOperation(value = "Get specific Customer in the System ")

	@GetMapping("/Customers/{id}")
	public Optional<Customer> getById(@PathVariable("id") int id) {
		System.out.println("cc" + id);
		Optional<Customer> data = customerService.findById(id);
		System.out.println("controller" + data);
		return data;

	}

	@ApiOperation(value = "Get specific Customer in the System ")

	@DeleteMapping("/Customer/{id}")
	public void deleteById(@PathVariable("id") int id) {
		customerService.deleteById(id);
	}

	/*
	 * @GetMapping("/Customer/getAllProduct") public String getProduct() { String
	 * url = "http://localhost:8200/Product"; RestTemplate restTemplate = new
	 * RestTemplate(); System.out.println("DATA: " + url); // return
	 * restTemplate.getForObject(url, String.class); return
	 * restTemplate.exchange(url, HttpMethod.GET, null, String.class).getBody(); }
	 * 
	 * @GetMapping("/Customer/getAllProduct/{id}") public String
	 * getProduct(@PathVariable("id") int id) { String url =
	 * "http://localhost:8200/Products/" + id; RestTemplate restTemplate = new
	 * RestTemplate(); System.out.println("DATA: " + url); // return
	 * restTemplate.getForObject(url, String.class); return
	 * restTemplate.exchange(url, HttpMethod.GET, null, String.class).getBody(); }
	 */

	@ApiOperation(value = "Get specific Customer in the System ")

	@GetMapping("/Customer/getAllProduct")
	public List<Product> getAllProduct() {
		List<Product> data = productServiceClient.getAllData();
		System.out.println("Data " + data);
		return data;
	}

}
