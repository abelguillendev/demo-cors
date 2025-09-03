package com.example.demo_cors.controller;

import io.micrometer.core.instrument.Counter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/metrics")
public class DemoMetricsController {

    private final Counter exampleCustomRequests;

    public DemoMetricsController(Counter exampleCustomRequests) {
        this.exampleCustomRequests = exampleCustomRequests;
    }

    @GetMapping("/increment")
    public ResponseEntity<String> increment() {
        this.exampleCustomRequests.increment();
        return ResponseEntity.ok("incremented");
    }
}