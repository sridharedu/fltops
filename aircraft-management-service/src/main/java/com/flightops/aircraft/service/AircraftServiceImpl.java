package com.flightops.aircraft.service;

import com.flightops.aircraft.dto.AircraftDTO;
import com.flightops.aircraft.entity.Aircraft;
import com.flightops.aircraft.repository.AircraftRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AircraftServiceImpl implements AircraftService {

    @Autowired
    private AircraftRepository aircraftRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public AircraftDTO createAircraft(AircraftDTO aircraftDTO) {
        Aircraft aircraft = modelMapper.map(aircraftDTO, Aircraft.class);
        aircraft = aircraftRepository.save(aircraft);
        return modelMapper.map(aircraft, AircraftDTO.class);
    }

    @Override
    public AircraftDTO getAircraftById(int id) {
        Aircraft aircraft = aircraftRepository.findById(id).orElseThrow();
        return modelMapper.map(aircraft, AircraftDTO.class);
    }

    @Override
    public List<AircraftDTO> getAllAircraft() {
        return aircraftRepository.findAll().stream()
                .map(aircraft -> modelMapper.map(aircraft, AircraftDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public AircraftDTO updateAircraft(int id, AircraftDTO aircraftDTO) {
        Aircraft aircraft = aircraftRepository.findById(id).orElseThrow();
        modelMapper.map(aircraftDTO, aircraft);
        aircraft = aircraftRepository.save(aircraft);
        return modelMapper.map(aircraft, AircraftDTO.class);
    }

    @Override
    public void deleteAircraft(int id) {
        aircraftRepository.deleteById(id);
    }
}
