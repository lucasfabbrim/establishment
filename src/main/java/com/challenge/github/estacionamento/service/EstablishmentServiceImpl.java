package com.challenge.github.estacionamento.service;

import com.challenge.github.estacionamento.model.Establishment;
import com.challenge.github.estacionamento.repository.EstablishmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstablishmentServiceImpl implements EstablishmentService{

    private final EstablishmentRepository establishmentRepository;

    @Autowired
    public EstablishmentServiceImpl(EstablishmentRepository establishmentRepository) {
        this.establishmentRepository = establishmentRepository;
    }
    @Override
    public List<Establishment> findAll() {
        return this.establishmentRepository.findAll();
    }

    @Override
    public Establishment findByCNPJ(String cnpj) {
        return this.establishmentRepository.findByCNPJ(cnpj);
    }
    public Establishment findById(Long id) {
        return this.establishmentRepository.findEstablishmentById(id);
    }

    @Override
    public Establishment save(Establishment establishment) {
        return this.establishmentRepository.save(establishment);
    }

    @Override
    public Establishment update(Establishment establishment) {
        return this.establishmentRepository.save(establishment);
    }

    @Override
    public void delete(Long id) {
       this.establishmentRepository.deleteById(id);
    }
}
