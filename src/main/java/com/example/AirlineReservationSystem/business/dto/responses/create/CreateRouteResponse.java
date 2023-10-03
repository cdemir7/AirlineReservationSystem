package com.example.AirlineReservationSystem.business.dto.responses.create;

import lombok.Data;

import java.util.UUID;

@Data
public class CreateRouteResponse {
    private UUID id;

    private int takeOfPointId;

    private int landOfPointId;
}
