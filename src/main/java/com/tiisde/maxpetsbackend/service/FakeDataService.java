package com.tiisde.maxpetsbackend.service;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class FakeDataService {

    private Faker faker;

    @PostConstruct
    public void init() {
        this.faker = new Faker();
    }

    public String generateFullName() {
        return faker.name().fullName();
    }

    public String generateEmailAddress() {
        return faker.internet().emailAddress();
    }

    public String generateAddress() {
        return faker.address().fullAddress();
    }
}
