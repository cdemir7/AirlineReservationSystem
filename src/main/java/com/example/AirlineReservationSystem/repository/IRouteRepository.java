package com.example.AirlineReservationSystem.repository;

import com.example.AirlineReservationSystem.entities.Route;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface IRouteRepository extends JpaRepository<Route, UUID> {
}
