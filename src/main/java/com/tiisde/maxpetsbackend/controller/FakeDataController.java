package com.tiisde.maxpetsbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiisde.maxpetsbackend.service.FakeDataService;

@RestController
@RequestMapping("/maxpets/api/v1")
public class FakeDataController {
    
    private final FakeDataService fakeDataService;

    @Autowired
    public FakeDataController(FakeDataService fakeDataService) {
        this.fakeDataService = fakeDataService;
    }

    @GetMapping("/fake")
    public String generateFakeData() {
        String fullName = fakeDataService.generateFullName();
        String emailAddress = fakeDataService.generateEmailAddress();
        String address = fakeDataService.generateAddress();

        return "Full Name: " + fullName + ", Email: " + emailAddress + ", Address: " + address;
    }
}
