package com.rennie.weather.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestController {
    // Test get method
    @GetMapping("/test")
    public String test() {
        return "Test";
    }
}
