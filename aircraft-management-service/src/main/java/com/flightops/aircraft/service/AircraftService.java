package com.flightops.aircraft.service;

import com.flightops.aircraft.dto.AircraftDTO;

import java.util.List;

public interface AircraftService {
    AircraftDTO createAircraft(AircraftDTO aircraftDTO);
    AircraftDTO getAircraftById(int id);
    List<AircraftDTO> getAllAircraft();
    AircraftDTO updateAircraft(int id, AircraftDTO aircraftDTO);
    void deleteAircraft(int id);
}
