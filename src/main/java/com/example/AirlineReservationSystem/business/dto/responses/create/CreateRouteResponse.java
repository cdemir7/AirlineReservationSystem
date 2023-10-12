package com.example.AirlineReservationSystem.business.dto.responses.create;

import lombok.Data;

import java.util.UUID;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateRouteResponse {
    private UUID id;

    private int takeOfPointId;

    private int landOfPointId;
}
