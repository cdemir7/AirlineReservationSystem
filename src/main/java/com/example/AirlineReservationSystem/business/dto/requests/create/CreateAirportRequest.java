package com.example.AirlineReservationSystem.business.dto.requests.create;

import lombok.Data;

@Data
public class CreateAirportRequest {
    private String code;

    private String name;

    private String city;

    private String state;
}
