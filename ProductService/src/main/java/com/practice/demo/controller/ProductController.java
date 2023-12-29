package com.practice.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.demo.model.Product;
import com.practice.demo.service.IProductService;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/product")
@Log4j2
public class ProductController {

	@Autowired
	private IProductService productService;

	@PostMapping("/saveProduct")
	private Product saveProduct(@RequestBody Product product) {

		log.info("ProductController::saveProduct::begining");

		Product responseProduct = productService.saveProduct(product);

		log.info("ProductController::saveProduct::ending");
		return responseProduct;

	}

	@GetMapping("{id}")
	private ResponseEntity getProductById(@PathVariable Long id) {
		log.info("ProductController::getProductById::begining:: "+id);
		
		Product responseProduct = productService.getProductById(id);
		
		log.info("ProductController::getProductById::ending");
		return new ResponseEntity<>(responseProduct,HttpStatus.OK);

	}
}
