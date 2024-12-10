package com.flightops.aircraft.controller;

import com.flightops.aircraft.dto.AircraftDTO;
import com.flightops.aircraft.service.AircraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/aircraft")
public class AircraftController {

    @Autowired
    private AircraftService aircraftService;

    @PostMapping
    public AircraftDTO createAircraft(@RequestBody AircraftDTO aircraftDTO) {
        return aircraftService.createAircraft(aircraftDTO);
    }

    @GetMapping("/{id}")
    public AircraftDTO getAircraftById(@PathVariable int id) {
        return aircraftService.getAircraftById(id);
    }

    @GetMapping
    public List<AircraftDTO> getAllAircraft() {
        return aircraftService.getAllAircraft();
    }

    @PutMapping("/{id}")
    public AircraftDTO updateAircraft(@PathVariable int id, @RequestBody AircraftDTO aircraftDTO) {
        return aircraftService.updateAircraft(id, aircraftDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteAircraft(@PathVariable int id) {
        aircraftService.deleteAircraft(id);
    }
}
