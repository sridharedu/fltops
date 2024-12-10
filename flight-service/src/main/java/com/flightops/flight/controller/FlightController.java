package com.flightops.flight.controller;

import com.flightops.flight.dto.FlightDTO;
import com.flightops.flight.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping
    public FlightDTO createFlight(@RequestBody FlightDTO flightDTO) {
        return flightService.createFlight(flightDTO);
    }

    @GetMapping("/{id}")
    public FlightDTO getFlightById(@PathVariable int id) {
        return flightService.getFlightById(id);
    }

    @GetMapping
    public List<FlightDTO> getAllFlights() {
        return flightService.getAllFlights();
    }

    @PutMapping("/{id}")
    public FlightDTO updateFlight(@PathVariable int id, @RequestBody FlightDTO flightDTO) {
        return flightService.updateFlight(id, flightDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteFlight(@PathVariable int id) {
        flightService.deleteFlight(id);
    }
}
