package com.rennie.weather.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//used to handle the incoming request from the client and then maps to the database and returns the results to the client
@RestController
@RequestMapping("/api/v1")
public class TestController {
    // Test get method
    @GetMapping("/test")
    public String test() {
        return "Test";
    }
}

