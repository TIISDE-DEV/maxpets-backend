package com.tiisde.maxpetsbackend.config.seeds;

import com.github.javafaker.Faker;
import com.tiisde.maxpetsbackend.core.domain.Product;
import com.tiisde.maxpetsbackend.dataprovider.repository.ProductRepository;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductSeed {

    private final ProductRepository productRepository;
    private final Faker faker;

    private final String[] availableSizes = { "S", "M", "L", "XL", "XXL" };
    private final String[] availableColors = { "Blue", "Green", "Red" };
    private final Byte[] images = { null };

    public ProductSeed(ProductRepository productRepository, Faker faker) {
        this.productRepository = productRepository;
        this.faker = faker;
    }

    @PostConstruct
    public void seed() {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Product product = new Product(null, null, i, null, availableColors, i,
                    images, availableColors);
            product.setName(faker.commerce().productName());
            product.setPrice(Double.parseDouble(faker.commerce().price()));
            product.setSize(faker.options().option(availableSizes));
            product.setAvailableSizes(availableSizes);
            product.setTotalReviews(faker.number().numberBetween(0, 1000));
            product.setImages(images);
            product.setAvailableColors(availableColors);
            products.add(product);
        }
        productRepository.saveAll(products);
    }
}
