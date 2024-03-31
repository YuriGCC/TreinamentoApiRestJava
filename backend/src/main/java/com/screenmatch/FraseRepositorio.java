package com.screenmatch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface FraseRepositorio extends JpaRepository<Frase, Long> {
    @Query("SELECT f FROM Frase f ORDER BY FUNCTION('RANDOM') LIMIT 1")
    Optional<Frase> obterFraseAleatoria();
}
