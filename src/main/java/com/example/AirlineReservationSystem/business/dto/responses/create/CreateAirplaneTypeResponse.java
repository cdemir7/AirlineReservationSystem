package com.example.AirlineReservationSystem.business.dto.responses.create;

import lombok.Data;

import java.util.UUID;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateAirplaneTypeResponse {
    private UUID id;

    private String typeName;

    private int maxCapacity;

    private String manuFacturedBy;
}
