package com.challenge.github.estacionamento.service;

import com.challenge.github.estacionamento.model.Establishment;

import java.util.List;

public interface EstablishmentService {

    List<Establishment> findAll();
    Establishment findByCNPJ(String cnpj);
    Establishment save(Establishment establishment);
    Establishment update(Establishment establishment);
    void delete(Long id);

}
