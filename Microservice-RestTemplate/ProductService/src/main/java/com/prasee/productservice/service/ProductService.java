package com.prasee.productservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.prasee.productservice.model.Product;

@Service
public interface ProductService {

	public List<Product> findAll();

	public Optional<Product> findById(int id);

	public Product updateProduct(Product product);

	public Optional<Product> findByName(String name);

	public void deleteById(int id);

	public Product save(Product product);

}
