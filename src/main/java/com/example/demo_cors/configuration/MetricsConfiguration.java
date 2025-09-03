package com.example.demo_cors.configuration;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MetricsConfiguration {

    @Bean
    public Counter exampleCustomRequests(MeterRegistry registry) {
        return Counter.builder("example.custom.requests")
                .description("Custom request counter from demo application")
                .register(registry);
    }
}
