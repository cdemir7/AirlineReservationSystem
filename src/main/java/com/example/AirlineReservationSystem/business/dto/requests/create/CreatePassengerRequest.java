package com.example.AirlineReservationSystem.business.dto.requests.create;

import com.example.AirlineReservationSystem.entities.enums.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CreatePassengerRequest {
    private String firstName;

    private String lastName;

    private Gender gender;

    private LocalDate birthDate;

    private String nationality;

    private String phone;

    private String email;
}
