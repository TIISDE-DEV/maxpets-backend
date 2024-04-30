package com.tiisde.maxpetsbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tiisde.maxpetsbackend.core.domain.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
