package com.example.AirlineReservationSystem.business.dto.responses.create;

import lombok.Data;

import java.util.UUID;

@Data
public class CreateAirplaneTypeResponse {
    private UUID id;

    private String typeName;

    private int maxCapacity;

    private String manuFacturedBy;
}
