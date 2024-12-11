package com.flightops.flight.repository;

import com.flightops.flight.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
    List<Flight> findByFlightStatus(String status);

    List<Flight> findByScheduledTimeBetween(LocalDateTime start, LocalDateTime end);

    @Query("SELECT f FROM Flight f WHERE f.flightStatus = :status " +
            "AND f.scheduledTime BETWEEN :startDate AND :endDate")
    List<Flight> findByFlightStatusAndScheduledTime(
            @Param("status") String status,
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate
    );
}
