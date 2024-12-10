package com.flightops.crew.controller;

import com.flightops.crew.dto.CrewDTO;
import com.flightops.crew.service.CrewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/crew")
public class CrewController {

    @Autowired
    private CrewService crewService;

    @PostMapping
    public CrewDTO createCrew(@RequestBody CrewDTO crewDTO) {
        return crewService.createCrew(crewDTO);
    }

    @GetMapping("/{id}")
    public CrewDTO getCrewById(@PathVariable int id) {
        return crewService.getCrewById(id);
    }

    @GetMapping
    public List<CrewDTO> getAllCrew() {
        return crewService.getAllCrew();
    }

    @PutMapping("/{id}")
    public CrewDTO updateCrew(@PathVariable int id, @RequestBody CrewDTO crewDTO) {
        return crewService.updateCrew(id, crewDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteCrew(@PathVariable int id) {
        crewService.deleteCrew(id);
    }

    @GetMapping("/search")
    public List<CrewDTO> searchCrew(@RequestParam String searchTerm) {
        return crewService.searchCrew(searchTerm);
    }
}
