package com.practice.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.demo.exceptionHandler.CustomeException;
import com.practice.demo.model.Product;
import com.practice.demo.repository.IProductRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ProductService implements IProductService {
	
    @Autowired
    private IProductRepository productRepository;
    
	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		log.info("ProductService::saveProduct::begining");
		Product data= productRepository.save(product);
		log.info("ProductService::saveProduct::ending");
		return data;
	}

	@Override
	public Product getProductById(Long id) {
		// TODO Auto-generated method stub
		log.info("ProductService::getProductById::begining...");
		
		Product data= productRepository.findById(id).orElseThrow(()->new CustomeException.NotFoundException("INVALID ID","404"));
		
		log.info("ProductService::getProductById::Ending....");
		return data;
	}

}
