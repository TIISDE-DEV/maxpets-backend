package com.tiisde.maxpetsbackend.mocks;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

import com.github.javafaker.Faker;
import com.tiisde.maxpetsbackend.core.domain.Reviews;

public class MockReviews {
    public static Reviews mockReviews() {
        Faker faker = new Faker();
        String[] sizes = { "S", "M", "L", "XL", "XXL" };
        String[] designs = { "POOR", "EXCELLENT" };
        Calendar startCal = Calendar.getInstance();
        startCal.set(1970, 4, 1);
        Date startDate = startCal.getTime();

        Calendar endCal = Calendar.getInstance();
        endCal.set(2024, 11, 30);
        Date endDate = endCal.getTime();

        Date randomDate = faker.date().between(startDate, endDate);

        byte[] profileImage = null;
        boolean isVerified = faker.bool().bool();
        boolean isRecommended = faker.bool().bool();
        String dogType = faker.dog().breed();
        double dogWeight = faker.number().numberBetween(1, 50);
        int stars = faker.number().numberBetween(1, 5);
        String title = faker.lorem().sentence(3);
        String description = faker.lorem().paragraph(2);
        String design = faker.options().option(designs);
        String sizing = faker.options().option(sizes);
        LocalDate lastSeeing = randomDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        byte[] dogImage = null;

        return new Reviews(profileImage, isVerified, isRecommended, dogType, dogWeight, stars, title, description,
                design, sizing, lastSeeing, dogImage);
    }
}
