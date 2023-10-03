package com.example.AirlineReservationSystem.business.dto.responses.create;

import com.example.AirlineReservationSystem.entities.enums.Gender;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class CreatePassengerResponse {
    private UUID id;

    private String firstName;

    private String lastName;

    private Gender gender;

    private LocalDate birthDate;

    private String nationality;

    private String phone;

    private String email;
}
