package com.tiisde.maxpetsbackend.dataprovider.entity;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "products")
public class ProductEntity {

    @Id
    private String id;
    private String name;
    private BigDecimal price;
    private String size;
    private String[] availableSizes;
    private int totalReviews;
    private Byte[] images;
    private String[] availableColors;
}
