package com.example.AirlineReservationSystem.business.dto.requests.create;

import com.example.AirlineReservationSystem.entities.AirlineCompany;
import com.example.AirlineReservationSystem.entities.AirplaneType;
import com.example.AirlineReservationSystem.entities.Airport;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CreateAirplaneRequest {
    @Min(value = 10, message = "Koltuk numarası 10'dan az olamaz.")
    @Max(value = 25, message = "Koltuk numarası 25'den fazla olamaz.")
    private int numberOfSeats;

    @NotNull
    private LocalDate manufacturedDate;

    private int typeId;

    private int locationId;

    private int airlineCompanyId;
}
