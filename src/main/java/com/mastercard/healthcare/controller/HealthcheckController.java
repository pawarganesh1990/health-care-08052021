package com.mastercard.healthcare.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("health")
public class HealthcheckController {

    @Value("${rate}")
    String rate;

    @Value("${lanecount}")
    String count;

    @GetMapping("hello")
    public String healthCheck() {
        return "Greetings health is good";
    }

    @GetMapping("rate")
    @RefreshScope
    public String getRate(Model m) {
        m.addAttribute("rateamount",rate);
        m.addAttribute("count",count);
        System.out.println("rate "  + rate);
        System.out.println("count "  + count);

        return "rateview";
    }

}
