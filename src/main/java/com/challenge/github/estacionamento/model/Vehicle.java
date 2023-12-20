package com.challenge.github.estacionamento.model;

import com.challenge.github.estacionamento.dto.VehicleDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "vehicles") @Entity(name = "vehicles")

@Setter @Getter

@NoArgsConstructor @AllArgsConstructor

public class Vehicle {

    public enum VehicleType {
        CAR,
        MOTORCYCLE
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;
    @Column(nullable = false)
    private String brand;
    @Column(nullable = false)
    private String model;
    @Column(nullable = false)
    private String color;
    @Column(unique = true, nullable = false)
    private String placa;
    @Column(nullable = false)
    private VehicleType type;

    public Vehicle(VehicleDTO vehicle){

        this.id = vehicle.id();
        this.brand = vehicle.brand();
        this.model = vehicle.model();
        this.color = vehicle.color();
        this.placa = vehicle.placa();
        this.type = vehicle.type();

    }


}
