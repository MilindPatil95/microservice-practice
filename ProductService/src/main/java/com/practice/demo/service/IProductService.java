package com.practice.demo.service;

import com.practice.demo.model.Product;

public interface IProductService {

  public Product saveProduct(Product product);

	public Product getProductById(Long id);

}
