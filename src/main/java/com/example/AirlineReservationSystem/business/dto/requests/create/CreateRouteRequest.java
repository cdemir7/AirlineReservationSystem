package com.example.AirlineReservationSystem.business.dto.requests.create;

import com.example.AirlineReservationSystem.entities.Airport;
import lombok.Data;

@Data
public class CreateRouteRequest {
    private int takeOfPointId;

    private int landOfPointId;
}
