package com.flightops.flight.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int flightId;

    private String flightNumber;
    private Date scheduledTime;
    private Date updatedTime;

    private int routeId;

    // Getters and Setters
}
