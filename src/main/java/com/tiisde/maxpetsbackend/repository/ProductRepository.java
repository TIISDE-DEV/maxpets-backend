package com.tiisde.maxpetsbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tiisde.maxpetsbackend.entity.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
