package com.example.AirlineReservationSystem.business.dto.requests.update;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UpdateFlightRequest {
    private String flightNumber;

    private LocalDateTime date;

    private int airplaneId;

    private int routeId;
}
