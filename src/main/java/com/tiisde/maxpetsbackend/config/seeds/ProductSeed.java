package com.tiisde.maxpetsbackend.config.seeds;

import com.github.javafaker.Faker;
import com.tiisde.maxpetsbackend.core.domain.Product;
import com.tiisde.maxpetsbackend.dataprovider.entity.ProductEntity;
import com.tiisde.maxpetsbackend.dataprovider.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductSeed {

    private final ProductRepository productRepository;
    private final Faker faker;

    @Value("${seed.enabled}")
    private boolean seedEnabled;

    private final String[] availableSizes = { "S", "M", "L", "XL", "XXL" };
    private final String[] availableColors = { "Blue", "Green", "Red" };
    private final Byte[] images = { null };

    private BigDecimal convertToBigDecimal(String priceString) {
        String normalizedPriceString = priceString.replace(",", ".");
        return new BigDecimal(normalizedPriceString);
    }

    public ProductSeed(ProductRepository productRepository, Faker faker) {
        this.productRepository = productRepository;
        this.faker = faker;
    }

    @PostConstruct
    public void seed() {
        if (!seedEnabled) {
            System.out.println("Seed disabled. Skipping data creation.");
            return;
        }

        List<Product> products = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Product product = new Product(
                    String.valueOf(i),
                    faker.commerce().productName(),
                    convertToBigDecimal(faker.commerce().price()),
                    faker.options().option(availableSizes),
                    availableSizes,
                    faker.number().numberBetween(0, 1000),
                    images,
                    availableColors);
            products.add(product);
        }

        List<ProductEntity> entities = products.stream()
                .map(product -> {
                    ProductEntity entity = new ProductEntity();
                    entity.setId(product.getId());
                    entity.setName(product.getName());
                    entity.setPrice(product.getPrice());
                    entity.setSize(product.getSize());
                    entity.setAvailableSizes(product.getAvailableSizes());
                    entity.setTotalReviews(product.getTotalReviews());
                    entity.setImages(product.getImages());
                    entity.setAvailableColors(product.getAvailableColors());
                    return entity;
                })
                .collect(Collectors.toList());

        productRepository.saveAll(entities);
    }
}