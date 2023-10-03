package com.example.AirlineReservationSystem.business.dto.requests.update;

import lombok.Data;

@Data
public class UpdateAirlineTypeRequest {
    private String typeName;

    private int maxCapacity;

    private String manuFacturedBy;
}
