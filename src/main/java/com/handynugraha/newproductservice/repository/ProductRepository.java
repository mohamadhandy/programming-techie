package com.handynugraha.newproductservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.handynugraha.newproductservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
  
}
