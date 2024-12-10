package com.flightops.flight.service;

import com.flightops.flight.dto.FlightDTO;

import java.util.List;

public interface FlightService {
    FlightDTO createFlight(FlightDTO flightDTO);
    FlightDTO getFlightById(int id);
    List<FlightDTO> getAllFlights();
    FlightDTO updateFlight(int id, FlightDTO flightDTO);
    void deleteFlight(int id);
}
