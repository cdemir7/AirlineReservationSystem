package com.example.AirlineReservationSystem.business.dto.requests.create;

import lombok.Data;

@Data
public class CreateAirlineCompanyRequest {
    private String name;

    private String contactPhone;

    private String contactEmail;
}
