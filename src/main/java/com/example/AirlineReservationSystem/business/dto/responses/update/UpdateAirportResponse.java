package com.example.AirlineReservationSystem.business.dto.responses.update;

import lombok.Data;

import java.util.UUID;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAirportResponse {
    private UUID id;

    private String code;

    private String name;

    private String city;

    private String state;
}
