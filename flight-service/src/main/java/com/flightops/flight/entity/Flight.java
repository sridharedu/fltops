package com.flightops.flight.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

// Flight.java
@Entity
@Getter
@Setter
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_id")
    private Integer flightId;

    @Column(name = "flight_number", nullable = false, length = 20)
    private String flightNumber;

    @Column(name = "scheduled_time", nullable = false)
    private LocalDateTime scheduledTime;

    @Column(name = "updated_time")
    private LocalDateTime updatedTime;

    @Column(name = "arrival_airport_code", nullable = false, length = 5)
    private String arrivalAirportCode;

    @Column(name = "departure_airport_code", nullable = false, length = 5)
    private String departureAirportCode;

    @Column(name = "flight_status", nullable = false, length = 20)
    private String flightStatus;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;

 /*   @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "route_id", nullable = false)
    private Route route;*/

    // Getters and Setters
    // Add getters and setters for all fields
}
