package com.example.AirlineReservationSystem.business.dto.responses.update;

import com.example.AirlineReservationSystem.entities.enums.Gender;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePassengerResponse {
    private UUID id;

    private String firstName;

    private String lastName;

    private Gender gender;

    private LocalDate birthDate;

    private String nationality;

    private String phone;

    private String email;
}
