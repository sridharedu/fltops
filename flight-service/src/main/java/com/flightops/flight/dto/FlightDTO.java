package com.flightops.flight.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
public class FlightDTO {
    private Integer flightId;

    @NotBlank(message = "Flight number is required")
    @Size(max = 20, message = "Flight number must not exceed 20 characters")
    private String flightNumber;

    @NotNull(message = "Scheduled time is required")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime scheduledTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedTime;

    @NotNull(message = "Route ID is required")
    private Integer routeId;

    @NotBlank(message = "Departure airport code is required")
    @Size(max = 5, message = "Departure airport code must not exceed 5 characters")
    private String departureAirportCode;

    @NotBlank(message = "Arrival airport code is required")
    @Size(max = 5, message = "Arrival airport code must not exceed 5 characters")
    private String arrivalAirportCode;

    @NotBlank(message = "Flight status is required")
    @Size(max = 20, message = "Flight status must not exceed 20 characters")
    private String flightStatus;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;
}
