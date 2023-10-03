package com.example.AirlineReservationSystem.business.dto.requests.update;

import lombok.Data;

import java.time.LocalDate;
@Data
public class UpdateAirplaneRequest {
    private int numberOfSeats;

    private LocalDate manuFacturedDate;

    private int typeId;

    private int locationId;

    private int airlineCompanyId;
}
