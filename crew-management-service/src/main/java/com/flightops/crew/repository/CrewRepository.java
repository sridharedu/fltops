package com.flightops.crew.repository;

import com.flightops.crew.entity.Crew;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrewRepository extends JpaRepository<Crew, Integer> {
}
