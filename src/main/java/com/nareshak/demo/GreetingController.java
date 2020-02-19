package com.nareshak.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GreetingController {

    @Value("${greeting.message}")
    private String message;

    @GetMapping("/hello")
    public String greet() {
        return message;
    }
}
