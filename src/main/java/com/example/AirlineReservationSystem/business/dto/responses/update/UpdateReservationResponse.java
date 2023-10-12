package com.example.AirlineReservationSystem.business.dto.responses.update;

import lombok.Data;

import java.util.UUID;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateReservationResponse {
    private UUID id;

    private int flightId;

    private int passengerId;

    private String seatNumber;

    private double fare;
}
