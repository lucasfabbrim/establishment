package com.challenge.github.estacionamento.controller;

import com.challenge.github.estacionamento.dto.VehicleDTO;
import com.challenge.github.estacionamento.model.Vehicle;
import com.challenge.github.estacionamento.service.VehicleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    private final VehicleServiceImpl vehicleService;
    @Autowired
    public VehicleController(VehicleServiceImpl vehicleService) {
        this.vehicleService = vehicleService;
    }
    @PostMapping("/signup")
    public ResponseEntity<?> create(@RequestBody VehicleDTO vehicle){
        this.vehicleService.save(vehicle);
        return ResponseEntity.ok().body(vehicle);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Vehicle> getVehicleById(@PathVariable Long id) {
        Vehicle vehicle = vehicleService.findById(id);
        if (vehicle != null) {
            return ResponseEntity.ok().body(vehicle);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
