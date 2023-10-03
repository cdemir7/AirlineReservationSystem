package com.example.AirlineReservationSystem.business.dto.responses.create;

import lombok.Data;

import java.util.UUID;
@Data
public class CreateAirlineCompanyResponse {
    private UUID id;

    private String name;

    private String contactPhone;

    private String contactEmail;
}
