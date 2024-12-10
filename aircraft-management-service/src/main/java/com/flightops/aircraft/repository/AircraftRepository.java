package com.flightops.aircraft.repository;

import com.flightops.aircraft.entity.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AircraftRepository extends JpaRepository<Aircraft, Integer> {
}
