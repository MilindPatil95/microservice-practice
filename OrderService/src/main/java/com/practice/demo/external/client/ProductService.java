package com.practice.demo.external.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.practice.demo.external.model.Product;



@FeignClient(name="Product-Service/product")
public interface ProductService {
	@PostMapping("/saveProduct")
	 Product saveProduct(@RequestBody Product product);
    
	@GetMapping("{id}")
	 ResponseEntity getProductById(@PathVariable Long id);

}
