package com.example.AirlineReservationSystem.business.dto.responses.create;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateFlightResponse {
    private UUID id;

    private String flightNumber;

    private LocalDateTime date;

    private int airplaneId;

    private int routeId;
}
