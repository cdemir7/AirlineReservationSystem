package com.example.AirlineReservationSystem.business.dto.requests.update;

import lombok.Data;

@Data
public class UpdateRouteRequest {
    private int takeOfPointId;

    private int landOfPointId;
}
