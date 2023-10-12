package com.example.AirlineReservationSystem.business.dto.responses.get;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetAllAirplaneTypesResponse {
    private UUID id;

    private String typeName;

    private int maxCapacity;

    private String manuFacturedBy;
}
