package com.example.AirlineReservationSystem.business.dto.responses.update;

import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class UpdateAirplaneResponse {
    private UUID id;

    private int numberOfSeats;

    private LocalDate manuFacturedDate;

    private int typeId;

    private int locationId;

    private int airlineCompanyId;
}
