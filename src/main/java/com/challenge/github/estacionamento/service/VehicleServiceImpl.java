package com.challenge.github.estacionamento.service;

import com.challenge.github.estacionamento.dto.VehicleDTO;
import com.challenge.github.estacionamento.model.Establishment;
import com.challenge.github.estacionamento.model.Vehicle;
import com.challenge.github.estacionamento.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService{

    private final VehicleRepository vehicleRepository;
    @Autowired
    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public List<Vehicle> findAll() {
        return this.vehicleRepository.findAll();
    }

    @Override
    public Vehicle findByLicense(String license) {
        return null;
    }

    public Vehicle findById(Long id) {
        return this.vehicleRepository.findVehicleById(id);
    }



    public Vehicle save(VehicleDTO vehicle) {
        return this.vehicleRepository.save(new Vehicle(vehicle));
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        return this.vehicleRepository.save(vehicle);
    }

    @Override
    public void delete(Long id) {
       this.vehicleRepository.deleteById(id);
    }
}
