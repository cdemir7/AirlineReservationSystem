package com.example.AirlineReservationSystem.business.dto.requests.create;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateAirlineCompanyRequest {
    private String name;

    private String contactPhone;

    private String contactEmail;
}
