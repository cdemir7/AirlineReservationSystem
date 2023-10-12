package com.example.AirlineReservationSystem.business.dto.requests.update;

import lombok.Data;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateReservationRequest {
    private int flightId;

    private int passengerId;

    private String seatNumber;

    private double fare;
}
