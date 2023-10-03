package com.example.AirlineReservationSystem.business.dto.requests.update;

import lombok.Data;

@Data
public class UpdateReservationRequest {
    private int flightId;

    private int passengerId;

    private String seatNumber;

    private double fare;
}
