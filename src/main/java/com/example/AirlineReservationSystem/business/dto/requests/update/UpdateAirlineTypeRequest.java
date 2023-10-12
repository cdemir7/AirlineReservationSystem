package com.example.AirlineReservationSystem.business.dto.requests.update;

import lombok.Data;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAirlineTypeRequest {
    private String typeName;

    private int maxCapacity;

    private String manuFacturedBy;
}
