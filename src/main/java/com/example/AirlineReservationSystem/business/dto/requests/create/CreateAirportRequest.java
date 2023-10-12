package com.example.AirlineReservationSystem.business.dto.requests.create;

import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateAirportRequest {
    private String code;

    @Length(min = 2, max = 20)
    private String name;

    // @Pattern(regexp = "")
    private String city;

    private String state;
}
