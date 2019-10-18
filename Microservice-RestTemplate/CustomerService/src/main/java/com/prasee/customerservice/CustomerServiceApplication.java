package com.prasee.customerservice;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.prasee.customerservice.feignClient.Product;
import com.prasee.customerservice.feignClient.ProductServiceClient;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	// @Bean public RestTemplate restTemplate() { return new RestTemplate(); }

	@Bean public ProductServiceClient productServiceClient() { return new
	  ProductServiceClient() {
	  
	  @Override public List<Product> getAllData() { 
	   return null; }
	  
	  }; }

}
