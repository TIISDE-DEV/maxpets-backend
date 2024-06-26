package com.tiisde.maxpetsbackend.core.domain;

import java.math.BigDecimal;

public class Product {
    private String id;
    private String name;
    private BigDecimal price; // Alterado para BigDecimal
    private String size;
    private String[] availableSizes;
    private int totalReviews;
    private Byte[] images;
    private String[] availableColors;

    public Product(String id, String name, BigDecimal price, String size, String[] availableSizes, int totalReviews,
            Byte[] images, String[] availableColors) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.size = size;
        this.availableSizes = availableSizes;
        this.totalReviews = totalReviews;
        this.images = images;
        this.availableColors = availableColors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String[] getAvailableSizes() {
        return availableSizes;
    }

    public void setAvailableSizes(String[] availableSizes) {
        this.availableSizes = availableSizes;
    }

    public int getTotalReviews() {
        return totalReviews;
    }

    public void setTotalReviews(int totalReviews) {
        this.totalReviews = totalReviews;
    }

    public Byte[] getImages() {
        return images;
    }

    public void setImages(Byte[] images) {
        this.images = images;
    }

    public String[] getAvailableColors() {
        return availableColors;
    }

    public void setAvailableColors(String[] availableColors) {
        this.availableColors = availableColors;
    }

}
