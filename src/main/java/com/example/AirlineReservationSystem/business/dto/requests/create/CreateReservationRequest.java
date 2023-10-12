package com.example.AirlineReservationSystem.business.dto.requests.create;

import com.example.AirlineReservationSystem.entities.Flight;
import com.example.AirlineReservationSystem.entities.Passenger;
import lombok.Data;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateReservationRequest {
    private int flightId;

    private int passengerId;

    private String seatNumber;

    private double fare;
}
