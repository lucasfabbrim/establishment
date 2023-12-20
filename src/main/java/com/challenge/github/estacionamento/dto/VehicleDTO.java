package com.challenge.github.estacionamento.dto;

import com.challenge.github.estacionamento.model.Vehicle;
public record VehicleDTO(Long id, String brand, String model, String color, String placa, Vehicle.VehicleType type) {

}
