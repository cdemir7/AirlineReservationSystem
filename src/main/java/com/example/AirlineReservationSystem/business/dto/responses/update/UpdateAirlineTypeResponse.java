package com.example.AirlineReservationSystem.business.dto.responses.update;

import lombok.Data;

import java.util.UUID;

@Data
public class UpdateAirlineTypeResponse {
    private UUID id;

    private String typeName;

    private int maxCapacity;

    private String manuFacturedBy;
}
