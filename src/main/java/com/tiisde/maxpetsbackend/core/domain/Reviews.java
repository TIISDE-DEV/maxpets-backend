package com.tiisde.maxpetsbackend.core.domain;

import java.time.LocalDate;

public class Reviews {
    public Reviews(byte[] profileImage, boolean isVerified, boolean isRecommended, String dogType, double dogWeight,
            int stars, String title, String description, String design, String sizing,
            LocalDate lastSeeing,
            String dogImage) {
        this.profileImage = profileImage;
        this.isVerified = isVerified;
        this.isRecommended = isRecommended;
        this.dogType = dogType;
        this.dogWeight = dogWeight;
        this.stars = stars;
        this.title = title;
        this.description = description;
        this.design = design;
        this.sizing = sizing;
        this.lastSeeing = lastSeeing;
        this.dogImage = dogImage;
    }

    private byte[] profileImage;
    private boolean isVerified;
    private boolean isRecommended;
    private String dogType;
    private double dogWeight;
    private int stars;
    private String title;
    private String description;
    private String design;
    private String sizing;
    private LocalDate lastSeeing;
    private String dogImage;

    public void setProfileImage(byte[] profileImage) {
        this.profileImage = profileImage;
    }

    public void setVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public void setRecommended(boolean isRecommended) {
        this.isRecommended = isRecommended;
    }

    public void setDogType(String dogType) {
        this.dogType = dogType;
    }

    public void setDogWeight(double dogWeight) {
        this.dogWeight = dogWeight;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public void setSizing(String sizing) {
        this.sizing = sizing;
    }

    public void setLastSeeing(LocalDate lastSeeing) {
        this.lastSeeing = lastSeeing;
    }

    public void setDogImage(String dogImage) {
        this.dogImage = dogImage;
    }

    public byte[] getProfileImage() {
        return profileImage;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public boolean isRecommended() {
        return isRecommended;
    }

    public String getDogType() {
        return dogType;
    }

    public double getDogWeight() {
        return dogWeight;
    }

    public int getStars() {
        return stars;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDesign() {
        return design;
    }

    public String getSizing() {
        return sizing;
    }

    public LocalDate getLastSeeing() {
        return lastSeeing;
    }

    public String getDogImage() {
        return dogImage;
    }
}
