package com.example.AirlineReservationSystem.business.dto.responses.update;

import lombok.Data;

import java.util.UUID;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateRouteResponse {
    private UUID id;

    private int takeOfPointId;

    private int landOfPointId;
}
