package com.microservice.currencyexchangeservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuitBreakerController {
    @GetMapping("/sample-api")
    public String SampleAPI(){
        return "Sample API";
    }
}
