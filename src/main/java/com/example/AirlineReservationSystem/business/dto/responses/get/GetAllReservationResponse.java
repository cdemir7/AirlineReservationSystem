package com.example.AirlineReservationSystem.business.dto.responses.get;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetAllReservationResponse {
    private UUID id;

    private UUID flightId;

    private UUID passengerId;

    private String seatNumber;

    private double fare;
}
