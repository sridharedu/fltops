package com.flightops.flight.repository;

import com.flightops.flight.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
}
