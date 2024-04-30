package com.tiisde.maxpetsbackend.dataprovider.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tiisde.maxpetsbackend.core.domain.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
