package com.mastercard.healthcare.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("health")
public class HealthcheckController {

    @GetMapping("hello")
    public String healthCheck() {
        return "Greetings health is good";
    }

}
