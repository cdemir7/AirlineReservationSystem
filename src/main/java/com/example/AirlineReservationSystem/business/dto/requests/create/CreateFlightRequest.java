package com.example.AirlineReservationSystem.business.dto.requests.create;

import com.example.AirlineReservationSystem.entities.Airplane;
import com.example.AirlineReservationSystem.entities.Route;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CreateFlightRequest {
    private String flightNumber;

    private LocalDateTime date;

    private int airplaneId;

    private int routeId;
}
