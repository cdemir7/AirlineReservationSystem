package com.example.AirlineReservationSystem.business.dto.requests.update;

import lombok.Data;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateRouteRequest {
    private int takeOfPointId;

    private int landOfPointId;
}
