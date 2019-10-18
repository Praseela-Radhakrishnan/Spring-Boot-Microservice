package com.prasee.customerservice.feignClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "ProductService", url = "http://localhost:8200")
public interface ProductServiceClient {

	@GetMapping("/Product")
	public List<Product> getAllData();

}
