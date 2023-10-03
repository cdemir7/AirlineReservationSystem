package com.example.AirlineReservationSystem.business.dto.requests.update;

import lombok.Data;

@Data
public class UpdateAirlineCompanyRequest {
    private String name;

    private String contactPhone;

    private String contactEmail;
}
