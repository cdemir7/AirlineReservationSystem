package com.example.AirlineReservationSystem.business.dto.responses.create;

import lombok.Data;

import java.util.UUID;

@Data
public class CreateAirportResponse {
    private UUID id;
    private String code;

    private String name;

    private String city;

    private String state;
}
