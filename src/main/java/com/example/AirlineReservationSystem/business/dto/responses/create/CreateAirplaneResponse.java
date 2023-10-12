package com.example.AirlineReservationSystem.business.dto.responses.create;

import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateAirplaneResponse {
    private UUID id;
    private int numberOfSeats;

    private LocalDate manuFacturedDate;

    private int typeId;

    private int locationId;

    private int airlineCompanyId;
}
