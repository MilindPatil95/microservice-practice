package com.practice.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.demo.model.Product;
@Repository
public interface IProductRepository extends JpaRepository<Product, Long>{

}
