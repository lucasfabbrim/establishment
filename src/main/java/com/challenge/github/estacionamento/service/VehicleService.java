package com.challenge.github.estacionamento.service;

import com.challenge.github.estacionamento.dto.VehicleDTO;
import com.challenge.github.estacionamento.model.Vehicle;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VehicleService {

    List<Vehicle> findAll();
    Vehicle findByLicense(String license);
    Vehicle save(VehicleDTO establishment);
    Vehicle update(Vehicle establishment);
    void delete(Long id);

}
