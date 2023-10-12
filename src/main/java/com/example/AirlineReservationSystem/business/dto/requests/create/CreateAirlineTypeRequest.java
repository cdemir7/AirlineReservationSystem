package com.example.AirlineReservationSystem.business.dto.requests.create;

import lombok.Data;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateAirlineTypeRequest {
    private String typeName;

    private int maxCapacity;

    private String manuFacturedBy;
}