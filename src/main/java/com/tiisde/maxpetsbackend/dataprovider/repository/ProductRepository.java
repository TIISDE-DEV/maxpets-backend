package com.tiisde.maxpetsbackend.dataprovider.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tiisde.maxpetsbackend.dataprovider.entity.ProductEntity;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {

}
