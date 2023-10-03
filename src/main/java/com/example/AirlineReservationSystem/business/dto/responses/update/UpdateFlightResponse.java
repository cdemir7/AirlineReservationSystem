package com.example.AirlineReservationSystem.business.dto.responses.update;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class UpdateFlightResponse {
    private UUID id;

    private String flightNumber;

    private LocalDateTime date;

    private int airplaneId;

    private int routeId;
}
