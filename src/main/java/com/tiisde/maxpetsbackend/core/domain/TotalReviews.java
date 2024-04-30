package com.tiisde.maxpetsbackend.core.domain;

import java.util.List;

public class TotalReviews {
    public TotalReviews(int stars, double average, double recommendedAverage, int totalReviews, TotalStars totalStars,
            List<String> customersImages) {
        this.stars = stars;
        this.average = average;
        this.recommendedAverage = recommendedAverage;
        this.totalReviews = totalReviews;
        this.totalStars = totalStars;
        this.customersImages = customersImages;
    }

    private int stars;
    private double average;
    private double recommendedAverage;
    private int totalReviews;
    private TotalStars totalStars;
    private List<String> customersImages;

    public int getStars() {
        return stars;
    }

    public double getAverage() {
        return average;
    }

    public double getRecommendedAverage() {
        return recommendedAverage;
    }

    public int getTotalReviews() {
        return totalReviews;
    }

    public TotalStars getTotalStars() {
        return totalStars;
    }

    public List<String> getCustomersImages() {
        return customersImages;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void setRecommendedAverage(double recommendedAverage) {
        this.recommendedAverage = recommendedAverage;
    }

    public void setTotalReviews(int totalReviews) {
        this.totalReviews = totalReviews;
    }

    public void setTotalStars(TotalStars totalStars) {
        this.totalStars = totalStars;
    }

    public void setCustomersImages(List<String> customersImages) {
        this.customersImages = customersImages;
    }

}
