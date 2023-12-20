package com.challenge.github.estacionamento.controller;

import com.challenge.github.estacionamento.dto.EstablishmentDTO;
import com.challenge.github.estacionamento.model.Establishment;
import com.challenge.github.estacionamento.service.EstablishmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/establishment")
public class EstablishmentController {

    private final EstablishmentServiceImpl establishmentService;

    @Autowired
    public EstablishmentController(EstablishmentServiceImpl establishmentService) {
        this.establishmentService = establishmentService;
    }

    @PostMapping("/signup")
    public ResponseEntity<?> create(@RequestBody EstablishmentDTO establishment){
        this.establishmentService.save(new Establishment(establishment));
        return ResponseEntity.ok().body(establishment);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Establishment> getEstablishmentById(@PathVariable Long id) {
        Establishment establishment = establishmentService.findById(id);
        if (establishment != null) {
            return ResponseEntity.ok().body(establishment);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
