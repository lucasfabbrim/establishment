package com.challenge.github.estacionamento.model;

import com.challenge.github.estacionamento.dto.EstablishmentDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "establishment") @Entity(name = "establishment")

@Setter @Getter

@NoArgsConstructor @AllArgsConstructor

public class Establishment {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String cnpj;
    @Column(nullable = false)
    private String address;
    @Column(unique = true, nullable = false)
    private String phone;
    @Column(nullable = false)
    private Integer moto;
    @Column(nullable = false)
    private Integer car;

    public Establishment(EstablishmentDTO establishment){

        this.id = establishment.id();
        this.name = establishment.name();
        this.cnpj = establishment.cnpj();
        this.address = establishment.address();
        this.phone = establishment.phone();
        this.moto = establishment.moto();
        this.car = establishment.car();

    }


}
