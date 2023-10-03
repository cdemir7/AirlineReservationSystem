package com.example.AirlineReservationSystem.business.dto.responses.update;

import lombok.Data;

import java.util.UUID;

@Data
public class UpdateAirportResponse {
    private UUID id;

    private String code;

    private String name;

    private String city;

    private String state;
}
