package com.example.AirlineReservationSystem.business.dto.requests.create;

import lombok.Data;

@Data
public class CreateAirlineTypeRequest {
    private String typeName;

    private int maxCapacity;

    private String manuFacturedBy;
}
