package com.practice.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.demo.entity.Order;
import com.practice.demo.model.OrderRequest;
import com.practice.demo.service.OrderService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/order")
@Log4j2
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	
	@PostMapping("/placeOrder")
	public ResponseEntity<Order>  placeOrder(@RequestBody OrderRequest orderRequest) {
	
	log.info("OrderController:: saveOrderDetails");	
	
	Order order= orderService.plceOrder(orderRequest);
	
	return new ResponseEntity<>(order, HttpStatus.OK);
  
	}
	

}
