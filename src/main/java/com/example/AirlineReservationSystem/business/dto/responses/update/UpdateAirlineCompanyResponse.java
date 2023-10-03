package com.example.AirlineReservationSystem.business.dto.responses.update;

import lombok.Data;

import java.util.UUID;

@Data
public class UpdateAirlineCompanyResponse {
    private UUID id;

    private String name;

    private String contactPhone;

    private String contactEmail;
}
