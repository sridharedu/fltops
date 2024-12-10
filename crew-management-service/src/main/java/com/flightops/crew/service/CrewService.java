package com.flightops.crew.service;

import com.flightops.crew.dto.CrewDTO;

import java.util.List;

public interface CrewService {
    CrewDTO createCrew(CrewDTO crewDTO);
    CrewDTO getCrewById(int id);
    List<CrewDTO> getAllCrew();
    CrewDTO updateCrew(int id, CrewDTO crewDTO);
    void deleteCrew(int id);

    List<CrewDTO> searchCrew(String searchTerm);

    List<CrewDTO> searchCrewByCrewNumber(String crewNumber);

}
