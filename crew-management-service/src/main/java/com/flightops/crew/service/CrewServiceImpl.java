package com.flightops.crew.service;

import com.flightops.crew.dto.CrewDTO;
import com.flightops.crew.entity.Crew;
import com.flightops.crew.repository.CrewRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CrewServiceImpl implements CrewService {

    @Autowired
    private CrewRepository crewRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CrewDTO createCrew(CrewDTO crewDTO) {
        Crew crew = modelMapper.map(crewDTO, Crew.class);
        crew = crewRepository.save(crew);
        return modelMapper.map(crew, CrewDTO.class);
    }

    @Override
    public CrewDTO getCrewById(int id) {
        Crew crew = crewRepository.findById(id).orElseThrow();
        return modelMapper.map(crew, CrewDTO.class);
    }

    @Override
    public List<CrewDTO> getAllCrew() {
        return crewRepository.findAll().stream()
                .map(crew -> modelMapper.map(crew, CrewDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public CrewDTO updateCrew(int id, CrewDTO crewDTO) {
        Crew crew = crewRepository.findById(id).orElseThrow();
        modelMapper.map(crewDTO, crew);
        crew = crewRepository.save(crew);
        return modelMapper.map(crew, CrewDTO.class);
    }

    @Override
    public void deleteCrew(int id) {
        crewRepository.deleteById(id);
    }
}
