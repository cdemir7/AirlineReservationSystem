package com.example.AirlineReservationSystem.business.dto.responses.update;

import lombok.Data;

import java.util.UUID;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAirlineCompanyResponse {
    private UUID id;

    private String name;

    private String contactPhone;

    private String contactEmail;
}
