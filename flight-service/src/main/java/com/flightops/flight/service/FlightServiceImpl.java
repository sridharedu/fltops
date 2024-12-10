package com.flightops.flight.service;

import com.flightops.flight.dto.FlightDTO;
import com.flightops.flight.entity.Flight;
import com.flightops.flight.repository.FlightRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public FlightDTO createFlight(FlightDTO flightDTO) {
        Flight flight = modelMapper.map(flightDTO, Flight.class);
        flight = flightRepository.save(flight);
        return modelMapper.map(flight, FlightDTO.class);
    }

    @Override
    public FlightDTO getFlightById(int id) {
        Flight flight = flightRepository.findById(id).orElseThrow();
        return modelMapper.map(flight, FlightDTO.class);
    }

    @Override
    public List<FlightDTO> getAllFlights() {
        return flightRepository.findAll().stream()
                .map(flight -> modelMapper.map(flight, FlightDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public FlightDTO updateFlight(int id, FlightDTO flightDTO) {
        Flight flight = flightRepository.findById(id).orElseThrow();
        modelMapper.map(flightDTO, flight);
        flight = flightRepository.save(flight);
        return modelMapper.map(flight, FlightDTO.class);
    }

    @Override
    public void deleteFlight(int id) {
        flightRepository.deleteById(id);
    }
}
