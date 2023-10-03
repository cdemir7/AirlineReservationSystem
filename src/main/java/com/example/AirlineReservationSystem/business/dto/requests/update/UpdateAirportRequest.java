package com.example.AirlineReservationSystem.business.dto.requests.update;

import lombok.Data;

@Data
public class UpdateAirportRequest {
    private String code;

    private String name;

    private String city;

    private String state;
}
