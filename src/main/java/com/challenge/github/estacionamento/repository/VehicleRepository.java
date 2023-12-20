package com.challenge.github.estacionamento.repository;

import com.challenge.github.estacionamento.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    @Query(value = "SELECT v FROM vehicles v WHERE v.placa" +
            " = :license")
    Vehicle findByLicense(@Param("license") String license);

    @Query("SELECT v FROM vehicles v WHERE v.id = :id")
    Vehicle findVehicleById(@Param("id")Long id);

}
