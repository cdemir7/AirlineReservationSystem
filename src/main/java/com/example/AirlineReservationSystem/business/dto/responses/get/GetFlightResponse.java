package com.example.AirlineReservationSystem.business.dto.responses.get;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetFlightResponse {
    private UUID id;

    private String flightNumber;

    private LocalDateTime date;

    private UUID airplaneId;

    private UUID routeId;
}
