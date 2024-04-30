package com.tiisde.maxpetsbackend.config.seeds;

import com.github.javafaker.Faker;
import com.tiisde.maxpetsbackend.entity.Product;
import com.tiisde.maxpetsbackend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductSeed {

    private final ProductRepository productRepository;
    private final Faker faker;

    @Autowired
    public ProductSeed(ProductRepository productRepository, Faker faker) {
        this.productRepository = productRepository;
        this.faker = faker;
    }

    @PostConstruct
    public void seed() {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < 10; i++) { 
            Product product = new Product();
            product.setName(faker.commerce().productName());
            product.setPrice(Double.parseDouble(faker.commerce().price()));
            product.setSize(faker.options().option("S", "M", "L", "XL", "XXL"));
            product.setAvailableSizes(new String[]{"S", "M", "L", "XL", "XXL"});
            product.setTotalReviews(faker.number().numberBetween(0, 1000));
            product.setImages(new String[]{"image1", "image2"}); 
            product.setAvailableColors(new String[]{"Blue", "Green", "Red"}); 
        }
        productRepository.saveAll(products);
    }
}