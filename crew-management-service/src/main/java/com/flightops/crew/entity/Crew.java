package com.flightops.crew.entity;

import javax.persistence.*;

@Entity
@Table(name = "crew")
public class Crew {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int crewId;

    private String name;
    private String role;
    private String contactInfo;

    // Getters and Setters
}
