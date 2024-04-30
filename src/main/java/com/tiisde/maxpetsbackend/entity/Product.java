package com.tiisde.maxpetsbackend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "products")
public class Product {

    @Id
    private String id;
    private String name;
    private double price;
    private String size;
    private String[] availableSizes;
    private int totalReviews;
    private String[] images;
    private String[] availableColors;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

}
