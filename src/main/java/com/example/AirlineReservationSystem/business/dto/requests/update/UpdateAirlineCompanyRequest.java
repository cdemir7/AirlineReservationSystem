package com.example.AirlineReservationSystem.business.dto.requests.update;

import lombok.Data;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAirlineCompanyRequest {
    private String name;

    private String contactPhone;

    private String contactEmail;
}
