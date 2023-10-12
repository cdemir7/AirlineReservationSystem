package com.example.AirlineReservationSystem.business.dto.responses.get;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetAllAirplanesResponse {
    private UUID id;

    private int numberOfSeats;

    private LocalDate manuFacturedDate;

    private UUID airplaneTypeId;

    private UUID airportId;

    private UUID airlineCompanyId;
}
