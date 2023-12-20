package com.challenge.github.estacionamento.repository;

import com.challenge.github.estacionamento.model.Establishment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstablishmentRepository extends JpaRepository<Establishment, Long> {

    @Query("SELECT e FROM establishment e WHERE e.cnpj = :cnpj")
    Establishment findByCNPJ(@Param("cnpj") String cnpj);

    @Query("SELECT e FROM establishment e WHERE e.id = :id")
    Establishment findEstablishmentById(@Param("id")Long id);

}
