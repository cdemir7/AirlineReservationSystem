package com.example.AirlineReservationSystem.business.dto.responses.create;

import lombok.Data;

import java.util.UUID;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateReservationResponse {
    private UUID id;

    private int flightId;

    private int passengerId;

    private String seatNumber;

    private double fare;
}
