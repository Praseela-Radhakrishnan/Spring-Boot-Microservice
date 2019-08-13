package com.prasee.productservice.controller;

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

import com.prasee.productservice.model.Product;
import com.prasee.productservice.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/Product")
	public List<Product> getAllData() {
		List<Product> list = productService.findAll();
		return list;

	}

	@PostMapping("/Product")
	public Product saveData(@RequestBody Product product) {
		Product data = productService.save(product);
		return data;
	}

	@PutMapping("/Product")
	public Product updateById(@RequestBody Product product) {
		Product data = productService.updateProduct(product);
		return data;

	}

	@GetMapping("/Product/{name}")
	public Optional<Product> getByName(@PathVariable("name") String name) {
		System.out.println("Name " + name);
		Optional<Product> data = productService.findByName(name);
		System.out.println("After name " + name);
		return data;

	}

	@GetMapping("/Products/{id}")
	public Optional<Product> getById(@PathVariable("id") int id) {
		System.out.println("cc" + id);
		Optional<Product> data = productService.findById(id);
		System.out.println("controller" + data);
		return data;

	}

	@DeleteMapping("/Product/{id}")
	public void deleteById(@PathVariable("id") int id) {
		productService.deleteById(id);

	}

}
