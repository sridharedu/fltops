package com.flightops.aircraft.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "aircrafts")
public class Aircraft {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aircraftId;

    private String model;
    private String tailNumber;
    private int capacity;

    // Getters and Setters
}
