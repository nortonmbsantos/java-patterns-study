package com.norton.gerenciador_viagens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.norton.gerenciador_viagens.entities.Viagem;

@Repository
public interface ViagemRepository extends JpaRepository<Viagem, Long> {

	Viagem findByLocalDeDestino(String localDeDestino);

}