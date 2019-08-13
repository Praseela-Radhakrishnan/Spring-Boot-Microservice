package com.prasee.productservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prasee.productservice.model.Product;
import com.prasee.productservice.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> findAll() {
		List<Product> list = productRepository.findAll();
		return list;
	}

	@Override
	public Optional<Product> findById(int id) {
		Optional<Product> product = productRepository.findById(id);
		return product;
	}

	@Override
	public Product updateProduct(Product product) {
		Product updateProduct = productRepository.save(product);
		return updateProduct;
	}

	@Override
	public Optional<Product> findByName(String name) {
		Optional<Product> updateName = productRepository.findByName(name);
		return updateName;
	}

	@Override
	public void deleteById(int id) {
		productRepository.deleteById(id);

	}

	@Override
	public Product save(Product product) {
		Product saveProduct = productRepository.save(product);
		return saveProduct;
	}

}
