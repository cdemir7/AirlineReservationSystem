package com.example.AirlineReservationSystem.business.dto.requests.create;

import com.example.AirlineReservationSystem.entities.AirlineCompany;
import com.example.AirlineReservationSystem.entities.AirplaneType;
import com.example.AirlineReservationSystem.entities.Airport;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CreateAirplaneRequest {
    private int numberOfSeats;

    private LocalDate manuFacturedDate;

    private int typeId;

    private int locationId;

    private int airlineCompanyId;
}
