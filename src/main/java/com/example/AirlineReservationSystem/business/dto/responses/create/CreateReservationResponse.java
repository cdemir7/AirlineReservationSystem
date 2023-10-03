package com.example.AirlineReservationSystem.business.dto.responses.create;

import lombok.Data;

import java.util.UUID;

@Data
public class CreateReservationResponse {
    private UUID id;

    private int flightId;

    private int passengerId;

    private String seatNumber;

    private double fare;
}
