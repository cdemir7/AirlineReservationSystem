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
public class GetAirportResponse {
    private UUID id;

    private String code;

    private String name;

    private String city;

    private String state;
}
