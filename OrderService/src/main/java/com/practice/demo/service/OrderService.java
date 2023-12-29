package com.practice.demo.service;

import java.time.Instant;

import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.practice.demo.entity.Order;
import com.practice.demo.external.client.ProductService;
import com.practice.demo.external.model.Product;
import com.practice.demo.model.OrderRequest;
import com.practice.demo.repository.OrderRepo;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class OrderService  implements IOrderService {
     
	@Autowired
	private OrderRepo orderRepo;
	
	@Autowired
	private ProductService productService;
	
	public Order plceOrder(OrderRequest orderRequest) {
		
//		Product product =Product.builder()
//				        .productId(8)
//				        .productName("watch")
//				        .price(400)
//				        .quantity(1)
//				        .build();
//		log.info("OrderService:: plceOrder ::  Feign Call.............(save product before save order)");
//		
//		productService.saveProduct(product);
//		
//		log.info("OrderService:: plceOrder ::  Feign Call............. done");
//		
		log.info("OrderService:: plceOrder ::"+orderRequest.toString());
		
		Order order = Order.builder()
			      .amount(orderRequest.getTotalAmount())
			      .orderStatus("Created")
			      .productId(orderRequest.getProductId())
			      .orderdate(Instant.now())
			      .quantity(orderRequest.getQuantity())
			      .orderdate(Instant.now())
			      .build();
		
		
	
		log.info("OrderService :: plceOrder :: Order saved successfully "+order.toString());
	return orderRepo.save(order);
	}

	
	@GetMapping("{id}")
	public ResponseEntity getProductDetailsByProductId(@PathVariable Long id) {
		
	 return productService.getProductById(id);
	}
	
}
