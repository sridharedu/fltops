package com.flightops.flight.config;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "crew-management-service")
public interface CrewClient {
    // Define methods for crew management interactions
}
