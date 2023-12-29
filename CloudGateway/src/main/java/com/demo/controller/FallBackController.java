package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	@GetMapping("/orderServiceFallBack")
	public String orderServiceFallBack() {
     
    return "Order Service is Down !! ";		  

	}
	
	@GetMapping("/productServiceFallBack")
	public String productServiceFallBack() {
		
		return "Product Service is Down !! ";
	}

}
